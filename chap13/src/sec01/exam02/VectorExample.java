package sec01.exam02;   //Board 객체를 저장하는 Vector. Vector 구현 클래스는 ArrayList와 동일한 내부 구조를 지니지만, 동기화 메소드 사용

import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<Board>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        list.remove(2);
        list.remove(3);

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i).subject + "\t" + list.get(i).content + "\t" + list.get(i).writer);
        }
    }
}
