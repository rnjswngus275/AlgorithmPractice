package etc;

import java.util.Arrays;
import java.util.Scanner;

public class bj1920_2 {
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) {
		int n=scan.nextInt();
		int[] arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		
		int m=scan.nextInt();	
		int [] arr2=new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=scan.nextInt();		
		}

		for(int i=0;i<m;i++) {
			boolean flag=false;
			int start=0;
			int end=n-1;
			while(start<=end) {
				if(flag)break;
				int mid=(start+end)/2;
				if(arr2[i]>arr[mid]) {
					start=mid+1;
				}else if(arr2[i]<arr[mid]) {
					end=mid-1;
				}else flag=true;
			}
			if(flag)sb.append("1\n");
			else sb.append("0\n");
		}
		
		
		
		System.out.print(sb);
	}
}
