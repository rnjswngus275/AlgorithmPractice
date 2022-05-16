import java.util.*;

public class 백준_2504 {
	static int T,M,N,X,Y,cnt=0;
	static Scanner scan =new Scanner(System.in);
	static int ans=0;
	static String str;
	static int leng;
	static int flag=0,flag1,flag2;
	static int answer=0;
	static Stack<String> stk=new Stack();
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		//(  ) [ ]
		
		str= scan.next();
		leng=str.length();

		solve();
		

	}
	static void solve() { 
		
		for(int j=0;j<leng;j++) {
			char a=str.charAt(j);
			
			if(a=='(') {
				flag1++;
				stk.push("(");
				continue;
				
			}
			else if (a=='[') {
				flag2++;
				stk.push("[");
				continue;
			}
			else if(a==')') {	//3. 닫힘 문자 ) 일때
				flag1--;
				if(flag1>=0) {
					if(stk.peek().equals("(")) {// 이전 값이 (일때 -> ()
						stk.pop();		//꺼내고
						stk.push("2");		// ()값은 2
						continue;
					}
					else {	//이전 값이 (이 아닐때 
						int num=0;
						while(!stk.isEmpty()) {//스택이 빌때까지						
							if(stk.peek().equals("[")) {
								System.out.print(0);
								System.exit(0);
							}
							else if(stk.peek().equals("(")) {
								stk.pop();
								stk.push(Integer.toString(2*num));
								break;
							}
							else {//숫자일 때
								 num+=Integer.parseInt(stk.pop());
								
							}
						}
						continue;
					}
				}
			}
			else if(a==']') {
				flag2--;
				if(flag2>=0) {
					if(stk.peek().equals("[")) {// 이전 값이 [일때 -> []
						stk.pop();		//꺼내고
						stk.push("3");		// []값은 3
						continue;
					}
					else {	//이전 값이 [이 아닐때 
						int num=0;
						while(!stk.isEmpty()) {//스택이 빌때까지						
							if(stk.peek().equals("(")) {
								System.out.print(0);
								System.exit(0);
							}
							else if(stk.peek().equals("[")) {
								stk.pop();
								stk.push(Integer.toString(3*num));
								break;
							}
							else {//숫자일 때
								 num+=Integer.parseInt(stk.pop());
								
							}
						}
						continue;
					}
				}
				
			}
			
		}	
		if(flag1<0||flag2<0) {//예외 처리
			System.out.print(0);
			System.exit(0);
		
		}
		if(flag1!=0||flag2!=0) {//예외 처리
			System.out.print(0);
			System.exit(0);
			
		}
		
		while(!stk.isEmpty()) {//각각 계산 한 덩어리들을 더함
			ans+=Integer.parseInt(stk.pop());				
		}
		System.out.print(ans);
	}

}