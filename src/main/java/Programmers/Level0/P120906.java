package Programmers.Level0;

public class P120906 {
    public class Solution {
        public int solution(int n) {
            int answer = 0;
            // 정수 n을 문자열로 변환
            String nStr = Integer.toString(n);

            for (int i = 0; i < nStr.length(); i++) {
                // 문자를 정수로 변환하고 합에 더함
                answer += nStr.charAt(i) - '0';
            }

            return answer;
        }
    }
}
