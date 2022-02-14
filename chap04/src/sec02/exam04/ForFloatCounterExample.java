package sec02.exam04;   //float 타입 카운터 변수. 부동 소수점을 쓰는 float 타입은 루프 카운터 변수에 부적합.

public class ForFloatCounterExample {
    public static void main(String[] args) {
        for(float x=0.1f; x<=1.0f; x+=0.1f) {
            System.out.println(x);
        }
    }
}
