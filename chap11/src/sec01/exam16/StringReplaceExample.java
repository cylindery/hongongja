package sec01.exam16;   //문자열 대치하기. String 객체의 문자열은 수정이 불가능하므로 새로운 객체를 만들어 참조한다. replace()

public class StringReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
        String newStr = oldStr.replace("자바", "JAVA");
        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
