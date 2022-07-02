import java.util.Arrays;
import java.util.Scanner;

public class swea1974 {
	static int T,n,m,max;
	static Scanner scan=new Scanner(System.in);
	static int[][] arr;
	static int[] arr2;
	static boolean ver,hor,rec;
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T=scan.nextInt();
		
		for(int i=0;i<T;i++) {	
			hor=false;
			arr=new int[9][9];
			arr2=new int[10];
			for(int j=0;j<9;j++) {
				for(int k=0;k<9;k++) {
					//가로 검사
					arr[j][k]=scan.nextInt();
				}
			}
			
			if(horizontal()) {
				if(vertical()) {
					if(rectangle()) {
						sb.append("#"+(i+1)+" "+1+"\n");
					}
					else sb.append("#"+(i+1)+" "+0+"\n");
				}
				else sb.append("#"+(i+1)+" "+0+"\n");
			}
			else sb.append("#"+(i+1)+" "+0+"\n");
		}
		System.out.print(sb);
	}
	
	static boolean check() {
		for(int a=1;a<10;a++) {
			if(arr2[a]!=1) {
				return false;	
			}
		}
		return true;
	}
	static boolean horizontal() {
		//세로 체크
		
		for(int a=0;a<9;a++) {
			Arrays.fill(arr2, 0);
			for(int b=0;b<9;b++) {
				int num=arr[a][b];
				if(num==1) {
					arr2[1]++;
				}if(num==2) {
					arr2[2]++;
				}if(num==3) {
					arr2[3]++;
				}if(num==4) {
					arr2[4]++;
				}if(num==5) {
					arr2[5]++;
				}if(num==6) {
					arr2[6]++;
				}if(num==7) {
					arr2[7]++;
				}if(num==8) {
					arr2[8]++;
				}if(num==9) {
					arr2[9]++;
				}	
			}
			if(!check()) {
				return false;
			}
		}
		return true;
	}
	static boolean vertical() {
		//세로 체크
		
		for(int a=0;a<9;a++) {
			Arrays.fill(arr2, 0);
			for(int b=0;b<9;b++) {
				int num=arr[b][a];
				if(num==1) {
					arr2[1]++;
				}if(num==2) {
					arr2[2]++;
				}if(num==3) {
					arr2[3]++;
				}if(num==4) {
					arr2[4]++;
				}if(num==5) {
					arr2[5]++;
				}if(num==6) {
					arr2[6]++;
				}if(num==7) {
					arr2[7]++;
				}if(num==8) {
					arr2[8]++;
				}if(num==9) {
					arr2[9]++;
				}	
			}
			if(!check()) {
				return false;
			}
		}
		return true;
	}
static boolean rectangle() {
	for(int linex=0;linex<9;linex+=3) {
		for(int liney=0;liney<9;liney+=3) {
			Arrays.fill(arr2, 0);
		for(int a=linex;a<linex+3;a++) {
			for(int b=liney;b<liney+3;b++) {
				int num=arr[a][b];
				if(num==1) {
					arr2[1]++;
				}if(num==2) {
					arr2[2]++;
				}if(num==3) {
					arr2[3]++;
				}if(num==4) {
					arr2[4]++;
				}if(num==5) {
					arr2[5]++;
				}if(num==6) {
					arr2[6]++;
				}if(num==7) {
					arr2[7]++;
				}if(num==8) {
					arr2[8]++;
				}if(num==9) {
					arr2[9]++;
				}	
			}	
		}
		if(!check()) {
			return false;
		}
	}
	}
		return true;
	}
}
