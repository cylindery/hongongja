package sec05.exam04;   //싱글톤 객체

public class SingletonExample {
    public static void main(String[] args) {
        /*
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
         */

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체를 참조하고 있습니다.");
        } else {
            System.out.println("다른 Singleton 객체를 참조하고 있습니다.");
        }
    }
}
