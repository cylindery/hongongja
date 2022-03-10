package sec01.exam06;   //중첩 인터페이스: 특정 클래스와 긴밀한 관계를 갖는 구현 클래스를 만들기 위함. 주로 정적 인터페이스 사용

public class Button {
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
    void touch() {
        listener.onClick();
    }

    static interface OnClickListener {
        void onClick();
    }
}
