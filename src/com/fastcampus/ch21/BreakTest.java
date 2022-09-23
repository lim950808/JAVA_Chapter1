package com.fastcampus.ch21;
// 21. 중간에 멈추는 break문, 무시하고 계속 진행하는 continue문
public class BreakTest {
    public static void main(String[] args) {
        int sum = 0;
        int num;

        // 1부터 14까지 더하면 100보다 넘는 순간(105)이 된다.
        for(num = 1; ; num++) {
            sum += num;
            if(sum >= 100) // sum이 100을 넘는 순간 break로 반복문을 빠져나옴
                break;
        }

        System.out.println(sum); // 105
        System.out.println(num); // 14
    }
}