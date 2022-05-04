import java.util.*;
import java.io.*;

public class 백준20437 {
	static int T,k;
	static String W;
	static int[][] arr;
	static Integer a;
	static Scanner scan=new Scanner(System.in);
	static int min,max;
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T=scan.nextInt();
		for(int i=0;i<T;i++) {
			min=Integer.MAX_VALUE;
			max=Integer.MIN_VALUE;
			W=scan.next();
			k=scan.nextInt();
			//인접리스트 생성
			ArrayList<ArrayList<Integer>> list=new ArrayList<>();
			for(int m=0;m<26;m++) {
				list.add(new ArrayList<>());
			}
			solve(list);
			if(min==Integer.MAX_VALUE) {
				sb.append(-1+"\n");
			}
			else sb.append(min+" "+max+"\n");

		}
		System.out.print(sb);
	}
	public static void solve(ArrayList<ArrayList<Integer>> list) {
		// a~z까지 생성된 list에 문자열 wㅔ 해당하는 index들을 기록한다.
		for(int idx=0;idx<W.length();idx++) {
				list.get(W.charAt(idx)-97).add(idx);
		}
		
		int i = 0;
		//a~z까지 해당하는 문자가 있는 위치(index)를 기록한 list 에서 최대 최소를 구한다 
		while(i<26) {
			int size= list.get(i).size();
			if(size>=k) {
				for(int m=0;size>=m+k;m++) {
					min=Math.min(min,list.get(i).get(m+k-1)-list.get(i).get(m)+1);
					max=Math.max(max, list.get(i).get(m+k-1)-list.get(i).get(m)+1);
				}
			}
			i++;
		}

	}

	}
