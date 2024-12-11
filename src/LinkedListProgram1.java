import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProgram1 {
    public static void main(String args[]){
        LinkedList <String> colors=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter no of colors");
        int n= sc.nextInt();
        sc.nextLine();

        System.out.println("Enter colors");
        for (int i=0;i<n;i++){
            colors.add(sc.nextLine());
        }*/
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        colors.add("white");
        colors.add("orange");
        colors.add("black");
        colors.add("red");
        System.out.println(colors);
        colors.set(0,"violet");
        System.out.println(colors);

        String n1=colors.get(4);
        System.out.println(n1);
        System.out.println(colors);


        String n2=colors.remove(2);
        System.out.println(colors);

        //addfirst
        colors.addFirst("Indigo");
        System.out.println(colors);
        //addlast
        colors.addLast("Indigo");
        System.out.println(colors);
        //getFirst
        System.out.println(colors.getFirst());
        //getLast
        System.out.println(colors.getLast());
        //removefirst
        colors.removeFirst();
        System.out.println(colors);

        //removelast
        colors.removeLast();
        System.out.println(colors);
        //peek
        System.out.println(colors.peek());
        System.out.println(colors);
        //poll
        System.out.println(colors.poll());
        System.out.println(colors);
        //offer
        colors.offer("pink");
        System.out.println(colors);



    }
}
