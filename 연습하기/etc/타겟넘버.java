package etc;

public class 타겟넘버 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//+개수 n 
		int [] l = {1,1,1,1,1};
		solution(l,3);
	}
	static int len;
	static boolean [] visited;
	static int ans =0;
    public static int solution(int[] numbers, int target) {
    	len = numbers.length;
    	for(int i=0;i<len;i++) {
			// +의 갯수
    		visited = new boolean[len];
    		sol(numbers,0,target,0);
		}
    	return 1;
    }

    public static void sol (int[] nums, int sum, int target, int cnt) {
    	if(cnt == len) {
    		if(sum == target) {
    			ans++;
    		}
            return;
    	}
    		sol(nums,sum+nums[cnt],target, cnt+1);
    		sol(nums,sum-nums[cnt],target, cnt+1);
    }

}
