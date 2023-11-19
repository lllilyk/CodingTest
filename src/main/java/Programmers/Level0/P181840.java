package Programmers.Level0;

public class P181840 {
    class Solution {
        public int solution(int[] num_list, int n) {
            int answer = 0;

            /* 배열의 길이를 얻을 때는 length 속성을 사용 <- .length()써서 error 발생
            * 문자열의 길이를 얻을 때(.length())와 다르다는 점! 기억하기 */
            for(int i=0; i<num_list.length; i++){
                if(num_list[i]==n){
                    answer = 1;
                }
            }
            return answer;
        }
    }
}
