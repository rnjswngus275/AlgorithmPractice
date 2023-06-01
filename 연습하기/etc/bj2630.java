package etc;

import java.util.Scanner;

public class bj2630 {
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	static int [][] arr;
	static int blue,white;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scan.nextInt();
		arr=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		check(0,0,n);
		System.out.println(white+"\n"+blue);
	}
	public static void check(int startx, int starty, int length) {
		//모두 같은 색갈인지 체크
		int check=arr[startx][starty];
		if(length ==1) {
			if(check==1) {
				blue+=1;
			}
			else {
				white+=1;
			}
			return;
		   }
		
		for(int i=startx;i<startx+length;i++) {
			for(int j=starty;j<starty+length;j++) {
				if(check!=arr[i][j]) {
					cut(startx,starty,length);
					return;
				} 
			}
		}
		if(check==1) {blue++;}
		else white++;
		return;
	}
	public static void cut(int startx,int starty,int length) {
		check(startx,starty,length/2);
		check(startx+length/2,starty,length/2);
		check(startx,starty+length/2,length/2);
		check(startx+length/2,starty+length/2,length/2);
		
	}

}
