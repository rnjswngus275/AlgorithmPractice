import java.util.*;

public class 백준1758 {
	static int n,m,cnt=0,answer=0;
	static long ans=0;
	static Scanner scan =new Scanner(System.in);
	static long MIN=Long.MAX_VALUE;
	static StringBuilder sb=new StringBuilder();
	static Integer[] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=scan.nextInt();	//사람의 수
		arr=new Integer[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr,Comparator.reverseOrder());

		for(int i=0;i<n;i++) {
			long tip= arr[i]-(i);
			if(tip<0) {
				tip=0;
			}
			ans+=tip;
		}
		System.out.print(ans);
	}


}
