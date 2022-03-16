package sec01.exam07;   //멀티 스레드 프로그램에서 공유 객체를 사용할 때 발생하는 문제 상황. 메인 스레드

public class MainThreadExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
    }
}
