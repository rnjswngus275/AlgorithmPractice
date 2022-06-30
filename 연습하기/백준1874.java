import java.util.*;

public class 백준1874 {
	static int num=1;
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb= new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk=new Stack<Integer>();
		int n =scan.nextInt();
		for(int i=0;i<n;i++) {
			int a=scan.nextInt();
		
			while(a>=num) {
				stk.push(num);
				num++;
				sb.append('+'+"\n");

			}
				if(stk.peek()==a) {
					stk.pop();
					sb.append('-'+"\n");
				}
				else {
					System.out.print("NO");
					System.exit(0);
				}
			
		}
		System.out.print(sb);
		}
	}


