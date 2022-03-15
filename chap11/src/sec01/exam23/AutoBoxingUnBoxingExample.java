package sec01.exam23;   //자동 박싱과 언박싱. 포장 클래스 타입에 기본값이 대입되면 자동으로 박싱한다

public class AutoBoxingUnBoxingExample {
    public static void main(String[] args) {
        //자동 박싱
        Integer obj = 100;
        System.out.println("value: " + obj);

        //대입 시 자동 언박싱
        int value = obj;
        System.out.println("value: " + value);

        //연산 시 자동 언박싱
        int result = obj + 100;
        System.out.println("result: " + result);
    }
}
