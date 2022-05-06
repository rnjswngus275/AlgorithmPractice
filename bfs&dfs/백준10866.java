import java.util.*;

public class Main {
	public static Scanner scan =new Scanner(System.in);
	public static StringBuilder sb=new StringBuilder();
	static int n,num,num2,last;
	static String command;
	public static void main(String[] args) {
			Deque dq=new ArrayDeque();
			n=scan.nextInt();
			for(int a=0;a<n;a++) {	
				command=scan.next();
				if(command.equals("push_front")) {
					num=scan.nextInt();
					dq.offerFirst(num);
				}
				if(command.equals("push_back")) {
					num2=scan.nextInt();
					dq.offerLast(num2);
				}
				if(command.equals("pop_front")) {
					boolean bol=dq.isEmpty();
					if(bol==true) {
						sb.append("-1"+"\n");
					}
					else {
						sb.append(dq.pollFirst()+"\n");
					}
				}
				if(command.equals("pop_back")) {
					boolean bol=dq.isEmpty();
					if(bol==true) {
						sb.append("-1"+"\n");
					}
					else {
						sb.append(dq.pollLast()+"\n");
					}
				}
				if(command.equals("size")) {
					sb.append(dq.size()+"\n");
				}
				if(command.equals("empty")) {
					boolean bol=dq.isEmpty();
					if(bol==true) {
						sb.append("1"+"\n");
					}
					else {
						sb.append("0"+"\n");
					}
				}
				if(command.equals("front")) {
					if(dq.isEmpty()) {
						sb.append("-1"+"\n");
					}
					else {
						sb.append(dq.peekFirst()+"\n");
					}
					
					
				}
				if(command.equals("back")) {
					if(dq.isEmpty()) {
						sb.append("-1"+"\n");					}

					else {
						sb.append(dq.peekLast()+"\n");					}
									
				}
				}
					System.out.print(sb);
					
				}
		}
