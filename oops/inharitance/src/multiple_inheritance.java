// Multiple inheritance is a concept where a class can inherit features (methods and properties)
// from more than one parent class.
// Java does not support multiple inheritance directly through classes due to the ambiguity and
// complexity it can introduce, such as the diamond problem.
// Instead, Java achieves multiple inheritance through interfaces.

interface animal {
    void eat();
}

// Second interface
interface Pet {
    void play();
}

// Class implementing multiple interfaces
class Dog implements animal, Pet {
    @Override
    public void eat() {
        System.out.println("The dog eats dog food");
    }

    @Override
    public void play() {
        System.out.println("The dog plays with a ball");
    }
}




public class multiple_inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Create an object of Dog

        // Calling methods from both interfaces
        myDog.eat();   // Method from Animal interface
        myDog.play();  // Method from Pet interface
    }

}
