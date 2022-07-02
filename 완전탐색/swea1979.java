import java.util.*;

public class swea1979 {
	static int T,n,k,cnt;
	static Scanner scan=new Scanner(System.in);
	static int[][] arr;
	static boolean[][] visitedv,visitedh;
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T=scan.nextInt();
		for(int i=0;i<T;i++) {
			cnt=0;
			n=scan.nextInt();
			arr=new int[n][n];
			visitedv=new boolean[n][n];			
			visitedh=new boolean[n][n];

			k=scan.nextInt();
			
			for(int j=0;j<n;j++) {
				for(int m=0;m<n;m++) {
					arr[j][m]=scan.nextInt();
				}
			}
			for(int a=0;a<n;a++) {
				for(int b=0;b<n;b++) {
					if(arr[a][b]==1&&!visitedv[a][b]) {
						vertical(a,b);
						
					}
					if(arr[a][b]==1&&!visitedh[a][b]) {
						horizontal(a,b);
						
					}
				}
			}
			
			sb.append("#"+(i+1)+" "+cnt+"\n");
		}
		System.out.print(sb);
	}
	static void vertical (int a,int b) {
		int count = 0;
		for(int i=b;i<n;i++) {
			if(arr[a][i]==1) {
				count++;
				visitedv[a][i]=true;
			}
			else break;
		}
		if(count==k) cnt++;
	}
	static void horizontal(int a, int b) {
		int count = 0;
		for(int i=a;i<n;i++) {
			if(arr[i][b]==1) {
				count++;
				visitedh[i][b]=true;
			}
			else break;
		}
		if(count==k) cnt++;
	}
}
