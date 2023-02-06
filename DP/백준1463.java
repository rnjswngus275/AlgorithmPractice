import java.util.Arrays;
import java.util.Scanner;

public class 백준1463 {
    public static Scanner scan=new Scanner(System.in);
    public static StringBuilder sb=new StringBuilder();
    public static int min=Integer.MAX_VALUE;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n=scan.nextInt();
        sol(n);
    }
    
    public static void sol(int n) {

        int []dp=new int [n+4];
        Arrays.fill(dp, Integer.MAX_VALUE-1);
        dp[1]=0;
        dp[2]=1;
        dp[3]=1;
        for(int i=4;i<=n;i++) {
            if(i%3==0)  dp[i]=Math.min(dp[i], dp[i/3]+1);
            if(i%2==0)  dp[i]=Math.min(dp[i], dp[i/2]+1);

            dp[i]=Math.min(dp[i], dp[i-1]+1);
            
        }
        System.out.println(dp[n]);
    }

}
