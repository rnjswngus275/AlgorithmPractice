import java.util.Scanner;

public class test {
	static int cnt=0;
	static Scanner scan =new Scanner(System.in);
	static int ans=0;
	static StringBuilder sb=new StringBuilder();
	static int leng;
	static int MAX,MIN;
	public static void main(String[] args) {
		int [] d=new int[100];
		int [] s=new int[100];
		String str= scan.next();
		leng=str.length();
		int start=0;
		for(int i=0;i<=leng;i++) {
			if(i==leng||str.charAt(i)=='#') {
				solve(start,i);
				start=i+1;
			}
			
		}
		System.out.print(MAX+" "+MIN);
		
	}
	static void solve(int start, int end) {
		int [] d=new int[end-start];
		int [] s=new int[end-start];
		d[0]=1;
		d[1]=1;
		s[0]=1;
		s[1]=1;
		for(int i=2;i<end-start;i++) {
			d[i]=Math.max(d[i-2]+1, d[i-1]);
			s[i]=Math.min(d[i-2]+1,d[i-1]);
		}
		System.out.println("max:"+d[end-start-1]+"min:"+s[end-start-1]);
		MAX+=d[end-start-1];
		MIN+=s[end-start-1];
	}

}
