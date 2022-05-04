import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
	static int n,p,cnt=0;
	static String[] arr;
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	
    public static void main(String[] args)  {
     		n=scan.nextInt();
    		int arr[]=new int[n];	
     		String str=scan.next();
         		for(int j=0;j<n;j++) {
         			arr[j]=str.charAt(j)-'0';
         		}
         		for(int i=0;i<n;i++) {
         			cnt+=arr[i];
         		}
         		System.out.println(cnt);
 		
    }
    	
    	
    
}
