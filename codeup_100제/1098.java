import java.util.*;

public class Main {

	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		
		int[][] pan=new int[x][y];		//판
		int n=scanner.nextInt();		//막대의 개수
		
		for(int i=0;i<n;i++) 	//막대 개수만큼 반복
		{
			int height =scanner.nextInt();
			int direction=scanner.nextInt();
			int x1=scanner.nextInt();
			int y1=scanner.nextInt();
			
			if(direction ==1) {		//세로 막대
				for(int j=0;j<height;j++) {
					pan[x1-1][y1-1]=1;
					x1++;
					
				}
			}
			else if (direction ==0) {		//가로막대
				for(int j=0;j<height;j++) {
					pan[x1-1][y1-1]=1;
					y1++;

				}
				
			}
		}
		for(int k=0;k<x;k++) {
			for(int m=0;m<y;m++) {
				System.out.print(pan[k][m]+" ");

			}
			System.out.print("\n");
		}

	}
}
