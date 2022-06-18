import java.util.*;
import java.io.*;
public class 백준1931 {
	static int n;
	static Scanner scan=new Scanner (System.in);
	static Comparator<long[]> comp=new Comparator<long[]>() {
		@Override
		public int compare(long[] o1, long[] o2) {
			// TODO Auto-generated method stub
			if(o1[1]==o2[1]) {
				return (int)(o1[0]-o2[0]);
			}
			return (int)(o1[1]-o2[1]);
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		long end=0;
		n=scan.nextInt();
		long[][] arr=new long[n][2];
		for(int i=0;i<n;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			arr[i][0]=a;	//0에는 시작 시간
			arr[i][1]=b;	//1에는 도착 시간
		}
		Arrays.sort(arr, comp);
		for(int j=0;j<n;j++) {
			if(end<=arr[j][0]) {//시작시간이 끝나는시간 이후인것 중에서 끝나는 시간이 가장 짧은 것들을 cnt
				end=arr[j][1];
				cnt++;
			}
		}
		System.out.print(cnt);
	}


}
