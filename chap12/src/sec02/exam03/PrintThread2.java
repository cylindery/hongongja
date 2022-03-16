package sec02.exam03;   //무한 반복해서 출력하는 스레드. interrupt() 메소드는 일시정지 상태가 되면 InterruptedException이 발생하기 때문에 잠깐이나마 일시 정지 시킨다.

public class PrintThread2 extends Thread {
    public void run() {
        try {
            while(true) {
                System.out.println("실행 중");
                Thread.sleep(1);
            }
        } catch(InterruptedException e) {}
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
