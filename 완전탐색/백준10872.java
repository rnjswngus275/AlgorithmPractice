import java.util.*;

public class 백준10872 {

	public static Scanner scanner=new Scanner(System.in);
	public static int factorial(int n) {
		int answer=0;
			if(n<=1) {
				return 1;
			}
			answer=n*factorial(n-1);
	
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= scanner.nextInt();
		System.out.print(factorial(n));

		}
}
