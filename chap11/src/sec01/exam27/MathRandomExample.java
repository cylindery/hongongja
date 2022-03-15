package sec01.exam27;   //임의의 주사위 눈 얻기. Math.random() 메소드 이용

public class MathRandomExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        System.out.println("주사위 눈: " + num);
    }
}
