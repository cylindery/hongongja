package sec03.exam01;   //키보드로부터 라인 단위 문자열 얻기. 반복해서 문자열을 라인 단위로 얻고 모니터에 출력, q로 멈추기

import java.io.*;

public class GetLinedStringFromKeyboard {
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);

        while(true) {
            System.out.print("입력하세요: ");
            String line = br.readLine();
            if(line.equals("q") || line.equals("quit")) { break; }
            System.out.println("입력된내용: " + line);
        }
        br.close();
    }
}
