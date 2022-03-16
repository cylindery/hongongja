package sec02.exam04;   //무한 반복해서 출력하는 스레드. 일시 정지 코드 대신에 Thread.interrupted()를 사용해서 PrintThread2의 interrupt()가 호출되었는지 확인한 뒤 while문 탈출

public class PrintThread2 extends Thread {
    public void run() {
        while(true) {
            System.out.println("실행 중");
            if(Thread.interrupted() == true) {
                break;
            }
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
