package sec01.exam06;   //프로그램 종료 exit(). for문이 10번 반복하다가 i가 5가 되면 프로그램 종료

public class ExitExample {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            if(i == 5) {
                System.exit(0);
//                break;
            }
        }
        System.out.println("마무리 코드");
    }
}
