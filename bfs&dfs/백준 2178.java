import java.io.*;
import java.util.*;
class xy{
	int x;
	int y;
	public xy(int x, int y){
		this.x=x;
		this.y=y;
	}
}
public class Main {
	static Scanner scan=new Scanner(System.in);
	static int[][] arr;
	static int[][] visited;
	static int[] dx= {-1,0,0,1};
	static int[] dy= {0,-1,1,0};
	static int n;
	static int m;
	static int cnt;
    public static void main(String[] args)  {
    	n=scan.nextInt();
    	m=scan.nextInt();
    	arr=new int[n+1][m+1];
    	visited=new int[n+1][m+1];
    	
    	for(int i=1;i<n+1;i++) {
    		String str=scan.next();
    		for(int j=1;j<m+1;j++) {
    			arr[i][j]=str.charAt(j-1)-'0';
    		}
    	}
    	  BFS(1,1);  	
    }
    
    
   public static void BFS(int i,int j) {
	   Queue<xy> q=new LinkedList<>();
	   visited[i][j]=1;
	   q.offer(new xy(i,j));
	   while(!q.isEmpty()) {
		   xy xy=q.poll();
		   for(int k=0;k<4;k++) {//순서대로 위 왼 오 아래 순으로 탐색
			   int nextx=xy.x+dx[k];
			   int nexty=xy.y+dy[k];
			   
			   if(nextx<1||nextx>n||nexty<1||nexty>m) {
				   continue;
			   }
			   if(arr[nextx][nexty]==1&&visited[nextx][nexty]==0) {
				   q.offer(new xy(nextx,nexty));
				   visited[nextx][nexty]=visited[xy.x][xy.y]+1;
			   }
		   }
	   }
	   System.out.println(visited[n][m]);
	   
   }
    
}
