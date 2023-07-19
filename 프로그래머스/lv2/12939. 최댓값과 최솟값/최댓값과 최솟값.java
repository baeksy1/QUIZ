class Solution {
    public String solution(String s) {
      String[] numbers = s.split(" "); // 문자열을 공백을 기준으로 분리하여 배열로 저장

        int min = Integer.MAX_VALUE; // 최소값을 초기화
        int max = Integer.MIN_VALUE; // 최대값을 초기화

        // 배열에서 숫자들을 차례대로 비교하여 최소값과 최대값을 갱신
        for (String num : numbers) {
            int n = Integer.parseInt(num);
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }

        return min + " " + max; // 최소값과 최대값을 문자열로 반환
    }
}