import java.util.*;

public class VectorProgram {
    public static void main(String args[]) {
        Vector<String> colors = new Vector<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        colors.add("white");
        colors.add("orange");
        colors.add("black");
        colors.add("red");
        System.out.println(colors);


        System.out.println(colors);
        colors.addFirst("indigo");
        colors.addLast("purple");
        System.out.println(colors);

        System.out.println("Iterator method");
        Iterator<String> iter=colors.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        colors.add(0,"violet");
        System.out.println(colors);
        //get element at specific index
        String n1=colors.get(4);
        System.out.println(n1);
        System.out.println(colors);
        //set value of an elemnet
        colors.set(0,"pink");
        System.out.println(colors);
        //remove an element
        colors.remove(2);
        System.out.println(colors);

        System.out.println(colors.contains("pink"));

        //sort
        colors.sort(Comparator.naturalOrder());
        System.out.println("Sorted order : "+colors);

        System.out.println(colors.contains("pink"));
    }
}