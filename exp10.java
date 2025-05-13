import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class exp10{
    public static void main(String []args){
        List<String> arraylist = new ArrayList<>();
        PerformListOfOperations(arraylist);

        System.out.println("\n-------------------------------------------------------------\n");

        List<String> linkedList = new LinkedList<>();
        PerformListOfOperations(linkedList);
    }
    public static void PerformListOfOperations(List<String> list){
            list.add("apple");
            list.add("mango");
            list.add("Pineapple");
            System.out.println("Intial list"+list);

            list.indexOf("Banana");

            System.out.println("size of list is"+list.size());

            list.remove("apple");

            System.out.println("Intial list"+list);



    }
}