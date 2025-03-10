import java.util.Objects;

public class Book {

    private String bookName;
    private int year;
    private Author author;
    private Book[] books;
    private int size;

    public Book() {
        this.books = new Book[8];
    }

    public Book(Author author, String bookName, int year) {
        this.author = author;
        this.bookName = bookName;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void addBook(Author author, String bookName, int year) {
        if (size >= books.length) {
            System.out.println("Нельзя добавить книгу, закончилось место");
        } else {
            Book newBook = new Book(author, bookName, year);
            books[size] = newBook;
            size++;
        }
    }

    public void printBook() {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            System.out.println(book);

        }
    }

    // Реализуем метод findContact (найти контакт)
    public void findBook(String world) {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (book.author.getFirstName().equals(world) || book.author.getLastName().equals(world) ||
                    book.getBookName().equals(world) || book.author.getSourName().equals(world)) {
                System.out.println("Книга найдена \n " + book);
                return;
            }
        }
        System.out.println(world + " не найдено");
    }


    @Override
    public String toString() {
        return String.format("Автор книги: %s, книга: %s, год издания: %d ", author.toString(), bookName, year);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, year, author);
    }
}
