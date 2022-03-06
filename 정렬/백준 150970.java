import java.io.*;
import java.util.*;
public class Main {
	static int n,p,cnt=0;
	static int[][] arr;
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	
    public static void main(String[] args)  {
    	//입력받기
    	 n=scan.nextInt();
    	 arr=new int[n][2];
    	 for(int i=0;i<n;i++) {
     		arr[i][0]=scan.nextInt();	//위치
     		arr[i][1]=scan.nextInt();	//색갈
     	 }
    	 //색갈별로 정렬한 후 
    	 Arrays.parallelSort(arr,comp);
//    	 for(int i=0;i<n;i++) {
//    		 System.out.println(arr[i][0]+" "+arr[i][1]);
//    	 }
    	 boolean flag =false;
    	 for(int i=1;i<n;i++) {
    		 if(arr[i][1]==arr[i-1][1]) {//색갈이 같으면
    			 
    			 if(i==1) {
					 cnt+=arr[i][0]-arr[i-1][0];
				 }
    			 if(i==n-1) {//마지막이면
    				 int d=arr[i][0]-arr[i-1][0];
    				 cnt+=d;
    			 }
    			 else if(arr[i][1]==arr[i+1][1]) {//중간위치면
    		    	 int min=100000;
    				 int a=arr[i][0]-arr[i-1][0];
    				 int b=arr[i+1][0]-arr[i][0];
    				 min=Math.min(a, b);
    				 cnt+=min;
    			 }
    			 else if(arr[i][1]!=arr[i+1][1]) {	//색갈 다를때
    				 int c=arr[i][0]-arr[i-1][0];
    				 cnt+=c;
    			 }
    		 }
    		 else {	//경계부분
    			 cnt+=arr[i+1][0]-arr[i][0];
    		 }
    	 }
    	 
    	 System.out.print(cnt);
    	     }
    	
    static Comparator<int[]> comp =new Comparator<int[]>() {
		@Override
		public int compare(int[] o1,int[] o2) {
			if(o1[1]<o2[1]) {	
				return -1;
			}else if(o1[1]>o2[1]) {
				return 1;
			}else {
				if(o1[0]<o2[0]) {
					return -1;
				}
				else {return 1;}
			}
		}
	};
    
}
