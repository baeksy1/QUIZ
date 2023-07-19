class Solution {
    public int solution(int n) {
       // 약수의 합을 저장할 변수를 0으로 초기화
        int totalSum = 0;

        // 1부터 n까지 반복하면서 n의 약수를 찾음
        for (int i = 1; i <= n; i++) {
            // i가 n의 약수인지 확인하여 약수라면 totalSum에 더함
            if (n % i == 0) {
                totalSum += i;
            }
        }

        return totalSum;
    }
}