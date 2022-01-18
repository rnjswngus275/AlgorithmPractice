import java.util.*;

public class Main {
	public static Scanner scanner=new Scanner(System.in);
	static int n,m;
	static int arr[];

	public static void main(String[] args) {
		n=scanner.nextInt();
		m=scanner.nextInt();

		arr=new int[m+1];
		solve(arr);
		for(int i=n;i<m+1;i++) {
			if(arr[i]==0) {
				System.out.println(i);
			}
		}
			
		}

	public static void solve(int arr[]) {
			arr[0]=arr[1]=1;
			for(int i=2;i*i<=m;i++) {
				if(arr[i]==1) {
					continue;
				}
				for(int j=i*i;j<arr.length;j=j+i) {	//i의 배수를 구해야함
					arr[j]=1;
				}
				
			}
			
		}

}
