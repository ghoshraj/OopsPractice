package oops;

interface myinterfaces{
    void sum(int a ,int b);
}
class Mathss implements myinterfaces{
    @Override
    public void sum(int a, int b) {
        System.out.println(a + b);
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Mathss m = new Mathss();
        m.sum(10 , 20);
    }
}
