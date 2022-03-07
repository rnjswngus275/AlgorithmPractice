import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
	static int n,p,cnt=1;
	static String[] arr;
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	
    public static void main(String[] args)  {
	 
     		String str=scan.next();
     		String str2=scan.next();
     		
     		int cal_h=Integer.parseInt(str2.split(":")[0])-Integer.parseInt(str.split(":")[0]);
     		int cal_m=Integer.parseInt(str2.split(":")[1])-Integer.parseInt(str.split(":")[1]);
     		int cal_s=Integer.parseInt(str2.split(":")[2])-Integer.parseInt(str.split(":")[2]);

 			
 			if(str.equals(str2)) {
 				System.out.print("24:00:00");
 				System.exit(0);
 			}
// 			System.out.println(hour+" "+min+" "+sec);
// 			System.out.println(hour2+" "+min2+" "+sec2);
 		 			
 			if(cal_s<0) {
 				cal_s+=60;
 				cal_m-=1;
 			}
 			if(cal_m<0) {
 				cal_m+=60;
 				cal_h-=1;
 			}
 			if(cal_h<0) {
 				cal_h+=24;
 			}

 			System.out.format("%02d:%02d:%02d",cal_h,cal_m,cal_s);
 			
    }
    	
    	
    
}
