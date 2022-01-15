package com.company.methods;

import com.company.book.Book;
import com.company.book.BookList;

import java.util.Scanner;

public class ReturnBooks implements IOperation{
    public void work(BookList bookList){
        System.out.println("還書系統");
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入歸還書名");
        String name = scanner.nextLine();

        for (int i =0; i<bookList.getUsedSize(); i++){
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name) && book.isBorrowed() == true ){
                book.setBorrowed(false);
                System.out.println("已成功歸還");
                return;
            }
        }
        System.out.println("沒有你要歸還的這本書！");





    }

}
