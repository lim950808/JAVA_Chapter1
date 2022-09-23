package com.fastcampus.ch09;
// 09. 자료형(data type)- 논리형과 자료형 없이 변수 사용하기
public class LocalVariableType {
    public static void main(String[] args) {
        var i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i); // 10
        System.out.println(j); // 10.0
        System.out.println(str); // hello

        str = "test";
        //str = 3; //이미 위에서 변수 str가 String 타입으로 지정됐기 때문에 아래에서 형변환 없이 다른 타입으로 바꿀 수 없다.
    }
}