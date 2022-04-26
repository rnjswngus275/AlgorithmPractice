import java.util.*;
public class Main {

	public static Scanner scan =new Scanner(System.in);
	public static int n,m,t;
	public static boolean[] visited; //정점을 방문 했는지 true/false
	public static StringBuilder sb=new StringBuilder();
	public static int[][] arr;
	static int ans,blue,white,cnt1,cnt2;
    public static void main(String[] args) {
    	//입력
    	n=scan.nextInt();	//한변의 길이
     	arr=new int[n][n];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n;j++) {
    			arr[i][j]=scan.nextInt();
    			if(arr[i][j]==1) {
    				cnt1++;
    			}
    			else if(arr[i][j]==0) {
    				cnt2++;
    			}
    		}
    	}
    	if(cnt1==n*n) {
    		System.out.println(0);
    		System.out.println(1);
    	}
    	else if(cnt2==n*n) {
    		System.out.println(1);
    		System.out.println(0);
    	}
    	else {
    	cal(0,0,n);
    	System.out.println(white);
    	System.out.println(blue);
    	}
    	
    }
    
    static void cal(int s,int e,int length) {
  
    	//종이 네개로 나누기 & 체크	
    		check(s,e,length/2);
    		check(s,e+length/2,length/2);
    		check(s+length/2,e,length/2);
    		check(s+length/2,e+length/2,length/2);
    }
    
    //같은 색의 색종이인지 check
    static void check(int startx, int starty, int length) {   
    	
    	int color =arr[startx][starty];
    	
		if(length ==1) {
			if(color==1) {
				blue+=1;
			}
			else {
				white+=1;
			}
			return;
		   }
		for(int i=startx;i<startx+length;i++) {
			for(int j=starty;j<(starty+length);j+=2) {
					if(arr[i][j]==arr[i][j+1]&& arr[i][j]==color) {
						continue;
					}
					else {
						cal(startx,starty,length);
						return;
					}
				}
	    	}
		if(color==1) {
			blue+=1;
		}
		else {
			white+=1;
		}
		return;
    }
 }
