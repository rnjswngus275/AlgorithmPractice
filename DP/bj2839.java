import java.util.*;

public class bj2839 {
	static Scanner scan=new Scanner(System.in);
	static int [] dp;
	static class dp{
		int kg,cnt;
		public dp(int kg,int cnt) {
			this.kg=kg;
			this.cnt=cnt;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scan.nextInt();
		dp=new int [5001];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[3]=1;
		dp[5]=1;
		
		Queue<dp> q=new LinkedList<> ();
		q.offer(new dp(3,1));
		q.offer(new dp(5,1));
		while(!q.isEmpty()) {
			dp d=q.poll();
			if(d.kg+3<n+1&&dp[d.kg+3]>d.cnt+1) {
				q.offer(new dp(d.kg+3,d.cnt+1));
				dp[d.kg+3]=d.cnt+1;
			}
			if(d.kg+5<n+1&&dp[d.kg+5]>d.cnt+1) {
				q.offer(new dp(d.kg+5,d.cnt+1));
				dp[d.kg+5]=d.cnt+1;
			}
		}
		if(dp[n]==Integer.MAX_VALUE) {
			System.out.println(-1);
		}else System.out.println(dp[n]);
		
	}

}
