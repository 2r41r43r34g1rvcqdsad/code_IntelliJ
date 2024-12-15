// Hierarchical inheritance is a type of inheritance in Java where multiple classes inherit from a single parent class
class Animal{
    void ability()
    {
        System.out.println("This animal eats the food.");
    }}
class cat extends Animal{
    void sound(){
        System.out.println("This cat maows");
    }
}
class dog extends Animal{
    void sound(){
        System.out.println("This sound barks");
    }
}




public class hierraical_inharitance {

    public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();

        // class dog can call his parent calss animal
        d.ability(); // calls parent calls method
        d.sound(); // calls the local class

        c.ability();
        c.sound();

    }
}
