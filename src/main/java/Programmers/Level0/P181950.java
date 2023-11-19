package Programmers.Level0;

import java.util.Scanner;

public class P181950 {
    public class Solution {
        public static void main(String[] args) {

            /* Scanner 클래스는 Java에서 사용자로부터 입력을 받기 위해 제공되는 클래스
            * 이 클래스를 사용하면 콘솔에서 키보드로부터 사용자의 입력을 받을 수 있음 */

            /* Scanner를 사용하여 문자열과 정수를 입력받는 예제 코드
                public class InputExample {
                    public static void main(String[] args) {
                        // Scanner 객체 생성
                        Scanner scanner = new Scanner(System.in);

                        // 문자열 입력 받기
                        System.out.print("문자열을 입력하세요: ");
                        String inputString = scanner.next(); // 띄어쓰기를 기준으로 문자열을 읽음

                        // 정수 입력 받기
                        System.out.print("정수를 입력하세요: ");
                        int inputInt = scanner.nextInt();

                        // 입력 받은 값 출력
                        System.out.println("입력한 문자열: " + inputString);
                        System.out.println("입력한 정수: " + inputInt);

                        // Scanner 닫기 (관례적으로 사용)
                        scanner.close();
                    }
                }
            */

            // Scanner 객체 생성, System.in은 표준 입력을 나타냄
            Scanner sc = new Scanner(System.in);
            // 문자열 입력 받아 저장
            String str = sc.next();
            // 정수 입력 받아 저장
            int n = sc.nextInt();

            // repeatString 함수를 아래에서 따로 정의함으로서, '주어진 문자열을 주어진 횟수만큼 반복한 결과를 출력한다'는 의미로 간결해짐
            // 함수의 이름과 파라미터를 통해 이 함수가 무슨 역할을 하는지 쉽게 이해 가능
            String repeatedString = repeatString(str, n);

            // 결과 출력
            System.out.println(repeatedString);
        }

        // repeatString 메서드는 주어진 문자열(str)을 주어진 횟수(n)만큼 반복하여 새로운 문자열 생성
        /* repeatString 함수를 따로 정의한 이유
           : 코드의 재사용성과 가독성을 높이기 위함
           1) 재사용성
            -> repeatString 함수는 문자열을 반복하는 로직을 담고 있음.
                이 함수를 정의함으로써, 이 로직이 필요한 어떤 부분에서든 간단하게 호출하여 사용할 수 있음
           2) 가독성
            -> 코드를 작은 블록으로 나누고 함수를 추상화함으로써 코드의 가독성이 향상됨.
                main 메서드에서 repeatString 함수를 호출함으로써, 실제 반복 로직이 어떻게 이루어지는지에 대한 세부사항을 숨길 수 있음.
                이로써 main 메서드는 주된 로직에 집중하고, 세부사항은 함수 내부에서 다루게 됨.
         */
        public static String repeatString(String str, int n) {
            // StringBuilder 클래스를 사용하여 문자열을 효율적으로 조작
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < n; i++) {
                result.append(str);
            }

            return result.toString();
        }
    }
}
