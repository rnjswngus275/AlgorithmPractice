import java.util.Scanner;

public class 백준1003 {
    public static Scanner scan=new Scanner(System.in);
    public static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) {
        // TODO Auto-generated method stub
           int t =scan.nextInt();
           for(int i=0;i<t;i++) {
               int n=scan.nextInt();
               sol(n);
           }
           System.out.println(sb);
    }
    public static void sol(int n) {
        int[][] dp=new int[n+2][2];
        dp[0][0]=1;
        dp[0][1]=0;
        dp[1][0]=0;
        dp[1][1]=1;
        

        for(int i=2;i<=n;i++) {
            dp[i][0]=dp[i-2][0]+dp[i-1][0];
            dp[i][1]=dp[i-2][1]+dp[i-1][1];
            
        }
        
        sb.append(dp[n][0]+" ");
        sb.append(dp[n][1]+"\n");
    }
}
