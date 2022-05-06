import java.util.*;

public class 백준1012 {
	static int T,M,N,cnt=0;
	static Scanner scan =new Scanner(System.in);
	static int[] dx= {1,0,0,-1};
	static int[] dy= {0,-1,1,0};
	static boolean[][] visited;
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T=scan.nextInt();
		for(int i=0;i<T;i++) {
			cnt=0;
			M=scan.nextInt();
			N=scan.nextInt();
			int K=scan.nextInt();
			boolean[][] arr=new boolean[M+1][N+1];
			visited=new boolean[M+1][N+1];
			for(int j=0;j<K;j++) {
				int a=scan.nextInt();
				int b=scan.nextInt();
				arr[a][b]=true;
			}
			for(int m=0;m<M;m++) {
				for(int n=0;n<N;n++) {
					if(arr[m][n]&&!visited[m][n]) {
						find(arr,m,n);
						cnt++;
					}
				}
			}
			sb.append(cnt+"\n");
		}
		System.out.print(sb);
	}
	static void find(boolean[][] arr,int m,int n) {
		if(!visited[m][n]&&arr[m][n]) {
			visited[m][n]=true;
			for(int i=0;i<4;i++) {
				int a=m+dx[i];
				int b=n+dy[i];
				if(a<=M&&a>=0&&b<=N&&b>=0) {
					if(!visited[a][b]) {
						find(arr,a,b);
					}
				}
			}
		}
	}

}
