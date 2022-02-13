/*
키보드로 아이디와 패스워드를 입력받는다. 이름은 문자열, 패스워드는 정수(패스워드는 int 타입으로 변환).
입력된 내용을 비교하여 아이디가 "java"이고 패스워드가 12345라면 "로그인 성공"을 출력하고 그렇지 않으면 "로그인 실패"를 출력.
 */

package sec02.verify.exam11;

import java.util.Scanner;

public class Exam11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디:");
        String name = scanner.nextLine();

        System.out.print("패스워드:");
        String strPassword = scanner.nextLine();
        int password = Integer.parseInt(strPassword);

        if(name.equals("java")) {
            if(password == 12345) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패:패스워드가 틀림");
            }
        } else {
            System.out.println("로그인 실패:아이디 존재하지 않음");
        }
    }
}
