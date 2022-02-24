package sec05.exam04;   //싱글톤. 단 하나의 객체만 존재하며, 정적 메소드 getInstance()로 자기 자신만을 리턴함

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {};

    static Singleton getInstance() {
        return singleton;
    }
}
