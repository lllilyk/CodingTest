package Programmers.Level0;

public class P120910 {
    int solution(int n, int t) {
        int answer = n;

        for(int i=1; i<=t; i++){
            answer *= 2;
        };
        return answer;
    }
}
