import java.util.*;

public class Main {
	public static Scanner scanner=new Scanner(System.in);
	public static StringBuilder sb=new StringBuilder();
	static int n,m;
	static int arr[];
	static int ans[];
	static int choice=0;
	static int sum=0;
	public static void main(String[] args) {
	
		arr=new int[9];
		ans=new int[7];
		for(int i=0;i<9;i++) {
			
			arr[i]=scanner.nextInt();
			}
		
		solve(0,0,0,0);
		}

	static boolean flag =false;
	public static void solve(int pos,int sum, int choice, int cnt) {
		//pos: 9명의 난쟁이의 키가 들어있는 배열에서의 현재위치
		//sum: 선택한 난쟁이 키의 합
		//choice :선택 유무 1:true 0:false
		//cnt : 지금까지 선택한 난쟁이 개수
		
		//ans[] : 키의 합이 100인 난쟁이들의 모임이 될 배열
		
		if(flag)return;
		if(choice!=0)		//선택됐으면 ans에 해당 pos의 난쟁이 추가
		{
			ans[cnt-1]=arr[pos-1];
		}
		if(cnt==7)	//선택한 난쟁이가 7명이거나 9까지 다 돌았을때 base case
		{
			if(sum==100)//sum이 100이면 정답
			{
				Arrays.sort(ans);
				for(int i=0;i<7;i++) {
				System.out.println(ans[i]);
				}
				flag=true;
			}
			//아니면 리턴
			return;
		}
		if(pos==9) {
			return;
		}
		
			
		solve(pos+1,sum+=arr[pos],1,cnt+1);// pos+1 번째 원소를 픽 
		sum-=arr[pos];
		solve(pos+1,sum,0,cnt);			//픽안함
		}

}
