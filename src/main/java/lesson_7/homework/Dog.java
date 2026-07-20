package lesson_7.homework;


public class Dog extends Animal{
    @Override
    public void makeSound (){
        System.out.println("vaf, vaf");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}
