public class bycicle {
    // Inheritance is a fundamental concept in Object-Oriented Programming (OOP) and
    // allows one class in Java to inherit the features (fields and methods) of another class
    // method overriding acchived through only inharitance
    //It is one of the ways Java achieves runtime polymorphism, allowing a subclass to provide
    // a specific implementation of a method already defined in its superclass.
    //Inheritance supports the concept of abstraction, where not all details need to be provided.
    public int gear;
    public int speed;

    // it can have the constructor
    public bycicle(int gear, int speed){
        this.gear=gear;
        this.speed=speed;


    }
    // the bycicle class the three methods, speedup, break and pint the inforemation
    public void speedUp(int increment){
        speed += increment;

    }
    public void speedDown(int decrement){
        speed -= decrement;
    }

    // using toSttring method to pring the informaion of the bycicle class.



    public String toString() {
        return ("No of the gear" + gear+"\n"+"speed of teh bicycle is "+ speed);}
}

class MountainBike extends bycicle{
    public int starthight;

    // the mountain bike sublclass has one constructor
    public MountainBike(int gear, int speed ,int starthight){
        // invoking the constructor of the super class
        super (gear,speed);
        starthight=starthight;

    }
    public void SeatHight(int starthight){
        starthight=starthight;

    }
    @Override public String toString(){
        return (super.toString()+"\nseat high is"+starthight);
    }
}
