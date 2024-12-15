public class discription {
    private String user_name;
    private String usre_id;
    private int password;

    public discription(String user_name, String usre_id, int password){
        this.password=password;
        this.user_name=user_name;
        this.usre_id= usre_id;
    }
    // getter for thte user_name
    public String getUser_name(){
        return user_name;
    }
    // setter for the user name
    public void setUser_name(String user_name){
        this.user_name=user_name;
    }
    // getter for user id


    public String getUsre_id()
    {
        return usre_id;
    }
    // setter for user id
    public void setUsre_id(String usre_id){
        this.usre_id=usre_id;

    }
    // getter for password
    public int getPassword(){
        return password;
    }
    public void setPassword(int password){
        this.password=password;
    }
}
