import java.util.*;

public class Main {
	public static Scanner scan =new Scanner(System.in);
	public static int dx[]= {0,0,1,-1};			//(x,y) 1. 오른쪽으로 한칸 , 2. 왼쪽으로한칸, 3. 아래로 한칸, 4. 위로 한칸
	public static int dy[]= {1,-1,0,0};
	static int n,m,v;
	static int[][] arr,arr2;
	static int cnt,cnt2=0;
	static int[] dan=new int[25*25];
	static boolean[] visited;
	static ArrayList<Integer>[] list;

	public static void main(String[] args) {
		
		n=scan.nextInt();
		m=scan.nextInt();
		visited=new boolean[n];
		list=new ArrayList[n];
		
		for(int i = 0; i < n; i++) {
			list[i] = new ArrayList<Integer>();
		}

		for(int i=0;i<m;i++) {		
			int a=scan.nextInt();
			int b=scan.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		
		for(int i=0;i<n;i++) {// n까지 방문하지 않은 노드 방문
			if(cnt2==0) {
				dfs(i,1);
				}
			
		}

		System.out.print(cnt2);
	}
	
	public static void dfs(int i,int cnt) {		
		if(cnt==5) {
			cnt2=1;
			return;
		}
		visited[i]=true;
		//방문했다고 표시
		//인접 노드 찾기
		for(int k:list[i]) {	//인접리스트에 포함된 값
			if(visited[k]==false) {
				dfs(k,cnt+1);
				
			}
		}
		visited[i]=false;
		
	}
	
	
	
		}
