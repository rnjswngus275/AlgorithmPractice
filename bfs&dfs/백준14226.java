import java.io.*;
import java.util.*;
class time{
	int time;
	int a;
	int clip;
	time(int a,int time,int clip){
		this.a=a;
		this.time=time;
		this.clip=clip;
	}
}
public class Main {
	static Scanner scan=new Scanner(System.in);
	static int[][] arr;
	static int s,n,x,y,max;
	static int[][] visited;
	static int[] cnt;
	static Queue<time> q=new LinkedList<>();
	static StringBuilder sb=new StringBuilder();
    public static void main(String[] args)  {
    		
    	s=scan.nextInt();
    	visited=new int[1001][1001];
    	  bfs();
      }
    public static void bfs() {
    	q.offer(new time(1,0,0));
    	visited[1][0]=1;
    	while(!q.isEmpty()) {
    		time t=q.poll();
    		int time=t.time;
    		int a=t.a;
    		int c=t.clip;//클립보드
    		
    		if(a==s) {
    			System.out.println(time);
    			break;
    		}
    		
    		//복사
    		if(a!=c&&visited[a][a]==0) {
    			q.offer(new time(a,time+1,a));
    			visited[a][a]=1;
    		}

    		//지우기 -1
    		if(a-1>2&&visited[a-1][c]==0) {
    			visited[a-1][c]=1;
    			q.offer(new time(a-1,time+1,c));
    		}
    		
    		//붙여넣기
    		if(c+a<=1000&&visited[c+a][c]==0&&c!=0) {
    			visited[c+a][c]=1;
    			q.offer(new time(a+c,time+1,c));
    		}
    		
    	}
    	
    	
    }
  
}
