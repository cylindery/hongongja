package sec03.exam01;   //자동 타입 변환. 작은 허용 범위의 타입에서 큰 허용 범위 타입으로.

public class PromotionExample {
    public static void main(String[] args) {
        //자동 타입 변환
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);

        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);
    }
}
