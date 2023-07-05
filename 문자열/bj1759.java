import java.util.*;

public class bj1759 {
static int L,C;
static ArrayList<Character> list=new ArrayList<>();
static Scanner scan=new Scanner(System.in);
static boolean[] visited;
static char[] tmp;
static ArrayList<String> answer=new ArrayList<>();
public static void main(String[] args) {
		// TODO Auto-generated method stub
		L=scan.nextInt();
		C=scan.nextInt();
		visited=new boolean[C];
		tmp=new char[L];
		for(int i=0;i<C;i++) {
			list.add(scan.next().charAt(0));
		}
		Collections.sort(list);
			sol(0,0,0,0);


		Collections.sort(answer);
		for(int i=0;i<answer.size();i++) {
			System.out.println(answer.get(i));
		}
	}
	public static void sol(int ja, int mo, int cnt,int start) {
		if(cnt==L) {
			//basecase
			if(ja>=2&&mo>=1) {
				String str = "";
				for(int i=0;i<L;i++) {
					str+=tmp[i];
				}
				answer.add(str);
			}
			return;
		}
		for(int i=start;i<C;i++) {
			if(!visited[i]) {
				visited[i]=true;
				char a = list.get(i);
				tmp[cnt] = a;
				if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
					sol(ja,mo+1,cnt+1,i+1);
				}else {
					sol(ja+1,mo,cnt+1,i+1);
				}
				visited[i]=false;
			}
		}
	}
}