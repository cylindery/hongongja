package sec02.exam09;   //break문은 가까운 반복문만 종료하지만, 라벨을 붙여 break 라벨;을 통해 바깥쪽 반복문 종료 가능.

public class BreakOutterExample {
    public static void main(String[] args) {
        Outter: for(char upper='A'; upper<='Z'; upper++) {
                for(char lower='a'; lower<='z'; lower++) {
                    System.out.println(upper + "-" + lower);
                    if(lower=='g') {
                       break Outter;
                    }
                }
        }
        System.out.println("프로그램 실행 종료");
    }
}
