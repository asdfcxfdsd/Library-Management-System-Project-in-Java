package user;

import com.company.book.BookList;
import com.company.methods.IOperation;


abstract public class User {
    public String name;
    public IOperation[] operations;


    public User(String name){
        this.name = name;
    }

    /*
    新建menu方法，理解為使用者選單
    因為SpecialPerson和OrdinaryPerson繼承了User，所以讓兩個子類重寫menu方法，二者的選單展示不一致
    此時menu可以沒有具體實現，因而將它設計為抽象方法，因此User類成為抽象類

     */
    abstract public int menu();


//    public void doOperation(int choice, BookList bookList){
//                this.operations[choice].work(bookList);
//    }
//}
//operations中存放的是哪些操作方法，得看子類
    public void doOperation(int choice, BookList booklist){
        this.operations[choice].work(booklist);
    }
}