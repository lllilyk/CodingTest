package Programmers.Level0;

public class P120813 {
    class Solution {
        public int[] solution(int n) {
            /* 짝수거나 홀수거나 어쨌든 주어진 n의 1/2 개수만 배열을 생성 */
            int[] answer = new int[(n + 1) / 2];

            /* [제한사항] 1부터 시작이니까 */
            int value = 1;
            for (int i = 0; i < answer.length; i++) {
                answer[i] = value;
                value += 2;
            }

            return answer;
        }
    }
}
