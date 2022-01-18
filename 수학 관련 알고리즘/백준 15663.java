import java.util.*;

public class Main {
	public static Scanner scanner=new Scanner(System.in);
	static int n;
	static int cnt;
	static double sum;

	public static void main(String[] args) {

		while(scanner.hasNext()) {
			int n=scanner.nextInt();
			System.out.println(solve(n));
		}
			}

	public static int solve(int n) {
		double i=1;
		cnt=0;
		sum=0;
		while(sum%n!=0||sum==0) {
			sum=(sum%n)+1*i;
			i=i*10;
			cnt++;
		}
			return cnt;
	}

}
