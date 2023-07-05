package etc;

import java.util.Scanner;

public class bj9663 {
	static Scanner scan=new Scanner(System.in);
	static int n;
	static boolean[][] pan;
	static int[]dx= {-1,1,0,0};
	static int[]dy= {0,0,-1,1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=scan.nextInt();
		pan=new boolean[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sol(i,j,0);
			}
		}
		
	}
	public static void sol (int x, int y, int cnt) {
		if(cnt==n) {
			
		}
		if(!pan[x][y]) {
			cnt++;
			//상하
			for(int i=0;i<n;i++) {
				pan[x][i]=true;
			}
			//좌우
			for(int i=0;i<n;i++) {
				pan[i][y]=true;
			}
			//대각선
			while()
			
		}
	}

}
