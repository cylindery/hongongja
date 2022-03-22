package sec01.exam13;   //지정한 길이만큼 읽기.

import java.io.Reader;
import java.io.FileReader;

public class ReadExample3 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("/Users/wonjuxx/Documents/Temp/test9.txt");

        char[] buffer = new char[5];

        int readBufferNum = reader.read(buffer, 2, 3);

        if(readBufferNum != -1) {
            for(int i=0; i<buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }
        reader.close();
    }
}
