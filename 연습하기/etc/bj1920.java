package etc;
import java.util.*;

public class bj1920 {
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		int n=scan.nextInt();
		Set<Integer> list=new HashSet<>();
		for(int i=0;i<n;i++) {
			list.add(scan.nextInt());
		}
		
		int m=scan.nextInt();		
		for(int i=0;i<m;i++) {
			int find=scan.nextInt();
			if(list.contains(find)){
				sb.append("1\n");
			}else sb.append("0\n");			
		}
		
		System.out.print(sb);
	}

}
