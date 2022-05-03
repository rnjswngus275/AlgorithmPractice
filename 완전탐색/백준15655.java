import java.util.*;

public class 백준15655 {
	public static Scanner scan =new Scanner(System.in);
	public static StringBuilder sb=new StringBuilder();
	static int n,m;
	static int cnt=0,tmp2=0;
	static int arr[];
	static int tmp[];
	static int flag;
	public static void main(String[] args) {
			n=scan.nextInt();
			m=scan.nextInt();
			arr=new int[n];
			tmp=new int[n];

			for(int a=0;a<n;a++) {	
				arr[a]=scan.nextInt();
				}
			Arrays.sort(arr);
			solve(0,0,false);
			System.out.print(sb);
		}

	public static void solve(int pos,int choice,boolean flag) {	//n개의 자연수 중 m개를 고른 수열
		if(pos>n) {
			return;
		}
		
		if(flag==true) {
			tmp[pos-1]=1;
		}
		if(flag==false&&pos!=0) {
			tmp[pos-1]=0;
		}
		if(choice==m) {
			for(int i=0;i<n;i++) {
				if(tmp[i]==1) {
					sb.append(arr[i]+" ");
				}
			}
			sb.append("\n");
			return;
		}
		
		
		solve(pos+1,choice+1,true);
		solve(pos+1,choice,false);
		return;
	}
}
