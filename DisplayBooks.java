package com.company.methods;

import com.company.book.Book;
import com.company.book.BookList;

public class DisplayBooks implements IOperation{
    public void work(BookList bookList){
        System.out.println("顯示圖書");


        for (int i =0; i< bookList.getUsedSize(); i++){
            Book book = bookList.getBooks(i);
            System.out.println(book);
        }

    }
}
