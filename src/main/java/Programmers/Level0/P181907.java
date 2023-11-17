package Programmers.Level0;

public class P181907 {
    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";

            if (n >= 0 && n <= my_string.length()) {
                answer = my_string.substring(0, n);
            }

            return answer;
        }
    }
}
