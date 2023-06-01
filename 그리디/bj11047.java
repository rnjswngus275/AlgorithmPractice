import java.util.Scanner;

public class bj11047 {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scan.nextInt();
		int k=scan.nextInt();//합
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt(); 
		}
		int sum=0;
		for(int i=n-1;i>=0;i--) {
			if(k==0)break;
			if(arr[i]<=k) {
				int a=k/arr[i];
				k-=arr[i]*a;
				sum+=a;
			}
		}
		System.out.println(sum);
	}

}
