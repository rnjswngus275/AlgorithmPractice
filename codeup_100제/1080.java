import java.util.*;

public class Main {

	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data = scanner.nextInt();
		int sum=0;
		for(int i=1;i<=data;i++) {
			sum+=i;
			if(sum>=data) {
				System.out.print(i);
				break;
			}

		}
	}

}
