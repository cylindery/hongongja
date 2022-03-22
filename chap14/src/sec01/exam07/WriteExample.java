package sec01.exam07;   //한 문자씩 출력하기. 'A', 'B', 'C'가 저장된 각각의 char를 파일로 출력해서 저장

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("/Users/wonjuxx/Documents/Temp/test7.txt");

        writer.write('A');
        writer.write('B');
        writer.write('C');

        writer.flush();
        writer.close();
    }
}
