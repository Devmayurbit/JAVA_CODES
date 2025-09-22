import java.util.*;
public class hashtable{
    public static void main(String[] args) {
    Hashtable<Object, Object> ht = new Hashtable<>();
        ht.put("name", "Alice");
        ht.put("age", "30");
        ht.put(1,"A");
        ht.put(2,"B");
        String s = (String)ht.get(1);
        Enumeration e = ht.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println(ht.get("name")); // Output: Alice
        System.out.println(ht.get("age"));  // Output: 30
        System.out.println(ht.get(1));      // Output: A
    }
}