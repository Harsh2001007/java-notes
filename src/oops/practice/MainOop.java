package oops.practice;

class MainOop{

    int carModelNum;
    String carModelName;
    String carColor;
    int carTopSpeed;


    public MainOop(){
        System.out.println("Introducing you the car oop model !!!!");
    }



    public void getTopSpeed(){
        System.out.println("The top speed of " + carModelName + " is " + carTopSpeed);
    }

    public void getCarColor(){
        System.out.println("The color of " + carModelName + " is " + carColor);
    }
}

