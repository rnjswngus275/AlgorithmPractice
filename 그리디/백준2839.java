import java.io.*;
import java.util.*;
public class 백준2839 {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=scan.nextInt();
		int cnt=0;
		while(N>0) {
			if(N%5!=0) {	//5키로짜리 봉지로 나눠떨어지지 않으면
				N=N-3;
				cnt++;
			}
			else {
				cnt+=(N/5);
				break;
			}
			}
		if(N<0) {
			System.out.print(-1);
		}
		else System.out.print(cnt);
		}
	
	}


