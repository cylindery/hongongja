package sec01.exam01;   //메인 스레드만 이용하여 비프음 발생시킨 뒤 출력하기

import java.awt.Toolkit;

public class BeepPrintExample1 {
    public static void main(String[] args) {
        //Toolkit 객체 얻기
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch(Exception e) {}
        }

        for(int i=0; i<5; i++) {
            System.out.println("띵");
            try{
                Thread.sleep(500);
            } catch(Exception e) {}
        }
    }
}
