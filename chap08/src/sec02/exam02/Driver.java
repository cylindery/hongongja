package sec02.exam02;   //매개 변수의 다형성. 매개 변수를 인터페이스로 선언하면, 매개 변수에 구현 객체를 넣어 자동 타입 변환을 통해 다형성 가능

public class Driver {
    public void drive(Vehicle vehicle) {
        vehicle.run();
    }
}
