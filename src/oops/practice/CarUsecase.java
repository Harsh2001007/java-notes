package oops.practice;

class CarUsecase{


    public static void main(String[] args) {


        MainOop carObject;
        MainOop carObjectPdf;
        carObject = new MainOop();
        carObjectPdf = new MainOop(48, "GT3");


        carObject.carTopSpeed = 260;
        carObject.carModelName = "porsche 911 gt3";
        carObject.carColor = "silver";


//        carObjectPdf.carTopSpeed = 260;
//        carObjectPdf.carModelName = "porsche 911 gt3";
//        carObjectPdf.carColor = "silver";

        carObject.getCarColor();
        carObject.getTopSpeed();

        carObjectPdf.getTopSpeed();
    }
}