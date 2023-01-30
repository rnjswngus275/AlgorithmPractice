import java.util.ArrayList;
import java.util.Scanner;

public class 백준1068 {
	static Scanner scan=new Scanner(System.in);
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static int n,erase,cnt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    n=scan.nextInt();
	    for(int i=0;i<n;i++) {
	        list.add(new ArrayList<>());
	    }
	    int root=-1;
	    for(int i=0;i<n;i++) {
	        int parent=scan.nextInt();
	        if(parent!=-1) {
	            list.get(parent).add(i);
	        }else root=i;
	    }
	    erase=scan.nextInt();
	    
	    if(erase==root) {
	        System.out.println(0);
	    }else {
	        
	        for(int i=0;i<n;i++) {
	            if(list.get(i).contains(erase)) {
	                list.get(i).remove(list.get(i).indexOf(erase));
	            }
	        }
	        
	        sol(root);
	        
    
	        System.out.println(cnt); 
	    }
	   
	}
	
	public static void sol(int idx) {
	   if(list.get(idx).isEmpty()) {
	       cnt++;
	       return;
	   }
	   else {
	       for(int a:list.get(idx)) {
	           sol(a);
	           
	       }
	   }
	}

}
