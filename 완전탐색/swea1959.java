import java.util.*;

public class swea1959 {
	static int T,ans,cnt;
	static Scanner scan=new Scanner(System.in);
	static int[] arr;
	static int[] arr2;
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T=scan.nextInt();
		for(int i=0;i<T;i++) {
			int n=scan.nextInt();
			int m=scan.nextInt();
			
			arr=new int[n];
			arr2=new int[m];
			
			for(int j=0;j<n;j++) {
				arr[j]=scan.nextInt();
			}
			for(int l=0;l<m;l++) {
				arr2[l]=scan.nextInt();
			}
			if(n<m) {
				ans=sol(n,m);
			}
			else ans=sol2(m,n);
			cnt++;
			sb.append("#"+cnt+" "+ ans+"\n");
		}
		System.out.print(sb);
		
	}
	static int sol(int a,int b) {
		int c=b-a;
		int start=0;
		int max=Integer.MIN_VALUE;
		while(start<c+1) {
			int sum=0;
			int j=0;
			for(int i=start;i<start+a;i++) {
				sum+=arr[j]*arr2[i];
				j++;
				
			}
			start++;
			if(max<sum) {
				max=sum;
			}
			
		}
		return max;	
	}
	static int sol2(int a,int b) {
		int c=b-a;
		int start=0;
		int max=Integer.MIN_VALUE;
		while(start<c+1) {
			int sum=0;
			int j=0;
			for(int i=start;i<start+a;i++) {
				sum+=arr2[j]*arr[i];
				j++;
				
			}
			start++;
			if(max<sum) {
				max=sum;
			}
			
		}
		return max;	
	}
}
