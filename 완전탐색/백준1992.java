import java.util.Scanner;

public class 백준1992 {
    public static Scanner scan=new Scanner(System.in);
    static int n;
    static int [][] arr;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        n=scan.nextInt();
        arr=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        
       
    }
    public static void sol(int start, int n) {
        int leftUp=arr[start][start],leftDown=arr[n/2][start],rightUp=arr[start][n/2],rightDown=arr[n/2][n/2];
        //왼쪽위
        for(int i=start;i<n/2;i++) {
            for(int j=start;j<n/2;j++) {
                if(arr[i][j]!=leftUp) {
                    sol()
                }
            }
        }
        
        //오른쪽위
        for(int i=start;i<n/2;i++) {
            for(int j=n/2;j<n;j++) {
                
            }
        }
        
        //왼쪽 아래
        for(int i= n/2;i<n;i++) {
            for(int j=start;j<n/2;j++) {
                
            }
        }
        //오른쪽 아래
        for(int i=n/2;i<n;i++) {
            for(int j=n/2;j<n;j++) {
                
            }
        }
    }

}
