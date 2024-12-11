import com.sun.jdi.Value;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueFruits {
    public static void main(String args[]) {
        Queue<String> fruits = new LinkedList<>();
        //add fruits
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Watermelon");
        System.out.println(fruits);
        //remove an item
        System.out.println("remove an item");
        fruits.remove("Grape");
        System.out.println(fruits);
        //print using foreach
        System.out.println("print using foreach");
        Iterator<String> iter=fruits.iterator();
        while (iter.hasNext()){
            iter.forEachRemaining((value)->
            System.out.print(value+","));
        }

        //size of queue
        System.out.println("size of queue");
        System.out.println(fruits.size());
        //empty or not
        System.out.println("empty or not");
        System.out.println(fruits.isEmpty());
        //iterate using iterator method
        System.out.println("iterate using iterator method");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        //remove all
        System.out.println("remove all");
        fruits.removeAll(fruits);
        //add elements using add and offer methods
        System.out.println("add elements using add and offer methods");
        //add fruits
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.offer("Grape");
        fruits.offer("Watermelon");

        //retrieve and remove from head of queue
        System.out.println("retrieve and remove from head of queue");
        System.out.println(fruits.poll());
        //retrieve from head of queue
        System.out.println("retrieve from head of queue");
        System.out.println(fruits.peek());

        System.out.println(fruits);
    }
}
