package tmp;


import java.util.Scanner;



public class swea1244 {
static int[] nums;    
static int change,ans;
static int change_num;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int o = 1; o <= T; o++) {
            String str=scan.next();
            change_num=scan.nextInt();
            nums=new int[str.length()];
            int leng=str.length();
            ans=Integer.MIN_VALUE;
            for(int i=0;i<leng;i++) {
                nums[i]=str.charAt(i)-'0';
            }
            if(leng<change_num)change_num=leng;
            select(leng,0,0);
            
            System.out.println("#"+o+" "+ans);

        }
    }
    public static void select(int leng,int start,int cnt) {
        if(cnt==change_num) {
            
            String tmp_num=make_num();
            if(Integer.parseInt(tmp_num)>ans) {
                ans=Integer.parseInt(tmp_num);
            }
            return;
        }
//        if(nums[0]<ans/Math.pow(10,leng-1)) return;
        for(int i=start;i<leng-1;i++) {
            for(int j=i+1;j<leng;j++) {                
                    Change(i, j);
                    select(leng, i, cnt+1);
                    Change(j, i);   
            }
        }     
    }
    
    public static String make_num() {
        int leng=nums.length;
        String num="";
        for(int i=0;i<leng;i++) {
           num+=nums[i];
        }
        return num;
    }
    
    
    public static void Change(int idx,int max_idx) {
        int tmp=nums[idx];
        nums[idx]=nums[max_idx];
        nums[max_idx]=tmp;
        change++;
    }

}
