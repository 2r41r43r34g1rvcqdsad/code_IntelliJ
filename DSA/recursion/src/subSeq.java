public class subSeq {
    public static void Subseq(String p, String s){
        if( s.isEmpty() ){
            System.out.println(p);
            return;
        }

        char ch = s.charAt(0);
        Subseq(p, s.substring(1));
        Subseq(p+ch,s.substring(1));
    }

    public static void main(String[] args) {
        Subseq("","abc");
    }
}
