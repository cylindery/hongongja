package sec02.exam02;   //1초 후 출력 스레드를 중지. 스레드의 종료는 stop() 메소드가 있지만 자원을 불안정한 상태로 남기고 종료하므로, 대신 1) stop 플래그를 사용

public class StopFlagExample {
    public static void main(String[] args) {
        PrintThread1 printThread1 = new PrintThread1();
        printThread1.start();

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {}

        printThread1.setStop(true);
    }
}
