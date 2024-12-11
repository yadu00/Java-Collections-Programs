import java.util.Stack;
public class StackProgram {
    public static void main(String args[]){
        Stack<String> color=new Stack<>();
        color.push("Black");
        color.push("BLue");
        color.push("Yellow");
        color.push("Green");
        color.push("orange");
        color.push("Red");
        color.push("Cyan");
        color.push("White");


        System.out.println(color);
        color.pop();
        System.out.println(color);
        System.out.println(color.peek());
        System.out.println(color.search("Orange"));
        System.out.println(color.empty());



    }
}
