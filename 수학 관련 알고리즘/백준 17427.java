import java.util.*;

public class Main {
	public static Scanner scanner=new Scanner(System.in);
	static int n;
	static int cnt;
	static long sum=0;

	public static void main(String[] args) {
			n=scanner.nextInt();
			for(int i=1;i<=n;i++) {
				sum=sum+((n/i)*i);
			}
			System.out.print(sum);

			}


}
