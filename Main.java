package com.company;

import com.company.book.BookList;
import user.Manager;
import user.OrdinaryPerson;
import user.User;

import java.util.Scanner;

public class Main {
    //返回到看是要使用哪種使用者
    // login function.
//    public static User login(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("請輸入你的名字");
//        String userName = scanner.nextLine();
//        System.out.println("請輸入你的身份：1-->管理員 ０-->普通用戶");
//        int number = scanner.nextInt();
//
//        if (number == 1){
//            return new Manager(userName);
//        }else {
//            return new OrdinaryPerson(userName);
//        }
//
//
//    }

    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入你的名字");
        String username = scanner.next();
        System.out.println("請輸入你的身份：1-->管理員 ０-->普通用戶");
        int number = scanner.nextInt();

        if (number == 1){
            return new Manager(username);
        }else{
            return new OrdinaryPerson(username);
        }

    }




    // 執行
    public static void main(String[] args) {
//        BookList bookList = new BookList();
//
//        User user = login();
//
//        while(true){
//            int choice = user.menu();
//            user.doOperation(choice, bookList);
//        }


        BookList bookList = new BookList();
        User user = login();

        while(true){
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }

    }











}
