class Solution {
    public int[] solution(int[] arr) {
        // 배열의 길이가 1 이하인 경우
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        
        // 가장 작은 수의 인덱스 찾기
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        
        // 가장 작은 수를 제외한 새로운 배열 생성
        int[] answer = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != minIndex) {
                answer[j++] = arr[i];
            }
        }
        
        return answer;
    
    }
}