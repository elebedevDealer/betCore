package lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Homework4 {
    public static void main(String[] args) {
//    1. Напиши программу, которая проверяет возраст пользователя:
//    Если возраст < 18 → вывести "Доступ запрещен".
//    Если от 18 до 60 → вывести "Доступ разрешен".
//    Если больше 60 → вывести "Вы в зоне риска".
        int age = 61;
        if (age < 18){
            System.out.println("Доступ запрещен");
        } else if (age >= 18 && age <= 60){
            System.out.println("Доступ разрешен");
        } else if(age > 60){
            System.out.println("Вы в зоне риска");
        }

        //    Циклический оператор While
//
//    2. Объяви List и заполни его числами от 1 до 10.
//    Выведи на экран числа от 1 до 10 с помощью while.
//    Выведи числа от 10 до 1 с помощью while.
//    С помощью while найди сумму чисел всех значений твоего листа.


        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(10);
        //int i = 3;
        //System.out.println(num);
        //System.out.println(num.size());
        //System.out.println(num.get(i));
        int i = 0;
        while (i < num.size()){
            System.out.println(num.get(i));
            i++;
        }

        int n = num.size() - 1;
        //System.out.println(n);
        while (n >= 0){
            System.out.println(num.get(n));
            n--;
        }
        int sum = 0;
        int t = 0;
        while (t < num.size()){
            sum +=num.get(t);
            t++;
            //System.out.println(sum);
        }

        System.out.println(sum);

    }





}
