package mainPackage;

public class readerTask {
    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.PIB = new String[]{"Usenko", "Oleksandr", "Vasylovych"};

        Book book1 = new Book();
        book1.bookName = "Alphabet";
        Book book2 = new mainPackage.Book();
        book2.bookName = "Ukraine 1918";
        Book book3 = new mainPackage.Book();
        book3.bookName = "Forest song";

        String[] bookAmount = new String[3];
        bookAmount = new String[]{book1.bookName, book2.bookName, book3.bookName};

        reader.takeBook(3);
        reader.takeBook("All quiet on the Western front, 1984, Farenheit 451");
        reader.takeBook(bookAmount);

        reader.returnBook(2);
        reader.returnBook("All quiet on the Western front, Farenheit 451");
        reader.returnBook(bookAmount[0]);
    }
}


class Book{

    String authorName;
    String bookName;
    String[] bookAmt = new String[3];
}

