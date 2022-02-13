/*
반지름이 10인 원의 넓이 구하기. var2, ".", var3을 + 연산해서 원주율을 얻은 다음 계산
 */

package sec02.verify.exam10;

public class Exam10 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 3;
        int var3 = 14;
        double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
        System.out.println("원의 넓이:" + var4);
    }
}
