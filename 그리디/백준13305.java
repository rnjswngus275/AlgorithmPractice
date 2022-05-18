import java.util.*;

public class 백준13305 {
	static int n,m,cnt=0,answer=0;
	static long ans=0;
	static Scanner scan =new Scanner(System.in);
	static long MIN=Long.MAX_VALUE;
	static StringBuilder sb=new StringBuilder();
	static long[] arr;
	static long[] arr2;
	public static void main(String[] args) {
		//출력 : 최소 비용
		n=scan.nextInt();	//도시의 갯수
		arr=new long[n];
		arr2=new long[n];
		for(int i=0;i<n-1;i++) {//도로의 길이 n-1개
			arr[i]=scan.nextLong();
		}
		for(int j=0;j<n;j++) {	//주유소의 리터당 가격 
			arr2[j]=scan.nextLong();
		}
		for(int i=0;i<n;i++) {
			if (arr2[i]<MIN) {
				MIN=arr2[i];
			}
			ans+=MIN*arr[i];
		}
		System.out.print(ans);
	}

}
