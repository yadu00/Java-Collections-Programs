import java.util.Deque;
import java.util.LinkedList;

public class DequeueFruits {
    public static void main(String args[]) {
        Deque<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Watermelon");
        //add element a end of dequeue
        System.out.println(fruits);
        fruits.offer("Strawberry");
        System.out.println("add element to end of dequeue");
        System.out.println(fruits);
        //add first
        fruits.addFirst("Kiwi");
        System.out.println("add element to first position");
        System.out.println(fruits);
        //add last
        fruits.addLast("Papaya");
        System.out.println("add element to last position");
        System.out.println(fruits);
        //Accessing the first element
        System.out.println("Accessing the first element");
        System.out.println(fruits.getFirst());
        //Accessing the last element
        System.out.println("Accessing the last element");
        System.out.println(fruits.getLast());
        //Accessing the first element using peek
        System.out.println("Accessing the first element using peek() method");
        System.out.println(fruits.peek());
        //Accessing the last element using peeklast
        System.out.println("Accessing the last element using peekLast() method");
        System.out.println(fruits.peekLast());
        //remove first element
        System.out.println("remove first element");
        System.out.println(fruits.poll());
        System.out.println(fruits);
        //to array
        System.out.println("Dequeue to Array");
        String [] array=new String[fruits.size()];
        fruits.toArray(array);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }


    }
}
