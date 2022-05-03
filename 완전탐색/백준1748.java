import java.util.*;

public class 백준1748 {
	public static Scanner scan =new Scanner(System.in);
	public static StringBuilder sb=new StringBuilder();
	static String t;
	static int k=0;
	static int cnt=0,tmp2=0;
	static int flag;
	public static void main(String[] args) {
			t=scan.next();
			k=t.length();	//몇자리 수인지
			for(int a=0;a<k-1;a++) {		//0: 1의자리수 n-1: n의 자리수
				cnt+=(a+1)*9*Math.pow(10, a);
			}
			cnt+=k*(Integer.parseInt(t)-(Math.pow(10, k-1)-1));
			System.out.println(cnt);
		}

	
}
