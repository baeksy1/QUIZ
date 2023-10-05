import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        String a= ""+x;
        String [] arr=a.split("");
        List<Integer>list = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            list.add(Integer.parseInt(arr[i]));
        }
        int result=0;
       for(int i=0; i<list.size();i++){
           result+= list.get(i);
        }
        
        if(x%result==0){
            answer=true;
        }
        return answer;
    }
}