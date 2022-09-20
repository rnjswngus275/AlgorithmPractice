package tmp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class swea4013_array {
    static int  K,ans;
    static int [][]cycle,arr;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int o = 1; o <= T; o++) {
            ans=0;
            K=scan.nextInt();      
            cycle=new int[K][2];
            arr=new int[4][8];
            
            for(int i=0;i<4;i++) {
                for(int j=0;j<8;j++) {
                    arr[i][j]=scan.nextInt();
                }
            }

            for(int i=0;i<K;i++) {
                cycle[i][0]=scan.nextInt();   //자석번호
                cycle[i][1]=scan.nextInt();   //회전방향 1(시계) -1(반시계)
                sol(cycle[i][0]-1,cycle[i][1],true,true);
                }
//            System.out.println(arr.get(0).toString().charAt(0));
            
            for(int i=0;i<4;i++) {
                int a=arr[i][0];
//                System.out.println(arr.get(i));
//                System.out.println(a);
                if(a==1) {
                    ans+=Math.pow(2, i);
                }
            }
            
            System.out.println("#" + o + " " + ans);
        }
        
    }
    public static void sol(int num,int cycle,boolean left_go,boolean right_go) {
        //왼쪽 자석의 3번째 날, 오른쪽 자석의 7번째 날
        //왼쪽이 움직여야하는지 체크
        int left=num-1;
        boolean isleft=false;
        if(left>=0) {   //왼쪽 자석이 존재한다면
            if(arr[num][6]!=arr[left][2]) { //회전 해야한다면
                isleft=true;
            }        
        }
        
        //오른쪽이 움직여야하는지 체크
        int right=num+1;
        boolean isright=false;
        if(right<4) {
//            System.out.println("19: "+arr.get(num).toString().charAt(19)+" 7 : " +arr.get(num).toString().charAt(7));

            if((arr[num][2]!=arr[right][6])) {
                isright=true;
            }
        }
        // 내바퀴 움직이기
        if(cycle==1) {  //시계 방향
            int tmp=arr[num][7];        //맨뒤꺼 빼낸후
            for(int i=7;i>=1;i--) {
               arr[num][i]=arr[num][i-1];
            }             //한칸씩 뒤로 보낸다.
            arr[num][0]=tmp;
            //맨앞에 TMP 넣는다.
        }else {
            int tmp=arr[num][0];        //맨앞꺼 빼낸후
            for(int i=1;i<=7;i++) {
               arr[num][i-1]=arr[num][i];
            }             //한칸씩 앞으로 보낸다.
            arr[num][7]=tmp;
            //맨뒤에 TMP 넣는다.
        }
        
        if(isleft&&left_go) {
            sol(left,cycle*(-1),true,false);
        }
        if(isright&&right_go) {
            sol(right,cycle*(-1),false,true);
        }
        
    }
        
}
