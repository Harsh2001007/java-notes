package oops;

class Student {

    // student data is here

    int studentID;
    String studentName;
    String studentCity;



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