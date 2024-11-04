package oops;

class person{
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        if (age <= 18)
            throw new IndexOutOfBoundsException();
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 18)
            throw new IndexOutOfBoundsException();
        this.age = age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        person p = new person("raj",22);
        /*
        //this line throw a exception
        person p1 = new person("ram",17);
         */
        System.out.println("Emp name : " + p.getName() + " Emp age : " + p.getAge());
    }
}
