import java.util.Scanner;

public class 백준11403 {
	static int N,cnt=0;
	static Scanner scan =new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	static int[][] arr,arr2;
	static boolean[][] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=scan.nextInt();
		arr=new int[N+1][N+1];

		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {				
				arr[i][j]=scan.nextInt();
			}
		}
		for(int k=1;k<=N;k++) {// 거쳐가는 노드
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					if(arr[i][k]==1&&arr[k][j]==1) {
						arr[i][j]=1;
					}
				}
			}
		}
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				sb.append(arr[i][j]+" ");
			}
			sb.append("\n");
		}
	
		System.out.print(sb);
	}

}
