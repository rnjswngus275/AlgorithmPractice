package etc;

import java.util.Scanner;
import java.util.*;

public class bj1927 {
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			int num=scan.nextInt();
			if(num>0) {
				//add
				pq.add(num);
				
			}else if(num==0) {
				if(pq.isEmpty()) {
					sb.append(0+"\n");
				}
				else sb.append(pq.poll()+"\n");
			}
		}
		System.out.println(sb);
	}
}
