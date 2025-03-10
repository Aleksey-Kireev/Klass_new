public class Main {


    public static void main(String[] args) {
        System.out.println("Hello, World!");

//        Инициализируем переменные
        String firstName = "";
        String lastName = "";
        String sourName = "";

//        Ввод информации о книге
        String[] d = Service.input();

//        Присваивание переменным данных, для передачи в конструктор

        for (int i = 0; i < d.length - 2; i++) {
            switch (i) {
                case 0 -> firstName = d[i];
                case 1 -> lastName = d[i];
                case 2 -> sourName = d[i];
            }
        }

        String book = d[d.length - 2];
        int year = Integer.parseInt(d[d.length - 1]);

//        System.out.printf("Автор: %s %s %s, книга: %s, год издания %d", firstName, lastName, sourName, book, year);

        Author author1 = new Author(firstName, lastName, sourName);     // Создание объекта типа Автор
        Book book1 = new Book(author1, book, year);                     // Создание объекта типа Книга

        //        Ввод информации об еще одной книге
        d = Service.input();

//        Присваивание переменным данных, для передачи в конструктор

        for (int i = 0; i < d.length - 2; i++) {
            switch (i) {
                case 0 -> firstName = firstName.isEmpty() ? "" : d[i];
                case 1 -> lastName = lastName.isEmpty() ? "" : d[i];
                case 2 -> sourName = sourName.isEmpty() ? "" : d[i];
            }
        }

        book = d[d.length - 2];
        year = Integer.parseInt(d[d.length - 1]);

        Author author2 = new Author(firstName, lastName, sourName);     // Создание объекта типа Автор
        Book book2 = new Book(author2, book, year);                     // Создание объекта типа Книга

//        Создаем авторов и книги разными способами
        Author author3 = new Author("Георгий", "Граубин", "");
        Book book3 = new Book(author3, "Четырехэтажная тайга", 1984);
        Author author4 = new Author();
        author4.setFirstName("Арсеньев");
        author4.setLastName("Владимир");
        author4.setSourName("Клавдиевич");
        Book book4 = new Book();
        book4.setAuthor(author4);
        book4.setBookName("Дерсу Узала");
        book4.setYear(1923);

//        Вывод всей библиотеки
        System.out.printf("%n %s", book1);
        System.out.printf("%n %s", book2);
        System.out.printf("%n %s", book3);
        System.out.printf("%n %s", book4);

//        Сравним две первых книги
        System.out.println("\n Сравним две первых книги, методом equals");
        String s = book1.equals(book2) ? "Книги одинаковые" : "Книги разные";
        System.out.println(s);

//        Теперь создадим массив объектов
        System.out.println("\n-----  Создадим массив объектов ------\n и выведем его в консоль.");
        System.out.println();
        Book bookAll = new Book();
        bookAll.addBook(author1, book1.getBookName(), book1.getYear());
        bookAll.addBook(author2, book2.getBookName(), book2.getYear());
        bookAll.addBook(author3, book3.getBookName(), book3.getYear());
        bookAll.addBook(author4, book4.getBookName(), book4.getYear());

        Author author5 = new Author("Пушкин", "", "");
        Book book5 = new Book(author5, "Лукоморье", 1900);
        Author author6 = new Author("Грибоедов", "Александр", "");
        Book book6 = new Book(author6, "Горе от ума", 1984);

        bookAll.addBook(author5, book5.getBookName(), book5.getYear());
        bookAll.addBook(author6, book6.getBookName(), book6.getYear());

        bookAll.printBook();        // Печать всей библиотеки
        System.out.println();

        String world = Service.inpFind();       // Ввод данных для поиска
        bookAll.findBook(world);                // Вывод результатов поиска


    }

}
