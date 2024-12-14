package oops.practice;

class CarUsecase{


    public static void main(String[] args) {


        MainOop carObject;
        carObject = new MainOop();

        carObject.carTopSpeed = 260;
        carObject.carModelName = "porsche 911 gt3";
        carObject.carColor = "silver";

        carObject.getCarColor();
        carObject.getTopSpeed();
    }
}