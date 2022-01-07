import java.util.*;

public class Main {

	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long a=scanner.nextLong();
		long r=scanner.nextLong();
		long n=scanner.nextLong();
		
		for(int i=0;i<n-1;i++) {
			a=a*r;
		}
		System.out.print(a);
	
	}

}
