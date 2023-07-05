import java.util.Scanner;

public class bj6064 {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		int t=scan.nextInt();
		for(int i=0;i<t;i++) {
			boolean flag=false;
			int n=scan.nextInt();
			int m=scan.nextInt();
			int x=scan.nextInt()-1;
			int y=scan.nextInt()-1;
			
			if(n==x) {
				x=0;
			}
			if(m==y) {
				y=0;
			}
			int a;
			
			for(int j=x;j<m*n;j+=m) {
				if(j%m==y) {
					System.out.println(j+1);
					flag=true;
					break;
				}
			}
			if(!flag)System.out.println(-1);

		}
		
		
	}
}
