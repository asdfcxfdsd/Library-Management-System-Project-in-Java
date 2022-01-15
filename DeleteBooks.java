package com.company.methods;

import com.company.book.Book;
import com.company.book.BookList;

import java.util.Scanner;

public class DeleteBooks implements IOperation{
    public void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("刪除書籍!");
        System.out.println("請輸入要刪除書籍的名字:");
        String name = scanner.next();


        //Find the book someone wants to delete and get the position.
        int i =0;
        for (; i<=bookList.getUsedSize(); i++){
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)){
                break;
            }
        }

        // 找到超過i代表要刪除的書沒有在booklist裡面
        if (i>= bookList.getUsedSize()){
            System.out.println("沒有要刪除的這本書！");
            return ;
        }



        for (int j = i; j< bookList.getUsedSize()-1; i++){
            Book book = bookList.getBooks(j+1);
            bookList.setBooks(i, book);
        }

        int size = bookList.getUsedSize() - 1;
        bookList.setUsedSize(size);
        System.out.println("書已經被刪除了！");

    }



//    删除图书（deleteBook()）
//
//    进行图书库删除图书的操作，首先连接图书数据库；获取用户所需要删除图书的名称；
//    然后利用ArrayList类size()函数，对图书库库存量进行计算；若为0，则无法删除；
//    若找到，并且该书并没有被借出，则用ArrayList类remove()函数进行图书的删除，
//   若借出，则删除失败；
//    否则，所删除书不存在。

//    public void delete(){
//        boolean flag = false;
//        System.out.println("---->删除图书\n");
//        System.out.println("请输入图书名称：");
//        Scanner input = new Scanner(System.in);
//        String name = input.next();
//        for(int i=0;i<bookList.size();i++){
//            if(bookList.get(i).getName()!=null
//                    && bookList.get(i).getName().equalsIgnoreCase(name)
//                    && bookList.get(i).getState()==1){
//                bookList.remove(i);
//                System.out.println("图书删除成功，欢迎下次使用！");
//                flag = true;
//                break;
//            }else if(bookList.get(i).getName()!=null
//                    && bookList.get(i).getName().equalsIgnoreCase(name)
//                    && bookList.get(i).getState()==0){
//                System.out.println("此图书被借出，不能进行删除！");
//                flag = true;
//                break;
//            }
//        }

//        if(!flag){
//            System.out.println("没有录入此图书，不能进行删除！");
//        }

//        System.out.println("*************************************************");
//
//        returnMain();
    // }


}
