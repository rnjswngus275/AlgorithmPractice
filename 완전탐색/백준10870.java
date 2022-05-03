import java.util.*;

public class 백준10870 {

	public static Scanner scanner=new Scanner(System.in);
	public static int pivo(int n) {
	
		int answer=0;
		
		if(n==0)return 0;
		if(n==1)return 1;
		
		answer=pivo(n-1)+pivo(n-2);
		
		
		
		return answer;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= scanner.nextInt();
		System.out.print(pivo(n));

		}
}
