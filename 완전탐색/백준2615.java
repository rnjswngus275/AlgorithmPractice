
import java.util.*;
import java.io.*;

public class 백준2615 {
    static Scanner scan=new Scanner(System.in);
    static int[][] arr;
    //↑ (↗ → ↘  ↓)  ↙    ←    ↖     순서 
    static int[] dx={-1,-1,0,1,1,1,0,-1};
    static int[] dy={0,1,1,1,0,-1,-1,-1};
    static int black,white;
    static int cnt,count;
    static boolean flag;
    public static void main(String args[]) {
        arr=new int[19][19];
        for(int i=0;i<19;i++){
            for(int j=0;j<19;j++){
            arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<19;i++) {
        	for(int j=0;j<19;j++) {
                if(arr[i][j]!=0){
                    if(flag==false){
                    check(i,j);
                    }
                }
        	}
        }
        //다 돌았을때까지 flag false이면
        if(flag==false){
            System.out.print(0);
        }
    }
    
    static void check(int a, int b){
        for(int i=1;i<=4;i++){   //모든 방향 탐색
            int nx=a+dx[i];
            int ny=b+dy[i];
            if(a+dx[i]>=0&&a+dx[i]<19&&b+dy[i]>=0&&b+dy[i]<19){       //판을 벗어나지 않는다면

                if(arr[nx][ny]==arr[a][b]){ //이전 바둑알 색갈과 같은것이 있다면
                    cnt=2;
                    check2(i,nx,ny);
                    if(cnt==5){
                    boolean chk=check3(i,a,b);
                    if(chk==true) {
                       if(arr[a][b]==1){
                           System.out.println(1);
                           int c=a+1;
                           int d=b+1;
                           System.out.print(c+" "+d);        
                           flag=true;
                           break;
                       } 
                       else if (arr[a][b]==2){
                           System.out.println(2);
                           int c=a+1;
                           int d=b+1;
                           System.out.print(c+" "+d);
                           flag=true;
                           break;
                       }
                    }
                    }
                    else if(cnt>5) {
                    	break;
                    }
                }
            }
        }
        return;
    }
    static void check2(int dir,int a, int b){    //방향 좌표 몇개인지 입력받음
        int nx=a+dx[dir];
        int ny=b+dy[dir];
		if(nx>=0&&nx<19&&ny>=0&&ny<19) {
        if(arr[nx][ny]==arr[a][b]){
            cnt++;
            check2(dir,nx,ny);
        }
        }
        
    }
    static boolean check3(int dir, int a, int b) {
    	 
    	if(dir==0||dir==1||dir==2||dir==3) {

    		int nx=a+dx[dir+4];
    		int ny=b+dy[dir+4];
    		if(nx>=0&&nx<19&&ny>=0&&ny<19) {
	    		if(arr[nx][ny]==arr[a][b]) {
	    			return false;
	    		}
	    		else return true;

    		}	
    	}

      	else if(dir==4||dir==5||dir==6||dir==7) {
      		int nx=a+dx[dir-4];
    		int ny=b+dy[dir-4];
      		if(nx>=0&&nx<19&&ny>=0&&ny<19) {
      		if(arr[nx][ny]==arr[a][b]) {
    			return false;
    		}
    		else return true;

      		}
      
      	}
    	return true;
    }
    
    
}
