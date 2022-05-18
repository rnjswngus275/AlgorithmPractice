import java.util.*;

public class 백준11508 {
	static int n,m,cnt=0,answer=0;
	static long ans=0;
	static Scanner scan =new Scanner(System.in);
	static long MIN=Long.MAX_VALUE;
	static StringBuilder sb=new StringBuilder();
	static Integer[] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=scan.nextInt();
		arr=new Integer[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr,Comparator.reverseOrder());
		for(int i=0;i<n;) {
			if(n-i<3) {
				ans+=arr[i];
				i++;
			}
			else {
				ans+=arr[i]+arr[i+1];
				i+=3;
			}
		}
		System.out.print(ans);
		
	}

}
