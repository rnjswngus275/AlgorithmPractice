package tmp;

import java.io.BufferedInputStream;
import java.sql.SQLNonTransientConnectionException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swea1953 {
    static int N, M, R, C, L, ans;
    static int[][] arr;
    static int dx[] = { -1, 1, 0, 0 }; // 상하좌우 순서
    static int dy[] = { 0, 0, -1, 1 };

    static class pos {
        int x, y;
        boolean[] dir = new boolean[4];

        public pos(int x, int y, boolean[] dir) {
            this.x = x;
            this.y = y;
            for (int i = 0; i < 4; i++) {
                this.dir[i] = dir[i];
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 시간당 1 움직일 수 있음
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int o = 1; o <= T; o++) {
            ans = 0;
            N = scan.nextInt();
            M = scan.nextInt();

            arr = new int[N][M];

            R = scan.nextInt(); // 멘홀의 가로위치
            C = scan.nextInt(); // 새로위치
            L = scan.nextInt(); // 탈출 후 소요된 시간

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }

            int ans=bfs(R,C);

            System.out.println("#" + o + " " + ans);

        }
    }

    public static int bfs(int x, int y) {
        int cnt=0;
        Queue<pos> q = new LinkedList<pos>();
        int[][]visited=new int[N][M];
        q.offer(new pos(x, y, dir_chk(x, y)));
        visited[x][y]=1;
        // 다음 터널이 이전터널의 경로와 같은지 확인해야한다.
        while (!q.isEmpty()) {
            pos cur = q.poll();
            int cur_x = cur.x;
            int cur_y = cur.y;
            boolean[] cur_dir = cur.dir;
            cnt++;
            if(visited[cur_x][cur_y]==L) {
                continue;
            }
            
            for (int i = 0; i < 4; i++) {
                if (cur_dir[i]) { // 갈수 있는 방향
                    int nx = cur_x + dx[i];
                    int ny = cur_y + dy[i];
                    if (nx >= 0 && ny >= 0 && nx < N && ny < M&&visited[nx][ny]==0&&arr[nx][ny]>0) {
                        // nx ny의 터널의 방향이 cur_dir중에 있어야한다.
                        boolean[] ndir = dir_chk(nx, ny);
                        if(i==0&&ndir[1]) {
                            //하로 출입가능한거
                            visited[nx][ny]=visited[cur_x][cur_y]+1;
                             q.offer(new pos(nx,ny,ndir));
                        }
                        else if(i==1&&ndir[0]) {
                            //상으로 출입가능한거
                            visited[nx][ny]=visited[cur_x][cur_y]+1;
                            q.offer(new pos(nx, ny, ndir));
                        }
                        else if(i==2&&ndir[3]) {
                            //우로 출입가능해야함
                            visited[nx][ny]=visited[cur_x][cur_y]+1;
                            q.offer(new pos(nx, ny, ndir));
                        }
                        else if(i==3&&ndir[2]) {
                            //좌로 출입가능해야함 
                            visited[nx][ny]=visited[cur_x][cur_y]+1;
                            q.offer(new pos(nx, ny, ndir));
                        }
                    }
                }
            }
        }
        return cnt;
    }

    public static boolean[] dir_chk(int x, int y) {
        boolean[] dir = new boolean[4];
        if (arr[x][y] == 1) {
            for (int i = 0; i < 4; i++) {
                dir[i] = true;
            }
        } else if (arr[x][y] == 2) {
            dir[0] = true;
            dir[1] = true;
        } else if (arr[x][y] == 3) {
            dir[2] = true;
            dir[3] = true;
        } else if (arr[x][y] == 4) {
            dir[0] = true;
            dir[3] = true;
        } else if (arr[x][y] == 5) {
            dir[1] = true;
            dir[3] = true;
        } else if (arr[x][y] == 6) {
            dir[1] = true;
            dir[2] = true;
        } else if (arr[x][y] == 7) {
            dir[0] = true;
            dir[2] = true;
        }
        return dir;
    }

}
