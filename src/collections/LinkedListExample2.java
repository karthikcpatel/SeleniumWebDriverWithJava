package collections;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListExample2 {
    public static void main(String args[]){
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Kartik");
        ll.add("Neetha");
        ll.add("Asha");
        ll.add("Vaishnavi");

        ll.remove(1);
        System.out.println("After the Index Removal " + ll);

        ll.remove("Kartik");
        System.out.println("After the Index Removal " + ll);

        }
    }
//}