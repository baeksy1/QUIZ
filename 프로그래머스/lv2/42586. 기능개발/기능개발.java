import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];

        /* 각 원소의 우선순위에 따른 작업기간을 넣을 큐 생성 */
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0 ; i < progresses.length; i++) {
            int target = progresses[i];

            int cnt = 0; /* 큐에 넣을 작업기간 */

            while (target < 100) { /* 작업기간 계산, 100이 넘으면 stop */
                target += speeds[i];
                cnt++;
            }

            queue.offer(cnt);
        }
        //입출력 예 2번을 예로 들면 queue에는 {5,10,1,1,20,1}이 들어있음!
        int index = 0;
        while (!queue.isEmpty()) { /* 작업기간 queue 반복문 실행 */
            int target = queue.poll();
            int cnt = 1; /* 위에서 poll() 된 target 자신의 수를 무조건 포함하므로 1 */
           
            /* queue 가 비어있지 않고, peek() 데이터가 target 보다 작거나 같은 경우 */
            /* 만약 target 보다 오래걸리는 작업이라면 이후 배포가 되어야하므로 반복문을 타지 않는다 */
            while (!queue.isEmpty() && queue.peek() <= target) {
                queue.poll(); /* 함께 배포될 작업이므로 poll() */
                cnt++;
            }

            answer[index] = cnt;
            index++;
        }

        /* 위 answer 에 담겨진 배열의 길이를 index 로 알았으므로 새로운 배열로 저장 */
        int[] result = new int[index];

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != 0) {
                result[i] = answer[i];
            } else {
                break;
            }
        }

        return result;
    }
}
