/*
주어진 바이트 배열을 문자열로 변환
 */
package sec01.verify.exam06;

public class BytesToStringExample {
    public static void main(String[] args) {
        byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
        String str = new String(bytes);
        System.out.println(str);
    }
}
