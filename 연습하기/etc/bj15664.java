package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class bj15664 {
	static Scanner scan=new Scanner(System.in);
	static int n,m;
	static int[] arr;
	static Integer[] nums;
	static LinkedHashSet<String> nums2=new LinkedHashSet<>();
	static boolean[] visited;
	static StringBuilder sb2=new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=scan.nextInt();
		m=scan.nextInt();
		nums=new Integer [n];
		for(int i=0;i<n;i++) {
			nums[i]=scan.nextInt();
		}
		arr=new int[m];
		Arrays.sort(nums);

		for(int i=0;i<n;i++) {
			visited=new boolean[n+1];
			arr[0]=nums[i];
			sol(1,i);
		}

		System.out.println(sb2);

		
	}
	public static void sol(int cnt, int start) {
		if(cnt==m) {
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<arr.length;i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
			if(!nums2.contains(sb.toString())) {
				nums2.add(sb.toString());
				sb2.append(sb.toString());
			}
			return;
		}
		for(int i=start;i<n;i++) {
				arr[cnt]=nums[i];
				sol(++cnt,i);
				cnt--;
			
		}
	}

}
