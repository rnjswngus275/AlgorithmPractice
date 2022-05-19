import java.util.Scanner;

public class 백준16953 {
	static long a,b,cnt=0,answer=0;
	static long ans=0;
	static Scanner scan =new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a=scan.nextLong();
		b=scan.nextLong();
		if(b%2!=0&&b%10!=1) { //2로 나누어 떨어지지 않고 1로 끝나지도 않는 수이면
			System.out.print(-1);
			System.exit(0);
		}
		else {
			ans=b;
			while(ans!=a) {
				 if(ans<a) {
						System.out.print(-1);
						System.exit(0);
					}
				if(ans%10==1&&ans!=1) {	//1로 끝나는 수이면
					ans=(ans-1)/10;
					cnt++;
				}
				else if(ans%2==0) {
					ans=ans/2;
					cnt++;
				}
				else {
					System.out.print(-1);
					System.exit(0);
				}
				
			}
		}
		System.out.print(cnt+1);
	}

}
