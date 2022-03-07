import java.io.*;
import java.util.*;
public class Main {
	static int n,p,cnt=1;
	static String[] arr;
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	
    public static void main(String[] args)  {
    	//입력받기
    	 n=scan.nextInt();
    	 arr=new String[n];
    	 
    	 for(int i=0;i<n;i++) {
     		String str=scan.next();
     		int index=str.indexOf('.');
     		String str2 = str.substring(index+1,str.length());
 			arr[i]=str2;	//확장자명
     		
     	 }
    	 //정렬
    	 Arrays.sort(arr);
    	 //중복 있는지 확인하고 cnt
    	 
    	 for(int j=0;j<n;) {
    		 int cnt=1;
    		 int k;
    		 for(k=j+1;k<n;k++) {
    			 if(arr[j].equals(arr[k]))cnt++;	//같은 경우 cnt 
    			 else break;
    		 }
    		 sb.append(arr[j]+" "+cnt+"\n");
    		 
    		 j=k;
    	 }
    	 
    	 System.out.println(sb.toString());
    	 
    	 
    	     }
    	
    	static Comparator<String> cmp=new Comparator<String>(){
    		@Override
    		public int compare(String o1,String o2) {
    				if(o1.compareTo(o2)<0) {
        				return -1;
        			}
    				else return 1;
    			
    			
    		}
    	};
    
}
