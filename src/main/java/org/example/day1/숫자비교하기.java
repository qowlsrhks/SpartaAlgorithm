package org.example.day1;

public class 숫자비교하기 {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;
        int answer = 0;
        answer = new 숫자비교하기().solution(num1, num2);
        System.out.println("answer = " +answer);

        answer= new 숫자비교하기().solution(11, 11);
        System.out.println("answer = " +answer);

        answer= new 숫자비교하기().solution(7, 99);
        System.out.println("answer = " +answer);
    }
    int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2){
            answer = 1;
        }else{
            answer = -1;
        }
        return answer;
    }
}
