import java.util.HashMap;
import java.util.Map;
/**
 * mapp
 */
public class mapp implements Escape {

    public static void main(String[] args) {
        Map <String ,Integer> students = new HashMap<>();
       

    students.put("mayur", 69);
    students.put("ayush", 46);
    students.put("sarthak", 37);

    System.out.println(students.keySet());
     System.out.println(students);

     for(String key : students.keySet()){
        System.out.println(key + " : " + students.get(key));
     }
    }
}