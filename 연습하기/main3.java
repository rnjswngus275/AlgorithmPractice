import java.util.LinkedList;
import java.util.Queue;

public class main3 {
    static int [][] arr =new int [6][6];
    public static class pos{
        int x,y,cnt,color;
        public pos(int x,int y,int cnt,int color) {
            this.x=x;
            this.y=y;
            this.cnt=cnt;
            this.color=color;
        }
    }
    public static int[] dx= {-1,1,0,0};
    public static int[] dy= {0,0,-1,1};
    public static void main(String[] args) {
//     int[][] macaroon= {
//             {1,1},{2,1},{1,2},{3,3},
//             {6,4},{3,1},{3,3},{3,3},
//             {3,4},{2,1}
//     };   
     int[][] macaroon= {
             {1,1},{1,2},{1,4},{2,1},
             {2,2},{2,3},{3,4},{3,1},
             {3,2},{3,3},{3,4},{4,4},{4,3},{5,4},{6,1}
     }; 
     // 떨어트린 위치(y좌표), 마카롱 색 순서
     
     //1. 마카롱 떨어뜨리기 arr[5][y] 부터 [4][y] ... 자리 비었는지 확인하고 넣음
     //2. 3개 떨어뜨린 후 부터 탐색
     //3. 터지는 마카롱이 있다면 터트리고 (0으로 만들고) 3-1 중력 작용 3-2 탐색 (3번 과정 반복)
     sol(macaroon);
     
    }
    
   public static void sol(int [][] mac) {
     for(int i=0;i<mac.length;i++) {
         pos cur=drop(mac[i][0],mac[i][1]);     //떨어진 좌표
         if(i>=3) {//3개 떨어뜨린 후부터 탐색
             boolean istrue=true;
             //3번과정 반복
                 istrue=search(cur);
              while(istrue) {
                  istrue=false;
                  for(int a=0;a<6;a++) {
                      for(int b=0;b<6;b++) {
                          if(arr[a][b]==0) continue;
                          else {
                              boolean res=search(new pos(a,b,1,arr[a][b]));
                              if(res) {
                                  istrue=true;
                              }
                          }
                      }
                  }
              }
         }
         System.out.println((i+1)+"번째");
         
     }
   }
   public static pos drop(int y, int color) {
       
       for(int i=5;i>=0;i--) {
           if(arr[i][y-1]==0) {
               arr[i][y-1]=color;
//               print(arr);
               return new pos(i,y-1,0,color);
           }
       }
       return new pos(0,0,1,0);
//       print();
   }
   public static boolean search(pos cur) {
       Queue<pos> q=new LinkedList<>();
       boolean [][] visited=new boolean[6][6];
       boolean isover3=false;
       visited[cur.x][cur.y]=true;
       q.offer(cur);
       int cnt=1;
       while(!q.isEmpty()) {
           pos now=q.poll();
           if(cnt>=3) isover3=true;
           for(int i=0;i<4;i++) {
               int ncolor=now.color;
               int ncnt=now.cnt;
               int nx=now.x+dx[i];
               int ny=now.y+dy[i];
               if(nx>=0&&ny>=0&&nx<6&&ny<6) {//격자를 빠져나가지 않고
                   if(!visited[nx][ny]&&ncolor==arr[nx][ny]) {//방문하지 않았고 떨어트린 색갈과 같다면
                       visited[nx][ny]=true;// 방문체크
                       cnt++;
                       q.offer(new pos(nx,ny,ncnt+1,ncolor));
                   }
                   
               }
           }
       }
       if(isover3) {
           pop(visited);
           gravity();
           return true;
       }else {//3개  넘는게 없으므로 
           return false;
       }
       
   }
   
   
   public static void pop (boolean [][] visited) {//bfs에서 터트린건 0으로 표시
       for(int i=0;i<6;i++) {
           for(int j=0;j<6;j++) {
               if(visited[i][j]==true) {
                   arr[i][j]=0;
               }
           }
       }
   }
   public static void gravity() {
       for(int j=0;j<6;j++) {
           for(int i=1;i<6;i++) {
               if(arr[i][j]==0) {//자리교환
                   for(int a=i;a>0;a--) {
                       int tmp=arr[a-1][j];
                       arr[a-1][j]=arr[a][j];
                       arr[a][j]=tmp;
                   }
                   
               }
           }
       }
   }
   public static void print(int [][] arr) {
       for(int i=0;i<6;i++) {
           for(int j=0;j<6;j++) {
               System.out.print(arr[i][j]);
           }
           System.out.println();
       }
       System.out.println("-------");
   }
   public static void copy(int [][] visited) {
       for(int i=0;i<6;i++) {
           for(int j=0;j<6;j++) {
               visited[i][j]=arr[i][j];
           }
       }
   }
}
