package sec01.exam10;   //문자열 출력하기

import java.io.Writer;
import java.io.FileWriter;

public class WriteExample4 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("/Users/wonjuxx/Documents/Temp/test10.txt");

        writer.write("ABC");

        writer.flush();
        writer.close();
    }
}
