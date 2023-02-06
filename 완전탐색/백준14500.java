import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준14500 {
    public static Scanner scan=new Scanner(System.in);
    static int n,m;
    static int [][] arr;
    static int [] dx= {-1,1,0,0};
    static int [] dy= {0,0,-1,1};
    static boolean [][] visited;
    static int max=Integer.MIN_VALUE;
   static public class pos4{
       int i,j;
       public pos4(int i, int j) {
           this.i=i;
           this.j=j;
       }
   }
   
    public static void main(String[] args) {
        // TODO Auto-generated method stub
           n=scan.nextInt();
           m=scan.nextInt();
           arr=new int [n][m];
           visited=new boolean[n][m];
           for(int i=0;i<n;i++) {
               for(int j=0;j<m;j++) {
                   arr[i][j]=scan.nextInt();
               }
           }
           for(int i=0;i<n;i++) {
               for(int j=0;j<m;j++) {
                   visited[i][j]=true;
                   sol(new pos4(i,j),1,arr[i][j]);
                   visited[i][j]=false;
                   check_exshape(i,j);
               }
           }
           System.out.println(max);
    }
    
    static void sol(pos4 cur,int cnt, int sum) {
        
        if(cnt==4) {//base case
            max=Math.max(max, sum);
            return;
        }
        for(int a=0;a<4;a++) {
            int nx=cur.i+dx[a];
            int ny=cur.j+dy[a];
            if(nx>=0&&ny>=0&&nx<n&&ny<m&&!visited[nx][ny]) {
                visited[nx][ny]=true;
                sum+=arr[nx][ny];
                sol(new pos4(nx,ny),cnt+1,sum);
                sum-=arr[nx][ny];    
                visited[nx][ny]=false;
            }
        }
    }
    static void check_exshape(int x, int y){

        int sum_value = 0;
        // 1. ㅜ
        if(x>=0 && x+1<n && y>=0 && y+2<m){
            sum_value = arr[x][y] + arr[x][y+1] + arr[x][y+2] + arr[x+1][y+1];
            max = Math.max(max, sum_value);
        }

        // 2. ㅏ
        if(x >=0 && x+2 <n && y>=0 && y+1<m){
            sum_value = arr[x][y] + arr[x+1][y] + arr[x+2][y] + arr[x+1][y+1];
            max = Math.max(max, sum_value);
        }

        // 3. ㅗ
        if(x-1>= 0&& x <n && y>=0 && y+2 <m){
            sum_value = arr[x][y] + arr[x][y+1] + arr[x][y+2] + arr[x-1][y+1];
            max = Math.max(max, sum_value);
        }

        // 4. ㅓ
        if(x >= 0 && x+2 <n && y-1>=0 && y <m){
            sum_value = arr[x][y] + arr[x+1][y] + arr[x+2][y] + arr[x+1][y-1];
            max = Math.max(max, sum_value);
        }
    }


}
