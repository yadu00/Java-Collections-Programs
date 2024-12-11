import com.sun.source.tree.Tree;
import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeProgram {
    public static void main(String args[]){
        TreeSet<String> color=new TreeSet<>();
        TreeSet<String> color2=new TreeSet<>();
        TreeSet<Integer> number=new TreeSet<>();
        color.add("Blue");
        color.add("Black");
        color.add("Yellow");
        color.add("Green");
        color.add("Orange");
        System.out.println("Color :"+ color);
        color2.addAll(color);
        System.out.println("Color 2 :"+color2);

        System.out.println("Iterator ");

        Iterator<String> iter=color.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        number.add(1);
        number.add(5);
        number.add(7);
        number.add(4);
        number.add(6);
        color.remove("Green");
        System.out.println(color);
        System.out.println(number);


        System.out.println("First: "+number.first());
        System.out.println("Last: "+number.last());
        System.out.println("Higher: "+number.higher(5));
        System.out.println("Lower: "+number.lower(4));
        System.out.println("Ceiling: "+number.ceiling(3));





    }
}
