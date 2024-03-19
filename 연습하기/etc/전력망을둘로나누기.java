package etc;

import java.util.ArrayList;

public class 전력망을둘로나누기 {
	static ArrayList<ArrayList<Integer>> list = new ArrayList<> ();
	static boolean [] visited;
	static int cnt =0;
    static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr ={{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
		solution(9, arr);
	}
    public static int solution(int n, int[][] wires) {
    	for(int i=0;i<n+1;i++) {
    		list.add(new ArrayList<>());
    	}
    	for(int i=0;i<wires.length;i++) {
    		list.get(wires[i][0]).add(wires[i][1]);  
    		list.get(wires[i][1]).add(wires[i][0]); 
    	}
    	for(int i=0;i<wires.length;i++) {
    		list.get(wires[i][0]).remove(list.get(wires[i][0]).indexOf(wires[i][1]));
    		list.get(wires[i][1]).remove(list.get(wires[i][1]).indexOf(wires[i][0]));
    		visited = new boolean[n+1];
    		cnt =0;
    		visited[wires[i][0]] = true;
    		countTower(wires[i][0]);
    		
    		list.get(wires[i][0]).add(wires[i][1]);
    		list.get(wires[i][1]).add(wires[i][0]);
    		int sub= Math.abs(n-cnt*2);
    		min = Math.min(sub,min);
    	}
    	//n번 연결 끊음
    	//탐색으로 갯수 가지치기 필요
    	return min;
    }
    public static void countTower(int num){

    	for(int i=0;i<list.get(num).size();i++) {
    		int now =list.get(num).get(i);
    		if(!visited[now]) {
    			visited[now] = true;
    			cnt++;
    			countTower(now);
    		}
    	}
    }

}
