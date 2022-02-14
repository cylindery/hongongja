/*
for문을 이용해서 다음과 같이 *를 출력하는 코드 작성
*
**
***
****
 */
package sec02.verify.exam05;

public class Exam05 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
