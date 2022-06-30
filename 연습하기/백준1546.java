import java.util.*;
public class 백준1546 {
	static Scanner scan=new Scanner(System.in);
	static double[] arr;
	static double sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=scan.nextInt();
		arr=new double[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextDouble();
		}
		Arrays.sort(arr);
		
		double max=arr[n-1];
		for(int i=0;i<n;i++) {
			double a=arr[i]/max*100;
			sum+=arr[i]/max*100;
		}
		System.out.print(sum/n);
	}

}
