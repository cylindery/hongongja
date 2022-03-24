package sec02.exam05;   //라인 단위로 출력하기. FileOutputStream에 보조 스트림으로 PrintStream 연결

import java.io.*;

public class PrintStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/wonjuxx/Documents/Temp/printstream.txt");
        PrintStream ps = new PrintStream(fos);

        ps.println("[프린터 보조 스트림]");
        ps.print("마치 ");
        ps.println("프린터가 출력하는 것처럼 ");
        ps.println("데이터를 출력합니다.");

        ps.flush();
        ps.close();
    }
}
