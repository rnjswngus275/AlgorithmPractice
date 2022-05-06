import java.io.*;
import java.util.*;
class xy{
	int x;
	int y;
	xy(int x, int y){
		this.x=x;
		this.y=y;
	}
}
public class Main {
	static Scanner scan=new Scanner(System.in);
	static char[][] arr;
	static int r,c,max;
	static int[][] visited,dist_water,dist_go;
	static int[] dx= {1,0,0,-1};
	static int[] dy= {0,-1,1,0};
	static StringBuilder sb=new StringBuilder();
    public static void main(String[] args)  {
    	r=scan.nextInt();	//ㄱㅏ로
    	c=scan.nextInt();	//세로
    	arr=new char[r][c];
    	visited=new int[r][c];
    	dist_water=new int[r][c];
    	dist_go=new int [r][c];
    	for(int i=0;i<r;i++) {
    		String str=scan.next();
    		for(int j=0;j<c;j++) {
    			arr[i][j]=str.charAt(j);
    		}
    	}
    	bfs_water();
    	bfs_go();
    	
    	for(int i=0;i<r;i++) {
    		for(int j=0;j<c;j++) {
    			if(arr[i][j]=='D') {
    				if(dist_go[i][j]==-1) {
    					System.out.println("KAKTUS");
    				}
    				else {
    					System.out.println(dist_go[i][j]);
    				}
    			}
    		}
    	}

	
    }
    //물의 시간을 dist_water에 저장하는 과정
	public static void bfs_water(){
		Queue<xy>q=new LinkedList<>();
		//물의 위치를 모두 q에 넣어서 탐색 시작
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				dist_water[i][j]=-1;
				if(arr[i][j]=='*') {
					q.offer(new xy(i,j));
					dist_water[i][j]=0;
					visited[i][j]=1;
				}
			}
		}
		while(!q.isEmpty()) {
			xy xy=q.poll();
			int x=xy.x;
			int y=xy.y;
			for(int k=0;k<4;k++) {
				int nextx=x+dx[k];
				int nexty=y+dy[k];
				if(nextx<0||nexty<0||nextx>=r||nexty>=c)continue;
				if(arr[nextx][nexty]!='.')continue;
				if(visited[nextx][nexty]==0) {
					q.offer(new xy(nextx,nexty));
					visited[nextx][nexty]=1;
					dist_water[nextx][nexty]=dist_water[x][y]+1;
				}
			}
		}
	}   
    public static void bfs_go() {
    	Queue<xy>q=new LinkedList<>();
    	for(int i=0;i<r;i++) {
    		for(int j=0;j<c;j++) {
    			dist_go[i][j]=-1;
    			visited[i][j]=0;
    			if(arr[i][j]=='S') {
    				q.offer(new xy(i,j));
    				dist_go[i][j]=0;
    				visited[i][j]=1;
    			}
    		}
    	}
    	while(!q.isEmpty()) {
    		xy xy=q.poll();
    		int x=xy.x;
    		int y=xy.y;
    		for(int k=0;k<4;k++) {
    			int nextx=x+dx[k];
    			int nexty=y+dy[k];
				if(nextx<0||nexty<0||nextx>=r||nexty>=c)continue;
				if(arr[nextx][nexty]!='.'&&arr[nextx][nexty]!='D')continue;
				if(dist_water[nextx][nexty]!=-1&&dist_water[nextx][nexty]<=dist_go[x][y]+1) continue;
				if(visited[nextx][nexty]==1)continue;
				q.offer(new xy(nextx,nexty));
				visited[nextx][nexty]=1;
				dist_go[nextx][nexty]=dist_go[x][y]+1;
    		}
    	}
    	
    	
    }
  
}
