import java.util.ArrayList;
import java.util.List;
class Solution {
      public int[] solution(int[] arr) {
        int cnt=0;
        List<Integer>list=new ArrayList<>();
        
        while(true) {
        	
        	if(list.size()==0) {
        		list.add(arr[cnt]);
        		cnt++;
        	}else if(arr[cnt]>list.get(list.size()-1)) {
        		list.add(arr[cnt]);
        		cnt++;
        	}else if(arr[cnt]<=list.get(list.size()-1)) {
        		list.remove(list.size()-1);
        	}
        	
        	if(cnt==arr.length) break;
        }
        
        
        int[] stk = new int [list.size()];
        
        for (int i = 0; i < stk.length; i++) {
			stk[i]=list.get(i);
		}
        
        return stk;
    }
}