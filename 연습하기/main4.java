
public class main4 {
    //첫번째 원소 =사람/ 두번째=식인종
    static int[] A=new int [2];
    static int[] B=new int [2];
    static int[] boat=new int[2];
    static int min= Integer.MAX_VALUE;
    static boolean [][]visitedA;     //[사람] [식인종]
    static boolean [][]visitedB;     //[사람] [식인종]

    public static void main(String[] args) {
        //사람 n명 식인종 m명 
        //배에는 최대 p명
        //배안 또는 섬에서 n<m이면 사망
       //return 안전하게+ 배 이동 최소
        
        int n=2;
        int m=2;
        int p=1;
        A[0]=n;
        A[1]=m;
        visitedA=new boolean[n+1][m+1];
        visitedB=new boolean[n+1][m+1];
        sol(n,m,p,0);
        if(min==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(min); 
        
    }
    public static void sol(int n, int m, int p,int cnt) {
        if(A[0]==0&&A[1]==0) {
            min=Math.min(cnt,min);
            return;
        }
        //A에 있는 것을 B로 옮기기
        for(int i=0;i<=A[0];i++) {
            for(int j=0;j<=A[1];j++) {
                //사람 i명 식인종 j명
                if(i+j<1||i+j>p) continue;  //사람수보다 더 많으면
                A[0]-=i;
                A[1]-=j;
                boat[0]+=i;
                boat[1]+=j;
                B[0]+=i;
                B[1]+=j;
                boolean istrue=validate(n,m);
                boat[0]=0;
                boat[1]=0;
                if(istrue&&!visitedA[A[0]][A[1]]) {
                    // B->A
                    visitedA[A[0]][A[1]]=true;
                    sol2(n,m,p,cnt+1);
                }
                //원상 복구
                A[0]+=i;
                A[1]+=j;
 
                B[0]-=i;
                B[1]-=j;
                
            }
        } 
    }
    
    
    public static void sol2(int n, int m, int p,int cnt) {
        if(A[0]==0&&A[1]==0) {
            min=Math.min(cnt,min);
            return;
        }
        
        //B에 있는 것을 A로 옮기기
        for(int i=0;i<=B[0];i++) {
            for(int j=0;j<=B[1];j++) {
                //사람 i명 식인종 j명
                if(i+j<1||i+j>p) continue;  //사람수보다 더 많으면
                B[0]-=i;
                B[1]-=j;
                boat[0]+=i;
                boat[1]+=j;
                A[0]+=i;
                A[1]+=j;
                boolean istrue=validate(n,m);

                boat[0]=0;
                boat[1]=0;
                if(istrue&&!visitedB[B[0]][B[1]]) {
                    visitedB[B[0]][B[1]]=true;
                    sol(n,m,p,cnt+1);
                }
                //원상 복구
                A[0]-=i;
                A[1]-=j;
 
                B[0]+=i;
                B[1]+=j;
                
            }
        } 
    }
    
    
    
    public static boolean validate(int n,int m) {
        if(A[0]<0||A[1]<0||B[0]<0||B[1]<0) return false;
        if(A[0]<A[1]) {
            if(A[0]!=0) return false;
        }
        if(B[0]<B[1]) {
            if(B[0]!=0) return false;
        } 
        if(boat[0]<boat[1]) {
            if(boat[0]!=0) return false;
        }
        if(A[0]==n&&A[1]==m)return false;
        
        return true;
    }
}
