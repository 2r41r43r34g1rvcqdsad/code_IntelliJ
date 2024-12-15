public class dice {
    int roll(){
        double rendom = Math.random()*6;
        return (int)Math.ceil(rendom);
    }

    public static void main(String[] args) {
        dice d = new dice();
        for(int i=0; i<10;i++){
            System.out.println(d.roll());
        }
    }
}
