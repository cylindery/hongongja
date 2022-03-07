package sec02.exam05;   //강제 타입 변환을 한다고 해서, 다시 부모 타입의 클래스 멤버를 사용하지 못하는 것은 아니다.

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        /*
        parent.field2 = "data2";
        parent.method3();
         */

        Child child = (Child) parent;
        child.field2 = "yyy";
        child.method3();
    }
}
