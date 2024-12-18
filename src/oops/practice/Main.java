package oops.practice;

class Employee {
    String name;
    int age;

    Employee(String name) {
        this.name = name; // Referring to the current object's `name`
    }

    Employee(int age) {
        this.age = age; // Referring to the current object's `name`
    }



    void introduce() {
        System.out.println("Hi, I am " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alicess");


        emp.introduce(); // Output: Hi, I am Alice
    }
}
