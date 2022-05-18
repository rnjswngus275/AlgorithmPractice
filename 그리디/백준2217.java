import java.util.*;
public class 백준2217 {
	static int n,m,cnt=0,answer=0;
	static Scanner scan =new Scanner(System.in);
	static int MAX=Integer.MIN_VALUE;
	static StringBuilder sb=new StringBuilder();
	static String[] str;
	static int[] arr;
	public static void main(String[] args) {
		
		//출력 : 들어올릴수있는 물체의 최대 중량
		//가장 작은 로프의 *n한 값
		n=scan.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		int a=n;
		for(int i=0;i<n;i++) {
			MAX=Math.max(arr[i]*a, MAX);
			a--;
		}
			System.out.print(MAX);
	}

}
