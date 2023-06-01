import java.util.*;

public class bj1946 {
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=scan.nextInt();
		for(int i=0;i<t;i++) {
			int n=scan.nextInt();
			int [] arr=new int[n+1];
			int first=0;
			int second=0;
			for(int j=0;j<n;j++) {
	            int a=scan.nextInt();
                int b=scan.nextInt();
                arr[a]=b;
			}
			int cnt=1;
			int min=arr[1];
			for(int k=2;k<n+1;k++) {
				if(arr[k]<min) {
					cnt++;
					min=arr[k];
				}
			}
			
			sb.append(cnt+"\n");
		}
		System.out.println(sb);

	}

}
