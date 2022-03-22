package sec01.exam08;   //배열 전체를 출력하기

import java.io.Writer;
import java.io.FileWriter;

public class WriteExample2 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("/Users/wonjuxx/Documents/Temp/test8.txt");

        char[] array = {'A', 'B', 'C'};

        writer.write(array);

        writer.flush();
        writer.close();
    }
}
