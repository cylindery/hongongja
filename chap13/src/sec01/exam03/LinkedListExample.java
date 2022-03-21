package sec01.exam03;   //ArrayList와 LinkedList의 실행 성능 비교. 10,000개의 객체를 삽입하는 데 걸린 시간 측정

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();

        long startTime = System.nanoTime();
        for(int i=0; i<10000; i++) {
            list1.add(i, "i");
        }
        long endTime = System.nanoTime();
        long arrayTime = endTime - startTime;
        System.out.println("ArrayList 걸린시간: " + arrayTime + " ns");

        List<String> list2 = new LinkedList<>();

        startTime = System.nanoTime();
        for(int i=0; i<10000; i++) {
            list2.add(i, "i");
        }
        endTime = System.nanoTime();
        long linkedTime = endTime - startTime;
        System.out.println("LinkedList 걸린시간: " + linkedTime + " ns");
    }
}
