package sec01.exam11;   //한 문자씩 읽기. Reader 문자 입력 스트림 사용

import java.io.Reader;
import java.io.FileReader;

public class ReadExample {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("/Users/wonjuxx/Documents/Temp/test7.txt");

        while(true) {
            int data = reader.read();
            if(data == -1) break;
            System.out.println((char) data);
        }
        reader.close();
    }
}
