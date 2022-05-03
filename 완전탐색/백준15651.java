import java.util.*;

public class 백준15651 {
	public static StringBuilder sb=new StringBuilder();
	public static Scanner scanner=new Scanner(System.in);
	static int n=0,m=0;
	static int[] data;
	public static void main(String[] args) {
		n=scanner.nextInt();
		m=scanner.nextInt();
		data=new int[m+1];
		solve(1);
		System.out.println(sb.toString());
		
	}
	
	public static void solve(int pos) {	//1~n중에서 총 m 번째 자리중 pos번째 자리를 고른 함수 
	
	if(pos==m+1) {
		for(int i=1;i<m+1;i++) {		// 저장된 값을 string builder에 넣어주기
			sb.append(data[i]).append(' ');
		}
		sb.append('\n');
		return;
	}//m개를 다 골랐을 때 재귀 끝
	
	for(int i=1;i<n+1;i++) {			//1~n까지 자연수 중에서 m번째 자리를 고른다.
		data[pos]=i;						//pos번째 자리를 기록한다. 
		solve(pos+1);					//pos+1 번째 자리를 고른다.
	}
		
	}
	
	
}
