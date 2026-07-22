package lesson_7.homework;

public class Cat extends Animal{
        @Override
        public void makeSound(){
                System.out.println("mew, mew");
        }


        public static void main(String[] args) {
                Animal cat = new Cat();
                cat.makeSound();
        }

}
