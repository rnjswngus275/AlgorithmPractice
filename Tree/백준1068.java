import java.util.ArrayList;
import java.util.Scanner;

public class 백준1068 {
	static Scanner scan=new Scanner(System.in);
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static int n,erase;
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
	            list.get(i).add(parent);
	        }else root=parent;
	    }
	    erase=scan.nextInt();
	    
	    if(erase==root) {
	        
	    }
	    for(int i=list.get(erase).size()-1;i>=0;i--) {
	        if(list.get(erase).get(i)<erase) {
	            list.get(erase).remove(i);
	        }
	    }
	    sol(erase);
	    
	    int cnt=0;
	    for(int i=0;i<list.size();i++) {
	        if(list.get(i).size()==1) {//부모가 1개이면 리프노드
	            cnt++;
	        }
	    }
	    
	    System.out.println(cnt); 
	}
	
	public static void sol(int del) {//dfs돌면서 리프노드 지우기
	   int size= list.get(del).size();
	   
	   if(size==1) {//리프노드이면 지운다
	       list.get(del).set(0,-1);
	       return;
	   }
	   for(int i=size-1;i>-1;i--) {
	       int node=list.get(del).get(i);
	       if(node>del) {//삭제하는 노드의 자식 노드일때 삭제
	           sol(node);
               list.get(del).set(i,-1);
	       }
	   }
	}

}
