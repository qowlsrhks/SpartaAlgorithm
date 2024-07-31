package org.example.day1;

public class 각도기 {

    public static void main(String[] args) {

        new 각도기().solution(70);
        new 각도기().solution(91);
        new 각도기().solution(180);
    }

    int solution(int angle) {
        int result = 0;

        if(0 < angle && angle < 90){
            result = 1;
        }else if(angle == 90){
            result = 2;
        }else if(90 < angle && angle < 180){
            result = 3;
        }else if(angle == 180){
            result = 4;
        }
        return result;
    }
}
