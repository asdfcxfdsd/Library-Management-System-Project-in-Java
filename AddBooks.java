package com.company.methods;

import com.company.book.Book;
import com.company.book.BookList;

import java.util.Scanner;



public class AddBooks implements IOperation{
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("加入新的書籍");

        System.out.println("請您輸入書名");
        String name = scanner.nextLine();
        System.out.println("請您輸入價格");
        int price = scanner.nextInt();
        System.out.println("請您輸入作者名");
        String authorName = scanner.nextLine();
        System.out.println("請您輸入類別");
        String type = scanner.nextLine();

        // Add new book to book list.
        Book newBook = new Book(name, price, authorName, type);
        int size = bookList.getUsedSize();
        bookList.setBooks(size, newBook);
        bookList.setUsedSize(size + 1);


    }

}
