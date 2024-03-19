import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class bj11000 {
	static Scanner scan=new Scanner(System.in);
	static int [][] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =scan.nextInt();
		arr= new int [n][2];
		for(int i=0;i<n;i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
		}
		Arrays.sort(arr,new Comparator<int[]>() {
			public int compare(int[] o1,int[] o2) {
				if(o1[0]==o2[0])return o1[1]-o2[1];
				return o1[0]-o2[0];
			}
		});
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(arr[0][1]);
		for(int i=1;i<n;i++) {
			int topEndTime = pq.peek();
			if(arr[i][0]<topEndTime)pq.offer(arr[i][1]);
			else {
				pq.poll();
				pq.offer(arr[i][1]);
			}
		}
		System.out.println(pq.size());
		
	}

}
