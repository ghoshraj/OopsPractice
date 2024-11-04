package oops;

// Parent class
class Person {
    String name;
    int age;
    // Constructor for the Person class
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called. Name: " + name + ", Age: " + age);
    }
    // Method in the parent class
    void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
// Subclass
class Employee extends Person {
    String company;
    double salary;

    // Constructor for the Employee class
    Employee(String name, int age, String company, double salary) {
        super(name, age); // Calls the constructor of the parent class
        this.company = company;
        this.salary = salary;
        System.out.println("Employee constructor called. Company: " + company + ", Salary: " + salary);
    }
    // Method in the Employee class
    @Override
    void showDetails() {
        super.showDetails(); // Calls the showDetails method from the Person class
        System.out.println("Company: " + company + ", Salary: " + salary);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 30, "TechCorp", 75000);
        emp.showDetails();
    }
}
