import java.util.*;

public class Main {

	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data = scanner.nextInt();
		int data2=scanner.nextInt();
		for (int i=1;i<=data;i++) {
			for(int j=1;j<=data2;j++) {
				System.out.println(i+" "+j);
			}
		}
		
	}

}
