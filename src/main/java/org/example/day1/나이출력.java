package org.example.day1;

public class 나이출력 {
    public static void main(String[] args) {
        int age = 40;
        int result = new 나이출력().solution(age);
        System.out.println("result = " + result);

        int result2 = new 나이출력().solution(23);
        System.out.println("result = " + result2);

    }
    int solution(int age) {
        int year = 2022;
        int result = (year - age) + 1;

        return result;
    }
}
