
import java.util.Scanner;

public class 백준3184 {
	static int R,C,cnt,v=0,o=0,V=0,O=0;
	static Scanner scan =new Scanner(System.in);
	static int[] dx= {1,0,0,-1};
	static int[] dy= {0,-1,1,0};
	static boolean[][] visited;
	static char[][] arr;
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			cnt=0;
			R=scan.nextInt();
			C=scan.nextInt();
			arr=new char[R+1][C+1];
			visited=new boolean[R+1][C+1];
		
			for(int i=0;i<R;i++) {
					String str=scan.next();
				for(int j=0;j<C;j++) {
					arr[i][j]=str.charAt(j);
				}
			}
			
			
			
			for(int m=0;m<R;m++) {
				for(int n=0;n<C;n++) {
					if((arr[m][n]=='v'||arr[m][n]=='o')&&!visited[m][n]) {
						v=0;o=0;
						find(m,n);
						if(o>v) {
							O+=o;
						}
						else V+=v;
					}
				}
		}
		System.out.print(O+" "+V);
	}
	static void find(int m,int n) {
		if(!visited[m][n]&&!(arr[m][n]=='#')) {//방문하지 않았고 울타리가 아니면
			visited[m][n]=true;
			if(arr[m][n]=='v') {
				v++;
			}else if(arr[m][n]=='o') {
				o++;
			}
			for(int i=0;i<4;i++) {
				int a=m+dx[i];
				int b=n+dy[i];
				if(a<R&&a>=0&&b<C&&b>=0) {
					if(!visited[a][b]) {
						find(a,b);
					}
				}
			}
		}
	}

}
