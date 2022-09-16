package tmp;

import java.util.Scanner;

public class swea1221 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String[] number= {"ZRO","ONE","TWO","THR","FOR","FIV","SIX","SVN","EGT","NIN"};
        for (int o = 1; o <= T; o++) {
            StringBuilder sb =new StringBuilder();

            scan.next();
            String _leng=scan.next();
            int leng=Integer.parseInt(_leng);
            int cnt[]=new int[10];
            for(int i=0;i<leng;i++) {
                String num=scan.next();
                if(num.equals("ZRO")) {
                    cnt[0]++;
                }
                else if(num.equals("ONE")) {
                    cnt[1]++;

                }else if(num.equals("TWO")) {
                    cnt[2]++;

                }else if(num.equals("THR")) {
                    cnt[3]++;

                }else if(num.equals("FOR")) {
                    cnt[4]++;

                }else if(num.equals("FIV")) {
                    cnt[5]++;

                }else if(num.equals("SIX")) {
                    cnt[6]++;

                }else if(num.equals("SVN")) {
                    cnt[7]++;

                }else if(num.equals("EGT")) {
                    cnt[8]++;

                }else if(num.equals("NIN")) {
                    cnt[9]++;

                }
            }
            for(int i=0;i<10;i++) {
                if(cnt[i]!=0) {
                    for(int j=0;j<cnt[i];j++) {
                       sb.append(number[i]+" ");
                    }
                }
            }
            
            System.out.println("#" + o + " " + sb);

        }

            
    }

}
