package sec02.exam04;

public class Anonymous {
    private int field;

    public void method(final int avg1, int avg2) {
        final int var1 = 0;
        int var2 = 0;

        field = 10;

//        arg1 = 20;
//        arg2 = 20;

//        var1= 30;
//        var2 = 30;

        Calculatable calc = new Calculatable() {
            @Override
            public int sum() {
                int result = field + avg1 + avg2 + var1 + var2;
                return result;
            }
        };

        System.out.println(calc.sum());
    }
}
