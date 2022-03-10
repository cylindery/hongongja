package sec01.exam03;   //멤버 클래스에서 바깥 클래스의 필드와 메소드에 접근할 땐, 인스턴스는 자유롭지만 정적 멤버 클래스는 정적 필드와 메소드만 접근 가능

public class A {
    int field1;
    void method1() {}

    static int field2;
    static void method2() {}

    class B {
        void method() {
            field1 = 10;
            method1();

            field2 = 10;
            method2();
        }
    }

    static class C {
        void method() {
//            field1 = 10;
//            method1();

            field2 = 10;
            method2();
        }
    }
}
