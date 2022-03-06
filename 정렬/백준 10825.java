import java.io.*;
import java.util.*;

public class Main {
	static int n,m;
	static String[][] info;
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
    public static void main(String[] args)  {
    	
    	 n=scan.nextInt();
    	 info=new String[n][4];

    	 for(int i=0;i<n;i++) {
     		info[i][0]=scan.next();		//이름
     		info[i][1]=scan.next();		//국어
     		info[i][2]=scan.next();		//영어	
     		info[i][3]=scan.next();		//수학

     	 }
    	 Arrays.sort(info,comp);
    	 
    	 for(int i=0;i<n;i++) {
    	    	 System.out.println(info[i][0]);
    	 }
    }
    	
    static Comparator<String[]> comp =new Comparator<String[]>() {
		@Override
		public int compare(String[] o1,String[] o2) {
			if(Integer.parseInt(o1[1])>Integer.parseInt(o2[1])) {	
				return -1;
			}else if (Integer.parseInt(o1[1])==Integer.parseInt(o2[1])) {
				if(Integer.parseInt(o1[2])<Integer.parseInt(o2[2])) {	
					return -1;
				}
				else if(Integer.parseInt(o1[2])==Integer.parseInt(o2[2])) {
					if(Integer.parseInt(o1[3])>Integer.parseInt(o2[3])) {
						return -1;
					}else if(Integer.parseInt(o1[3])==Integer.parseInt(o2[3])) {
						if(o1[0].compareTo(o2[0])<0) {
							return -1;
						}
					}
				}
			}
			return 1;
		}
	};
    
}
