package tmp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class swea1242 {
    static int ans = 0;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int o = 1; o <= T; o++) {
            ans = 0;
            boolean flag = false;
            int n = scan.nextInt();
            int m = scan.nextInt();
            char arr[][] = new char[n][m];
            HashMap<String, Integer> pas_idx = new HashMap<>();

            // TODO : 1. hash 맵에 암호코드가 들어있는 행을 string으로 넣고 index를 value로 넣는다.
            // 2. 중복 검사해서 다른 것만 넣는다.
            for (int i = 0; i < n; i++) {
                int cnt = 0;
                String str = scan.next();
                for (int j = 0; j < m; j++) {
                    arr[i][j] = str.charAt(j);
                    if (arr[i][j] == '0') {
                        cnt++;
                    }
                }

                if (cnt != m) {
                    String tmp = "";
                    for (int j = 0; j < m; j++) {
                        int first_idx = 0;
                        if (arr[i][j] == '0') {
                            tmp = tmp + "0";
                        }
                        if (j < m && arr[i][j] != '0') {
                            
                            while (j < m && arr[i][j] != '0') {
                                // 16진수 to 2진수
                                String str1 = arr[i][j] + "";
                                int tmp1 = Integer.parseInt(str1, 16);
                                String tmp2 = Integer.toBinaryString(tmp1);
                                if (tmp2.length() == 1) {
                                    tmp2 = "000" + tmp2;
                                } else if (tmp2.length() == 2) {
                                    tmp2 = "00" + tmp2;
                                } else if (tmp2.length() == 3) {
                                    tmp2 = "0" + tmp2;
                                }
                                tmp += tmp2;
                                j++;
                            }
                            j -= 1;
                            if (!pas_idx.isEmpty()) {
                                if (!pas_idx.containsKey(tmp)) {
                                    pas_idx.put(tmp, i);
                                }
                            } else
                                pas_idx.put(tmp, i);
                            tmp = ""; // 초기화
                        }

                    }
                }
            }
            //first index 찾기
            
            // last index 찾기
            
            boolean allsucess = false;
            
            for (String code : pas_idx.keySet()) {
                boolean issucess = false;
                int first_idx=0;
                int last_idx = 0;
                for (int i = 0; i < code.length(); i++) {
                    if (code.charAt(i) == '1') {
                        first_idx = i; // 마지막 1이 있는 idx
                        break;
                    }
                }
                for (int i = 0; i < code.length(); i++) {
                    if (code.charAt(i) == '1') {
                        last_idx = i; // 마지막 1이 있는 idx
                    }
                }
                int tmp = last_idx - first_idx+1;
                int length = 0;
                if (tmp < 112) {
                    length = 7;
                    for (int a = last_idx; a > first_idx + 53; a--) {

                        issucess = check_pass(a, code, length);
                        if (issucess) {
                            allsucess = true;
                            break;
                        }
                    }
                } else if (tmp < 168) {
                    length = 14;
                    for (int a = last_idx; a > first_idx + 53; a--) {

                        issucess = check_pass(a, code, 7);
                        if (issucess) {
                            allsucess = true;
                            break;
                        }
                    }
                    for (int a = last_idx; a > first_idx + 109; a--) {

                        issucess = check_pass(a, code, length);
                        if (issucess) {
                            allsucess = true;
                            break;
                        }
                    }
                } else {
                    length = 21;
                    for (int a = last_idx; a > first_idx + 53; a--) {

                        issucess = check_pass(a, code, 7);
                        if (issucess) {
                            allsucess = true;
                            break;
                        }
                    }
                    for (int a = last_idx; a > first_idx + 109; a--) {

                        issucess = check_pass(a, code, 14);
                        if (issucess) {
                            allsucess = true;
                            break;
                        }
                    }
                    for (int a = last_idx; a >  first_idx + 165; a--) {

                        issucess = check_pass(a, code, length);
                        if (issucess) {
                            allsucess = true;
                            break;
                        }
                    }
                }
                
            }

            if (allsucess == true) {
                System.out.println("#" + o + " " + ans);
            } else
                System.out.println("#" + o + " " + 0);
        }

    }

