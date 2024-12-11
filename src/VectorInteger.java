import java.util.Iterator;
import java.util.Vector;

public class VectorInteger {
    public static void main(String args[]) {
        Vector<Integer> number = new Vector<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        System.out.println(number);
        //clone a vector
        System.out.println("Clone");
        Vector<Integer> number1=new Vector<>();
        number1.addAll(number);
        System.out.println("New Vector : "+number1);
        //add at specified index
        System.out.println("add at specified index");
        number.add(2,10);
        System.out.println(number);
        //replace an item at specified index
        System.out.println("Replace");
        number.set(2,35);
        System.out.println(number);
        //remove specified item
        System.out.println("Remove an item");
        number.remove(1);
        System.out.println(number);
        //Contains specified item
        System.out.println("Contains an 2");
        System.out.println(number.contains(2));
        //to array
        Integer [] array=new Integer[number.size()];
        number.toArray(array);
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]+" ");
        }
        //get an element
        System.out.println("Get an element");
        number.get(4);
        //is empty
        System.out.println("Empty or not");
        System.out.println(number.isEmpty());
        //get first element
        System.out.println("get first element");
        System.out.println(number.firstElement());
        //get last element
        System.out.println("get last element");
        System.out.println(number.lastElement());
        //iterate elements
        System.out.println("Iterate elements");
        Iterator<Integer> iter=number.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }







    }
}
