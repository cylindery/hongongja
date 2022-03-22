package sec01.exam05;   //배열 길이만큼 읽기. 길이가 100인 배열을 생성하고, read(byte[] b) 메소드로 한꺼번에 100byte를 읽고 저장
//많은 양의 바이트를 읽을 때는 read() 메소드보다 read(byte[] b) 메소드가 더 좋다. 전체를 읽지 않고 배열의 길이만큼만 읽으므로

import java.io.InputStream;
import java.io.FileInputStream;

public class ReadExample2 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("/Users/wonjuxx/Documents/Temp/test2.db");

        byte[] array = new byte[100];

        while(true) {
            int readArrayNum = is.read(array);
            if(readArrayNum == -1) break;
            for(int i=0; i<readArrayNum; i++) {
                System.out.println(array[i]);
            }
        }
        is.close();
    }
}
