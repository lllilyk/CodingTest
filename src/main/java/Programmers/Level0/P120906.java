package Programmers.Level0;

public class P120906 {
    /*정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요*/
    public class Solution {
        public int solution(int n) {
            int answer = 0;
            String nStr = Integer.toString(n); // 정수 n을 문자열로 변환

            for (int i = 0; i < nStr.length(); i++) {
                // 문자를 정수로 변환하고 합에 더함
                answer += nStr.charAt(i) - '0';
            }

            return answer;
        }
    }
}
