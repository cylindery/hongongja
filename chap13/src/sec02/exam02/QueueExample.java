package sec02.exam02;   //Queue를 이용한 메시지 큐. 먼저 넣은 메시지가 반대쪽으로 먼저 나옴

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> queue = new LinkedList<Message>();

        //메시지 저장
        queue.offer(new Message("sendMail", "홍길동"));
        queue.offer(new Message("sendSMS", "신용권"));
        queue.offer(new Message("kakaoTalk", "홍두께"));

        //메시지 큐가 비어있는지 확인
        while(!queue.isEmpty()) {
            Message message = queue.poll();     //메시지 큐 객체를 하나씩 가져오기
            switch(message.command) {
                case "sendMail" :
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS" :
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;
                case "kakaoTalk" :
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
