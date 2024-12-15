public class single {
    // Single inheritance has only a single subclass
    public int height;

    public single(int height) {
        this.height = height;
    }

    public void bump(int height) {
        System.out.println("The height of the bump is " + height);
    }
}

class Mingle extends single {
    public int width;

    public Mingle(int width, int height) {
        super(height);
        this.width = width;  // Correctly initializing the instance variable
    }

    public void total() {
        System.out.println("The height of the bump is " + this.height + "\n" + "The width of the bump is " + this.width);
    }
}

