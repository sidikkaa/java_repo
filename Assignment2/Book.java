package com.celcom.Assignment2;
import java.util.List;
import java.util.ArrayList;

public class Book {
    String title;
    String author;
    long ISBN;

    public Book(String title, String author, long ISBN) {
        super();
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    static class Library {
        List<Book> list;

        Library() {
            list = new ArrayList<>();
        }

        void addBook(Book book) {
            list.add(book);
        }

        void printBooks() {
            for (Book book : list) {
                System.out.println("Title: " + book.title + ", Author: " + book.author + ", ISBN: " + book.ISBN);
            }
        }
        void removeBook(long ISBN) {
            list.removeIf(book -> book.ISBN == ISBN);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("book1", "George", 1234567890L);
        
        Library library = new Library();
        library.addBook(book1);
        library.printBooks();
        library.removeBook(1234567890L);
        System.out.println("After Removing");
        library.printBooks();
    }
}

