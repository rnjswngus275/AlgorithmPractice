import java.io.*;
import java.util.*;

public class 백준1002 {
	static Scanner scan =new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T=scan.nextInt();
		for(int i=0;i<T;i++) {
			int x1=scan.nextInt();
			int y1=scan.nextInt();
			int r1=scan.nextInt();
			int x2=scan.nextInt();
			int y2=scan.nextInt();
			int r2=scan.nextInt();
			System.out.println(solve(x1,y1,r1,x2,y2,r2));
		}
			
	}
	static int solve(int x1, int y1, int r1, int x2, int y2,int r2) {
		int dist=(int)(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		
		if(x1==x2&&y1==y2&&r1==r2) {
			return -1;
		}
		else if(dist>Math.pow(r1+r2, 2)) {
			return 0;
		}
		else if(dist<Math.pow(r2-r1, 2)) {
			return 0;
		}
		else if(dist==Math.pow(r2-r1, 2)) {
			return 1;
		}
		else if(dist==Math.pow(r1+r2, 2)) {
			return 1;
		}
		else return 2;
	}



}
