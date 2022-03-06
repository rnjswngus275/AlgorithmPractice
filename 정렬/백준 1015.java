import java.io.*;
import java.util.*;

public class Main {
	static int n,m;
	static int[][] a;
	static int[] b;
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	
    public static void main(String[] args)  {
    	//입력받기
    	 n=scan.nextInt();
    	 a=new int[n][2];
    	 b=new int[n];
    	 for(int i=0;i<n;i++) {
     		a[i][0]=scan.nextInt();	//입력 받는 값
     		a[i][1]=i;//index 값 
     	 }
    	 
    	 //정렬
    	 Arrays.sort(a,comp);

    	 //오름차순으로 정렬한 a를 인덱스로 갖는 배열 b 생성
    	 for(int i=0;i<n;i++) {
    		 b[a[i][1]]=i;
    	 }
    	 
    	 //출력
    	 for(int j=0;j<n;j++) {
    		sb.append(b[j]+" ");
    	 }
    	 
    	 System.out.print(sb);

    	     }
    	
    static Comparator<int[]> comp =new Comparator<int[]>() {
		@Override
		public int compare(int[] o1,int[] o2) {
			if(o1[0]<o2[0]) {	
				return -1;
			}else if(o1[0]>o2[0]) {
				return 1;
			}else {
				if(o1[1]<o2[1]) {
					return -1;
				}
				else {return 1;}
			}
			
		}
	};
    
}
