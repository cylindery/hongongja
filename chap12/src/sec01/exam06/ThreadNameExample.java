package sec01.exam06;   //메인 스레드 이름 출력 및 UserThread 생성 및 시작.
//메인 스레드는 main이라는 이름을 가지며, 우리가 생성한 스레드는 Thread-n 이름으로 설정. 직접 설정하고 싶다면 thread.setName()

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

        Thread threadA = new ThreadA();
        System.out.println("작업 스레드 이름: " + threadA.getName());
        threadA.start();

        Thread threadB = new ThreadB();
        System.out.println("작업 스레드 이름: " + threadB.getName());
        threadB.start();
    }
}
