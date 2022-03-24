/*
FileReader와 BufferedReader를 이용해서 source.txt 내용을 읽고, 각 라인 번호를 추가해 모니터로 출력하는 프로그램 작성
 */
package sec02.verify.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
    public static void main(String[] args) throws Exception {
        String filePath = "/Users/wonjuxx/IdeaProjects/hongongja/chap14/src/sec02/verify/exam02/AddLineNumberExample.java";
        FileReader reader = new FileReader(filePath);
        BufferedReader br = new BufferedReader(reader);

        int rowNum = 0;
        String rowData;
        while((rowData = br.readLine()) != null) {
            System.out.println(++rowNum + ": " + rowData);
        }
        br.close();
    }
}
