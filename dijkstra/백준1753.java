import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;


public class 백준1753 {
	static class Info implements Comparable<Info>{
		int idx, distance;	//인덱스와 가중치를 저장한다.
		Info(int idx,int distance){	
			this.idx=idx;
			this.distance=distance;
		}
		public int compareTo(Info other) {	//가중치를 기준으로 comparable을 선언하여 우선순위 큐의 판단 기준을 제공한다.
			if(this.distance<other.distance) {//비교할 값보다 지금이 최소값일 때 -> 교환안함
				return -1;		//음수 일경우 : 교환안함
			}
			return 1;
		}
		
	}
	
	static Scanner scan=new Scanner(System.in);
	static int n,m,k,x,ans=0;
	static int[] dist;
	static boolean [] visited;
	static ArrayList<ArrayList<Info>> list=new ArrayList<>();
	public static void main(String[] args) {
		
		
		/////////////////입력/////////////////////////
		n=scan.nextInt();		//정점의 개수
		m=scan.nextInt();		//간선의 개수
		k=scan.nextInt();		//시작 노드
		dist=new int[n+1];		//최단 경로 저장용 배열
		//리스트 초기화
		for(int i=1;i<=n+1;i++) {
			list.add(new ArrayList<>());
		}
		for(int i=0;i<m;i++) {
			int a=scan.nextInt();	//출발 
			int b=scan.nextInt();	//도착 
			int c=scan.nextInt();	//비용
			list.get(a).add(new Info(b,c));
		}
		
		
		/////////////////초기화/////////////////////////
		
		//모든 정점까지의 거리를 무한대로 초기화 해주기
		//최소값인지 비교해서 갱신해주어야하기 때문에 초기값은 
		for(int i=0;i<=n;i++) {
			dist[i]=Integer.MAX_VALUE;
		}
		
		dist[k]=0;			//출발도시는 0으로 초기화
		
		
		////다익스트라 시작////
		dijkstra(k);
		
		for(int i=1;i<n+1;i++) {
			if(dist[i]==2147483647) {
				System.out.println("INF");
			}
			else System.out.println(dist[i]);
		}
		
		
	}
	static void dijkstra(int start) {

		//최소 힙 생성
		PriorityQueue<Info> pq=new PriorityQueue<>();
		pq.add(new Info(start,0)); 	//출발 노드 wieght(가중치) 0으로 초기화
		
		//거리 정보들이 소진 될때까지 거리를 갱신한다.
		while(!pq.isEmpty()) {
			Info info =pq.poll();	//우선순위가 가장 높은 것을 꺼내서 (여기서 우선순위는 distance = 다 1이므로 같음)
			int index=info.idx;
			int distance=info.distance;
			
			if(dist[index]<distance) {		//꺼낸 정보가 최신 정보랑 다르면 의미 없으므로 폐기 한다 (예 :1->2->3 가는경우)
					continue;
					
			}
			
			for(int i=0;i<list.get(index).size();i++) {	//해당 도시와 연결되어있는 도시를 탐색
				int index2=list.get(index).get(i).idx;
				int distance2=list.get(index).get(i).distance+distance;		//index까지의 distance와 i까지의 distance를 더한 값
				if(dist[index2]>distance2) {		//새로운 distance(distance2)와 기존 distance 비교
					dist[index2]=distance2;		//갱신 ( 초기값은 무한대이므로 처음엔 무조건 갱신됨)
					pq.add(new Info(index2,distance2));			//priority queue에 삽입
					
				}
				
			}
		}
	}

}

