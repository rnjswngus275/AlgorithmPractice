import java.util.ArrayList;
import java.util.Scanner;


public class 백준5567 {
	static int n,m,cnt=0;
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static boolean[] visited;
	static Scanner scan =new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		// 입력
		n=scan.nextInt();
		m=scan.nextInt();
		for(int i=1;i<=n+1;i++) {
			list.add(new ArrayList<Integer>());
		}
		visited=new boolean[n+1];
		for(int i=0;i<m;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			list.get(a).add(b);
			list.get(b).add(a);
			}
		visited[1]=true;
		for(int i=0;i<list.get(1).size();i++) {
			if(!visited[list.get(1).get(i)]) {
				visited[list.get(1).get(i)]=true;
				dfs(list.get(1).get(i),1);	
				cnt++;
			}
			else {
				dfs(list.get(1).get(i),1);	
			}
		}
	
		System.out.print(cnt);

	}
	static void dfs(int i, int depth) {
		if(depth==2) {
			cnt++;
			return ;
		}
		for(int k=0;k<list.get(i).size();k++) {
			if(list.get(i).get(k)!=null&&!visited[list.get(i).get(k)]) {
				visited[list.get(i).get(k)]=true;
				dfs(k,depth+1);
			}
		}
	}

}
