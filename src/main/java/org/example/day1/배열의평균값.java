package org.example.day1;

public class 배열의평균값 {

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numbers_len = numbers.length;
        double answer = new 배열의평균값().solution(numbers, numbers_len);
        System.out.println("answer = " + answer);

        int numbers2[] = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        int numbers_len2 = numbers2.length;
        double answer2 = new 배열의평균값().solution(numbers2, numbers_len2);
        System.out.println("answer = " + answer2);
    }

    double solution(int numbers[], int numbers_len) {
        double answer = 0;

        for(int i = 0; i< numbers_len; i++){
            answer += numbers[i];
        }
        answer = answer / numbers_len;
        return answer;
    }

}
