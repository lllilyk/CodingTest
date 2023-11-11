package Programmers.Level0;

public class P181841 {
    class Solution {
        public String solution(String[] str_list, String ex) {
            /* 멀티스레드 환경에서는 StringBuffer가 더 적합하다고 함
            * StringBuilder
            * append(String str): 문자열을 뒤에 추가
            * insert(int offset, String str): 지정된 위치에 문자열을 삽입
            * delete(int start, int end): 지정된 범위의 문자열을 삭제
            * replace(int start, int end, String str): 지정된 범위의 문자열을 다른 문자열로 대체
            * toString(): StringBuilder 객체를 문자열로 변환하여 반환 */
            StringBuilder answer = new StringBuilder();

            for (String str : str_list) {
                if (!str.contains(ex)) {
                    answer.append(str);
                }
            }

            return answer.toString();
        }
    }
}
