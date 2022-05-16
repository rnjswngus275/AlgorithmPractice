import java.util.*;

public class 백준2644 {
	static int n,p1,p2,m,cnt=0;
	static Scanner scan =new Scanner(System.in);
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	
	static int[] visited;
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) {
		// 입력
		n=scan.nextInt();//전체 사람의수
		p1=scan.nextInt();// 촌수 계산 하려는 사람1
		p2=scan.nextInt();// 촌수 계산 하려는 사람2
		m=scan.nextInt();// 부모자식 관계 m
		visited=new int[n+1];
		for(int i=0;i<n+1;i++) {
			list.add(new ArrayList<Integer>());
		}
		for(int i=0;i<m;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		bfs();
		
		System.out.print(visited[p2]-1);
	}
	static void bfs() {
		Queue<Integer> q=new LinkedList<>();
		
		q.offer(p1);
		visited[p1]=1;
		int next=0;
		while(!q.isEmpty()) {
			
			next=q.poll();
			int size=list.get(next).size();
			for(int i=0;i<size;i++) {
				int a=list.get(next).get(i);
				if(visited[a]==0) {
					visited[a]=visited[next]+1;
					q.offer(a);
				}
			}

		}
	}

}
