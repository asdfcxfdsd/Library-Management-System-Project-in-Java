package user;
// 管理員


import com.company.methods.*;

import java.util.Scanner;

public class Manager extends User {

    // Constructor 構造方法
    public Manager(String name) {
        //super：存取 父類別 的成員（資料成員、函數成員、建構元）
        super(name);
        this.operations = new IOperation[] {
                new ExitSystem(),
                new FindBooks(),
                new AddBooks(),
                new DeleteBooks(),
                new DisplayBooks()
        };


    }

     /*
    重寫父類User的menu方法
    menu作用：返回你要執行的操作
     */


    public int menu(){
        System.out.println(this.name + "歡迎來到圖書小練習！");
        System.out.println("=======管理員菜單=======");
        System.out.println("=======0.退出系統=======");
        System.out.println("=======1.查找圖書=======");
        System.out.println("=======2.新增圖書=======");
        System.out.println("=======3.刪除圖書=======");
        System.out.println("=======4.顯示圖書=======");
        System.out.println("=======================");
        System.out.println("選擇你要執行的指定： ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }



}

