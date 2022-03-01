import java.io.*;
import java.util.*;

public class Main {
	static Scanner scan=new Scanner(System.in);
	static int[][] arr;
	static int k,n,x,y,max;
	static int[] visited;
	static int[] parent;
	static Queue<Integer> q=new LinkedList<>();
	static StringBuilder sb=new StringBuilder();
    public static void main(String[] args)  {
    		
    		n=scan.nextInt();
    		k=scan.nextInt();
    		visited=new int[100001];
    		parent=new int[100001];
    		if(n==k) {
    			System.out.println(0);
    			System.out.print(n);
    		}
    		else {
    		
    		q.offer(n);
    		while(!q.isEmpty()) {
    			
    			int a=q.poll();
    			if(a==k) {//동생을 잡으면
    				System.out.println(visited[k]);
    			}
    			//왼쪽으로 한칸
    			if(a-1>=0&&visited[a-1]==0) {
    				q.offer(a-1);
    				parent[a-1]=a;	
    				visited[a-1]=visited[a]+1;
    			}
    			//오른쪽으로  한칸
    			if(a+1<=100000&&visited[a+1]==0) {
    				q.offer(a+1);
    				parent[a+1]=a;	
    				visited[a+1]=visited[a]+1;
    			}
    			//오른쪽으로 곱하기 2칸
    			if(a*2<=100000&&visited[a*2]==0) {
    				q.offer(a*2);
    				parent[a*2]=a;	
    				visited[a*2]=visited[a]+1;
    			}
    			
    			
    		}
    		
    		//출력
    		Stack<Integer> s=new Stack<>();
    		int idx=k;
    		while(idx!=n) {
    			s.push(idx);
    			idx=parent[idx];
    		}
    		s.push(idx);
    		while(!s.isEmpty()) {
    			System.out.print(s.pop()+" ");
    		}
    		}
      }
  
}
