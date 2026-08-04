package lesson_9;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class homework_9 {
    public static void main(String[] args) {
        //1. Создай массив чисел int[] nums = {5, 8, 12, 3, 17, 4, 9}.
       // С помощью стрима и filter() посчитай, сколько чисел больше 7.
        int[] nums = {5, 8, 12, 3, 17, 4, 9};
        long count = Arrays.stream(nums).filter(i -> i>7 ).count();
        System.out.println(count);
//        2. Создай список чисел от 1 до 20.
//С помощью Stream и filter() выведи только чётные числа.
       List<Integer> list = IntStream.rangeClosed(1,20).boxed().toList();
        //System.out.println(list);
        list.stream().filter(i -> i%2==0).forEach(System.out::println);


    }

}




