import java.util.*;
public class swea2001 {
	static int T,n,m,max;
	static Scanner scan=new Scanner(System.in);
	static int[][] arr;
	static boolean[][] visitedv,visitedh;
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T=scan.nextInt();
	
		for(int i=0;i<T;i++) {
			max=Integer.MIN_VALUE;
			n=scan.nextInt();
			m=scan.nextInt();
			arr=new int[n][n];
			for(int j=0;j<n;j++) {
				for(int l=0;l<n;l++) {
					arr[j][l]=scan.nextInt();
				}
			}
			for(int q=0;q<=n-m;q++) {
				for(int w=0;w<=n-m;w++) {
					sol(q,w);
				}
			}
			
			
			
			sb.append("#"+(i+1)+" "+max+"\n");
		}
		System.out.print(sb);
	}
	static void sol(int startx,int starty) {
		int sum=0;
		for(int i=startx;i<startx+m;i++) {
			for(int j=starty;j<starty+m;j++) {
				sum+=arr[i][j];
			}
		}
		if(max<sum) max=sum;
		
		
	}

}
