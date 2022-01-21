import java.util.*;

public class Main {
	public static Scanner scanner=new Scanner(System.in);
	public static StringBuilder sb=new StringBuilder();
	static int n,m;
	static char arr[][];
	static int ans;
	static int max=0,max2=0,MAX=0;
	public static void main(String[] args) {
			n=scanner.nextInt();
			arr=new char[n][n];
			for(int i=0; i<n; i++) {
				String str = scanner.next();
				for(int j=0; j<n; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			
			
			solve();
			System.out.print(max);
			
		}


	public static void solve() {		// 1. 가로를 바꾸고비교 한다.  max를 구한다 2. 세로를 비교한다.  max를 구한다.
		//max : 사탕의 최대 개수
		char tmp ;
		for(int j=0;j<n;j++) {		//행
			for(int i=0;i<n-1;i++) {		//열		
					//자리교체
					tmp=arr[j][i];
					arr[j][i]=arr[j][i+1];
					arr[j][i+1]=tmp;
					
					count();
					//원상복구
					tmp=arr[j][i];
					arr[j][i]=arr[j][i+1];
					arr[j][i+1]=tmp;
					}
			}
				
		for(int j=0;j<n;j++) {		//열
			for(int i=0;i<n-1;i++) {		//행
					
					tmp=arr[i][j];
					arr[i][j]=arr[i+1][j];
					arr[i+1][j]=tmp;
					
					count();
					//원상복구
					tmp=arr[i][j];
					arr[i][j]=arr[i+1][j];
					arr[i+1][j]=tmp;
		
			}
		}
		return ;
		
		}
	
	public static void count() {	
		
		//가로 세기
		for(int m=0;m<n;m++) {
			int cnt=1;
			for(int k=0;k<n-1;k++) {
			if(arr[m][k]==arr[m][k+1]) {	
				cnt++;		
			}
			else {
			cnt=1;
			}
			
			max=Math.max(max, cnt);
			}
		}
			
		//세로 세기
		for(int m=0;m<n;m++) {
			int cnt=1;
			for(int k=0;k<n-1;k++) {
			if(arr[k][m]==arr[k+1][m]) {	
				cnt++;		
			}
			else {
			cnt=1;
			}
			
			max=Math.max(max, cnt);
			}
		}
		return;
	}

}
