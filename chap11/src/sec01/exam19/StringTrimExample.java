package sec01.exam19;   //문자열 공백 제거. trim() 메소드는 앞뒤의 공백을 제거한다

public class StringTrimExample {
    public static void main(String[] args) {
        String tel1 = " 02";
        String tel2 = "123    ";
        String tel3 = "   1234   ";

        String tel = tel1.trim() + tel2.trim() + tel3.trim();
        System.out.println(tel);
    }
}
