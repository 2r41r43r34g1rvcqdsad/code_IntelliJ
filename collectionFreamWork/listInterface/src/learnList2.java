import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class learnList2 {
    public static void main(String[] args) {

        List<String> fruit = new ArrayList<>();
        fruit.add("kiwi");
        fruit.add("papaya");
        fruit.add("apple");
        fruit.add("Mango");

        for(int i=0;i<fruit.size();i++){
            System.out.println("fruit " + fruit.get(i));
        }

        for(String fal: fruit){
            System.out.println(" For each fruti:"  + fal);
        }

        Iterator<String>  f = fruit.iterator();   // it will give you the iterator
        while(f.hasNext()){
            System.out.println("Iterator " + f.next());

        }

        List<String> subList = fruit.subList(1,2); // This will give the sublist a list
        System.out.println(subList);


    }
}
