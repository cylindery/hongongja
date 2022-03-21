package sec01.exam05;   //hashCode()와 equals() 메소드 재정의. 인스턴스가 달라도 이름과 나이가 동일하다면 동일한 객체로 간주

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //equals() 재정의. 1) obj가 Member의 인스턴스인지 확인한 뒤, obj의 name, age가 필드와 같다면 동일한 객체라고 인식
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            return member.name.equals(name) && (member.age == age);
        } else {
            return false;
        }
    }

    //hashCode() 재정의. name의 hashCode와 age를 리턴
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
