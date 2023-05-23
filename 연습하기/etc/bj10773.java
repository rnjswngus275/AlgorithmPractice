package etc;
import java.util.*;
public class bj10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int k=scan.nextInt();
		Stack<Integer> stk=new Stack ();
		for(int i=0;i<k;i++) {
			int n=scan.nextInt();
			if(n==0) {
				if(stk.size()>0)
					{
					stk.pop();
					}
			}else {
				stk.push(n);
			}
		}
		int sum=0;
		int size=stk.size();
		if(size>0) {
			for(int i=0;i<size;i++) {
				sum+=stk.pop();
			}
		}
		
		System.out.println(sum);
	}

}
