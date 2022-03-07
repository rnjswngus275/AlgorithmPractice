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
     		int index=str.indexOf(':');
     		int hour = Integer.parseInt(str.substring(0,index));
     		String tmp=str.substring(index+1,str.length());
     		int index2=tmp.indexOf(':');
 			int min=Integer.parseInt(tmp.substring(0,index2));
 			int sec=Integer.parseInt(tmp.substring(index2+1,tmp.length()));
 			
     		String str2=scan.next();
     		int index3=str.indexOf(':');
     		int hour2 = Integer.parseInt(str2.substring(0,index3));
     		String tmp2=str.substring(index3+1,str2.length());
     		int index4=tmp2.indexOf(':');
 			int min2=Integer.parseInt(tmp2.substring(0,index4));
 			int sec2=Integer.parseInt(tmp2.substring(index4+1,tmp2.length()));

// 			System.out.println(hour+" "+min+" "+sec);
// 			System.out.println(hour2+" "+min2+" "+sec2);
 			
 			int cal_h=hour2-hour;
 			int cal_m=min2-min;
 			int cal_s=sec2-sec;
 			
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
