/*
주어진 배열의 항목에서 최대값을 구하기. for문 활용
 */
package sec02.verify.exam04;

public class Exam04 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1, 5, 3, 8, 2};

        for(int i=0; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("max: " + max);
    }
}
