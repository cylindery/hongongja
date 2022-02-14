/*
while문과 Math.random() 메소드를 이용해 2개의 주사위를 던져 나오는 눈을 (눈1, 눈2) 형태로 출력하고
눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드.
 */
package sec02.verify.exam03;

public class Exam03 {
    public static void main(String[] args) {
        while(true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            int sum = num1 + num2;
            System.out.println("(" + num1 + ", " + num2 + ")");
            if(sum == 5) {
                break;
            }
        }
    }
}
