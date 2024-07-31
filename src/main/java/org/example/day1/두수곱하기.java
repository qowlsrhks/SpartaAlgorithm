package org.example.day1;

public class 두수곱하기 {

    public static void main(String[] args) {
        int answer = 0;
        answer = new 두수곱하기().solution(3, 4);
        System.out.println("answer = " + answer);
        answer = new 두수곱하기().solution(27, 19);
        System.out.println("answer = " + answer);
    }
    int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }
}
