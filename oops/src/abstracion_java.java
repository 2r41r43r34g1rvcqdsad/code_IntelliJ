
abstract class shape{
    String color;
    //these are the abstract methods
    abstract double  area();
    public abstract String toString();

    //abstract class can have the constructor
    public shape(String color){
        System.out.println("Shape constructor called ");
        this.color=color;
    }
    // this is the concrete method
    public String getColor(){return color;}

}
class circle extends shape{
    double radius;
    public circle(String color, double radius){
        //calling the shape constructor
        super(color);
        System.out.println("Calling the circle constructor ");
        this.radius=radius;
    }
    @Override double area(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override public String toString(){
        return " the color of circle is "+super.getColor() +
                " the area of the circle is "+area();
    }


        }


class rectangle extends shape{
    double length;
    double width;
    public rectangle(String color, double length, double width){
        // calling the constructor
        super(color);
        // calling the rectangle constructor
        this.length=length;
        this.width=width;

    }
    @Override double area(){
        return length*width;
    }
    @Override public String toString(){
        return "The color of the circle is : "+ super.getColor()+
                " \nThe area of the circle is : "+ area();


    }
}
        public class abstracion_java {
            public static void main(String[] args) {
                circle s1 = new circle("red", 4.3);
                System.out.println(s1.toString());
                shape s2 = new rectangle("Yellow",3.0, 4.0);
                System.out.println(s2.toString());




            }
}
