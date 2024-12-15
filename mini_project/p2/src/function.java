public class function {
    int Milage;
    int fuel;


    int distance;
    int speed;


    public void carMilage(int distance, int speed){
        this.speed=speed;
        this.distance =distance;
        int milage = distance/speed;
        if(distance>100){
            System.out.println("Your car mialge is " +milage+ " so please fill the fuel");
        } else if (distance<100) {
            System.out.println("Your car milage is " +milage+ "please continue you journey");

        }



    }
}
