package sec02.exam04;   //강제 타입 변환을 위해서는 instanceof를 통한 객체 타입 확인이 필요하다.

public class Driver {
    public void drive(Vehicle vehicle) {
        if(vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }
        vehicle.run();
    }
}
