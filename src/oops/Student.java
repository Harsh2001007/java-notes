package oops;

class Student {

    // student data is here

    int studentID;
    String studentName;
    String studentCity;

    public Student(){
        System.out.println("this is non-parameterised constructor");
    }

    public Student(int valOne){
        System.out.println("this is a parameterized constructor");
    }

    public Student(String strValOne){
        System.out.println("this is parameterized but holding string value");
    }



    // Behaviour or methods


    public void study(){
        System.out.println(studentName + " is studying");
    }

    public void showFullDetail(){
        System.out.println("My name is " + studentName);
        System.out.println("My student id is " + studentID);
        System.out.println("My city name is " + studentCity);
    }
}