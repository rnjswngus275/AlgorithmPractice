import java.util.*;

public class Main {
	public static Scanner scan =new Scanner(System.in);
	static int e,s,m,ans;
	public static void main(String[] args) {
		
			e=scan.nextInt();
			s=scan.nextInt();
			m=scan.nextInt();
			
			if(e==15) {
				e=0;
			}
			if(s==28) {
				s=0;
			}
			if(m==19) {
				m=0;
			}
			solve();
			System.out.print(ans);
		}

	public static void solve() {	
		
		
		int n=1;
		while(true) {
			
			if(n%15==e&&n%28==s&&n%19==m) {
				ans=n;
				break;
			}
			n+=1;
		}
		
		
		}

}
