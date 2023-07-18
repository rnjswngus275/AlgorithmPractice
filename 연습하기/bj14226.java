import java.util.*;

public class bj14226 {
	static Scanner scan=new Scanner(System.in);
	static Queue<pos> q=new LinkedList<>();
	static int[] visited;
	public static class pos{
		int now,clip,time;
		pos(int now, int clip, int time){
			this.now=now;
			this.clip=clip;
			this.time=time;
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=scan.nextInt();
		visited=new int [1001];
		q.offer(new pos(1,0,0));
		visited[1]=0;
		Arrays.fill(visited, Integer.MAX_VALUE);
		
		while(!q.isEmpty()) {
			pos p=q.poll();
			int now=p.now;
			int clip=p.clip;
			int time=p.time;
			
			if(time<visited[now]) {
				visited[now]=time;
			}
			//1. 복사 : 계속 복사가 반복되는 상황일 때 ???어케하쥐
			if(clip!=now) {
				q.offer(new pos(now,now,time+1));
			}
			//2. 붙여넣기
			if(clip!=0&&now+clip<1001) {
				if(visited[now+clip]==Integer.MAX_VALUE) {//방문안했으면
					q.offer(new pos(now+clip,clip,time+1));
				}else if(visited[now+clip]>time+1) {//이전 방문한것보다 최적경로이면
					q.offer(new pos(now+clip,clip,time+1));
				}
			}
			//3. 삭제
			if(now-1>1) {
				if(visited[now-1]>time-1) {
					q.offer(new pos(now-1,clip,time+1));				
				}
			}
		}
		System.out.println(visited[s]);
	}
}
