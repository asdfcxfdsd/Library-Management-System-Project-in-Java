package user;

import com.company.methods.*;

import java.util.Scanner;

public class OrdinaryPerson extends User{


    public OrdinaryPerson(String name){
        super(name);
        this.operations = new IOperation[] {
                new ExitSystem(),
                new FindBooks(),
                new BorrowBooks(),
                new ReturnBooks()
        };
    }



    public int menu(){
        System.out.println(this.name + "歡迎來到圖書小練習！");
        System.out.println("=======普通用戶菜單=======");
        System.out.println("=======0.退出系統=======");
        System.out.println("=======1.查找圖書=======");
        System.out.println("=======2.借閱圖書=======");
        System.out.println("=======3.歸還圖書=======");
        System.out.println("=======================");
        System.out.println("選擇你要執行的指定： ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }




}
