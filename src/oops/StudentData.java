package oops;

class StudentData{
    public static void main(String[] args) {


        // creating objects of Student

        Student st1;
        Student st2;

        st1 = new Student();
        st2 = new Student();

        st1.studentName = "harsh sachan";
        st1.studentID = 7;
        st1.studentCity = "Noida";

        st2.studentName = "Priyal sharma";
        st2.studentID = 8;
        st2.studentCity = "Noida";


        st1.showFullDetail();
        st1.study();


        st2.showFullDetail();
        st2.study();

    }
}