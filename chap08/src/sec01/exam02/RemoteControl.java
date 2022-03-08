package sec01.exam02;   //상수 필드 선언. 인터페이스는 객체를 생성할 수 없어 상수 필드, 추상 메소드만 가능. 상수는 public static final을 포함

public interface RemoteControl {
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;
}
