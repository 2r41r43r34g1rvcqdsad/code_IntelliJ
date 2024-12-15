public class Main {
    public static void main(String[] args) {
        String name = "kapil_123";
        String id = "I am so on";
        int password= 1212121;
        discription d = new discription(name,id,password);
        System.out.println("Here is the information of the user: "+"\n"+d.getUser_name()+"\n" +d.getUsre_id()+"\n"+d.getPassword());


    }
}