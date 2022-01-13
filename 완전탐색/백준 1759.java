import java.util.*;

public class Main {
	public static Scanner scanner=new Scanner(System.in);
	static int l,c;
	static String[] data,tmp;
	static int cnt;
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) {
		l=scanner.nextInt();
		c=scanner.nextInt();		
		data=new String[c];
		tmp=new String[l];
		for(int i=0;i<c;i++) {
			data[i]=scanner.next();
		}
		Arrays.sort(data);
		solve(0,0);
			}

	public static void solve(int pos,int i) { 	//pos:현재 tmp의 위치 i:현재 data의 위치
				//모든 문자열의 경우의 수 만들고 a i e o u가 하나라도 없으면 없애기
		if(pos==l) {
			int k=0, m=0; //k는 모음 체크 m은 자음 체크
			for(int i1=0;i1<l;i1++) {
				if(tmp[i1].equals("a")||tmp[i1].equals("e")||tmp[i1].equals("i")||tmp[i1].equals("o")||tmp[i1].equals("u")) {
					k++;		//모음 있으면 체크
					
				}
				else {
					m++;
				}
			}
			if(k>=1&&m>=2) {
			for(int i1=0;i1<l;i1++) {
			System.out.print(tmp[i1]);
			}
			System.out.println();
			}
			return;
		}
		
		for(int a=i;a<c;a++) {
			//c개의 문자중 l개를 골라 tmp에 넣는다. 
			tmp[pos]=data[a];
			solve(pos+1,i+1);		//고르고
			i=i+1;
		}
			
	}

}
