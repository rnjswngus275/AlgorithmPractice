import java.util.*;

public class Main {

	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long h =scanner.nextInt();
		long b= scanner.nextInt();
		long c =scanner.nextInt();
		long s =scanner.nextInt();
		
		double pcm=h*b*c*s;

		pcm=pcm/8/1024/1024;
		
		double answer=Math.round(pcm*10)/10.0;
		System.out.print(answer+" MB");
	}

}

// 강약 h
// 체크 b
//트랙개수 c
// 녹음 시간 s
