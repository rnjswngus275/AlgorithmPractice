import java.io.*;
import java.util.*;
public class Main {
	static int n,p,cnt=0;
	static String[][] arr;
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	
    public static void main(String[] args)  {
    	//입력받기
    	 n=scan.nextInt();
    	 arr=new String[n][2];
    	 for(int i=0;i<n;i++) {
     		String str=scan.next();	
     		String length=Integer.toString(str.length());
     		arr[i][0]=str;	//글자
     		arr[i][1]=length;	//글자의 길이 
     	 }
    	 
    	 //길이가 짧은것부터
    	 //길이가 같으면 사전순으로
    	 Arrays.parallelSort(arr,cmp);
    	 
    	 System.out.println(arr[0][0]);
    	 for(int m=1;m<n;m++) {
    		 if(!arr[m][0].equals(arr[m-1][0])) {
            	 System.out.println(arr[m][0]);
     		 }
    		
    		
    	 }    	 
    	     }
    	
    	static Comparator<String[]> cmp=new Comparator<String[]>(){
    		@Override
    		public int compare(String[] o1,String[]o2) {
    				if(Integer.parseInt(o1[1])<Integer.parseInt(o2[1])) {
        				return -1;
        			}else if(Integer.parseInt(o1[1])>Integer.parseInt(o2[1])) {
        				return 1;
        			}
        			else if(Integer.parseInt(o1[1])==Integer.parseInt(o2[1])) {
        				return o1[0].compareTo(o2[0]);
        			}
        			else return 1;
    			
    			
    		}
    	};
    
}
