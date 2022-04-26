import java.util.*;

public class Main {

	public static Scanner scan =new Scanner(System.in);
	public static int n,m,t;
	public static boolean[] visited; //정점을 방문 했는지 true/false
	public static StringBuilder sb=new StringBuilder();
	public static int[][] arr;
	static int ans;
    public static void main(String[] args) {
    	
    	t=scan.nextInt();	//테스트케이스

    	
    	for(int i=0;i<t;i++) {
    		int a= scan.nextInt();
    		int b= scan.nextInt();
    		if(a==b) {
    			ans=1;
    		}
    		else {
    		//bCa 계산
    			if(a>b/2) {
    				a=b-a;
    			}
	    		double answer=factorial(b,a)/factorial(a,a);
	    		ans=(int)answer;
    		}
    		System.out.println(ans);
    	}
    	
    }
    static double factorial(int a, int b) {
    	double ans = a;
    	
    	for(int i=1;i<b;i++) {		//b번
    		ans=ans*(a-i);
    	}
    	return ans;
    }
}
