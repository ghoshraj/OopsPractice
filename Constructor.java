package oops;

class paramconstructor{
    String name;
    int age;
    paramconstructor(String name , int age){
        this.name = name;
        this.age = age;
    }
    paramconstructor(String name){
        this.name = name;
    }
}
public class Constructor {
    public static void main(String[] args) {
        paramconstructor p = new paramconstructor("raj",22);
        paramconstructor p1 = new paramconstructor("ram");
        System.out.println(p.name + " " + p.age);
        System.out.println(p1.name + " " + p1.age);
    }
}
