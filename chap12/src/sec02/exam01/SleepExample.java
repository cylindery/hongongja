package sec02.exam01;   //3초 주기로 10번 비프음 발생. Thread 클래스의 sleep() 정적 메소드 이용

import java.awt.Toolkit;

public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<10; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000);
            } catch(InterruptedException e) {}
        }
    }
}
