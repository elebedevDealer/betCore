package lesson_2;

public class Homework2 {
    public static void main(String[] args) {
//        Операторы сравнения и логические
//        1. Объяви переменные:
        int age = 25;
        boolean hasTicket = false;
        boolean canEnter = age >= 18 && hasTicket;
        System.out.println("Can enter: " + canEnter);
        System.out.println("если hasTicket = false то у нас \"Can enter: \" будет false" );
        //Что произойдёт, если hasTicket = false?
        boolean canEnter2 = age >= 18 || hasTicket;
        System.out.println(canEnter2);
        System.out.println("если hasTicket = false но стоит оператор или || то у нас \"Can enter: \" будет true потому что одно из утверждений верно" );
         //       Попробуй изменить && на || — как меняется логика?




        // задание 2.
        String str = "276";
        Double dbl = Double.valueOf(String.valueOf(str));
        Integer in = Integer.valueOf(String.valueOf(str));
        Long ln = Long.valueOf(String.valueOf(str));
        System.out.println(dbl);
        System.out.println(in);
        System.out.println(ln);


        //Присвой это значение таким типам как: Double, Integer, Long.




    }
}
