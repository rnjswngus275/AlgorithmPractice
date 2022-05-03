
import java.io.*;
import java.util.*;

public class 백준2529 {
	static Scanner scan =new Scanner(System.in);
	static int K;
	static long MIN=Long.MAX_VALUE,MAX=Long.MIN_VALUE;
	static String[] arr;
	static String bigger="<";
	static String smaller=">";
	static boolean[] visited;
	static int[] arr2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		K=scan.nextInt();
		arr=new String [K+1];
		arr2=new int[K+1];
		visited=new boolean[10];
		for(int i=0;i<K;i++) {
			arr[i]=scan.next();
		}
		
		solve(0);
		String max=Long.toString(MAX);
		String min=Long.toString(MIN);
		if(max.length()==K) {
			max=0+max;
		}
		if(min.length()==K) {
			min=0+min;
		}
		System.out.print(max+"\n"+min);
		
	}
	//10Ck
	public static void solve(int cnt) {
		//basecase
		Long cal=(long) 0; // k글자의 정수
		if(cnt==K+1) {
			for(int j=0;j<K+1;j++) {
				cal=cal*10+arr2[j];
			}
			//min max
			MIN=Math.min(MIN,cal);
			MAX=Math.max(MAX,cal);
			return;
		}
		for(int i=0;i<10;i++) {		
			if(!visited[i]) {
				
				//부등호 확인하고 처리
				if(cnt!=0) {
					if(arr[cnt-1].equals(bigger)) {//a<b일때 
						if(arr2[cnt-1]==9) {//더 커야되는데 9면 return
							return;
						}	
						else if(arr2[cnt-1]>i) {//다음 i까지 continue
							continue;
						}		
					}
					else {
						if(arr[cnt-1].equals(smaller)) {//a>b일때
							if(arr2[cnt-1]==0) {//더 작아야되는데 0이면 return
								return;
							}
							else if(arr2[cnt-1]<i) {//어차피 그다음 i는 더 큰수일테니 return
								return;
							}		
						}
					}
				}
				visited[i]=true;
				arr2[cnt]=i;
				solve(cnt+1);
				arr2[cnt]=0;
				visited[i]=false;
			}
		}
		
	}
}
