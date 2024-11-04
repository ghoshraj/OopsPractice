package oops;

interface myinterface{
    void sum(int a ,int b);
}
class Math implements myinterface{
    @Override
    public void sum(int a, int b) {
        System.out.println(a + b);
    }
}
public class Interface {
    public static void main(String[] args) {
        myinterface m = new Math();
        m.sum(10,20);
    }
}
