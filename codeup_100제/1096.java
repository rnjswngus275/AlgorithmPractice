import java.util.*;

public class Main {

	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=scanner.nextInt();
		int[][] go=new int[19][19];
		for(int i=0;i<n;i++) {
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			go[x-1][y-1]=1;
		}
		
		for(int j=0;j<19;j++) {
			for(int k=0;k<19;k++) {
				System.out.print(go[j][k]+" ");
			}
			System.out.print("\n");
		}
		
	
	}
}





