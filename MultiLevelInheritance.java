package oops;

class animal{
    void eat(){
        System.out.println("Eating");
    }
}
class mamels extends animal{
    void run(){
        System.out.println("Running");
    }
}
class human extends mamels{
    void talk(){
        System.out.println("Talking");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        human h = new human();
        h.eat();
        h.run();
        h.talk();
    }
}
