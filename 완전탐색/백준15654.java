import java.util.*;

public class 백준15654 {
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
			tmp=new int[m];
			for(int a=0;a<n;a++) {	
				arr[a]=scan.nextInt();
				}
			Arrays.sort(arr);
			solve(0,0);
			System.out.print(sb);
		}

	public static void solve(int cnt,int used) {	//n개의 자연수 중 m개를 고른 수열

		if(cnt==m) {
			for(int i=0;i<m;i++) {
				sb.append(tmp[i]+" ");				
				
			}
			sb.append("\n");
			return;
		}
		for(int i=0;i<n;i++) {
			if((used&1<<i)!=0) {//i번째 원소가 있으면 
				continue;
			}
			tmp[cnt]=arr[i];
			solve(cnt+1,used|1<<i);
		}
		
	}
}
