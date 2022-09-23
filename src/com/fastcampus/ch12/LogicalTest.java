package com.fastcampus.ch12;
// 12. 자바의 연산자들 -2 (관계, 논리 연산자)
public class LogicalTest {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = (( num1 = num1 + 10) < 10) && ((i = i + 2) < 10); //논리곱

        System.out.println(value); // false
        System.out.println(num1); // 20
        System.out.println(i); // 2
    }
}