import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        int tmp=0;
        for(String str:completion){
            if(map.get(str)!=null){ //동명이인일경우
                tmp=map.get(str);
                map.put(str,tmp+1);
            }
            else{
                map.put(str,1);
                }
        }
        for(String str:participant){
           
            if(map.get(str)!=null){ //완주한 목록에 이름 있는 사람들이면
                tmp=map.get(str);
                if(tmp>0){
                    map.put(str,tmp-1);
                } 
                else return str;
            }
            else{
                return str;
            }
            
        }
       return "얌"; 
    }
}
