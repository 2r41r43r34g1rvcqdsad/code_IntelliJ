import java.util.Scanner;

public class circle {
    double circleradmm;
    circle (double circleradmm){
        this.circleradmm =circleradmm;
    }
    double getCircleradmm(){
        return 2*circleradmm+Math.PI;
    }
    double getArea() {
        return Math.pow(circleradmm, 2) * Math.PI;

    }

    @Override
    public String toString() {
        return "circle credentials and results,  Radius in MM ="+circleradmm+" ,Circumfrance of the circle: "
                +getCircleradmm()+"  " +
                ", Area of the circle: "+getArea()+"  ";

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to area & circumefrenc calculateor of the cirecle:");
        System.out.println("Please enter the radius of the circle");
        double radius = s.nextDouble();
        circle c = new circle(radius);
        System.out.println(c);
    }
}
