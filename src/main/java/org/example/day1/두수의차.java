package org.example.day1;

public class 두수의차 {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;
        int answer = 0;
        answer = new 두수의차().solution(num1, num2);
        System.out.println("answer = " + answer);

        System.out.println("answer = " + new 두수의차().solution(num1 = 100, num2 = 2));
    }

    int solution(int num1, int num2) {
        int answer = 0;

        answer = num1 - num2;

        return answer;
    }
}
