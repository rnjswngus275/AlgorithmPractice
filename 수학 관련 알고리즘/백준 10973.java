import java.util.*;
public class Main {

	public static Scanner scan =new Scanner(System.in);
	public static StringBuilder sb=new StringBuilder();
	public static int[] arr,visited,arr3;
	static int[] perm;
	static int N,num=0,cnt2;
	static boolean flag;
    public static void main(String[] args) {
    	//입력
    	N=scan.nextInt();
    	arr=new int[N];
    	perm=new int[N];
    	visited=new int[N+1];
    	for(int i=0;i<N;i++) {
    		arr[i]=scan.nextInt();
    	}
    	if(preperm(arr))
    	{
    		for(int i=0;i<N;i++) {
        		System.out.print(arr[i]+" ");
        	}
    	}
    	else {
    		System.out.print(-1);
    	}
    	
    }
    static boolean preperm(int[] arr) {
    	int i=arr.length-1;
    	int j=arr.length-1;
    	while(i>0&&arr[i-1]<=arr[i]) i--;
    	if(i<=0) return false;

    	while(arr[j]>=arr[i-1]) j--;
    	
    	swap(arr,i-1,j);
    	j=arr.length-1;
    	while(i<j) {
    		swap(arr,i,j);
    		i++;
    		j--;
    	}
    	return true;
    }
    static void swap(int[] arr, int idx1, int idx2) {
    	int temp=arr[idx1];
    	arr[idx1]=arr[idx2];
    	arr[idx2]=temp;
    }
 }
