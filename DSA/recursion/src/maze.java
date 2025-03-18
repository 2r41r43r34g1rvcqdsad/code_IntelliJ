import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        // number of ways to go from Point a to poing b
        //System.out.println(count(3,3));
        //path("", 3,3);
        //System.out.println(pathArr("",3,3));
        System.out.println(pathArrDigonal("", 3,3));



    }
    // number of ways to go from Point a to poing b
    static int count(int r, int c){
        if(r==1 || c == 1){
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r,c-1);

        return left + right;
    }

    // Path to go from one point o another
    static void path(String p, int r, int c){
        if(r ==1 && c == 1) {
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);

        }
        if(c>1){
            path(p+'R', r, c-1);
        }

    }

    // using the array list path to reach till a point
    static ArrayList<String> pathArr(String p, int r, int c){
        if(r ==1 && c == 1) {
            ArrayList<String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathArr(p+'D',r-1,c));

        }
        if(c>1){
           list.addAll( pathArr(p+'R', r, c-1));
        }
        return list;

    }

    // We will also include the digonal path
    static ArrayList<String> pathArrDigonal(String p, int r, int c){
        if(r ==1 && c == 1) {
            ArrayList<String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1 && c>1){
            list.addAll(pathArrDigonal(p+'D',r-1,c));}
        if(r>1){
            list.addAll(pathArrDigonal(p+'V',r-1,c));

        }
        if(c>1){
            list.addAll( pathArrDigonal(p+'H', r, c-1));
        }
        return list;

    }




}
