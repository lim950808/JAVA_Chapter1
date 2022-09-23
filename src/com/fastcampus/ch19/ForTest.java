package com.fastcampus.ch19;
// 19. 반복문 - for 문
public class ForTest {
    public static void main(String[] args) {

        // for문으로 표현
        ////////////////////////////////////////////////
        int count = 1;
        int sum = 0;

        for( int i=0; i<10; i++, count++ ) {  // for( 초기화식; 조건식; 증감식; )
            sum += count; // 수행문
            //count++;
        }
        System.out.println(sum); // 55
        ////////////////////////////////////////////////


        // while문으로 표현
        ////////////////////////////////////////////////
        int num = 1;
        int total = 0;

        // while문
        while( num <= 10 ) { // num을 1부터 10까지 더하라
            total += num;
            num++;
        }
        System.out.println(total); // 55
        ////////////////////////////////////////////////
    }
}