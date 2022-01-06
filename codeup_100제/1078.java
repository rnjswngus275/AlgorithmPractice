import java.util.*;

public class Main {

	public static final Scanner scanner= new Scanner(System.in);
	public static int CalSum(int data) {
		int sum=0;
		for(int i=2;i<=data;i+=2) {
			sum+=i;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=scanner.nextInt();
			int answer=CalSum(num);
			System.out.print(answer);
	}

}
