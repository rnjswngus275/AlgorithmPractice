import java.util.*;

public class Main3 {
    public static StringBuilder sb=new StringBuilder();
    public static Scanner scanner=new Scanner(System.in);
    static int n=0,m=0;
    static int[] data;
    static boolean []visited;
    public static void main(String[] args) {
        n=scanner.nextInt();
        m=scanner.nextInt();
        data=new int[m+1];
        visited=new boolean[n+1];
        solve(1,1,visited);
        System.out.println(sb);
    }
    //pos 현재 위치 used 앞의 pos에서 사용된 숫자 체크 
    public static void solve(int start,int pos, boolean []visited) {   // 1~n의 자연수 중  pos 위치의 값을 저장하고 하는 함수
        //끝날 조건 pos가 m 일때
        //리턴 해야하는 값 : m개의 데이터를 가진 수열
        
        if(pos==m+1) {
            for(int i=1;i<m+1;i++) {
                sb.append(data[i]).append(" ");
            
            }
            sb.append("\n");
            return;
        }
        
        for(int i=1;i<n+1;i++) {
                data[pos]=i;
                solve(i+1,pos+1,visited);

        }
    }

}
