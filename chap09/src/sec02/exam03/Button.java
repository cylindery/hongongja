package sec02.exam03;   //UI 프로그램에서 버튼의 클릭 이벤트를 처리하기 위한 익명 구현 객체

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
