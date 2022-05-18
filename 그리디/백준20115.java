import java.util.*;
public class 백준20115 {
	static int n,m,cnt=0,answer=0;
	static double ans=0;
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
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(i==n-1) {
				ans+=arr[i];
			}
			else ans+=(double)arr[i]/2;
		}
		System.out.print(ans);
	}

}
