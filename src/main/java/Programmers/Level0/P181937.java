package Programmers.Level0;

public class P181937 {
    class Solution {
        public int solution(int num, int n) {
            int answer = 0;

            if (num % n == 0) {
                answer = 1;
            }

            return answer;
        }
    }
}
