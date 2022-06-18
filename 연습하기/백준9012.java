import java.io.*;
import java.util.*;

public class 백준9012 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X=scan.nextInt();
		int cnt1=0,cnt2=0;
		for(int i=0;i<X;i++) {
			Stack<Character> stk=new Stack();
			String str=scan.next();
			int leng=str.length();
			boolean flag =false;
			for(int j=0;j<leng;j++) {
				char c=str.charAt(j);
				if(c=='(') {
					stk.push(str.charAt(j));
				}
				else if(c==')') {
					if(stk.isEmpty()) {
						flag=true;
						System.out.println("NO");
						break;
					}
					if(stk.peek()=='(') {
						stk.pop();
					}
					else {
						flag=true;
						System.out.println("NO");
						break;
					}
				}
			}
			if(flag==false&&stk.isEmpty()) {
				System.out.println("YES");
			}else if(flag==false&&!stk.isEmpty()) {
				System.out.println("NO");
			}
			
		}
		
	}

}
