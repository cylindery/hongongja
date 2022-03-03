package sec06.exam06;   //Getter와 Setter 메소드 사용

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-50);

        System.out.println("현재 속도: " + myCar.getSpeed());

        myCar.setSpeed(50);

        System.out.println("현재 속도: " + myCar.getSpeed());

        if(!myCar.isStop()) {
            myCar.setStop(true);
        }

        System.out.println("현재 속도: " + myCar.getSpeed());
    }
}
