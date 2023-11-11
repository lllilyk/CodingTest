package Programmers.Level0;

public class P120825 {
    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";

            for (int i = 0; i < my_string.length(); i++) {
                // char 형태로 받는 이유
                // 문자열을 구성하는 각 문자를 개별적으로 다루기 위함
                char currentChar = my_string.charAt(i);

                for (int j = 0; j < n; j++) {
                    answer += currentChar;
                }
            }

            return answer;
        }
    }
}
