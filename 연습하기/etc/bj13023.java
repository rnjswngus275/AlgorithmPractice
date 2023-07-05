package etc;
import java.util.*;
public class bj13023 {
	static int n,m;
	static Scanner scan=new Scanner(System.in);
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static boolean[]visited;
	static int cnt=0;
	static boolean flag=false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=scan.nextInt(); //사람의 수
		m=scan.nextInt(); //관계의 수
		visited=new boolean[2000];
		for(int i=0;i<n;i++) {
			list.add(new ArrayList<>());
		}
		for(int i=0;i<m;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			list.get(a).add(b);
			list.get(b).add(a);
			
		}
		
		for(int i=0;i<n;i++) {
			visited[i]=true;
			cnt=1;
			sol(i);
			visited=new boolean[2000];
			if(flag) break;
			
		}
		if(flag)System.out.println(1);
		else System.out.println(0);
		
	}
	public static void sol(int a) {
		if(cnt==5){
			flag=true;
			return;
		}
		
		ArrayList<Integer> nums=list.get(a);
		for(int i=0;i<nums.size();i++) {
			int num=nums.get(i);
			Boolean isvisited=visited[num];
			if(!isvisited) {
				visited[num]=true;
				cnt++;
				sol(num);
				visited[num]=false;
				cnt--;
			}
		}
	}

}
