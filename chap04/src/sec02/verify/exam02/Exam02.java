/*
for문을 이용해 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드
 */
package sec02.verify.exam02;

public class Exam02 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=100; i++) {
            if(i%3 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("3의 배수의 총합 : " + sum);
    }
}
