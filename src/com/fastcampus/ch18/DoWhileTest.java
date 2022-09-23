package com.fastcampus.ch18;

import java.util.Scanner;
// 18. 반복문 - do-while문
public class DoWhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0; // sum 초기화

        do {
            input = scanner.nextInt(); // Scanner를 이용해 숫자 입력
            sum += input; // 입력된 모든 숫자를 더함
        } while(input != 0); // 0을 입력할 때 빠져나감

        System.out.println(sum); // 0을 입력하기 전까지의 모든 수를 더함.
    }
}