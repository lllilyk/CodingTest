package Programmers.Level0;

public class P120891 {
    static class Solution {
        public int solution(int order) {
            int answer = 0;

            for (int i = 1; i <= order; i++) {
                int num = i;
                while (num > 0) {
                    int digit = num % 10;
                    if (digit == 3 || digit == 6 || digit == 9) {
                        answer++;
                    }
                    num /= 10;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(10);
        System.out.println(result);
    }
}
