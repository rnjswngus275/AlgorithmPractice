import java.io.*;
import java.lang.*;
import java.util.*;

//n개의 숫자
// 평균
//평균과 가까운 숫자 (|평균-숫자|) 조건1 두개 이상일 경우 먼저 입력된 데이터 
public class 탐색하기3 {
	public static final Scanner scanner = new Scanner(System.in);


	/**
    * 평균과의 차가 가장 작은 데이터의 번호를 반환하는 함수
    * 여러 가지라면 가장 빠른 번호를 반환한다.
    *
    * @param data 
    * @param n 
    * @return int  가장 평균과 가까운 데이터의 번호 (1번부터 시작)
    */
	public static int findIndex(int[] data, int n)
	{
		int sum=0;
		int avg=0;
		int[] data2=new int[n];
		int min=Integer.MAX_VALUE;
		int min_index=0;
		for(int i=0;i<n;i++){
			sum+=data[i];
		}
		avg=sum/n;
		for(int i=0;i<n;i++){
			data2[i]=Math.abs(avg-data[i]);
		}
		for(int i=0;i<n;i++){
			if(min>data2[i]){
				min=data2[i];
				min_index=i;
			}
		}
		return min_index+1;
		
	}

	public static void main(String[] args)
	{
		int n = scanner.nextInt();
		int[] data = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			data[i] = scanner.nextInt();
		}

		int answer = findIndex(data, n);
		int index = answer - 1;
		System.out.printf("%d %d\n", answer, data[index]);
	}

}
