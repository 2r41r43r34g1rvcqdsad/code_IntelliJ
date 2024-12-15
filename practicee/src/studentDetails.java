public class studentDetails {
    String name;
    int age;
    int roll_no;
    String father_name;
    String District;
    int classs;

    public static void main(String[] args) {
        studentDetails sru = new studentDetails("kapil", 22,53423,
                "Sri Krishna Kumar Mishra ","Umaria",12);
        System.out.println(sru);

    }




    @Override
    public String toString() {
        return "StudentDetails{"+"name= "+ name + '\''+
                ",  age =" + age +
                ",  roll_no =" + roll_no+
                ",  father_name='"+father_name+ '\''+
                ",  Districet=" + District +'\''+
                ",  classs =" + classs+ '\''+'}';
    }

    // this is constructor
    public studentDetails(String name, int age, int roll_no, String father_name, String district, int classs) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;

        this.father_name = father_name;
        this.District = district;
        this.classs = classs;

    }


}
