
package oops;

class a1{
    String name;
    int age;
    a1(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        a1 a = new a1("Rajesh",22);
    }
}
