package sec02.exam01;   //TryCatchFinally 예외 처리 블록. 생성자 내부 또는 메소드 내부에서 작성되는 예외 처리 방법

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String2");
        } catch(ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
}
