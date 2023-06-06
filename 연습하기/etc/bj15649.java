package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class bj15649 {
	static Scanner scan=new Scanner(System.in);

	static int n,m;
	static int[] arr;
	static int[] nums;
	static LinkedHashSet<String> nums2=new LinkedHashSet<>();
	static boolean[] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=scan.nextInt();
		m=scan.nextInt();
		nums=new int [n+1];
		for(int i=1;i<=n;i++) {
			nums[i]=scan.nextInt();
		}
		arr=new int [m+1];
		Arrays.sort(nums);

		for(int i=1;i<=n;i++) {
			visited=new boolean[n+1];
			visited[i]=true;
			arr[1]=nums[i];
			sol(1,i+1);
		}
		ArrayList<String> list=new ArrayList<>();
		list.addAll(nums2);
		for(int i=0;i<nums2.size();i++) {
			System.out.print(list.get(i));
		}
	}
	public static void sol(int cnt,int start) {
		if(cnt==m) {
			StringBuilder sb=new StringBuilder();
			for(int i=1;i<arr.length;i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
			nums2.add(sb.toString());
			return;
		}
		for(int i=1;i<=n;i++) {
			if(!visited[i]) {
				arr[cnt+1]=nums[i];
				visited[i]=true;
				sol(++cnt,i+1);
				visited[i]=false;
				cnt--;
			}
		}
	}
}
