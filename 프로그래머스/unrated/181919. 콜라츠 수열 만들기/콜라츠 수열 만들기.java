import java.util.ArrayList;
import java.util.List;

class Solution {
      public int[] solution(int n) {
        List<Integer>list = new ArrayList<>();
        list.add(n);
        while(true) {
        	
        	if(n%2==0) {
        		list.add(n/2);
        		n=n/2;
        	}else if(n%2==1) {
        		list.add(3*n+1);
        		n=3*n+1;
        	}
        	if(n==1) {
        		break;
        	}
        }
        
        int[] answer = new int [list.size()];
        for (int i = 0; i < answer.length; i++) {
        	
			answer[i]=list.get(i);
		}
        
        return answer;
    }
}