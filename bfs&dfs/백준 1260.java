import java.util.*;

public class Main {
	public static Scanner scan =new Scanner(System.in);
	public static StringBuilder sb=new StringBuilder();
	public static StringBuilder sb2=new StringBuilder();

	static int n,m,v;
	static int[][] arr;

	static int[] visited;
	static int[] visited2;

	static String command;

	public static void main(String[] args) {
		
		n=scan.nextInt();
		m=scan.nextInt();
		v=scan.nextInt();
		arr=new int[n+1][n+1];
		visited=new int[n+1];
		visited2=new int[n+1];

		for(int i=0;i<m;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			arr[a][b]=1;
			arr[b][a]=1;
		}
		DFS(v);
		System.out.println(sb);
		BFS(v);
		System.out.println(sb2);

		}
	
	public static void DFS(int v) {
		Stack<Integer> stack =new Stack<>();

		stack.push(v);
		
		while(!stack.empty()) {
			int curr=stack.pop();	//노드를 pop
			
			if(visited[curr]==1)continue;		//방문한 노드이면 skip
			//그렇지 않으면
			visited[curr]=1;
			sb.append(curr+" ");
			for(int i=n;i>0;i--) {
				if(visited[i]==0&&arr[curr][i]==1) {//방문하지 않은 노드이고 간선이 존재하는 경우
					stack.push(i);
				}
			}
		}
		}
	public static void BFS(int v) {
		Queue<Integer> q=new LinkedList<>();
		
		visited2[v]=1;
		q.offer(v);
		
		while(q.isEmpty()==false) {
			int curr=q.poll();
			sb2.append(curr+" ");	//실제 방문
			
			for(int i=1;i<n+1;i++) {
				if(visited2[i]==0&&arr[curr][i]==1) {//방문하지 않은 노드이고 간선이 존재하는 경우
					visited2[i]=1;
					q.offer(i);
				}
			}
		}
	
	}
	
		}
