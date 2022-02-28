import java.io.*;
import java.util.*;

class xy{
	int x;
	int y;
	
	public xy(int x,int y){
		this.x=x;
		this.y=y;
	}
}

public class Main {
	static Scanner scan=new Scanner(System.in);
	static int[][] arr;
	static int m,n,x,y,max;
	static int[] dx= {1,0,0,-1};
	static int[] dy= {0,-1,1,0};
	static int[][] visited;
	static Queue<xy> q=new LinkedList<>();
    public static void main(String[] args)  {
    	m=scan.nextInt();//가로
    	n=scan.nextInt();//세로
    	
    	arr=new int[n][m];
    	
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			arr[i][j]=scan.nextInt();
    			if(arr[i][j]==1) {
    				q.offer(new xy(i,j));
    			}
    		}
    	}
        //모든 판을 탐색 : q에 두개씩 한번에 넣어서 다 poll한다음에 next꺼 
    	while(!q.isEmpty()) {
    		xy xy=q.poll();
    		for(int i=0;i<4;i++) {
    			int nextx=xy.x+dx[i];
    			int nexty=xy.y+dy[i];
    			if(nextx<0||nexty<0||nextx>=n||nexty>=m||arr[nextx][nexty]!=0) continue;
    			
    			arr[nextx][nexty]=arr[xy.x][xy.y]+1;
    			q.offer(new xy(nextx,nexty));
    		}
    	}
    	if(check()) {
    		System.out.println(max-1);
    	}
    	else
    	{
			System.out.print(-1);
    	}
    	
      }
    	public static boolean check() {
    		for(int i=0;i<n;i++) {
        		for(int j=0;j<m;j++) {
        			//안익은 토마토가 있을때
        			if(arr[i][j]==0) {
        				return false;
        			}
        			//날짜 최종인 곳 구하기
        			max=Math.max(max, arr[i][j]);
        		}
        	}
    		return true;
    	}
   
  
}
