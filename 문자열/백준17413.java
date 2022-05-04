import java.io.*;
import java.util.*;

public class 백준17413 {

	static Scanner scan=new Scanner(System.in);
	static String arr;
	static int blank,opentag;
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			arr=scan.nextLine();
			solve();
			System.out.println(sb);
	}
	
	public static void solve() {
		int i=0;
		int start=0;
		int length=arr.length();
		while(start<length) {			
			//탐색 시작하는 위치의 첫글자가 태그이면 꺽쇠 닫힐때까지 기록
			if(arr.charAt(start)=='<') {
				int tagend=arr.indexOf('>',start);
				String str=arr.substring(start,tagend+1);
				sb.append(str);
				start=tagend+1;
				continue;
			}
			//태그가 아니고 글자이면
			
			blank=arr.indexOf(" ",start);		//int blank 
			opentag=arr.indexOf("<",start);
			
			if(blank==-1||opentag==-1) {
				if(blank<opentag) {
					reverse(start,opentag-1,false);
					start=opentag;
				}
				else if(blank==opentag) {	//마지막 단어
					reverse(start,length-1,false);
					break;
				}
				else {
					reverse(start,blank-1,true);
					start=blank+1;
				}
			}
			
			else {
				if(blank<opentag) {	
					reverse(start,blank-1,true);
					start=blank+1;
				}
				else if(blank>opentag) {
					reverse(start,opentag-1,false);
					start=opentag;
				}
			}
		}
	}
	
	public static void reverse(int start,int end,boolean isblank) {
		for(int i=end;i>=start;i--) {
			sb.append(arr.charAt(i));
		}
		if(isblank) {
			sb.append(' ');
		}
	}
}
