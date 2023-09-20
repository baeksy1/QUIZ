import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<food.length;i++){
            list.add(food[i]/2);
        }
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i);j++){
                answer+=i+1;
            }
        }
        answer=answer+0;
        String reverse="";
        for(int i=answer.length()-2; i>=0;i--){
            char re=answer.charAt(i);
            reverse+=Character.toString(re);
        }
        answer=answer+reverse;
        return answer;
    }
}