package sec03.exam04;   //정수 타입의 연산. 보다 큰 범위의 타입으로 통일됨

public class LongOperationExample {
    public static void main(String[] args) {
        byte value1 = 10;
        long value2 = 100;
        long value3 = 1000L;
        long result = value1 + value2 + value3;
        System.out.println(result);
    }
}
