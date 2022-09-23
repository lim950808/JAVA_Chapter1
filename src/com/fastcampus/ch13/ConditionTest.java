package com.fastcampus.ch13;

import java.util.Scanner;
//13. 자바의 연산자들 -3 (조건 연산자, 비트 연산자)
public class ConditionTest {
    public static void main(String[] args) {
        int max;
        System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");

        Scanner scanner = new Scanner(System.in); //Scanner를 통해 콘솔에 입력함.
        System.out.println("입력 1: ");
        int num1 = scanner.nextInt(); //정수를 입력 받을 수 있음.
        System.out.println("입력 2: ");
        int num2 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2; //삼항연산자
        System.out.println(max);
    }
}
