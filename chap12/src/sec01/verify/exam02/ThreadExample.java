/*
동영상과 음악을 재생하기 위해 두 가지 스레드를 실행
 */
package sec01.verify.exam02;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(new MusicRunnable());
        thread2.start();


    }
}
