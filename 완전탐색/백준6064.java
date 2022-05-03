import java.util.*;

public class 백준6064 {
	public static Scanner scan =new Scanner(System.in);
	public static StringBuilder sb=new StringBuilder();
	static int t, n,x,y, m,arr[][],ans;
	static int k=0;
	static int tmp=0,tmp2=0;
	static int flag;
	public static void main(String[] args) {
			t=scan.nextInt();
			for(int i=0;i<t;i++) {
				m=scan.nextInt();
				n=scan.nextInt();
				x=scan.nextInt();
				y=scan.nextInt();	
				solve(m,n,x,y);
				System.out.println(ans);
			}
			
		}

	public static void solve(int m,int n, int x,int y) {	
	
		if(x==m) {
			x=0;
		}
		if(y==n) {
			y=0;
		}
		for(int i=x;i<m*n;i+=m) {
			if(i%n==y) {
				ans=i;
				return;
			}
		
		}
		ans=-1;
		}
	

	
}
