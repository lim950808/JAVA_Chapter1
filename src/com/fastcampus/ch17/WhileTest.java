package com.fastcampus.ch17;
// 17. 반복문 - while문
public class WhileTest {
    public static void main(String[] args) {
        int num = 1;
        int sum  = 0; // 지역변수 초기화

        while( num <= 10) { // 1부터 10까지의 num을 더해서 sum에 대입
            sum += num;
            num++;
        }

        System.out.println(sum); // 55
        System.out.println(num); // 11
    }
}