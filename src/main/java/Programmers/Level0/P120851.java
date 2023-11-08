package Programmers.Level0;

public class P120851 {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;

            /* Character 클래스의 정적 메소드 - .isDigit(), .getNumericValue() */
            for (int i = 0; i < my_string.length(); i++) {
                char c = my_string.charAt(i);

                /* c가 문자이면 true 반환 */
                if (Character.isDigit(c)) {
                    /* 문자를 정수로 변환 */
                    int num = Character.getNumericValue(c);
                    answer += num;
                }
            }

            return answer;
        }
    }
}
