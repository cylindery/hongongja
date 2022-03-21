/*
BoardDao 객체의 getBoardList() 메소드를 호출하면 List<Board> 타입의 컬렉션을 리턴.
 */
package sec01.verify.exam07;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> board = dao.getBoardList();
        for(int i=0; i<board.size(); i++) {
            System.out.println(board.get(i).getTitle() + "-" + board.get(i).getContent());
        }
    }
}
