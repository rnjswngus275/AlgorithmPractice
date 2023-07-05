import java.util.Scanner;

public class bj3085 {
	static Scanner scan=new Scanner(System.in);
	static int n,m;
	int[] dx= {-1,1,0,0};
	int[] dy= {0,0,1,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scan.nextInt();
		char[][] arr=new char[n][n];
		for(int i=0;i<n;i++) {
			String str=scan.nextLine();
			for(int j=0;j<n;j++) {
				arr[i][j]=str.charAt(j);
			}
		}
		
		
	}
	
	public static void check() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {}
		}
	}
}
