
package oops;

class car{
    int regnum;
    private static int n = 100;
    car(){
        regnum = n;
        n++;
    }
    void start(){
        System.out.println(regnum + " start");
    }
    void breaks(){
        System.out.println(regnum + " break execute");
    }
}
class Driver{
    void drive(car c){
        c.start();
        c.breaks();
        System.out.println("***************");
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();
        car c3 = new car();
        Driver d1 = new Driver();
        d1.drive(c1);
        d1.drive(c2);
        d1.drive(c3);
    }
}
