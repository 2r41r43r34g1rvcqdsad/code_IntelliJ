package example;

import java.sql.SQLOutput;

public class Student {
    // here we will writte the sudent info
    int student;
    String studentName;
    String studentCity;

    //now create a method forstuden class
    public void work(){
        System.out.println(studentName+ " is studying!");

    }
    public void data(){
        System.out.println("Student id = " + student);
        System.out.println("Student name is " + studentName);
        System.out.println("Student city name is "+ studentCity);
    }
}
