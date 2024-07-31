package org.example.day1;

public class 두수의나눗셈 {

    public static void main(String[] args) {
        int answer = 0;
        answer = new 두수의나눗셈().solution(3, 2);
        System.out.println("answer = " + answer);

        answer = new 두수의나눗셈().solution(7, 3);
        System.out.println("answer = " + answer);

        answer = new 두수의나눗셈().solution(1, 16);
        System.out.println("answer = " + answer);
    }
    int solution(int num1, int num2) {
        float answer = ((float) num1 / num2) *1000;
        return (int)answer;
    }
}
