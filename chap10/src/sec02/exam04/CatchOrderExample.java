package sec02.exam04;   //catch 블록의 순서. 하위 예외 클래스에서 상위 예외 클래스로 작성

public class CatchOrderExample {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(args[0]);
            int value2 = Integer.parseInt(args[1]);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족합니다");
        } catch(Exception e) {
            System.out.println("실행에 문제가 있습니다.");
        } finally {
            System.out.println("다시 실행하세요");
        }
    }
}
