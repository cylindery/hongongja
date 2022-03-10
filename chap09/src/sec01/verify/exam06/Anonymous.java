package sec01.verify.exam06;    //익명 자식 객체 생성

public class Anonymous {
    //필드 초기값으로 대입
    Person field = new Person() {
        void work() {
            System.out.println("출근합니다.");
        }
        @Override
        void wake() {
            System.out.println("6시에 일어납니다.");
            work();
        }
    };

    //로컬 변수값으로 대입
    void method1() {
        Person localVar = new Person() {
            void work() {
                System.out.println("산책합니다.");
            }
            @Override
            void wake() {
                System.out.println("7시에 일어납니다.");
                work();
            }
        };
        localVar.wake();
    }

    void method2(Person person) {
        person.wake();
    }
}
