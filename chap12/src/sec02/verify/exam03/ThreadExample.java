/*
메인 스레드에서 1초 후 MovieThread의 interrupt() 메소드를 호출해서 MovieThread를 안전하게 종료하고 싶습니다.
 */
package sec02.verify.exam03;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.start();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        thread.interrupt();
    }
}
