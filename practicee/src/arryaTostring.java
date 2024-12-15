public class arryaTostring {
    public static void main(String[] args) {
       String[] s = new  String[] {"I", "am", "the", " best"};
       StringBuilder sb = new StringBuilder();
       for(String str : s){
           sb.append(str).append(" ");
       }
        System.out.println(sb);

    }
}
