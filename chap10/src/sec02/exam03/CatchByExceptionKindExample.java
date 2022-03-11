package sec02.exam03;   //다중 catch. catch 블록이 여러개라도 단 하나의 블록만 실행됨. 예외가 동시다발적으로 발생하지 않으며, 하나의 예외가 발생하면 즉시 실행을 멈춰 해당 catch로 가기 때문

public class CatchByExceptionKindExample {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(args[0]);
            int value2 = Integer.parseInt(args[1]);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족합니다.");
        } catch(NumberFormatException e) {
            System.out.println("숫자로 변환할 수가 없습니다.");
        } finally {
            System.out.println("다시 실행하세요.");
        }
    }
}
