package main;

import book.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEntries = scanner.nextInt();

        if (numberOfEntries == 0) {
            System.out.println("N/A");
        } else {
            Book[] books = new Book[numberOfEntries];
            scanner.nextLine().trim();
            for (int i = 0; i < numberOfEntries; i++) {
                String bookName = scanner.nextLine().trim();
                String authorName = scanner.nextLine().trim();
                String isbn = scanner.nextLine().trim();
                books[i] = new Book(bookName, authorName, isbn);
            }
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i]);

            }
        }

        scanner.close();
    }


}
