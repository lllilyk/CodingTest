package Programmers.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181886 {
    class Solution {
        public String[] solution(String[] names) {
            List<String> answerList = new ArrayList<>();

            int groupSize = 5;
            // Math.ceil() 메소드는 주어진 숫자 이상의 가장 작은 정수를 반환 즉, 올림을 수행
            // ex) Math.ceil(4.2)는 5를 반환, Math.ceil(-3.8)은 -3을 반환
            // 소수 부분까지 결과에 반영하기 위해 (double)로 형변환
            int totalGroups = (int) Math.ceil((double) names.length / groupSize);

            for (int i = 0; i < totalGroups; i++) {
                int startIdx = i * groupSize;
                // Math.min()을 사용하여 현재 그룹의 끝 인덱스를 계산
                // 현재 그룹의 마지막 인덱스보다 다음 그룹의 시작 인덱스가 크면, 현재 그룹의 마지막 인덱스까지만 포함하도록 함
                int endIdx = Math.min((i + 1) * groupSize, names.length);

                String[] group = new String[endIdx - startIdx];
                // System.arraycopy() : 배열 간의 요소를 복사하는데 사용되는 java 메소드
                // arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
                // arraycopy(복사할 원본 배열, 원본 배열에서 복사를 시작할 위치의 인덱스,
                //           복사된 데이터를 저장할 대상 배열, 대상 배열에서 데이터를 저장할 시작 위치의 인덱스, 복사할 요소의 개수)

                System.arraycopy(names, startIdx, group, 0, group.length);

                answerList.add(group[0]);
            }
            // answerList를 String 배열로 변환하여 반환
            return answerList.toArray(new String[0]);
        }
    }
}
