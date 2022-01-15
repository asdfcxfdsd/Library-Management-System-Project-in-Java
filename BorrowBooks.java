package com.company.methods;

import com.company.book.Book;
import com.company.book.BookList;

import java.util.Scanner;

public class BorrowBooks implements IOperation{
    public void work(BookList bookList){
        System.out.println("借閱書籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入書名");
        String name = scanner.nextLine();

        for (int i =0; i<= bookList.getUsedSize(); i++){
            Book book = bookList.getBooks(i);
            if(book.getName().equals(name) && book.isBorrowed() == false ){
                book.setBorrowed(true);
                System.out.println("借到了");
                return;
            }
        }
        System.out.println("非常抱歉，本館沒有您要借閱的書！");






    }
}
