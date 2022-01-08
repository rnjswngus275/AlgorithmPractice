import java.util.*;

public class Main {

	public static Scanner scanner=new Scanner(System.in);
	static int n;
	static int[][]board=new int[100][100];
	static void fill(int r, int c) {
		if(r<0||r>n-1||c<0||c>n-1)return;//벽에 막혔거나 배열을 뚫고 나가려고할때 return
		if(board[r][c]!=0) return; //가야할 곳이 이미 1로 채워져 있을 때
		
		board[r][c]=1;
		
		fill(r-1,c);
		fill(r+1,c);
		fill(r,c-1);
		fill(r,c+1);
		//상하좌우 1로 채우러 가기
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n= scanner.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]=scanner.nextInt();
				
			}
		}
		int sRow,sCol;
		sRow=scanner.nextInt();
		sCol=scanner.nextInt();
		fill(sRow,sCol);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(board[i][j]+" ");
				
			}
			System.out.print("\n");
		}	
		}
}
