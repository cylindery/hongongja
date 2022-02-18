package sec02.exam01;   //외부 클래스에서 Car 필드값 읽기와 변경

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("제작회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔: " + myCar.color);
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);

        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed);
    }
}
