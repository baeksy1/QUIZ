class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
       

        // x부터 시작해 x씩 증가하는 숫자를 n개 만큼 리스트에 추가
        for (int i = 0; i < n; i++) {
            answer[i]=((long)x * (i + 1));//형변환 필수~
        }
        return answer;
    }
}