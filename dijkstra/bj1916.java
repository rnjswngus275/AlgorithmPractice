import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.PriorityQueue;

public class bj1916 {
	static class info implements Comparable<info> {
		int x,cost;
		public info (int x, int cost) {
			this.x=x;
			this.cost=cost;
		}
		@Override
		public int compareTo(info a) {
			return this.cost-a.cost;
		}
	}
	static Scanner scan=new Scanner(System.in);
	static ArrayList<ArrayList<info>> list= new ArrayList<>();
	static int[] dist;
	static boolean [] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= scan.nextInt();//도시의  개수
		int m = scan.nextInt(); //버스의 개수
		dist=new int [n+1];
		visited=new boolean [n+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		for(int i=0;i<n+1;i++) {
			list.add(new ArrayList<info>());
		}
		for(int i =0;i<m;i++) {//출발도시, 도착도시, 비용
			int a= scan.nextInt();
			int b= scan.nextInt();
			int c= scan.nextInt();
			list.get(a).add(new info(b,c));
		}
		int start = scan.nextInt();
		int end =scan.nextInt();
		dist[start]=0;
		sol(start);
		System.out.print(dist[end]);
	}
	public static void sol (int start) {
		PriorityQueue<info> pq =new PriorityQueue<>();
		pq.offer(new info(start,0));
		while(!pq.isEmpty()) {
			info cur = pq.poll();
            if(visited[cur.x]) continue;
            visited[cur.x]=true;
			for(info next : list.get(cur.x)) {
				if(dist[next.x]>dist[cur.x]+next.cost) {
					dist[next.x]=dist[cur.x]+next.cost;
					pq.offer(new info(next.x,dist[next.x]));
				}
			}
			
		}
	}
	

}
