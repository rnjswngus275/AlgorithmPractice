import java.util.*;
public class Main {

	public static Scanner scan =new Scanner(System.in);
	public static StringBuilder sb=new StringBuilder();
	public static int[] arr,visited,arr3;
	static int[] perm;
	static int N,num=0,cnt2;
	static boolean flag;
    public static void main(String[] args) {
    	//입력
    	N=scan.nextInt();
    	arr=new int[N+1];
    	visited=new int[N+1];
    	dfs(1);
    	System.out.print(sb);

    }
    
    static void dfs(int depth) {
    	if(depth ==N+1) {
    		for(int i=1;i<N+1;i++) {
    			sb.append(arr[i]).append(' ');
    		}
    		sb.append('\n');
    		return;
    	}
    	
    	for(int i=1;i<N+1;i++) {
    		if(visited[i]==1)continue;
    		arr[depth]=i;
    		visited[i]=1;
    		dfs(depth+1);
    		visited[i]=0;
    		
    	}
    }

 }
