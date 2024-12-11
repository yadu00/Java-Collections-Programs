import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListFruits {
    public static void main(String args[]){
        LinkedList<String> fruits=new LinkedList<>();

        //add fruits
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Watermelon");

        //Iterator
        Iterator <String> iter=fruits.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        //addfirst
        System.out.println("Add Element to First Position");
        fruits.addFirst("Mango");
        System.out.println(fruits);
        //getLast
        System.out.println("Get Element at Last Position");
        System.out.println(fruits.getLast());

        //update 4th node
        System.out.println("Update Element at 4th Position");
        fruits.set(4,"Pineapple");
        System.out.println(fruits);

        //iterate reverse order
        int n=fruits.size();
        System.out.println("Reverse Order");
        for (int i=n-1;i>=0;i--){
            System.out.println(fruits.get(i));
        }
        //addfirst
        System.out.println("Add Element to First Position");
        fruits.addFirst("Kiwi");
        //addlast
        System.out.println("Add Element to Last Position");
        fruits.addLast("Avacado");
        System.out.println(fruits);
        //addfirst
        System.out.println("Add Element to First Position");
        fruits.addFirst("Strawberry");
        //add at end
        fruits.offer("Pappaya");
        System.out.println(fruits);
        //display elemnts and positions
        for (int i=0;i<=n-1;i++){
            System.out.println("Index : "+i+" "+fruits.get(i));
        }

        //remove first and remove last
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println(fruits);

        //copy linked list
        LinkedList<String> fruits2 = new LinkedList<>();
        fruits2.addAll(fruits);
        System.out.println("New Linked List : "+fruits2);
    }
}
