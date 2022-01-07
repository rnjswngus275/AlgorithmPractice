
import java.util.*;

public class Main {

	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=scanner.nextInt();
		int[][] data=new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				data[i][j]=scanner.nextInt();
			}
		}
		int[][] go=new int[19][19];
		
		for(int k=0;k<19;k++) {
			for(int m=0;m<19;m++) {
				for(int a=0;a<n;a++) {
					if (data[a][0]==k+1&&data[a][1]==m+1) {
						go[k][m]=1;
//						System.out.println(k+" "+m+"값");
					}
				}//data 배열에 i와 j 값이 지금 go의 [k][m]값과 같으면 go[k][m]의 값을 1로 바꾼다.
				System.out.print(go[k][m]+" ");
			}
			System.out.print("\n");
		}
	}
}



