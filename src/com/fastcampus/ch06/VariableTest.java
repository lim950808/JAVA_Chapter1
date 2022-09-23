package com.fastcampus.ch06;
// 06. 자료형(data type) - 정수는 어떻게 표현하나요?
public class VariableTest {

    public static void main(String[] args) {
        byte bnum = 127; //byte는 127까지. 128부턴 int
        System.out.println(bnum); // 127

        //int num = 12345678900;
        long lNum = 12345678900L; //long 타입일시 맨뒤에 L을 붙임
        System.out.println(lNum); // 12345678900
    }

}
