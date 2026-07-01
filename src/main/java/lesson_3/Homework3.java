package lesson_3;

import java.util.*;

public class Homework3 {
    public static void main(String[] args) {

        //1. Создайте список List<String>, наполните его 7-8 названиями любимых фильмов. Выведите список в консоль
        List<String> films = new ArrayList<>();
        films.add("The Lion King");
        films.add("Toy Story");
        films.add("Frozen");
        films.add("Monsters, Inc.");
        films.add("WALL-E");
        films.add("Finding Nemo");
        films.add("How to Train Your Dragon");
        films.add("Zootopia");
        films.add("Kung Fu Panda");
        System.out.println(films);

//        2. Добавьте в Set<Student> 5 студентов (одного добавьте дважды). Выведите Set на экран и поясните что произошло.
        Set<String> student = new HashSet<>();
        student.add("Петя");
        student.add("Вася");
        student.add("Зина");
        student.add("Гена");
        student.add("Тома");
        student.add("Гена");
        System.out.println(student + " Set не допускает хранение дублей, так как \"Гена\" упоминается два раза, коллекция Set убирает дубликаты.");

//        3. Создайте Map<String, Integer>, где ключом будет название фрукта, а значением — его цена в магазине. Заполните словарь 5-6 элементами.
        Map<String, Integer> shop = new HashMap<>();
        shop.put("Apple", 2);
        shop.put("Potato", 1);
        shop.put("Carrot", 1);
        shop.put("Tomatoes", 3);
        shop.put("Pear", 2);
        System.out.println(shop);


//        4. Создайте массив из 10 случайных целых чисел. Посчитайте и выведите сумму всех элементов массива.* (Задание со звездочкой).
        int [] nums = new int[10];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(20);
            sum += nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(sum);


//                int [] nums = new int [10];
//        System.out.println(nums[0]);

    }
}
