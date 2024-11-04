
package oops;

import java.util.Scanner;

class book{
    String title;
    String author;
    double price;
    book(String t , String a , double p){
        title = t;
        author = a;
        price = p;
    }
    void display(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
}
class bookcreator{
    static book create(){
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String a = sc.next();
        double p = sc.nextDouble();
        book b = new book(t,a ,p);
        return b;
    }
}
public class Library {
    public static void main(String[] args) {
        book b1 = bookcreator.create();
        b1.display();
    }
}
