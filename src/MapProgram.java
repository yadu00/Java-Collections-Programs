import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String args[]){
        Map<Integer,String> color=new HashMap<>();
        Map<Integer,String> color2=new HashMap<>();
        color.put(1,"Blue");
        color.put(2,"Black");
        color.put(3,"Yellow");
        color.put(4,"Red");
        color.put(5,"Orange");

        System.out.println(color);
        color2.putAll(color);
        System.out.println(color2);
        System.out.println("Key Set: "+color.keySet());
        System.out.println("Value Set: "+color.values());
        System.out.println("Entry Set: "+color.entrySet());
        System.out.println("Removed : "+color.remove(1));
        System.out.println(color.putIfAbsent(6,"Red"));
        
        System.out.println(color.containsValue("Yellow"));
        System.out.println(color.containsKey(5));
        color.replace(3,"Pink");

        System.out.println(color);

    }
}
