package Programmers.Level0;

public class P120849 {

    class Solution {
        public String solution(String my_string) {

            String answer = "";

            answer = my_string.replaceAll("[aeiou]", "");

            return answer;
        }
    }
}
