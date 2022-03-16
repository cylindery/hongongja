package sec01.exam08;   //User2 작업 스레드

public class User2 extends Thread {
    public Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User2");
        this.calculator = calculator;
    }

    public void run() {
        calculator.setMemory(50);
    }
}
