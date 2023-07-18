package etc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import etc.bj16918.pos;

public class bj7576 {
	static Scanner scan=new Scanner(System.in);
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,1,-1};
	static class pos{
		int x,y,time;
		public pos(int x, int y, int time) {
			this.x=x;
			this.y=y;
			this.time=time;
		}
	}
	static int M,N;
	static int [][] arr;
	static boolean [][] visited;
	static int time=0, max;
	static Queue<pos> q=new LinkedList<>();
	static boolean flag=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M=scan.nextInt();
		N=scan.nextInt();
		arr = new int[N][M];
		visited = new boolean[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr[i][j]=scan.nextInt();
				if(arr[i][j]==1) {
					q.offer(new pos(i,j,time));
					visited[i][j]=true;
				}
			}
		}
		while(!q.isEmpty()) {
			pos p=q.poll();
			for(int i=0;i<4;i++) {
				int x=p.x+dx[i];
				int y=p.y+dy[i];
				if(x>=0&&y>=0&&x<N&&y<M&&!visited[x][y]&&arr[x][y]!=-1) {
					q.offer(new pos(x,y,p.time+1));
					visited[x][y]=true;
					arr[x][y]=1;
					if(max<p.time+1) {
						max=p.time+1;
					}
				}
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr[i][j]==0) {
					flag=false;
				}
			}
		}
		if(flag) {
			System.out.println(max);
		}else System.out.println(-1);
	}

}
