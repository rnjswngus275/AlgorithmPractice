
public class main1 {
    static int max=Integer.MIN_VALUE;
    static int ans=0;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] weight= {100,50,50,80,40,40};
//        int [] weight= {100,60,40,20,35,45};
//        int [] weight= {90,40,50,90};

        boolean [] visited=new boolean[weight.length];
        for(int i=1;i<=(weight.length/2);i++) {
            sol(weight,visited,i,0,0);
        }
      System.out.println((ans)+" "+max);
    }
    public static void sol(int [] weight,boolean []visited, int i,int people,int sum) {
        //i : i , i+1...n-i 로 팀 나누기
        if(people==i) {// 사람이 i명 모이면 basecase
            int sum2=0;
            for(int a=i;a<=weight.length-i;a++) {
                //i 부터 n-i까지
                //a개 픽하는 경우
                sol2(weight,visited,a,0,0,sum,i);
                
            }

            return;
        }
        
        for(int a=0;a<weight.length;a++) {
            if(!visited[a]) {//방문하지 않은 점이면
                visited[a]=true;
                sum+=weight[a];
                sol(weight,visited,i,people+1,sum);
                sum-=weight[a];
                visited[a]=false;
            }
        }
        
    }
    public static void sol2(int[] weight, boolean[] visited,int i,int peopleNow, int sum,int sumBefore,int peopleBefore) {
            if(peopleNow==i) {
                if(sum==sumBefore) {
                    if(max<=sum){
                        max=sum;
                        ans=Math.max(i+peopleBefore, ans);
                    }
                }   
                return;
            }
                
                for(int a=0;a<weight.length;a++) {
                    if(!visited[a]) {
                        visited[a]=true;
                        sum+=weight[a];
                        sol2(weight,visited,i,peopleNow+1,sum,sumBefore,peopleBefore);
                        sum-=weight[a];
                        visited[a]=false;
                    }
                }
            
        
    }

}
