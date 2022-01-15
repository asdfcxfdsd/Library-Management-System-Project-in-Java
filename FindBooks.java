package com.company.methods;

import com.company.book.Book;
import com.company.book.BookList;

import java.util.Scanner;

public class FindBooks implements IOperation{

    public void work(BookList bookList){
        System.out.println("查詢書籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入書名");
        String name = scanner.nextLine();

        for (int i=0; i<=bookList.getUsedSize(); i++){
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)){
                System.out.println("找到此書顯示在下面");
                System.out.println(book);
                return;
            }
        }
        System.out.println("沒有這本書！");





    }









}
