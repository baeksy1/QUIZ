import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        List<String>list = new ArrayList<>();
        String a= ""+n;
        String [] arr=a.split("");
        for(int i =0; i<arr.length;i++){
        list.add(arr[i]);
        }
        Collections.sort(list,Collections.reverseOrder());
        for(int i=0; i<list.size();i++){
            answer+=list.get(i);
        }
        
        return Long.parseLong(answer);
    }
}