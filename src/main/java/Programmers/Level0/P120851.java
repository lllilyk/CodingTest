package Programmers.Level0;

public class P120851 {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;

            for (int i = 0; i < my_string.length(); i++) {
                char c = my_string.charAt(i);

                if (Character.isDigit(c)) {
                    int num = Character.getNumericValue(c);
                    answer += num;
                }
            }

            return answer;
        }
    }
}
