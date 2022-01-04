import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
	public static final Scanner scanner = new Scanner(System.in);

	/**
     * 배열에서 소속이 "AJOU"인 첫 원소와 마지막 원소를 출력하는 함수
     * @param school 각 사람들의 소속학교 정보 배열
     * @param n      사람들의 수
     */
	public static int[] getIndexes(String[] school, int n)
	{
		int firstIndex = -1; //존재하지 않으면 -1
		int lastIndex = -1;  //존재하지 않으면 -1
		
		for(int i=0;i<n;i++){
			if(school[i].equals("AJOU")){
				if(firstIndex!=-1){
					lastIndex=i+1;
				}
				else{
					//첫번째 아주 찾기
					firstIndex=i+1;
				}
			}
		}
		
		return new int[]{firstIndex, lastIndex};
	}

	public static void main(String[] args)
	{
		int n = scanner.nextInt();
		String[] schools = new String[n];
		for(int i = 0 ; i < n ; i++)
		{
			schools[i] = scanner.next();
		}
		int[] indexes = getIndexes(schools, n);
		System.out.printf("%d %d\n", indexes[0], indexes[1] );
	}

}
