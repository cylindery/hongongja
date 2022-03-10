package sec01.exam04;   //로컬 클래스에서 사용하는 매개 변수나 로컬 변수의 값을 로컬 클래스 내부에 복사해두고 사용하므로, 값의 변경을 막기 위해 매개 변수나 로컬 변수를 final로 선언할 것은 요구한다.

public class Outter {
    public void method1(final int arg) {
        final int localVariable = 1;
//        arg = 100;
//        localVariable = 100;

        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }
}
