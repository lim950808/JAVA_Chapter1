package com.fastcampus.ch20;
// 20. 반복문이 여러 번 포개진 중첩 반복문
public class NestedLoopTest {
    public static void main(String[] args) {

        /* for문으로 만드는 구구단 */
        int dan = 2;
        int count = 1;
        for( dan = 2; dan <= 9; dan++) {
            for(count = 1; count <=9 ; count++) {
                System.out.println( dan + "X" + count + "=" + dan * count);
            }
            System.out.println(); // 2단부터 9단까지
        }

        /* while문으로 만드는 구구단 */
        dan = 2;
        while( dan <= 9 ) {
            count = 1;
            while (count <= 9) {
                System.out.println( dan + "X" + count + "=" + dan * count);
                count++;
            }
            dan++;
            System.out.println(); // 2단부터 9단까지
        }

    }
}
