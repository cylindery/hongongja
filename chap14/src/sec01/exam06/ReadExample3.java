package sec01.exam06;   //지정한 길이만큼 읽기. 3byte를 읽고, 길이 5인 배열의 배열[2], 배열[3], 배열[4]에 저장

import java.io.InputStream;
import java.io.FileInputStream;

public class ReadExample3 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("/Users/wonjuxx/Documents/Temp/test3.db");

        byte[] buffer = new byte[5];

        int readBufferNum = is.read(buffer, 2, 3);
        if(readBufferNum != -1) {
            for(int i=0; i<buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }
        is.close();
    }
}
