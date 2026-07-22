package lesson_7.homework;

public class Book {

//        Конструкторы класса.
//        Создай класс Book с полями title, author, year.
//        Добавь три конструктора:
//        - без параметров
//                - с title и author
//                - со всеми параметрами
//        Покажи использование конструкторов
//

        String title;
        String author;
        int year;

        public Book() {
        }

        public Book(String title, String author){
            this.title = title;
            this.author = author;
        };

        public Book(String title, String author, int year){
            this.title = title;
            this.author = author;
            this.year = year;
        }

    public static void main(String[] args) {
        Book book = new Book();
        book.author = "Daria";
        System.out.println(book.title +" " + book.author + " " + book.year + " Есть только автор, поэтому все остальные значения пустые.");

        Book book2 = new Book("The Great Gatsby","F. Scott Fitzgerald" );
        System.out.println(book2.title +" " + book2.author + " " + book2.year + " Отсутствует только год, поэтому все остальные значения заполнены.");

        Book book3 = new Book("To Kill a Mockingbird","Harper Lee", 1960);
        System.out.println(book3.title +" " + book3.author + " " + book3.year + " Все значения есть, все параметры отображаются.");
    }

}
