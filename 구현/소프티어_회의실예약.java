import java.util.*;
public class 소프티어_회의실예약 {
	static int n,m,cnt=0,answer=0;
	static Hashtable<String,Integer> map=new Hashtable<>();
	static Scanner scan =new Scanner(System.in);
	static StringBuilder sb=new StringBuilder();
	static String[] str;
	static int[][] arr;
	public static void main(String[] args) {
		// 문제 : 비어있는 시간대 출력
		//입력 : 예약된 m개의 회의 정보 
		// 회의실 수 n 회의 수 m
		// 회의실의 이름 (n줄)
		// 회의실의 이름 r, 시작시간 s, 종료시간 t (m줄)
		//출력 : Room 회의실 이름:
		// n(=예약 가능한 시간대의 개수) available:tt-tt (n줄)
		// 가능한 시간이 없다면 Not available
		
		n=scan.nextInt();
		m=scan.nextInt();
		str=new String[n];	//회의실 이름이 저장된 
		arr=new int[n][20];
		for(int i=0;i<n;i++) {
			str[i]=scan.next();
		}
		Arrays.sort(str);
		
		for(int i=0;i<n;i++) {
			map.put(str[i], i);
		}
		for(int j=0;j<m;j++) {	//예약 잡힌 시간
			String r;
			int a;
			int b;
			r=scan.next();	//회의실 이름
			a=scan.nextInt();//시작 시간 
			b=scan.nextInt();//종료 시간
			int val=map.get(r);
			for(int k=a;k<b;k++) {	//시간 체크
				arr[val][k]=1;
			}
		}
		
		print();
		System.out.print(sb);
		
	}
	static void print() {
		for(int a=0;a<n;a++) {
			StringBuilder sb2=new StringBuilder();
			sb.append("Room "+str[a]+":\n");
			int cnt=0;
			for(int i=9;i<=18;i++) {
				if(arr[a][i]==0&&i<18) {// 빈 시간대이면
					cnt++;
					if(i<10) {	//한자리 수이면
						sb2.append("0"+i+"-");
					}else sb2.append(i+"-");
					//다음 1나올때까지 continue
					while(arr[a][i]==0&&i<18) {
						i++;
					}
					if(i<10) {	//한자리 수이면
						sb2.append("0"+i+"\n");
					}else sb2.append(i+"\n");
				}
			}
			if(cnt==0) {
				sb.append("Not available\n");
			}
			else {
				sb.append(cnt+" available:\n");
				sb.append(sb2);
			}
			if(a==n-1) {
				return;
			}
			else sb.append("-----\n");
		}
	}
}
