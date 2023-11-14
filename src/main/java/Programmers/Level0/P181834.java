package Programmers.Level0;

public class P181834 {
    class Solution {
        public String solution(String myString) {
            String answer = "";

            // String 타입의 문자열을 charr 문자 배열로 변환
            char[] charArray = myString.toCharArray();

            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] < 'l') {
                    charArray[i] = 'l';
                }
            }

            // char를 String으로 다시 형변환
            answer = new String(charArray);

            return answer;
        }
    }
}
