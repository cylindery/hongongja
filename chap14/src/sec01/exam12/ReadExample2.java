package sec01.exam12;   //배열 길이만큼 읽기. 배열 길이보다 많은 문자가 들어온다면, 배열만큼 읽은 뒤 나눠서 반복 읽기

import java.io.Reader;
import java.io.FileReader;

public class ReadExample2 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("/Users/wonjuxx/Documents/Temp/test8.txt");

        char[] array = new char[100];

        while(true) {
            int readArray = reader.read(array);
            if(readArray == -1) break;
            for(int i=0; i<readArray; i++) {
                System.out.println(array[i]);
            }
        }
        reader.close();
    }
}
