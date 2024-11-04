package oops;

class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}
class deer extends Animal{
    @Override
    void eat(){
        System.out.println("eat grass");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        deer d = new deer();
        d.eat();
    }
}
