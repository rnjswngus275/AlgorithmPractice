import java.io.*;
import java.util.*;
public class 백준1065 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		int N=scan.nextInt();
		if(N<100) {
			System.out.print(N);
		}
		else {
			cnt+=99;
			for(int i=100;i<=N;i++) {
				int a=i/100;
				int b=(i/10)%10;
				int c=i%10;
				if((a-b)==(b-c)) {
					cnt++;
				}
			}
			System.out.print(cnt);
		}

	}

}
