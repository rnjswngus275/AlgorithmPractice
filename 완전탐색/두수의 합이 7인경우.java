import java.util.*;

public class Main {

	public static Scanner scanner=new Scanner(System.in);
	public static int solve(int n,int data[]) {
		int ret=0;
		//모든 부분집합을 나열하기 위해서 i=0부터 1<<n까지 반복		{},{data[0]}{data[1],data[2]}....등 모든 부분 집합들 n이 4면 0000~1111까지 존재할 수 있음 
		for(int i=0;i<(1<<n);i++) {			//1<<n는 원소가 n인 집합에서의 부분집합의 개수이다.
			if(Integer.bitCount(i)!=2) {	//부분집합의 원소가 두개가 아닌 경우에는 스킵
				continue;
			}
			int sum=0;
			for(int j=0;j<n;j++) {		//i가 n자리 수 2진수이므로 n번 돌려서 1이 있는 곳을 확인한다.
				if((i&1<<j)!=0) {		//i에 j번째 원소가 존재하면 (= 부분집합이 data[j]를 포함하고 있으면)  example : i가 0101이고 j가 2라서 0100이라면 &연산 해서 1이므로  ok 그리고 j가0일때도 ok
					sum+=data[j]; //sum에 j번째 원소를 더한다
				}
			}
			if(sum==7) {		//합이 7이면 count를 1씩올려줌다.
				ret++;
				}
			
		}
		
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =scanner.nextInt();
		int[] data=new int[n];
		for(int i=0;i<n;i++) {
			data[i]=scanner.nextInt();
		}
		
		System.out.print(solve(n,data));
		
	}
}
