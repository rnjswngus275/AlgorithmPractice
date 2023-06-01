package etc;

import java.util.*;

public class bj10866 {
	static Scanner scan=new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) {
		int n=scan.nextInt();
		Deque<Integer> dq=new ArrayDeque<>();
		for(int i=0;i<n;i++) {
			String command=scan.next();
			switch(command) {
				case "push_front":{
					int x=scan.nextInt();
					dq.offerFirst(x);
					break;
				}
				case "push_back":{
					int x=scan.nextInt();
					dq.offerLast(x);
					break;
				}
				case "pop_front":{
					if(dq.peekFirst()==null) {
						sb.append(-1+"\n");
					}
					else sb.append(dq.pollFirst()+"\n");
					break;
				}
				case "pop_back":{
					if(dq.peekLast()==null) {
						sb.append(-1+"\n");
					}
					else sb.append(dq.pollLast()+"\n");
					break;
				}
				case "size":{
					sb.append(dq.size()+"\n");
					break;
				}
				case "empty":{
					boolean istrue = dq.isEmpty();
					if(istrue) sb.append(1+"\n");
					else sb.append(0+"\n");
					break;
				}
				case "front":{
					if(dq.peekFirst()==null) {
						sb.append(-1+"\n");
					}
					else sb.append(dq.peekFirst()+"\n");
					break;
				}
				case "back":{
					if(dq.peekLast()==null) {
						sb.append(-1+"\n");
					}
					else sb.append(dq.peekLast()+"\n");
					break;
				}
			}
		}
		System.out.println(sb);
		
	}

}
