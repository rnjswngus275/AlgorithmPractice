import java.util.Scanner;

public class bj9095 {
	static Scanner scan=new Scanner(System.in);
	static int [] dp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=scan.nextInt();
		dp=new int[11];
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		
		for(int i=4;i<11;i++) {
			dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
		}
		for(int i=0;i<t;i++) {
			int n=scan.nextInt();
			System.out.println(dp[n]);

		}
	}

}
