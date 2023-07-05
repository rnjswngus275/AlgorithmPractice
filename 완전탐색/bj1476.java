import java.util.Scanner;

public class bj1476 {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e=scan.nextInt();
		int s=scan.nextInt();
		int m=scan.nextInt();
		if(e==15) {
			e=0;
		}
		if(s==28) {
			s=0;
		}
		if(m==19) {
			m=0;
		}

		int a,b,c;
		for(int i=0;;i++) {
			a=i*15+e;
			if(a%28==s&&a%19==m) {
				if(a==0) System.out.println(7980);
				else System.out.println(a);
				break;
			}else continue;
		}
	}

}
