import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n; //n을 입력받아 보세요
		n=scanner.nextInt();
		// "Goorm"을 n번 출력하세요 
		// 각 문자열 사이는 ", "로 구분되어야 합니다
		for(int i=0;i<n;i++){
			if(i==n-1){
			System.out.printf("Goorm");

			}
			else{
			System.out.printf("Goorm");
			System.out.printf(", ");
			}
	
		}

	}
}
