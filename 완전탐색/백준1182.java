import java.util.*;

public class 백준1182 {
	public static Scanner scanner=new Scanner(System.in);
	static int n,s;
	static int[] data;
	static int cnt;

	public static void main(String[] args) {
		n=scanner.nextInt();
		s=scanner.nextInt();		
		data=new int[n];
		
		for(int i=0;i<n;i++) {
			data[i]=scanner.nextInt();
		}
		
		solve(0,0,0);
		System.out.print(cnt);
		}

	public static void solve(int pos,int val,int a) {
				if(pos==n) {
					if(a==n)	//선택을 아예안했을때
					{
						return;
					}
					if(val==s) {
					cnt++;}
					return;
				}
				
				solve(pos+1,val+data[pos],a);				//선택하고
				solve(pos+1,val,a+1);  						//선택안하고
			
	}

}
