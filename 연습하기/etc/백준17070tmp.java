package tmp;

import java.util.Scanner;
class position2{
    int x1;
    int y1;
    int x2;
    int y2;
    position2(int x1,int y1,int x2,int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
}

public class 백준17070 {
    static int [] vdx1= {0,0};
    static int [] vdy1= {1,1};
    static int [] vdx2= {0,1};
    static int [] vdy2= {1,1};
    
    static int [] hdx1= {1,1};
    static int [] hdy1= {0,0};
    static int [] hdx2= {1,1};
    static int [] hdy2= {0,1};
    
    static int [] ddx1= {1,1,1};
    static int [] ddy1= {1,1,1};
    static int [] ddx2= {0,1,1};
    static int [] ddy2= {1,0,1};
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[][]=new int [n][n];
        
    }

}
