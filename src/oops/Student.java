package oops;

class Student {

    // student data is here

    int studentID;
    String studentName;
    String studentCity;

    public Student(){
        System.out.println("Hi i will run as soon as someone crete object of this class");
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