package task0410.by.itacademy.viktoriazakarian.maraphon0410;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("Harry Potter and Chamber of Secrets", "J. Rowling", "ROSMAN", 2000, 823, 40, "hardcover"));
        list.add(new Book("Harry Potter and goblet of fire", "J. Rowling", "ROSMAN", 2002, 858, 45, "hardcover"));
        list.add(new Book("Fight Club", "Ch.Palahniuk", "ANTALOGIA", 2018, 160, 15, "paperback"));
        list.add(new Book("Java: guide for beginners", "G.Shmidt", "Dialektica", 2019, 816, 100, "hardcover"));
        list.add(new Book("Java: complete guide", "G.Shmidt", "Dialektica", 2018, 1488, 130, "hardcover"));
        System.out.println("Книги Дж.Роулинг: ");
        for (Book book : list) {
            if (Objects.equals(book.getAuthor(), "J. Rowling")) {
                book.print();
            }
        }
        System.out.println();
        System.out.println("Книги издательства АНТАЛОГИЯ:");
        for (Book book : list) {
            if (Objects.equals(book.getPublishing(), "ANTALOGIA")) {
                book.print();
            }
        }
        System.out.println();
        System.out.println("Книги, выпущенные в 2018 году:");
        for (Book book : list) {
            if (Objects.equals(book.getYearOfPublication(), 2018)) {
                book.print();
            }
        }
        System.out.println();
        System.out.println("Книги в твердом переплете:");
        for (Book book : list) {
            if (Objects.equals(book.getTypeOfBinding(), "hardcover")) {
                book.print();
            }
        }
        System.out.println();
        System.out.println("Книги дороже 150 рублей:");
        for (Book book : list) {
            if (book.getPrice() > 150) {
                book.print();
            }
        }
    }
}
