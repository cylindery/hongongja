package sec01.exam11;   //바이트 배열을 문자열로 변환. System.in.read() 이용

import java.io.IOException;

public class KeyboardToStringExample {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100];

        System.out.print("입력: ");
        int readByteNo = System.in.read(bytes);

        String str = new String(bytes, 0, readByteNo-1);
        System.out.println(str);
    }
}
