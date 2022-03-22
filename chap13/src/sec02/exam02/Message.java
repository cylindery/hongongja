package sec02.exam02;   //FIFO 자료구조를 이용하는 Queue 인터페이스. 대표적으로 LinkedList 클래스가 있다.

public class Message {
    public String command;
    public String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
