class switchCase {
    public static void main(String[] args) {
       String day = "Satuday";

       switch (day){
           case "Monday":
               System.out.println("this is not sunday");

           case "Tuesday":
               System.out.println("this is tuesday");

           case "Friday":
               System.out.println("bruh! this is friday");

           case "Satuday":
               System.out.println("This is the day of struggle");
               break;

           default:
               System.out.println("default");
       }
    }
}