import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {
    public static void main(String args[]){
        HashSet<String> color=new HashSet<>();
        HashSet<String> color1=new HashSet<>();
        HashSet<String> color2=new HashSet<>();
        color.add("Blue");
        color.add("Black");
        color.add("Yellow");
        color.add("Green");
        color.add("Orange");


        color2.add("purple");
        color2.add("indigo");
        color2.add("red");
        color2.add("orange");
        color2.add("Green");
        System.out.println("Hash Set ");
        System.out.println(color);
        System.out.println("Union");
        color.addAll(color2);
        System.out.println(color);
        System.out.println("Intersection ");
        color.retainAll(color2);
        System.out.println(color);
        System.out.println("Subset ");
        color.containsAll(color1);
        System.out.println(color);

        Iterator<String> iter=color.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next());
        }
        Iterator<String> iter1=color2.iterator();
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }

    }
}
