import java.io.*;
import java.util.*;

public class Main {
	static Scanner scan=new Scanner(System.in);
	static int[][] arr;
	static int k,n,x,y,max;
	static int[] visited;
	static Queue<Integer> q=new LinkedList<>();
    public static void main(String[] args)  {
    		
    		n=scan.nextInt();
    		k=scan.nextInt();
    		visited=new int[100001];
    		if(n==k) {
    			System.out.print(0);
    		}
    		else {
    		
    		q.offer(n);
    		while(!q.isEmpty()) {
    			
    			int a=q.poll();
    			
    			//왼쪽으로 한칸
    			if(a-1>=0&&visited[a-1]==0) {
    				q.offer(a-1);
    				visited[a-1]=visited[a]+1;
    			}
    			//오른쪽으로  한칸
    			if(a+1<=100000&&visited[a+1]==0) {
    				q.offer(a+1);
    				visited[a+1]=visited[a]+1;
    			}
    			//오른쪽으로 곱하기 2칸
    			if(a*2<=100000&&visited[a*2]==0) {
    				q.offer(a*2);
    				visited[a*2]=visited[a]+1;
    			}
    		}
			System.out.print(visited[k]);

    		}
      }
  
}
