package codeup100;

import java.util.*;

public class Main {
	public static Scanner scanner=new Scanner(System.in);
	static int n;
	static int[][] data;
	static int count=0;
	static int queen=0;
	public static void main(String[] args) {
		n=scanner.nextInt();		
		data=new int[n][n];

		solve(0);
		System.out.print(count);
		}

	public static void solve(int line) {
		// 한줄에 한개씩 퀸을 놓는 자리를 설정 가능한 자리는 0 안되면+1한다.
		if(line==n){	//base case
			count++;
			return;
		}
		
		for(int i=0;i<n;i++) {		// line번째 줄에 i번째 자리에 퀸의 자리를 결정
			
			if(data[line][i]==0){	
				//line+1 부터 n행까지 대각선, 아래 방향을 체크해준다. 
				int k=i+1; //오른쪽 대각선
				int m=i-1; //왼쪽 대각선
					
				for(int j=line+1;j<n;j++) {	
					if(k<n) {		//k가 n보다 작거나 같으면 체크 (대각선 오른쪽)
						
						data[j][k]+=1;
						k++;

					}
					if(m>=0) {//m이 0보다 크거나 같으면 체크 (대각선 왼쪽)
						data[j][m]+=1;						
						m--;


					}
					data[j][i]+=1;//직선 아래 방향 체크

				}
				
				solve(line+1);
				
				int a=i+1; //오른쪽 대각선
				int b=i-1; //왼쪽 대각선
				for(int j=line+1;j<n;j++) {	
					if(a<n) {		//k가 n보다 작거나 같으면 체크 (대각선 오른쪽)
						
						data[j][a]-=1;
						a++;

					}
					if(b>=0) {//m이 0보다 크거나 같으면 체크 (대각선 왼쪽)
						data[j][b]-=1;						
						b--;
					}
					data[j][i]-=1;//직선 아래 방향 체크
				}	

			}
		
		}
			
	}

}
