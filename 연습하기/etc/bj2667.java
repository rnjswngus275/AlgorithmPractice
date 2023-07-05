package etc;
import java.util.*;
public class bj2667 {
	static Scanner scan=new Scanner(System.in);
	static int n;
	static int [][] arr;
	static boolean [][] visited;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,1,-1};
	static int cnt=0;
	static int total =0;
	static ArrayList<Integer> sb=new ArrayList<>(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=scan.nextInt();
		arr=new int[n][n];
		visited=new boolean [n][n];
		for(int i=0;i<n;i++) {
			String str="";
			str=scan.next();
			for(int j=0;j<n;j++) {
				arr[i][j]=str.charAt(j)-'0';
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==1&&!visited[i][j]) {
					visited[i][j]=true;
					sol(i,j);
					cnt++;
					sb.add(cnt);
					cnt=0;
					total++;
				}
				}
			}
		Collections.sort(sb);
			System.out.println(total);
			for(int i=0;i<sb.size();i++) {
				System.out.println(sb.get(i));
			}
		}
		
		
	
	
	public static void sol(int x, int y) {
		
		int a,b;
		for(int i=0;i<4;i++) {
			a=x+dx[i];
			b=y+dy[i];
			if(a>=0&&a<n&&b>=0&&b<n&&!visited[a][b]&&arr[a][b]==1) {
				cnt++;
				visited[a][b]=true;
				sol(a,b);
			}
		}
	}

}
