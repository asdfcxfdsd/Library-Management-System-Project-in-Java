package com.company.methods;

import com.company.book.BookList;

public class ExitSystem implements IOperation{
    public void work(BookList bookList){
        System.out.println("退出系統");
        //System.exit(0)是正常退出程式，而System.exit(1)或者說非0表示非正常退出程式
        //System.exit(status)不管status為何值都會退出程式。和return 相比有以下不同點：return是回到上一層，而System.exit(status)是回到最上層
        System.exit(1);

    }
}
