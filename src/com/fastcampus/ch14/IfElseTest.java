package com.fastcampus.ch14;
// 14. 조건문 - if 문(만약에... 라면)
public class IfElseTest {
    public static void main(String[] args) {
        int age = 6;

        if( age >= 8) { // 8살 이상이면
            System.out.println("학교에 다닙니다");
        }
        else { // 8살 미만이면
            System.out.println("학교에 다니지 않습니다."); // 6살은 8살 미만이므로 "학교에 다니지 않습니다."가 출력됨.
        }
        System.out.println("노는게 제일 좋아"); // if else 문을 빠져 나와서 "노는게 제일 좋아"는 모든 경우에 같이 출력됨.
    }
}