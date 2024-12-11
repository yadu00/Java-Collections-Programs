import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListProgram {
    public static void main(String args[]){
        ArrayList <String> names=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        names.add("amal");
        names.add("austin");
        names.add("yadu");
        names.add("aswin");
        names.add("abhishek");
        System.out.println(names);
        //String n2=names.remove(2);
       // System.out.println(names);
        //System.out.println("removed name :" +n2 );
       // names.removeAll(names);
        //System.out.println(names);
        Iterator <String> iter=names.iterator();
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        iter.next();
        iter.remove();

        System.out.println(names);
        while (iter.hasNext()){
            iter.forEachRemaining((value)->System.out.print(value+","));
        }








    }
}
