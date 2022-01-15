package com.company.book;

public class Book {
    //    Book：定義書籍的資訊 BookList：表示書庫，裡面存放書籍
    private String name;
    private int price;
    private String author;
    private String type;
    private boolean isBorrowed = false;

    public Book(String name, int price, String author,  String type){
        this.name = name;
        this.price = price;
        this.author = author;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String getAuthor(){
        return author;
    }

    public String getType(){
        return type;
    }

    public boolean isBorrowed(){
        return isBorrowed;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setType(){
        this.type = type;
    }

    public void setBorrowed(boolean borrowed){
        isBorrowed = borrowed;
    }





    @Override
    // 改寫tostring這樣不會印出亂數。
//    public String toString() {
//        return "Book{" +
//                "name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", price=" + price +
//                ", type='" + type + '\'' +
//                ((isBorrowed == true) ? " 借閱狀態: 已借出" : " 借閱狀態: 未借出") +
//                '}';
//    }


    public String toString(){
        return "Book{" + "name='" + name + '\'' + ", author='" + author + '\'' + ", price = " + price + ", type ='"+ type + '\'' + ',' + ((isBorrowed == true) ? "借閱狀態: 已借出" : " 借閱狀態: 未借出") + "}";
    }






}
