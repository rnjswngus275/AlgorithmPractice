import java.util.*;

class xy{
	int x;
	int y;
	xy(int x,int y){
		this.x=x;
		this.y=y;
	}
}

public class 백준18404 {
	static int T,M,N,X,Y,cnt=0;
	static Scanner scan =new Scanner(System.in);
	static int[] dx= {-2,-2,-1,-1,+1,+1,+2,+2};
	static int[] dy= {-1,+1,-2,+2,-2,+2,-1,+1};
	static int[][] arr;
	static int[][] visited;
	static ArrayList<xy> list;
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) {
		// 입력
		N=scan.nextInt();
		M=scan.nextInt();
		X=scan.nextInt();
		Y=scan.nextInt();
		list=new ArrayList<>();
		for(int i=0;i<M;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			visited=new int [N+1][N+1];
			list.add(new xy(a,b));
			
		}
		bfs();
		
		for(int i=0;i<list.size();i++) {
			xy xy=list.get(i);
			sb.append(visited[xy.x][xy.y]-1+" ");
			
		}
		System.out.print(sb);
	}
	static void bfs() {
		Queue<xy> q=new LinkedList<>();
		q.offer(new xy(X,Y));	
		visited[X][Y]=1;
		
		while(!q.isEmpty()) {
			xy cur=q.poll();
			int x=cur.x;
			int y=cur.y;
			
			for(int i=0;i<8;i++) {
				int nx=cur.x+dx[i];
				int ny=cur.y+dy[i];
					if(nx>0&&ny>0&&nx<N+1&&ny<N+1) {	//격자를 빠져나가지 않으면
						if(visited[nx][ny]==0) {	//방문하지 않았고
						q.offer(new xy(nx,ny));
						visited[nx][ny]=visited[x][y]+1;
					}
				}
			}
		}
	
	}
}