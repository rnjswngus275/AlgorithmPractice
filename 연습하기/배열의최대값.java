import java.io.*;
import java.lang.*;
import java.util.*;


public class 배열의최대값 {
	public static final Scanner scanner = new Scanner(System.in);

	/**
     * 배열의 최대값을 계산하는 함수.
     *
     * @param data
     * @param n
     * @return data[0] ~ data[n-1]중 최대값.
     */
	public static int getMax(int[] data, int n) {
		int Max=data[0];
		for(int i=1;i<n;i++){
			if(data[i]>Max){
				Max=data[i];
			}
		}
		return Max;
	}

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = scanner.nextInt();
		}

		int answer = getMax(data, n);

		System.out.println(answer);
	}

}
