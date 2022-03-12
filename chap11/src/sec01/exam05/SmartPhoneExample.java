package sec01.exam05;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("구글", "안드로이드");

        String strObj = smartPhone.toString();
        System.out.println(strObj);

        System.out.println(smartPhone); //System.out.println() 메소드는 매개값으로 객체 자체를 주면, 객체의 toString() 메소드를 호출해서 리턴값을 출력함
    }
}
