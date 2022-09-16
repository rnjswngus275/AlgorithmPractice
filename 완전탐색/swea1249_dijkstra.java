package tmp;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;


public class swea1249_dijkstra {

    public static class Info implements Comparable<Info>{
        int x,y; 
        int distance;  //인덱스와 가중치를 저장한다.
        Info(int x,int y, int distance){ 
            this.x=x;
            this.y=y;
            this.distance=distance;
        }
        public int compareTo(Info other) {  //가중치를 기준으로 comparable을 선언하여 우선순위 큐의 판단 기준을 제공한다.
            if(this.distance<other.distance) {//비교할 값보다 지금이 최소값일 때 -> 교환안함
                return -1;      //음수 일경우 : 교환안함
            }
            return 1;
        }
    }
    static int N,ans;
    static int dir[][] = new int[][] {{0,1},{1,0},{-1,0},{0,-1} };

    static boolean[][] visited;
    static int[][] sum;
    static int [][] arr;
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        long start=System.currentTimeMillis();

        int T = scanner.nextInt();
        for (int o = 1; o <= T; o++) {
            ans=Integer.MAX_VALUE;
            N=scanner.nextInt();
            arr=new int[N][N];
            visited= new boolean[N][N];
            sum=new int[N][N];
            for(int i=0;i<N;i++) {
                Arrays.fill(sum[i], Integer.MAX_VALUE);
            }
            sum[0][0]=0;
            
            for(int i=0;i<N;i++) {
                String str =scanner.next();
                for(int j=0;j<N;j++) {
                    arr[i][j]=str.charAt(j)-'0';
                }
            }
            
            dijkstra();
            System.out.println("#" + o + " " + sum[N-1][N-1]);

    }
        System.out.println(System.currentTimeMillis()-start);

    }
    public static void dijkstra() {
        PriorityQueue<Info> pq =new PriorityQueue<>();
        pq.offer(new Info(0,0,0));
        
        while(!pq.isEmpty()) {
            Info cur=pq.poll();
            if(cur.distance>sum[cur.x][cur.y])continue;      
            
            for(int i=0;i<4;i++) {
                int nx=cur.x+dir[i][0];
                int ny=cur.y+dir[i][1];
                
                if(nx>=0&&ny>=0&&nx<N&&ny<N) {
                    int nd=cur.distance+arr[nx][ny];
                    if(sum[nx][ny]>nd) {
                        sum[nx][ny]=nd;
                        pq.offer(new Info(nx, ny, sum[nx][ny]));
                    }
                }
            }
        }
        
    }
}
