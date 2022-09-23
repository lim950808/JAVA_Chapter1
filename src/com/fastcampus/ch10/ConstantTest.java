package com.fastcampus.ch10;
// 10. 변하지 않는 상수와 리터럴, 변수의 형 변환
public class ConstantTest {

    public static void main(String[] args) {

        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0; //final이 붙은 상수는 반드시 값을 지정해 줘야 한다.

        System.out.println(MAX_NUM); // 100
        System.out.println(MIN_NUM); // 0

        //MAX_NUM = 1000;
    }

}