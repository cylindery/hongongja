/*
키보드로 두 실수를 입력받아(Scanner 이용), 입력된 첫 번째 수에 두 번째 수를 나눈 결과를 "결과:값"으로 출력하되,
두 번째 수에 0 또는 0.0이 입력되었을 경우 "결과:무한대"가 출력되도록 코드 작성
 */

package sec02.verify.exam09;

import java.util.Scanner;

public class Exam09 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double result;

        System.out.print("첫 번째 수: ");
        num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("두 번째 수: ");
        num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("-------------------");

        result = num1 / num2;
        if((num2 == 0) || (num2 == 0.0)) {
            System.out.println("결과:무한대");
        } else {
            System.out.println("결과:" + result);
        }
    }
}
