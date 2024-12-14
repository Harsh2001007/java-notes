package oops.practice;

import com.sun.tools.javac.Main;

class MainOop{

    int carModelNum;
    String carModelName;
    String carColor;
    int carTopSpeed;


    // non parameterised constructor
    public MainOop(){
        System.out.println("Introducing you the car oop model !!!!");
    }

    // parameteized constructor

    public MainOop(int i, String s){
        System.out.println("The demo contains info pdf of " + i + " pages with file name " + s);
    }


    public void getTopSpeed(){
        System.out.println("The top speed of " + carModelName + " is " + carTopSpeed);
    }

    public void getCarColor(){
        System.out.println("The color of " + carModelName + " is " + carColor);
    }
}

