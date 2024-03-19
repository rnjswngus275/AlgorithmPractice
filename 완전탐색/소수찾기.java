import java.util.*;
public class 소수찾기 {
	static boolean[] visited;
	static String nums;
	static HashSet set;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("17");
		solution("011");
	}
    public static int solution(String numbers) {
    	//n글자 
    	nums = numbers;
    	 set = new HashSet<>();
    	for(int i=1;i<=numbers.length();i++) {
    		visited =new boolean[numbers.length()];
    		sol(i,0,"");
    	}
    	return set.size();
    }
    public static void sol(int n, int cnt, String str) {
    	if(cnt == n) {
    		//int로 만들고 소수 판별 후 set에 
        	int num = Integer.parseInt(str);
//        	System.out.println("cnt: "+cnt +" num : " + num);
        	if(isSosu(num)) {
        		set.add(num);
        	}
    		return; 
    	}
    	for(int i=0;i<nums.length(); i++) {
    		if(!visited[i]) {
    			visited[i] = true;
//    			System.out.println(nums.charAt(i));
    			sol(n,cnt+1,str+""+nums.charAt(i));
    			visited[i] = false;
    		}
    	} 
    }
    public static boolean isSosu(int num) {
    	if (num == 0 || num == 1) return false;
    	for(int i=2;i<Math.sqrt(num)+1;i++) {
    		if(num % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
