package tmp;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class swea7465 {
    static int N,M,cnt;
    static boolean[] visited;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int o = 1; o <= T; o++) {
            ArrayList<ArrayList<Integer>> list=new ArrayList<>();
            cnt=0;
            N=scan.nextInt();
            M=scan.nextInt();
            visited=new boolean[N+1];
            for(int i=0;i<N+1;i++) {
                list.add(new ArrayList<>());
            }
            for(int i=0;i<M;i++) {
                int a=scan.nextInt();
                int b=scan.nextInt();
                list.get(a).add(b);
                list.get(b).add(a);
            }
            
            for(int i=1;i<N+1;i++) {
                if(!visited[i]) {
                    bfs(list,i);
                    cnt++;
                }
            }
            
            System.out.println("#" + o + " " + cnt);

            
        }

            
    }
    public static void bfs(ArrayList<ArrayList<Integer>> list,int i) {
        Queue<Integer> q=new LinkedList<Integer>();
        q.offer(i);
        visited[i]=true;
       while(!q.isEmpty()) {
           int cur=q.poll();
           for(int j=0;j<list.get(cur).size();j++) {
               int a=list.get(cur).get(j);
               if(!visited[a]) {
                   visited[a]=true;
                   q.offer(a);
               }
           }
       }
    }

}
