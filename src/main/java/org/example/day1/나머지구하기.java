package org.example.day1;

public class 나머지구하기 {

    public static void main(String[] args) {

        int answer = 0;
        answer = new 나머지구하기().solution(3, 2);
        System.out.println("answer = " + answer);
        answer = new 나머지구하기().solution(10, 5);
        System.out.println("answer = " + answer);
    }
    int solution(int num1, int num2) {

        int answer =  num1 % num2;

        return answer;
    }
}
