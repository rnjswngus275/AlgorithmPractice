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
		cnt=0;
		sum=1;
		while(sum%n!=0) {
			sum=(sum*10)+1;
			sum=sum%n;
			cnt++;
		}
			return cnt+1;
	}

}
