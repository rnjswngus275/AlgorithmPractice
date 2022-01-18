import java.util.*;

public class Main {
	public static Scanner scanner=new Scanner(System.in);
	static int a,b;
	static int cnt;
	static int k;//최대 공약수


	public static void main(String[] args) {
			a=scanner.nextInt();
			b=scanner.nextInt();
			gcd(a,b);
			System.out.println(k);
			System.out.print(a*b/k);
			}

	public static void gcd(int a, int b) {	
		if(b==0) {
			k=a;
			return;
		}
		int r=a%b;
		gcd(b,r);
		
		}

}
