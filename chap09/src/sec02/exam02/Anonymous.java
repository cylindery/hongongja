package sec02.exam02;   //익명 구현 객체 생성

public class Anonymous {
    //익명 구현 객체를 필드값으로 대입
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }
        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    //익명 구현 객체를 로컬 변수로 대입
    void method1() {
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Audio를 켭니다.");
            }
            public void turnOff() {
                System.out.println("Audio를 끕니다.");
            }
        };
        localVar.turnOn();
    }

    void method2(RemoteControl rc) {
        rc.turnOn();
    }
}
