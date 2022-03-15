/*
문자열 "200"을 정수로 변환하는 코드와 숫자 150을 문자열로 변환하는 코드를 작성
 */
package sec01.verify.exam09;

public class StringConvertExample {
    public static void main(String[] args) {
        String num1 = "200";
        int intNum1 = Integer.parseInt(num1);

        int num2 = 150;
        String strNum2 = String.valueOf(num2);
    }
}
