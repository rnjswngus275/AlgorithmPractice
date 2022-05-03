import java.io.*;
import java.util.*;
import java.lang.*;

class 테스트케이스 {
  public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//테스트 케이스의 수를 입력받는다
		int tc = scanner.nextInt();
	
		/*
		 * 여러 테스트 케이스에 대하여
		 * 공통적으로 사용될 수 있는 계산은 
		 * 여기에서 미리 하는것이 좋다
		 * 자세한 내용은 공간활용 단원에서 다룬다
		 */
		
		for(int i = 1; i <= tc; i++)
		{
			//테스트 케이스의 수 만큼 
			// i는 1~tc까지 반복한다 
		
			//테스트 케이스 번호를 출력한다 
			System.out.printf("Case #%d\n", i);
			
			//하나의 테스트 케이스를 처리하는 함수 호출
			testCase();
		}
  }
	public static void testCase()
	{	
		//하나의 테스트 케이스를 하나의 함수에서 처리하면 
		//실수도 줄고 간결해진다 
		ArrayList<Integer> arr =new ArrayList <>();
int sum=0;
	for(int j=0; j<3;j++){
			arr.add(scanner.nextInt());
			sum+=arr.get(j);
		}
		
		System.out.println(sum);
		
		
	}
}
