import java.io.*;
import java.util.*;
public class Main {
	static int n,m;
	static long[] arr;
	static int[] b;
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	
    public static void main(String[] args)  {
    	//입력받기
    	 n=scan.nextInt();
    	 arr=new long[n];
    	 for(int i=0;i<n;i++) {
     		arr[i]=scan.nextLong();	//입력 받는 값
     	 }
    	 
    	Arrays.sort(arr);
    	
    	 int cnt = 1;
         int max = 1
         int maxIdx = 0;
         for(int i = 1; i < n; i++) {
             if(arr[i] == arr[i-1]) cnt++;
             else cnt = 1;

             if(cnt > max) {
                 max = cnt;
                 maxIdx = i;
             }
         }
    	 System.out.print(arr[maxIdx]);
    	     }
}
