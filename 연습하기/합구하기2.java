import java.io.*;
import java.lang.*;
import java.util.*;


public class 합구하기2 {
	public static final Scanner scanner = new Scanner(System.in);

	/**
     * 동아리 멤버들의 탑승 가능 여부를 출력하는 함수
     *
     * @param data 각 멤버들의 몸무게 data[0] ~ data[n-1]
     * @param n    멤버들의 수
     * @param p    놀이기구 탑승 가능 체중 제한
     * @param q    놀이기구 최대 하중
     */
	public static void solve(int[] data, int n, int p, int q)
	{
		int S = 0;	//탑승가능한 사람의 몸무게 총 합
		int C = 0;	//탑승가능한 사람의 수
		for(int i=0;i<n;i++){
			if(data[i]<=p){		
				S+=data[i];	
				C++;					
			}
		}
		System.out.println(C+" "+S);
		if(S>q){
				System.out.printf("NO");
			}
		else{
				System.out.printf("YES");
		}
	}


	public static void main(String[] args)
	{
		int n = scanner.nextInt();
		int p = scanner.nextInt();
		int q = scanner.nextInt();
		int[] data = new int[n];
		for(int i = 0 ; i < n ; i ++)
		{
			data[i] = scanner.nextInt();
		}

		solve(data, n, p, q);
	}

}
