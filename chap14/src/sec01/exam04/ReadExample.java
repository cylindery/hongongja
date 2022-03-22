package sec01.exam04;   //1byte씩 읽기. read()

import java.io.InputStream;
import java.io.FileInputStream;

public class ReadExample {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("/Users/wonjuxx/Documents/Temp/test1.db");

        while(true) {
            int data = is.read();
            if(data == -1) {
                break;
            }
            System.out.println(data);
        }

        is.close();
    }
}
