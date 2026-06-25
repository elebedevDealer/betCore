package lesson_1;

public class Homework {
    public static void main(String[] args) {
        byte a = 127;
        short bb = 128;
        int c = 33333;
        long dd = 4444455555L;

        float ii = 11.2f;
        double f = 20.3d;

        boolean g = true;
        char h = 'A';

        System.out.println(a + " byte" );
        System.out.println(bb + " short");
        System.out.println(c + " int");
        System.out.println(dd + " long");
        System.out.println(ii + " float");
        System.out.println(f + " double");
        System.out.println(g + " boolean");
        System.out.println(h + " char");



        byte b = 10;
        int i = b;
        double d = i;

        System.out.println(b);
        System.out.println(i);
        System.out.println(d);

        double doubleValue = 9.78;
        int intValue = (int) doubleValue;

        System.out.println(doubleValue);
        System.out.println(intValue + " Int не может иметь значения после запятой, по этому и происходит округление.");





    }



}
