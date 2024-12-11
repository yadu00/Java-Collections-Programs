import java.util.LinkedList;
import java.util.Stack;

public class StackFruits {
    public static void main(String args[]){
        Stack<String> fruits=new Stack<>();
        fruits.push("Apple");
        fruits.push("Banana");
        fruits.push("Orange");
        fruits.push("Grape");
        fruits.push("Mango");
        System.out.println(fruits);
        //Search an element
        System.out.println(fruits.search("Banana"));
        //Empty or not
        System.out.println(fruits.empty());
        //Size of stack
        System.out.println(fruits.size());
        //copy stack
        Stack<String> fruits2 = new Stack<>();
        fruits2.addAll(fruits);
        System.out.println("New Stack : "+fruits2);
        //add element to top
        fruits.push("Strawberry");
        //remove element
        fruits.pop();
        //get object from top of stack
        System.out.println(fruits.peek());




    }
}
