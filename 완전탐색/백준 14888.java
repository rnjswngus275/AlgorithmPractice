import java.util.*;

public class Main {
	public static Scanner scanner=new Scanner(System.in);
	static int n;
	static int[] data,cal;
	static int max;
	static int min;
	public static void main(String[] args) {
		n=scanner.nextInt();		//수의 개수
		data=new int[n];
		cal=new int[4];
		max=Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			data[i]=scanner.nextInt();				//수 배열
		}
		for(int j=0;j<4;j++) {
			cal[j]=scanner.nextInt();		// 덧 뺄 곱 나눗셈의 순서로 
		}
		solve(data[0],0);
		
		System.out.println(max+" "+min);
		}
	public static int calculate(int a,int b, int c) {
		if(c==0) {//덧
			return b+a;
			 
		}
		else if(c==1) //뺄
		{
			return b-a;

		}
		else if (c==2) {//곱
			return b*a;

		}
		else if(c==3) {//나눗
			return b/a;

		}
		return 0;
	}
	//sum : 계산 한 값을 넣을 변수 j: data배열에서 현재위치 
	public static void solve(int sum, int j) {			
			//i번째 까지 계산한 값과 i+1번째 숫자를 i번째 부호로 계산을 하는 함수
		if(j==n-1) {//base case
			max= Math.max(max,sum);
			min=Math.min(min,sum);
		}
		
		for(int i=0;i<4;i++) {		//부호를 다 쓸 때까지 반복

			if(cal[i]==0) {	//해당 인덱스에 해당하는 부호가 없을 때
				continue;
			}

			cal[i]--;	//사용했다고 표시해주기
			solve(calculate(data[j+1],sum,i),j+1);

			cal[i]++;
		}
		
	}
	

}
