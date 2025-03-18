import java.util.ArrayList;
import java.util.List;

public class learnList {

    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
//        List <Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.contains(20)); // check wheter the element is their or not
//        System.out.println(list.remove(1));  // remove the index value
//        System.out.println(list);
//        list.addAll(list1);      // addes one list to another
//        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.set(1,200));
        System.out.println(list);
        list.add(2,60);
        System.out.println(list);





    }
}
