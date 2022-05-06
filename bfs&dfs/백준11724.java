import java.util.*;

public class Main {
	public static Scanner scan =new Scanner(System.in);
	public static StringBuilder sb=new StringBuilder();
	public static StringBuilder sb2=new StringBuilder();

	static int n,m,v;
	static int[][] arr;
	static int cnt;
	static int[] visited;
	static int[] visited2;

	public static void main(String[] args) {
		
		n=scan.nextInt();
		m=scan.nextInt();
		arr=new int[n+1][n+1];
		visited=new int[n+1];

		for(int i=0;i<m;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			arr[a][b]=1;
			arr[b][a]=1;
		}
		for(int i=1;i<n+1;i++) {
			if(visited[i]==0) {
				dfs(i);
				cnt++;
			}
		}
		System.out.print(cnt);
	}
	
	public static void dfs(int v) {
		visited[v]=1;
		for(int i=1;i<n+1;i++) {
			if(visited[i]==0&&arr[v][i]==1) {
				dfs(i);
			}
		}
	}
	
	
	
		}
