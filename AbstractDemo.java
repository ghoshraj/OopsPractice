package oops;

abstract class a{
    abstract void run();
}
class b extends a {

    @Override
    void run() {
        System.out.println("running");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        b b = new b();
        b.run();
    }
}
