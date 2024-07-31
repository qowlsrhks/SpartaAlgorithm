package org.example.day1;

public class 짝수의합 {

    public static void main(String[] args) {
        int n = 4;
        int answer = new 짝수의합().solution(n);
        System.out.println("answer = " + answer);
    }

    int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                answer += i;
            }
        }
        return answer;
    }
}
