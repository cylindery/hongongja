package sec01.exam02;   //ArrayIndexOutOfBoundsException. 배열에서 인덱스 범위를 초과할 경우 발생하는 실행 예외

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        String data1 = args[0];
        String data2 = args[1];

        System.out.println("args[0]: " + data1);
        System.out.println("args[1]: " + data2);
    }
}
