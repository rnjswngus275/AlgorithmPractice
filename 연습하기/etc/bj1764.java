package etc;

import java.util.Scanner;
import java.util.*;

public class bj1764 {
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scan.nextInt();
		int m=scan.nextInt();
		Set <String> set=new HashSet<>();
		
		for(int i=0;i<n;i++) {
			set.add(scan.next());
		}
		ArrayList<String> list=new ArrayList<>();
		int count=0;
		for(int j=0;j<m;j++) {
			String str=scan.next();
			if(set.contains(str)) {
				list.add(str);
				count++;
			}
		}
		Collections.sort(list);
		System.out.println(count);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			}
	}

}
