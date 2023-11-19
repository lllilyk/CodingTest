package Programmers.Level0;

public class P181907 {
    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";

            if (n >= 1 && n <= my_string.length()) {

                /* substring 메서드의 인덱스는 시작 인덱스(포함)부터 종료 인덱스(미포함)까지
                 * substring(int beginIndex) / substring(int beginIndex, int endIndex)
                 * ex) "Hello, World"
                 * "Hello, World".substring(7) => "World"
                 * "Hello, World".substring(0, 5) => "Hello" (0부터 4까지의 문자) */
                answer = my_string.substring(0, n);
            }

            return answer;
        }
    }
}
