package sec01.exam02;   //다른 키로 인식

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        //식별키 new Key(1)로 "홍길동"을 저장함
        hashMap.put(new Key(1), "홍길동");

        //식별키 new Key(1)로 "홍길동"을 읽어옴
        String value = hashMap.get(new Key(1));
        System.out.println(value);
    }
}
