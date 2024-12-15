public class linearSeacrche1Darray {
    public static void main(String[] args) {
        int [] arr= {23,45,1,2,5,9,6};
        int val=45;
        System.out.println( "Search Integer "+ linearSearch(arr,val));
        String str = "kapil";
        char t = 'a';

        System.out.println("Search string Boolean = "+ linearSearchStrings(str,t));
        System.out.println("Search string = "+ linearSearchStringsChar(str,t));

    }
    static int linearSearch(int arr [], int val){
        if (arr.length==0){
            return -1;
        }
        // run for loop
        for(int i =0;i<arr.length;i++ ){
            if(arr[i]==val){
                return i;
            }

        }
        return -1;

    }
    static boolean linearSearchStrings(String str, char t){
        if(str.length()==0){
            return false;
        }
        for(int i=0; i<str.length();i++) {
            if (str.charAt(i) == t) {
                return true;
            }
        }
        return false;

    }
    static String linearSearchStringsChar(String str, char t){
        if(str.length()==0){
            return null;
        }
        for(int i=0; i<str.length();i++) {
            if (str.charAt(i) == t) {
                return String.valueOf(str.charAt(i)); // Convert char to String
            }

        }
        return "Not found ";

    }
}