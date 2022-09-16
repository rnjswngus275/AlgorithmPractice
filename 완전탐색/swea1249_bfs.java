package tmp;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swea1249_bfs {
    public static class position2{
        int x,y;
        position2(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    static int N,ans;
    static int dir[][] = new int[][] {{1,0},{0,-1},{-1,0},{0,1}};

    static boolean[][] visited;
    static int[][] sum;
    static int [][] arr;
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        long start=System.currentTimeMillis();

        // TODO Auto-generated method stub
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
            
            
            for(int i=0;i<N;i++) {
                String str =scanner.next();
                for(int j=0;j<N;j++) {
                    arr[i][j]=str.charAt(j)-'0';
                }
            }
            sum[0][0]=0;
            
            bfs(0,0);
            System.out.println("#" + o + " " + sum[N-1][N-1]);
            
        }

    }
    public static void bfs(int x,int y) {
        Queue <position2> q= new LinkedList<>();
        q.offer(new position2(x, y));
        while(!q.isEmpty()) {
            position2 next=q.poll();
            for(int i=0;i<4;i++) {
                int nx=next.x+dir[i][0];
                int ny=next.y+dir[i][1];
                
                if(nx>=0&&ny>=0&&nx<N&&ny<N) {
                    if(sum[nx][ny]>arr[nx][ny]+sum[next.x][next.y]) {
                        sum[nx][ny]=arr[nx][ny]+sum[next.x][next.y];
                        q.offer(new position2(nx, ny));
                    }
                }
            }
        }
     }

}
