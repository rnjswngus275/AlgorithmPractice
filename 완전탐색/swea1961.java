import java.util.*;

public class swea1961 {
	static int T,n,m,max;
	static Scanner scan=new Scanner(System.in);
	static int[][] arr,arr2;
	static boolean[][] visitedv,visitedh;
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T=scan.nextInt();
		
		for(int i=0;i<T;i++) {
			n=scan.nextInt();
			arr=new int[n][n];
			arr2=new int[n][n*3];
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					arr[j][k]=scan.nextInt();
				}
			}
			int x=0;
			int y=0;
			while(x<n) {
				y=0;
			for(int a=n-1;a>=0;a--) {
				arr2[x][y]=arr[a][x];
				y++;
				
			}
			x++;
			}
			
			
			int l=0;
			x=n-1;
			y=0;
			while(l<n) {
				y=0;
			for(int a=n-1;a>=0;a--) {
				arr2[l][y+n]=arr[x][a];
				y++;
				
			}
			x--;
			l++;
			}
			
			l=0;
			x=n-1;
			while(l<n) {
				y=0;
			for(int a=n-1;a>=0;a--) {
				arr2[l][y+(2*n)]=arr[y][x];
				y++;
				
			}
			x--;
			l++;
			}
			
			System.out.println("#"+(i+1));
			for(int q=0;q<n;q++) {
				for(int p=0;p<n*3;p++) {
					if(p>0&&p%n==0) System.out.print(" ");
					
					System.out.print(arr2[q][p]);
				}
				
				System.out.println();
			}
			
		}
	
	}

}
