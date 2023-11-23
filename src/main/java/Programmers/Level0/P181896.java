package Programmers.Level0;

public class P181896 {
    class Solution {
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
