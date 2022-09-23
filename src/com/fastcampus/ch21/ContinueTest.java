package com.fastcampus.ch21;
// 21. 중간에 멈추는 break문, 무시하고 계속 진행하는 continue문
public class ContinueTest {
    public static void main(String[] args) {
        int num;
        for( num = 1; num <= 100; num++) {
            // num이 3의 배수가 아니면 건너뛰기
            if( (num % 3) != 0)
                continue;

            // 1부터 100까지 숫자 중 3의 배수를 출력
            System.out.println(num); // 3 6 9 ... 99
        }
    }
}