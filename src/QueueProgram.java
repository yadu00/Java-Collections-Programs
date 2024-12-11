import java.util.LinkedList;
import java.util.Queue;

public class QueueProgram {
    public static void main(String args[]){
        Queue<String> colors=new LinkedList<>();
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

    }
}
