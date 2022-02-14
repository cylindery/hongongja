/*
while문과 Scanner를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성.
Scanner의 nextLine() 사용
 */
package sec02.verify.exam07;

import java.util.Scanner;

public class Exam07 {
    public static void main(String[] args) throws Exception {
        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("--------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("--------------------------------------");
            System.out.print("선택> ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice) {
                case 1:
                    System.out.print("예금액>");
                    balance += Integer.parseInt(scanner.nextLine());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("출금액>");
                    balance -= Integer.parseInt(scanner.nextLine());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("잔고>" + balance);
                    System.out.println();
                    break;
                case 4:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
