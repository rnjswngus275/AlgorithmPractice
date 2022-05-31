import java.util.*;
import java.util.Scanner;

public class 백준1654 {
	static Scanner scan =new Scanner(System.in);
	static int k,n,sum=0,ans=0;
	static int[] arr;
	static long max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k=scan.nextInt();
		n=scan.nextInt();
		arr=new int[k];
		for(int i=0;i<k;i++) {
			arr[i]=scan.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		max++;
		long min=0;
		long mid=0;
		
		while(min<max) {
			mid=(max+min)/2;		//임시로 계산해볼 길이 
			long cnt=0;
			for(int i=0;i<k;i++) {
				cnt+=(arr[i]/mid);
			}
			if(cnt<n) {
				max=mid;
			}
			else min=mid+1;
		}
		System.out.println(min-1);
	}
		
}