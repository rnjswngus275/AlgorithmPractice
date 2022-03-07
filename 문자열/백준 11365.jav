import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
	static int n,p,cnt=0;
	static String[] arr;
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	
    public static void main(String[] args)  {
     		while(scan.hasNext()) {
     			String str=scan.nextLine();
     			if("END".equals(str)) break;
     			
     			sb.append(str);
     			System.out.println(sb.reverse());
     			sb.delete(0, sb.length());
     		}
 		
    }
    	
    	
    
}
