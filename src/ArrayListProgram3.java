import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class ArrayListProgram3 {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Integers");
        int n= sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Integers");
        for (int i=0;i<n;i++){

            numbers.add(sc.nextInt());
        }
        System.out.println(numbers);
        for (int i=0;i<n;i++){

            System.out.println(numbers.get(i));
        }
        //add new position
        numbers.add(0,6);
        System.out.println(numbers);
        //get element at specific index
        int n1=numbers.get(4);
        System.out.println(n1);
        System.out.println(numbers);
        //set value of an elemnet
        numbers.set(0,3);
        System.out.println(numbers);
        //remove an element
        numbers.remove(2);
        System.out.println(numbers);

        System.out.println(numbers.contains(3));

        //Cloning an Arraylist
        ArrayList<Integer> numbers1 = (ArrayList<Integer>) numbers.clone();
        //length of an Array list
        System.out.println(numbers1.size());
        int n2=numbers1.size();
        System.out.println(n2);

        //sort
        numbers1.sort(Comparator.naturalOrder());
        System.out.println("Sorted order : "+numbers1);
        //empty or not
        System.out.println(numbers1.isEmpty());
        //find index of an element

        System.out.println(numbers1.indexOf(3));
        System.out.println(numbers1.indexOf(6));
        //addall() to add elements from 1 to another
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(numbers);
        System.out.println("New Arraylist : "+numbers2);
    }
}