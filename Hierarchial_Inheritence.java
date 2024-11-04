package oops;
class animals{
    void eat(){
        System.out.println("Eating");
    }
}
class mamelss extends animals{
    void run(){
        System.out.println("Running");
    }
}
class humans extends mamelss{
    void talk(){
        System.out.println("Talking");
    }
}
class snake extends mamelss{
    void talk(){
        System.out.println("so - so");
    }
}
public class Hierarchial_Inheritence {
    public static void main(String[] args) {
        snake s = new snake();
        s.eat();
        s.run();
        s.talk();
        System.out.println("________________");
        humans h = new humans();
        h.eat();
        h.run();
        h.talk();
    }
}
