package org.example.day1;

public class 편지{

    public static void main(String[] args) {

        String message = "I love you~";
        int answer = new 편지().solution(message);
        System.out.println("answer = " + answer);
    }
    int solution(String message) {
        int answer = 2 * message.length();
        return answer;
    }
}
