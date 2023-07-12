package etc;

import java.util.*;
import java.util.Queue;
import java.util.Scanner;

public class bj16918 {
	static Scanner scan=new Scanner(System.in);
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,1,-1};
	static class pos{
		int x,y;
		public pos(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	static int R,C,N;
	static char [][] arr;
	static Queue<pos> q=new LinkedList<>();
	static int second;
	static boolean flag=false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R=scan.nextInt();
		C=scan.nextInt();
		N=scan.nextInt();
		arr=new char [R][C];
		
		for(int i=0;i<R;i++) {
			String str=scan.next();
			for(int j=0;j<C;j++) {
				arr[i][j]=str.charAt(j);
				if(arr[i][j]=='O') {
					q.offer(new pos(i,j));
				}
			}
		}
		if(N==1) {
			test();
			return;
		}
		if(N%2==0) {
			StringBuilder sb=new StringBuilder() ;
			for(int i=0;i<R;i++) {
				for(int j=0;j<C;j++) {
					sb.append('O');
				}
				sb.append('\n');
			}
			System.out.println(sb);
			flag=true;
			return;
		}
		second=1;
		fill();
		boom();
		while(!flag) {
			qing();
			fill();
			boom();
		}

	}
	
	public static void boom(){
		second++;
		while(!q.isEmpty()) {
			pos p=q.poll();
			int x=p.x;
			int y=p.y;
			arr[x][y]='.';

			for(int i=0;i<4;i++) {
				int x2=x+dx[i];
				int y2=y+dy[i];
				if(x2>=0&&y2>=0&&x2<R&&y2<C) {
					arr[x2][y2]='.';
				} 
			}
		}
		if(second == N) {
			test();
			flag=true;
		}
	}
	public static void qing() {
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(arr[i][j]=='O') {
					 q.offer(new pos(i,j));
				}
			}
		}
	}
	public static void fill() {
		second++;
		for(int i=0;i<R;i++) {
			Arrays.fill(arr[i], 'O');
		}
	}
	public static void test() {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
					sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
