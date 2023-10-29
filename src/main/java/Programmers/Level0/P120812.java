package Programmers.Level0;

import java.util.HashMap;
import java.util.Map;

public class P120812 {
    class Solution {
        public int solution(int[] array) {
            Map<Integer, Integer> countMap = new HashMap<>();

            // 배열의 원소를 세어서 countMap에 저장

            for (int num : array) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            int maxCount = 0;
            int mode = -1;

            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                int num = entry.getKey();
                int count = entry.getValue();

                if (count > maxCount) {
                    maxCount = count;
                    mode = num;
                } else if (count == maxCount) {
                    // 최빈값이 중복될 경우 -1을 반환
                    mode = -1;
                }
            }

            return mode;
        }
    }
}
