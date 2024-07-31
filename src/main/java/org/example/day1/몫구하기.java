package org.example.day1;

public class 몫구하기 {

    public static void main(String[] args) {
        int answer = 0;
        answer = new 몫구하기().solution(10, 2);
        System.out.println("answer = " + answer);
        answer = new 몫구하기().solution(7, 2);
        System.out.println("answer = " + answer);
    }
    int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }
}
