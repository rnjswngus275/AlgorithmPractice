import java.util.*;
public class 백준4963 {
	static Scanner scan=new Scanner(System.in);
	static int[] dx= {0,0,1,-1,-1,1,-1,1};
	static int[] dy= {1,-1,0,0,-1,1,1,-1};
	static int [][] arr;
	static boolean[][] visited;
	static int w,h,cnt=0;
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		w=scan.nextInt();
		h=scan.nextInt();
		if(w==0&&h==0) {
			break;
		}
		arr=new int[h][w];
		visited=new boolean[h][w];
		
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		cnt=0;
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(arr[i][j]==1&&!visited[i][j]) {
					dfs(i,j);
					cnt++;
				}
			}
		}
		sb.append(cnt+"\n");
	}
		System.out.print(sb);
		
	}
	static void dfs(int i, int j) {
		visited[i][j]=true;
		for(int a=0;a<8;a++) {
			int nx=i+dx[a];
			int ny=j+dy[a];
			if(nx>=0&&ny>=0&&nx<h&&ny<w) {
				if(arr[nx][ny]==1&&!visited[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}

}
