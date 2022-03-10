package sec02.exam04;   //익명 객체의 로컬 변수 사용. 메소드의 매개 변수나 로컬 변수의 값은 수정하면 익명 객체 내부의 복사해 둔 값과 달라지지 않게 final로 선언할 것을 요구한다.

public interface Calculatable {
    public int sum();
}
