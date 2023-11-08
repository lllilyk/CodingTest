package Programmers.Level0;

public class P120909 {
    class Solution {
        public int solution(int n) {
            // sqrtN : square root(제곱근)
            // Math.sqrt() : 주어진 숫자의 제곱근을 계산하는 메소드
            double sqrtN = Math.sqrt(n);

            /* Math.sqrt(2); // 1.414213562373095 가능 */
            if (sqrtN == (int)sqrtN) {
                return 1;
            } else {
                return 2;
            }
        }
    }
}
