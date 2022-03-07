package sec02.exam01;   //자동 타입 변환. 클래스 간의 상속일 경우, 자식 클래스는 부모 클래스로 자동 타입 변환 가능.

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

//        B b3 = e;
//        C c2 = d;
    }
}
