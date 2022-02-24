package sec05.exam05;   //final 필드. 초기화 한 이후에 변경 불가. 초기화 1) 필드 선언 시, 2) 생성자에서

public class Person {
    final String nation = "Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
