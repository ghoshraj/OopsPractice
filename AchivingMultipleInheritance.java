package oops;

interface sum{
    void sum(int a ,int b);
}
interface substract{
    void substract(int a ,int b);
}
class Maths implements sum , substract{
    @Override
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    @Override
    public void substract(int a, int b) {
        System.out.println(a - b);
    }
}
public class AchivingMultipleInheritance {
    public static void main(String[] args) {
        Maths m = new Maths();
        m.sum(20,10);
        m.substract(20,10);
    }
}
