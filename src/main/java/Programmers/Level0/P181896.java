package Programmers.Level0;

public class P181896 {
    /* 내부 클래스는 외부 클래스의 인스턴스 없이는 생성 불가
    * 내부 클래스를 정적으로 선언하면 외부 클래스의 인스턴스 없이 내부 클래스의 인스턴스 생성 가능
    * 정적 내부 클래스는 외부 클래스의 인스턴스에 종속되지 않기 때문 */
    static class Solution {
        public int solution(int[] num_list) {
            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] < 0) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] nums = {5, 8, -3, 2, 7};
            int result = solution.solution(nums);
            System.out.println(result);
        }
    }
}
