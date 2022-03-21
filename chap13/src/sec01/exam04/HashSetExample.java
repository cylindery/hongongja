package sec01.exam04;   //String 객체를 중복 없이 저장하는 HashSet. Set 인터페이스의 구현클래스. hashCode()를 비교한 뒤 equals() 비교

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");

        int size = set.size();
        System.out.println("총 객체수: " + size);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String str = iterator.next();
            System.out.println("\t" + str);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        size = set.size();
        System.out.println("총 객체수: " + size);

        iterator = set.iterator();
        for(String element : set) {
            System.out.println("\t" + element);
        }

        set.clear();
        if(set.isEmpty()) {
            System.out.println("비어 있음");
        }
    }
}
