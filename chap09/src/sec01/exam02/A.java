package sec01.exam02;   //바깥 필드와 메소드에서 사용 제한. 바깥 클래스에서 인스턴스 멤버 클래스는 정적 필드, 메소드에 한해서 객체 생성 불가

public class A {
    //인스턴스 필드
    B field1 = new B();
    C field2 = new C();

    //인스턴스 메소드
    void method1() {
        B var1 = new B();
        C var2 = new C();
    }

    //정적 필드 초기화
//    static B field3 = new B();
    static C field4 = new C();

//    정적 메소드
    static void method2() {
//        B var3 = new B();
        C var4 = new C();
    }

//    인스턴스 멤버 클래스
    class B {}

//    정적 멤버 클래스
    static class C {}
}
