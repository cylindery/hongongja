package sec01.exam01;   //equals() 메소드 재정의. 1) 비교 객체가 기준 객체와 동일한 타입인지 instanceof 사용한 뒤, 2) 같은 타입으로 강제 타입 변환

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            if(id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }
}
