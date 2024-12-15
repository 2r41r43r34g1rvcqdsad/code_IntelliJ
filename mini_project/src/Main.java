public class Main {
    public static void main(String[] args) {
        int n = 3;
        int m = 2;
        Functions func = new Functions();
        func.calculations(n, m);
        System.out.println("Addition: " + func.getAdd());
        System.out.println("Subtraction: " + func.getSub());
        System.out.println("Multiplication: " + func.getMulti());
        System.out.println("Division: " + func.getDiv());
    }
}
