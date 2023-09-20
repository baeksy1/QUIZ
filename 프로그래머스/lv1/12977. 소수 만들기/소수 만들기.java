import java.util.*;
class Solution {
    public int solution(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int answer = -1;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int c=j+1;c<nums.length;c++){
                   list.add(nums[i]+nums[j]+nums[c]);
                }
            }
        }
        
        int result=0;
        for(int i=0;i<list.size();i++){
            int count=0;
            for(int j=2;j<=list.get(i)/2;j++){
                if(list.get(i)%j==0){
                    count++;
                }
            }
            if(count==0){
                result++;
            }
        }
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(result);

        return result;
    }
}