package sec04.exam02;   //입력된 키코드를 변수에 저장. System.in.read() 사용

public class KeyCodeExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);
    }
}
