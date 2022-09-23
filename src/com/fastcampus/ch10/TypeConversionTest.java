package com.fastcampus.ch10;
// 10. 변하지 않는 상수와 리터럴, 변수의 형 변환
public class TypeConversionTest {
    public static void main(String[] args) {
        int iNum = 255;
        byte bNum = (byte) iNum; // int를 더 작은 byte로 강제 형변환

        System.out.println(bNum); // 255는 byte 안에 담기지 못하므로 255 대신 -1이 나옴.

        double dNum2 = 3.14;
        int iNum2 = (int)dNum2; //double를 int로 강제 형변환하게 되면 소수점들이 모두 사라짐

        System.out.println(iNum2); // 3.14에서 소수점이 없어져서 결과는 3

        double dNum3 = 1.2;
        float fNum = 0.9F;

        int iNum3 = (int)dNum3 + (int)fNum; // 1 + 0 => 1
        int iNum4 = (int)(dNum3 + fNum); //(int)(1.2 + 0.9) => 2

        System.out.println(iNum3); // 1
        System.out.println(iNum4); // 2

        int myNum = 10;
        int yourNum = 20;

        //myNum = myNum + yourNum; //아래처럼 쓸 수 있음.
        myNum += yourNum; // myNum을 yourNum과 더해서 그 값을 myNum에 집어 넣어라
        System.out.println(myNum); // 30
    }
}