//올바른 암호인지 확인
    public static boolean check_pass(int idx, String code, int length) {
        int sum_odd = 0;
        int sum_even = 0;
        int cert_code = 0;
        int toggle = 0;

        for (int j = idx; j >= 0; j--) {
            int i = 0;
            toggle += 1;

//            for (i = j - 6; i <= j; i++) {
//                str += code.charAt(i) + "";
//            }
            int arr[] = new int[4];
            int cnt_4 = 1;
            int cnt = 1;
            int flag = code.charAt(j) - '0';
            j--;
            while (j >= idx - length * 8 && cnt_4 < 5) {

                if (code.charAt(j) - '0' != flag) {
                    if (cnt_4 == 1) {
                        arr[3] = cnt;
                    } else if (cnt_4 == 2) {
                        arr[2] = cnt;
                    } else if (cnt_4 == 3) {
                        arr[1] = cnt;
                    } else if (cnt_4 == 4) {
                        arr[0] = cnt;
                    }
                    cnt_4++;
                    cnt = 1;
                    flag = code.charAt(j) - '0';
                } else {
                    cnt++;
                }
                if (j == idx - length * 8 + 1) {
                    arr[0] = cnt;
                    break;
                }
                j--;

            }
            if (j > idx - length * 8 + 1)
                j += 2;
            else
                j = 0;

            // if( arr 0~3의 비가 표와 같은 것을 찾는다) 200 임로 56의 3배까지 가능

            String tmp = "";
            if (length == 21) {
                for (int a = 0; a < 4; a++) {
                    tmp += arr[a] / 3 + "";
                }
            } else if (length == 14) {
                for (int a = 0; a < 4; a++) {
                    tmp += arr[a] / 2 + "";
                }
            } else {
                for (int a = 0; a < 4; a++) {
                    tmp += arr[a] + "";
                }
            }

            if (tmp.equals("3211")) {
                if (toggle == 1) {
                    cert_code += 0;
                } else if (toggle % 2 == 1) {
                    sum_even += 0;

                } else
                    sum_odd += 0;
            } else if (tmp.equals("2221")) {
                if (toggle == 1) {
                    cert_code += 1;
                } else if (toggle % 2 == 1) {
                    sum_even += 1;

                } else
                    sum_odd += 1;
            } else if (tmp.equals("2122")) {
                if (toggle == 1) {
                    cert_code += 2;
                } else if (toggle % 2 == 1) {
                    sum_even += 2;
                } else
                    sum_odd += 2;

            } else if (tmp.equals("1411")) {
                if (toggle == 1) {
                    cert_code += 3;
                } else if (toggle % 2 == 1) {
                    sum_even += 3;
                } else
                    sum_odd += 3;
            } else if (tmp.equals("1132")) {
                if (toggle == 1) {
                    cert_code += 4;
                } else if (toggle % 2 == 1) {
                    sum_even += 4;
                } else
                    sum_odd += 4;
                   
            } else if (tmp.equals("1231")) {
                if (toggle == 1) {
                    cert_code += 5;
                } else if (toggle % 2 == 1) {
                    sum_even += 5;
                } else
                    sum_odd += 5;
                    
            } else if (tmp.equals("1114")) {
                if (toggle == 1) {
                    cert_code += 6;
                } else if (toggle % 2 == 1) {
                    sum_even += 6;
                } else
                    sum_odd += 6;
                    
            } else if (tmp.equals("1312")) {
                if (toggle == 1) {
                    cert_code += 7;
                } else if (toggle % 2 == 1) {
                    sum_even += 7;
                    
                } else
                    sum_odd += 7;
            } else if (tmp.equals("1213")) {
                if (toggle == 1) {
                    cert_code += 8;
                } else if (toggle % 2 == 1) {
                    sum_even += 8;
                } else
                    sum_odd += 8;
                    
            } else if (tmp.equals("3112")) {
                if (toggle == 1) {
                    cert_code += 9;
                } else if (toggle % 2 == 1) {
                    sum_even += 9;
                   
                } else
                    sum_odd += 9;
            } else { // 잘못된 코드
                return false;

            }
        }
        // 전역으로 합 저장

        // 암호조건 확인
        if (((sum_odd * 3 + sum_even) + cert_code) % 10 == 0) {
            ans += sum_odd + sum_even + cert_code;
            return true;
        } else
            return false;
    }

}