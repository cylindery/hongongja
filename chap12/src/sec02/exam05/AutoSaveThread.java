package sec02.exam05;   //1초 주기로 save() 메소드를 호출하는 데몬 스레드. catch() {break;}를 넣어주지 않으면 메인 스레드 종료 이후 한번 더 실행

public class AutoSaveThread extends Thread {
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                break;
            }
            save();
        }
    }

    public void save() {
        System.out.println("작업 내용을 저장함.");
    }
}
