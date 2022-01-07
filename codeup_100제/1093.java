import java.util.*;

public class Main {

	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=scanner.nextInt();
		int[] data=new int[n];
		for(int i=0;i<n;i++) {
			data[i]=scanner.nextInt();
		}
		int[] count=new int[23];
		Arrays.fill(count,0);
		for(int j=0;j<n;j++) {
			count[data[j]-1]+=1;
		}
		for(int k=0;k<23;k++) {
			System.out.print(count[k]+" ");
		}
	
		
	}

}
