package lesson_5;

public class Homework5 {
    public static void main(String[] args) {
//        Оператор Switch.
//
//        1. Напиши программу, которая выводит, к какому времени года относится месяц.
        int month = 6;
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
            default:
                System.out.println("there is only 12 month");
          }

//        2. Циклический оператор for.
//        Выведи таблицу умножения на 5 с помощью цикла for.
//
//        Пример:
//        5 x 1 = 5
//        5 x 2 = 10
//...
//        5 x 10 = 50
//
        for (int i = 1; i < 11; i++){
            int mult = 5 * i;
            System.out.println("5 * " + i +" = " + mult);
        }
//        1. (Задание со звездочкой - необязательное) Нарисуй с помощью for треугольник:
//        Пример:
//        *
//        **
//        ***
//        ****
//        *****
        int b = 6;
        for (int i = 1; i < b; i++){
            System.out.println("*".repeat(i));
        }


    }
}
