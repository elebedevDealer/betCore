package lesson_6;

public class Calculator {
    public static void main(String[] args) {
//       double a = 2.2;
//       int b = 2;
//       double result = sum(a, b);
//        System.out.println(result);

        int intSum = sum(2,4);
        System.out.println(intSum);
        double doubleSum = sum(2.8,4.2);
        System.out.println(doubleSum);
        int intSub = sub(53, 57);
        System.out.println(intSub);
        double dobleSub = sub(83.9, 83.7);
        System.out.println(dobleSub);

//№6 Методы в Java (как в них передавать и возвращать значения, перегрузка методов).
//Создать класс Calculator, и реализовать в нем методы на сложение и вычитание
//используя перегрузку методов и чтобы методы возвращали разные типы данных.
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        double result = a + b;
        return result;
    }

    public static int sub (int a, int b) {
        int result = a - b;
        return result;
    }
    public static double sub (double a, double b) {
        double result = a - b;
        return result;
    }

}
