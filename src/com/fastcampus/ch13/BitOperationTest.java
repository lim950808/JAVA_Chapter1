package com.fastcampus.ch13;
// 13. 자바의 연산자들 -3 (조건 연산자, 비트 연산자)
public class BitOperationTest {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        System.out.println(num1 | num2); // 15
        System.out.println(num1 & num2); // 0
        System.out.println(num1 ^ num2); // 15
        System.out.println( ~num1 ); // -6

        System.out.println(num1 << 2); // 20
        System.out.println(num1); // 5 => 위에서 2를 옮겨도 num1의 값이 바뀌지 않음
        System.out.println(num1 <<= 2); // 20 => 대입연산자로 인해 num1의 값이 바뀜
        System.out.println(num1 >> 1); // 10
    }
}