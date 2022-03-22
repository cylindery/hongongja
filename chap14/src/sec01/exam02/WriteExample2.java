package sec01.exam02;   //배열 전체를 출력하기

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("/Users/wonjuxx/Documents/Temp/test2.db");

        byte[] array = {10, 20, 30};

        os.write(array);

        os.flush();
        os.close();
    }
}
