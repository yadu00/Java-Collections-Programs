import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProgram {
    public static void main(String args[]){
        Set<String> color=new HashSet<>();
        color.add("Blue");
        color.add("Black");
        color.add("Yellow");
        color.add("Green");
        color.add("Orange");
        System.out.println("Set ");
        System.out.println(color);

        System.out.println("New Set ");

        Set<String> color1=new HashSet<>();
        color1.addAll(color);
        System.out.println(color1);
        System.out.println("Iterator ");

        Iterator<String> iter=color.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("Remove ");

        iter.remove();
        color.removeAll(color);
        System.out.println(color);


    }
}
