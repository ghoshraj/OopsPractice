package oops;

class student{
    String name;
    int age;

    //copy constructor
    student (student s1){
        this.name = s1.getName();
        this.age = s1.getAge();
    }
    public student() {
    }

    public student(String name) {
        this.name = name;
    }

    public student(int age) {
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
public class CopyConstructor {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setAge(13);
        s1.setName("raj");
        student s2 = new student(s1);
        System.out.println(s2.getName() + " " + s2.getAge());
    }
}
