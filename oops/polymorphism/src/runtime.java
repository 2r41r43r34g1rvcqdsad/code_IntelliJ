 class runtime {
    // it is achieved by method overriding
    //The method to be executed is determined at runtime based on the actual object's type, not the reference type.
    // it occurs at runtime of the execution


    // here is a  basic example of tuis method
    void sound(){
        System.out.println("animal makes a sound; ");
    }
}
class dog extends runtime{
    void sound(){
        System.out.println("Dog barks");
    }


}
class cat extends runtime{
    void sound(){
        System.out.println("cat mawos"
                );
    }
         }

