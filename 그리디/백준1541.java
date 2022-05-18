import java.util.*;

public class 백준1541 {
	static int i,n,m,cnt=0,answer=0;
	static int ans=0;
	static Scanner scan =new Scanner(System.in);
	static long MIN=Long.MAX_VALUE;
	static StringBuilder sb=new StringBuilder();
	static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=scan.next();
		int leng=str.length();
		for(;i<leng;) {
			if(i==0) {
				ans+=cal(str);
			}
			else {
			if(str.charAt(i)=='-') {
				i++;
				while(i<leng) {
					if(str.charAt(i)=='-') {
						i++; 
						break;
					}
					
					ans-=cal(str);
					i++;
				}
			}
			else {
				i++;
				ans+=cal(str);
			}
			}
			
		}
		System.out.print(ans);
		
	}
	static int cal(String str) {
		String num="";
		while(i<str.length()&&str.charAt(i)!='-'&&str.charAt(i)!='+') {// 부호 나올 때까지
			
			num+=str.charAt(i);
			i++;
		}
		return Integer.parseInt(num);
	}

}
