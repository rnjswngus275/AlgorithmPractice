import java.util.*;
public class Main {

	public static Scanner scan =new Scanner(System.in);
	public static StringBuilder sb=new StringBuilder();
	public static int[] arr,arr2,arr3,visited;
	static int K,M,cnt=0;
 public static void main(String[] args) {
 	//입력
 	K=scan.nextInt();	//자리 수
 	M=scan.nextInt(); // 나누는 수
 	
 	int max=(int) Math.pow(10, K);
 	
 	arr=new int[max];	// 소수 배열
 	arr2= new int[max]; // 두 소수의 합의 배열
 	arr3=new int[max];	// 두 소수의 곱의 배열 
 	visited=new int[10];
 	
 	//에라토스테네스의 체로 소수구하기
 	arr[0]=arr[1]=1;
 	for(int i=2;i*i<max;i++) {
 		if(arr[i]==1) continue;
 		for(int j=i*i;j<max;j+=i) {
 			arr[j]=1;
 		}
 	}
 	
 	//소수의 합이 체크되어 있는 배열 구하기
 	for(int a=2;a<max-1;a++) {
 		if(arr[a]==1) continue;
 		for(int b=a+1;b<max;b++) {
 			if(arr[b]==1)continue;
 			if(a+b>=max) continue;
 			arr2[a+b]=1;
 		}
 	}
     
 	//소수의 곱이 체크되어있는 배열 구하기
 	for(int a=2;a<max;a++) {
 		if(arr[a]==1) continue;
 		for(int b=a;b<max;b++) {
 			if(arr[b]==1)continue;
 			long num=(long)a*(long)b;
 			if(num>=max) continue;
 			arr3[a*b]=1;
 		}
 	}
 	
 	//i : 구하려는 수
 	for(int i=(int)Math.pow(10,K-1);i<max;i++) {
 		if(arr2[i]==1) {	//합으로 나타낼 수 있고 
 		int num=i;
 		while(true) {	//m으로 나누어 떨어질 때 까지 나눈수가 두개의 소 수의 곱인경우 
 			if(num%M==0) {
 				num/=M;
 			}else break;
 		}
 		if(arr3[num]==1) {
 			cnt++;
 		}
 	}
 	}
 	int ret=comb(0,0,0);
 	
 	System.out.print(ret);
  	
 }
 static boolean check(int val) {
	  while(val%M==0) val/=M;
	  if(arr3[val]==1) {
		  return true;
	  }
	  return false;
 }
 static int comb(int cur,int idx ,int val)
 {
     if(idx == K)
     {
         if(arr2[val] == 1&& check(val))
             return 1;		//조건 1,2에 모두 부합하는 경우 결과값에 +1해준다. (ret이 +1된다.)
         return 0;
     }
     int ret = 0;
     for(int i = cur ;i<=9;i++)
     {
         if(idx ==0 && i == 0)	//맨첫자리일때는 0을 비허용한다.
             continue;
         if(visited[i] == 1)	//방문한 숫자이면 pass
             continue;
         visited[i] =1 ;
         ret += comb(cur ,idx+1,val*10 + i);	//재귀
         visited[i] = 0;	//재귀 끝나고 돌아오면 다시 체크 풀어주기
     }
     return ret;		//최종적으로 재귀를 다 돌았을 때 return된 1값이 다 더해진 ret을 return해준다. (ret=조건에 맞는 수의 개수)
 }

}
