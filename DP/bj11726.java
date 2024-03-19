import java.util.Scanner;
import java.util.*;
public class bj11726 {
	static Scanner scan=new Scanner(System.in);
	static int [] dp;

	public static void main(String[] args) {
		HashMap<Integer,Integer> hash =new HashMap<>();
		int n=scan.nextInt();
		int [][] arr = new int[n][2];
		int cnt = n;
		for(int i=0;i<n;i++) {
			int key =scan.nextInt();
			int val =scan.nextInt();
			hash.put(key, val);
			arr[i][0]= key;
			arr[i][1]= val;
		}
		for(int i=0;i<n;i++) {
			if(hash.containsKey(arr[i][1])) {
				cnt-=1;
			}
		}
		System.out.print(cnt);
	}

}
