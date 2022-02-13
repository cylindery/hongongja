package sec04.verify.exam03;    //Scanner를 이용해서 이름, 주민번호 앞 6자리, 전화번호를 키보드에서 입력받고 출력

import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String name;
        String ssn;
        String tel;

        System.out.println("[필수 정보 입력]");
        System.out.print("1. 이름: ");
        name = scanner.nextLine();
        System.out.print("2. 주민번호 앞 6자리: ");
        ssn = scanner.nextLine();
        System.out.print("3. 전화번호: ");
        tel = scanner.nextLine();

        System.out.println();

        System.out.println("[입력한 내용]");
        System.out.println(name);
        System.out.println(ssn);
        System.out.println(tel);
    }
}
