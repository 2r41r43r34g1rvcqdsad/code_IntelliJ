class A {
    // In multilevel inheritance, a class (child class) inherits from another class (parent class),
    // which itself is a subclass of another class (grandparent class)
    // The child class thus inherits from both its immediate parent class and the grandparent class.
    // This chain can extend to more levels.

    public void displayA(){
        System.out.println("This is class A");
    }

}
class B extends A{
    void displayB(){
        System.out.println("This is class B");
    }
}
class C extends B{
    void displayC(){
        System.out.println("This is class C");
    }
}
public class multi_inharitance{
    public static void main(String[] args) {
        C obj = new C();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }

}
