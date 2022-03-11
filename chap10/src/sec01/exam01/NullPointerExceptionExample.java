package sec01.exam01;   //NullPointerException. 객체 참조가 없는 값을 갖는 참조 변수로 접근

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String data = null;
        System.out.println(data.toString());
    }
}
