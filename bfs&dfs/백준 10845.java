  import java.util.*;

public class Main {
	public static Scanner scan =new Scanner(System.in);
	public static StringBuilder sb=new StringBuilder();
	static int n,num,last;
	static String command;
	public static void main(String[] args) {
			Queue q=new LinkedList();
			n=scan.nextInt();
			for(int a=0;a<n;a++) {	
				command=scan.next();
				if(command.equals("push")) {
					num=scan.nextInt();
					q.offer(num);
					last=num;
				}
				if(command.equals("pop")) {
					boolean bol=q.isEmpty();
					if(bol==true) {
						sb.append("-1"+"\n");
					}
					else {
						sb.append(q.poll()+"\n");
					}
				}
				if(command.equals("size")) {
					sb.append(q.size()+"\n");
				}
				if(command.equals("empty")) {
					boolean bol=q.isEmpty();
					if(bol==true) {
						sb.append("1"+"\n");
					}
					else {
						sb.append("0"+"\n");
					}
				}
				if(command.equals("front")) {
					if(q.isEmpty()) {
						sb.append("-1"+"\n");
					}
					else {
						sb.append(q.peek()+"\n");
					}
					
					
				}
				if(command.equals("back")) {
					if(q.isEmpty()) {
						sb.append("-1"+"\n");					}

					else {
						sb.append(last+"\n");					}
					
					
				}

				}
					System.out.print(sb);
					
				}
		}
