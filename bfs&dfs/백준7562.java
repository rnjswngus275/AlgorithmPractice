import java.io.*;
import java.util.*;

class xy{
	int x;
	int y;
	public xy(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
}

public class Main {
	static Scanner scan=new Scanner(System.in);
	static int[][] arr;
	static int l,a,b,x,y;
	static int[] dx= {2,2,1,1,-1,-1,-2,-2};
	static int[] dy= {1,-1,-2,2,-2,2,-1,1};
	static int[][] visited;
	
    public static void main(String[] args)  {
    
    	int t=scan.nextInt();	//테스트케이스의 개수
    		
    	for(int m=0;m<t;m++) {
    		l=scan.nextInt();	//체스판 한변의 길이
    		a=scan.nextInt();	//현재위치 (a,b)
    		b=scan.nextInt(); 
    		x=scan.nextInt();	// 가고싶은 위치(x,y)
    		y=scan.nextInt();
    	 	visited=new int[l][l];
    		bfs();
    	
    	}
    	
      }
    
    public static void bfs() {
    	Queue<xy> q=new LinkedList<>();
    	q.offer(new xy(a,b));//시작점
    	if(a==x&&b==y) {
			System.out.println("0");
			return;
		}
    	while(!q.isEmpty()) {
    		
    		xy xy=q.poll();
    		if(xy.x==x&&xy.y==y) {
    			System.out.println(visited[x][y]);
    			break;
    		}
    		for(int i=0;i<8;i++) {
    			int nextx=xy.x+dx[i];
    			int nexty=xy.y+dy[i];
    			
    			if(nextx<0||nexty<0||nextx>=l||nexty>=l) continue;
    			if(visited[nextx][nexty]==0) {
    				q.offer(new xy(nextx,nexty));
    				visited[nextx][nexty]=visited[xy.x][xy.y]+1;
    			}
    		}
    	}
    	
    }
    
   
  
}
