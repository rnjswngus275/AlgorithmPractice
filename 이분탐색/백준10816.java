import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class 백준10816 {

	static Scanner scan=new Scanner(System.in);
	static int n,m;
	static StringBuilder sb=new StringBuilder();
	static HashMap<Integer,Integer> hash=new HashMap(); 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		n=Integer.parseInt(br.readLine());
		
			String a=br.readLine();
			StringTokenizer st=new StringTokenizer(a);
			for(int i=0;i<n;i++) {
				int b;
				int num=Integer.parseInt(st.nextToken());
				try {
					b=hash.get(num);
				}
				catch(Exception e) {
					hash.put(num, 0);
					b=0;
				}
				hash.put(num,b+1);	
			}
			
			
			
		
			m=Integer.parseInt(br.readLine());
			String k=br.readLine();
			StringTokenizer st2=new StringTokenizer(k);
			for(int i=0;i<m;i++) {
				int num=Integer.parseInt(st2.nextToken());
				try{
					if(hash.get(num)==null) {
						sb.append("0"+" ");
					}
					else sb.append(hash.get(num)+" ");
					
				}
				catch(Exception e) {
					sb.append("0"+" ");
				}
				
			}
			
		
					
		System.out.print(sb);
		
		
	}
	static int search (int[] arr1, int find_num) {
		
		System.out.println("search");
		int cnt=0;
		int start=0;
		int end=n-1;
		int mid=(start+end)/2;
		while(end>start) {
			System.out.println("while");
			
			if (arr1[mid]>=find_num) {	//left (3일때 lowerbound인지 확인해야함)
				end=mid;
				mid=(start+end)/2;
			}
			else if(arr1[mid]<find_num) {	//right
				start=mid+1;	
				mid=(start+end)/2;
				
			}	
		}
		
		while(mid<n&&arr1[mid]==find_num) {
			cnt++;
			mid++;
		}
			return cnt;		
	}
}