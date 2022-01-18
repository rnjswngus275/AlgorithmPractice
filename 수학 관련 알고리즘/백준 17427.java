import java.util.*;

public class Main {
	public static Scanner scanner=new Scanner(System.in);
	static int n;
	static int cnt;
	static int sum=0;

	public static void main(String[] args) {
			n=scanner.nextInt();
		solve();

			}

	public static int solve() {	//1~n까지의 각각의 약수를 더한 값
		
		//i의 약수를 구해서 다 더하기
		for(int i=1;i<n+1;i++) {
			int m=(int) Math.floor(Math.sqrt(i));
			for(int j=1;j<=m;j++) {
				int k=0;
				if(i%j==0) {
					k=i/j;
					if(k==j) {
						sum+=k;}
					else {sum=sum+j+k;}
				}
			}
			System.out.println(i+"의 sum은"+sum+"입니다");

		}
		System.out.println(sum);
	return 0; 
	}

}
