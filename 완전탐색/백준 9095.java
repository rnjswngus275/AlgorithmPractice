import java.util.*;
public class Main {

	public static Scanner scan =new Scanner(System.in);
	public static StringBuilder sb=new StringBuilder();
	public static int[] arr,visited,arr3;
	static int N,T,num=0,cnt=0;
	static boolean flag;
    public static void main(String[] args) {
    	//입력
    	T=scan.nextInt();
    	for(int i=0;i<T;i++) {
    		N=scan.nextInt();
    		cnt=0;
    		int ans=cal(N,0);
    		sb.append(ans+"\n");
    	}
    	System.out.print(sb);
    


    }
    static int cal(int n, int val) {
    	//basecase
    	if(val==n) {
    		cnt++;
    		return 1;
    	}
    	if(val>n) {
    		return 1;
    	}
    	for(int i=1;i<=3;i++) {
    		cal(n,val+i);
    	}
    	
    	return cnt;
    }
    

 }
