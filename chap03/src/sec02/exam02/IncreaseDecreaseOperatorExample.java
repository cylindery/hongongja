package sec02.exam02;   //증감 연산자. 연산자의 위치에 따라 연산 순서 변화

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("------------------");
        x++;
        ++x;
        System.out.println("x=" + x);

        System.out.println("------------------");
        y--;
        --y;
        System.out.println("y=" + y);

        System.out.println("------------------");
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("------------------");
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("------------------");
        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
