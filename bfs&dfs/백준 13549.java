import java.io.*;
import java.util.*;

public class Main {
	static Scanner scan=new Scanner(System.in);
	static int[][] arr;
	static int k,n,x,y,max;
	static int[] visited;
	static int[] cnt;
	static Queue<Integer> q=new LinkedList<>();
	static StringBuilder sb=new StringBuilder();
    public static void main(String[] args)  {
    		
    		n=scan.nextInt();
    		k=scan.nextInt();
    		visited=new int[100001];
    		cnt=new int[100001];
    		if(n==k) {
    			System.out.println(0);
    		}
    		else {
    		
    		q.offer(n);
    		while(!q.isEmpty()) {
    			
    			int a=q.poll();
    			if(a==k) {//동생을 잡으면
    				System.out.println(cnt[k]);
    			}
    			//오른쪽으로 곱하기 2칸
    			if(a*2<=100000&&visited[a*2]==0) {
    				q.offer(a*2);
    				cnt[a*2]=cnt[a];	
    				visited[a*2]=visited[a]+1;
    			}
    			//왼쪽으로 한칸
    			if(a-1>=0&&visited[a-1]==0) {
    				q.offer(a-1);
    				cnt[a-1]=cnt[a]+1;	
    				visited[a-1]=visited[a]+1;
    			}
    			//오른쪽으로  한칸
    			if(a+1<=100000&&visited[a+1]==0) {
    				q.offer(a+1);
    				cnt[a+1]=cnt[a]+1;	
    				visited[a+1]=visited[a]+1;
    			}
    			
    			
    			
    		}
    		}
      }
  
}
