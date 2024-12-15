package example;

public class mainClass {
    public static void main(String[] args) {
        // Now create the objexts of the calss Student
        // new keywoed allocates the memory in dynemic memory.
        Student s1 = new Student();
        Student s2 = new Student();
        s1.studentName= "Ram";
        s1.student = 3233;
        s1.studentCity= "New delhi";
        s2.studentName= "Shayam";
        s2.student = 2322134;
        s2.studentCity= "benglore";
        s1.work();
        s1.data();
        s2.work();
        s2.data();


    }

}
