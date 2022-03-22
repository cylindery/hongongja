package sec01.exam09;   //배열 일부를 출력하기

import java.io.Writer;
import java.io.FileWriter;

public class WriteExample3 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("/Users/wonjuxx/Documents/Temp/test9.txt");

        char[] array = {'A', 'B', 'C', 'D', 'E'};

        writer.write(array, 1, 3);

        writer.flush();
        writer.close();
    }
}
