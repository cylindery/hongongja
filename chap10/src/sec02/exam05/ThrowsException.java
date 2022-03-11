package sec02.exam05;   //예외 처리 떠넘기기. throws가 붙어있는 메소드는 반드시 try 블록에 호출되어야 하고, 예외 처리까지 필수. throws로 넘겨받은 메소드에서 또다시 throws 가능

public class ThrowsException {
    public static void main(String[] args) {
        try {
            findClass();
        } catch(ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }
}
