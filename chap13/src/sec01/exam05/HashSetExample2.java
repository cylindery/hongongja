package sec01.exam05;   //Member 객체를 중복없이 저장하는 HashSet. Member 클래스에서 hashCode()와 equals()를 재정의하지 않으면 객체가 2개로 나옴

import java.util.*;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        System.out.println("총 객체수 : " + set.size());
    }
}
