import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeueProgram {
    public static void main(String args[]) {
        Deque<String> colors = new LinkedList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        colors.add("white");
        colors.add("orange");
        colors.add("black");
        colors.add("red");
        System.out.println(colors);
        colors.offer("pink");

        System.out.println(colors.peek());
        System.out.println(colors);
        colors.addFirst("indigo");
        colors.addLast("purple");
        System.out.println(colors);


    }
}