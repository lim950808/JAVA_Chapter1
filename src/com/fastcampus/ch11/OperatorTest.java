package com.fastcampus.ch11;
// 11. 자바의 연산자들 -1 (대입, 부호, 산술, 복합대입, 증감연산자)
public class OperatorTest {
    public static void main(String[] args) {
        int gameScore = 150;

//        int lastScore = ++gameScore; //gameScore += 1;   //gameScore = gameScore + 1; // 1을 증가한 이후 대입해라
//        System.out.println(lastScore); // 151
//        System.out.println(gameScore); // 151

        int lastScore = gameScore++; // 대입한 이후 1을 증가해라
        System.out.println(lastScore); // 150
        System.out.println(gameScore); // 151
    }
}
