package Programmers.Level0;

import java.util.HashMap;
import java.util.Map;

public class P120812 {
    class Solution {
        public int solution(int[] array) {
            /* 각 숫자의 빈도수를 저장할 맵 생성 */
            Map<Integer, Integer> countMap = new HashMap<>();

            /* 배열의 원소를 하나씩 세어서 맵에 저장하기 */
            for (int num : array) {
                /* 만약에 맵에 이미 해당하는 숫자가 있으면 현재의 빈도수를 가져오고, 없으면 0을 기본값으로 사용하여 1을 더해주기*/
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            int maxCount = 0;
            int mostFrequent = -1;

            /* 향상된 for문을 사용해서 맵의 각 항목 돌기 */
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                /* entrySet()은 맵의 키-값 쌍을 나타내는 엔트리(entry) 집합을 반환
                * Map.Entry<Integer, Integer>는 이 엔트리의 형식을 지정 */
                int num = entry.getKey();
                int count = entry.getValue();

                if (count > maxCount) {
                    maxCount = count;
                    mostFrequent = num;
                } else if (count == maxCount) {
                    // 최빈값이 중복될 경우 -1을 반환
                    mostFrequent = -1;
                }
            }

            return mostFrequent;
        }
    }
}
