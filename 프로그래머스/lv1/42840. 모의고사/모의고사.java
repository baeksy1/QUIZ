import java.util.ArrayList;

class Solution {
 	 public int[] solution(int[] answers) {
	        
	        ArrayList<Integer>list = new ArrayList<>();
	        int[] s1 = {1,2,3,4,5}; //5
	        int[] s2 = {2,1,2,3,2,4,2,5};//8
	        int[] s3 = {3,3,1,1,2,2,4,4,5,5};//10
	        int t1 =0, t2 = 0,t3=0;
	        for(int i=0;i<answers.length;i++){
	            if(answers[i] == s1[(i)%5]) t1++;
	            if(answers[i] == s2[(i)%8]) t2++;
	            if(answers[i] == s3[(i)%10]) t3++;//왜 함수가 끝내지 않고 동시에 진행하냐 세개 다 비교해야되기 때문
	            
	        }
	        int max = Math.max(Math.max(t1,t2),t3);
	        if(max == t1){
	            list.add(1);
	        }
	        if(max == t2){
	            list.add(2);
	        }
	        if(max == t3){
	            list.add(3);
	        }
	        int size = list.size();
	        
	        int answer[] = new int[size];
	        int i =0;
	        for(int num: list){
	            answer[i++] = num;
	        }
	        return answer;
	    }
}