package com.company.book;

import java.util.ArrayList;

public class BookList {
//    Book：定義書籍的資訊 BookList：表示書庫，裡面存放書籍
    public int usedSize = 3;
    public Book[] books = new Book[10];

    public BookList(){
        books[0] = new Book("我的愛是說停不能停", 50, "黃得恩", "小說");
        books[1] = new Book("垃圾警察", 50, "那麼貴", "小說");
        books[2] = new Book("西遊記", 100, "吳承恩", "小說");
    }





    public Book getBooks(int position){
        return this.books[position];
    }


    public void setBooks(int position, Book book){
        books[position] = book;
    }


    public int getUsedSize(){
        return usedSize;
    }


    public void setUsedSize(int usedSize){
        this.usedSize = usedSize;
    }












}
