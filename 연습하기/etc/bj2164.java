package etc;

import java.util.Scanner;
import java.util.*;

public class bj2164 {
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	static Queue<Integer> q=new LinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scan.nextInt();
		for(int i=1;i<n+1;i++) {//500,000
			q.offer(i);
		}
		while(q.size()>1) {
			q.poll();
			int tmp=q.poll();
			q.offer(tmp);
		}
		System.out.println(q.poll());
		
	}

}
