package sec01.exam02;   //hashCode() 메소드를 재정의 하지 않은 경우, HashMap의 식별키로 사용했을 때 저장된 값을 찾아오지 못한다. number 필드값이 같아도 hashCode()에서 리턴하는 해시코드가 다르므로

public class Key {
    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Key) {
            Key compareKey = (Key) obj;
            if(this.number == compareKey.number) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
