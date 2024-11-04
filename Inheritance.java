package oops;

class parent{
    String name;
    int age;

    public parent(String name, int age) {
        this.name = name;
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
        this.age = age;
    }
}
class child extends parent{
    int id;
    public child(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        child c = new child("raj",22,12);
        System.out.println(c.getAge() + " " + c.getAge() + " " + c.id);
    }
}
