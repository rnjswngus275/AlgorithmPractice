import java.util.*;

public class 백준1389 {
	static int n,m,cnt=0,answer=0;
	static int[][] arr;
	static int MIN=Integer.MAX_VALUE;
	static int[] visited;
	static Scanner scan =new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		// 입력
		n=scan.nextInt();
		m=scan.nextInt();
		arr=new int[n+1][n+1];
		
		for(int i=0;i<m;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			arr[a][b]=1;
			arr[b][a]=1;
		}
		for(int i=1;i<=n;i++) {	//각자의 베이컨 수 구하기
			int ans=0;
			visited=new int[n+1];
			bfs(i);
			for(int j=1;j<=n;j++) {
				ans+=visited[j];
			}
			if(MIN>ans-1) {
				answer=i;
				MIN=ans-1;
			}
		}
		System.out.print(answer);
	}
	static void bfs(int i) {
		Queue<Integer>q =new LinkedList<>();
		q.offer(i);
		visited[i]=1;
		while(!q.isEmpty()) {
			int nxt=q.poll();
			for(int a=1;a<=n;a++) {
				if(arr[nxt][a]==1&&visited[a]==0) {
					visited[a]=visited[nxt]+1;
					q.offer(a);
				}
			}
			
		}
	
	}
}
