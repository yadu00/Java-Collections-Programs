import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayListProgram2 {
    public static void main(String args[]) {
        ArrayList<String> colors = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of colors");
        int n= sc.nextInt();
        sc.nextLine();

        System.out.println("Enter colors");
        for (int i=0;i<n;i++){

            colors.add(sc.nextLine());
        }
        System.out.println(colors);
        //Iterator method to iterate through list
        System.out.println("Iterator method");
        Iterator <String> iter=colors.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        //using for loop
       // for (int i=0;i<n;i++){

         //   System.out.println(colors.get(i));
       // }
        //add new position
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

        //Cloning an Arraylist
        ArrayList<String> colors1 = (ArrayList<String>) colors.clone();
        //length of an Array list
        System.out.println(colors1.size());
        int n2=colors1.size();
        System.out.println(n2);

        //sort
        colors1.sort(Comparator.naturalOrder());
        System.out.println("Sorted order : "+colors1);
        //empty or not
        System.out.println(colors1.isEmpty());
        //find index of an element

        System.out.println(colors1.indexOf("pink"));
        System.out.println(colors1.indexOf("brown"));
        //addall() to add elements from 1 to another
        ArrayList<String> colors2 = new ArrayList<>();
        colors2.addAll(colors);
        System.out.println("New Arraylist : "+colors2);

        String [] array=new String[colors.size()];
        colors.toArray(array);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }
    }
}