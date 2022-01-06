import java.util.*;


public class Main {

	public static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	while(true) {
		String data="";
		data=scanner.next();
		
		if(data.equals("q")) {
			System.out.print("q");
			break;
		}
		else {
			System.out.println(data);
			}
		}
	}

}
