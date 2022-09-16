package tmp;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
////순열로 접근, 시간초과
//
//public class 숫자만들기4008 {
//
//  public static int N;
//  public static int nums[] = new int [12];
//  public static int ops[] = new int [11];
//  public static int maxans;
//  public static int minans;
//  public static int CNT;
//  
//  public static void solve(int k)
//  {
//      CNT++;
//      if (k == N - 1)
//      {
//          int val = nums[0];
//          for (int i = 0; i < N - 1; i++)
//          {
//              if (ops[i] == 0)      val += nums[i + 1];
//              else if (ops[i] == 1) val -= nums[i + 1];
//              else if (ops[i] == 2) val *= nums[i + 1];
//              else                  val /= nums[i + 1];
//          }
//          maxans = maxans < val ? val : maxans;
//          minans = minans > val ? val : minans;
//      }
//      else
//          for (int i = k; i < N - 1; i++)
//          {
//              int t = ops[k]; ops[k] = ops[i]; ops[i] = t;
//              solve(k + 1);
//              t = ops[k]; ops[k] = ops[i]; ops[i] = t;
//          }
//  }
//  
//  
//  public static void main(String[] args) throws FileNotFoundException  {
//      
//      long start = System.currentTimeMillis();
//      
//      System.setIn(new FileInputStream("숫자만들기4008input.txt"));
//      Scanner sc = new Scanner(System.in);
//      
//      int TC = sc.nextInt();
//      
//      for(int tc = 1; tc <= TC; tc++) {
//
//          N = sc.nextInt();
//          
//          int cnt = 0;
//          for (int i = 0; i < 4; i++)
//          {
//              int t;
//              t = sc.nextInt();
//              for (int j = 0; j < t; j++)
//                  ops[cnt++] = i;
//          }
//          
//          for (int i = 0; i < N; i++)
//              nums[i] = sc.nextInt();
//
//          maxans = Integer.MIN_VALUE;
//          minans = Integer.MAX_VALUE;
//          
//          CNT = 0;
//          solve(0);
//          
//          System.out.printf("#%d %d %d\n", tc, maxans - minans, CNT);
//      }
//      System.out.println(( System.currentTimeMillis() - start )/1000.0 ); 
//      sc.close();
//  }
//}




//순수 중복순열로 접근
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//public class Solution {
public class swea숫자만들기 {

  public static int N;
  public static int nums[] = new int [12];
  public static int opcnt[] = new int [4];
  public static int ops[] ;
  public static int maxans;
  public static int minans;
  public static int CNT;
  
  
  public static void solve(int k)
  {
      CNT++;
      if (k == N - 1)
      {
          int cnt[] = new int[4];
          for(int i = 0; i < N - 1; i++) 
              cnt[ops[i]]++;

          for (int i = 0; i < 4; i++)
              if(opcnt[i] < cnt[i]) return;

          int tans = nums[0];
          
          for(int i = 0; i < N - 1; i++) {
              switch (ops[i]) {
                  case 0 : tans += nums[i + 1]; break;
                  case 1 : tans -= nums[i + 1]; break; 
                  case 2 : tans *= nums[i + 1]; break;
                  case 3 : tans /= nums[i + 1]; break;
              }
          }
          
          maxans = Math.max(maxans, tans);
          minans = Math.min(minans, tans);
      }
      else
      {
          for (int i = 0; i < 4; i++)
          {
              ops[k] = i;
              solve(k + 1);
          }
      }
  }
  
  public static void main(String[] args) throws FileNotFoundException {
      
      long start = System.currentTimeMillis();
      
      System.setIn(new FileInputStream("숫자만들기4008input.txt"));
      Scanner sc = new Scanner(System.in);
      
      int TC = sc.nextInt();
      
      for(int tc = 1; tc <= TC; tc++) {

          N = sc.nextInt();
          ops = new int [N - 1];
          
          for (int i = 0; i < 4; i++)
              opcnt[i] = sc.nextInt();
          
          for (int i = 0; i < N; i++)
              nums[i] = sc.nextInt();

          maxans = Integer.MIN_VALUE;
          minans = Integer.MAX_VALUE;
          
          CNT = 0;
          solve(0);
          
          
          System.out.printf("#%d %d %d\n", tc, maxans - minans, CNT);
          //System.out.printf("#%d %d\n", tc, maxans - minans);
      }
      System.out.println(( System.currentTimeMillis() - start )/1000.0 ); 
      sc.close();
  }
}



//중복순열 가지치기로 접근
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
////public class Solution {
//public class 숫자만들기4008 {
//
//public static int N;
//public static int nums[] = new int [12];
//public static int ops[] = new int [4];
//public static int maxans;
//public static int minans;
//public static int CNT;
//
//
//public static void solve(int k, int v)
//{
//    CNT++;
//    if (k == N)
//    {
//        maxans = Math.max(maxans, v);
//        minans = Math.min(minans, v);
//    }
//    else
//    {
//        if (ops[0] != 0)
//        {
//            ops[0]--;
//            solve(k + 1, v + nums[k]);
//            ops[0]++;
//        }
//        if (ops[1] != 0)
//        {
//            ops[1]--;
//            solve(k + 1, v - nums[k]);
//            ops[1]++;
//        }
//        if (ops[2] != 0)
//        {
//            ops[2]--;
//            solve(k + 1, v * nums[k]);
//            ops[2]++;
//        }
//        if (ops[3] != 0)
//        {
//            ops[3]--;
//            solve(k + 1, v / nums[k]);
//            ops[3]++;
//        }
//    }
//}
//
//public static void main(String[] args) throws FileNotFoundException {
//    
//    long start = System.currentTimeMillis();
//    
//    System.setIn(new FileInputStream("숫자만들기4008input.txt"));
//      Scanner sc = new Scanner(System.in);
//      
//    int TC = sc.nextInt();
//    
//      for(int tc = 1; tc <= TC; tc++) {
//
//        N = sc.nextInt();
//        
//        for (int i = 0; i < 4; i++)
//            ops[i] = sc.nextInt();
//        
//        for (int i = 0; i < N; i++)
//            nums[i] = sc.nextInt();
//
//        maxans = Integer.MIN_VALUE;
//        minans = Integer.MAX_VALUE;
//        
//        CNT = 0;
//        solve(1, nums[0]);
//        
//        
//        System.out.printf("#%d %d %d\n", tc, maxans - minans, CNT);
//        //System.out.printf("#%d %d\n", tc, maxans - minans);
//    }
//      System.out.println(( System.currentTimeMillis() - start )/1000.0 ); 
//      sc.close();
//}
//}
