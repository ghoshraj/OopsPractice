
package oops;

class Animals{
    void bark(){
    }
}
class Dog extends Animals{
    void bark(){
        System.out.println("Bhow bhow");
    }
}
class Cat extends Animals{
    void bark(){
        System.out.println("Meo meo");
    }
}
class Snake extends Animals{
    void bark(){
        System.out.println("hs....");
    }
}
class Zoo{
    void call(Animals a){
        a.bark();
    }
}
public class Casting {
    public static void main(String[] args) {
        Zoo z = new Zoo();
        z.call(new Snake());
        z.call(new Dog());
        z.call(new Cat());
    }
}
