package Programmers.Level0;

public class P181889 {
    class Solution {
        public int[] solution(int[] num_list, int n) {
            /* 배열 초기화 잊지 말기!!!!!
            * 빈 배열에 값을 할당하려고 하니 당연히 오류가 발생..
            * 배열의 크기를 알기 위해서는 미리 크기를 정의하고 초기화해야 함! */
            int[] answer = new int[n];

            for(int i=0; i<n; i++){
                answer[i] = num_list[i];
            }

            return answer;
        }
    }
}
