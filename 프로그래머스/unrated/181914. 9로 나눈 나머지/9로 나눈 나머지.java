class Solution {
	public int solution(String number) {
        int answer = 0;
        char []arr= new char[number.length()];
        int sum=0;
        for (int i = 0; i < number.length(); i++) {
			arr[i]=number.charAt(i);
		}
        for (int i = 0; i < arr.length; i++) {
        	sum+=Character.getNumericValue(arr[i]);
        }
        
       answer=sum%9;
        return answer;
    }
    
    
}