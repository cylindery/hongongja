package sec04.exam05;   //키보드에서 입력된 내용을 문자열로 얻기. System.in.read()는 키코드 하나씩 읽지만, Scanner를 통해 문자열로 읽기

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String inputData;

        while(true) {
            inputData = scanner.nextLine();
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            if(inputData.equals("q")) {
                break;
            }
        }
        System.out.println("종료");
    }
}
