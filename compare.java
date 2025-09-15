import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
        public String toString() {
            return "Student [age=" + age + ", name=" + name + "]";
        
    }
}


public class compare {
    public static void main(String[] args) {

        Comparator<Student> com = (i, j)-> i.age >j.age?1:-1;
            
        

        List<Student> studs= new ArrayList<>();

        studs.add(new Student(21,"matur"));
        studs.add(new Student(45,"maturttr"));

        Collections.sort(studs ,com);
        for(Student s : studs)
        System.out.println(s);        
        // Comparator<Integer> com = new Comparator<Integer>() {

            // public int compare(Integer i , Integer j){
            //     if(i%10 > j%10)
            //     return 1;
            //     return -1;
            // }
        // };

        

        // List<Integer> num = new ArrayList<>();
        // num.add(23);
        // num.add(67);
        // num.add(13);

        // Collections.sort(num,com);
        // System.out.println(num);
    }
}
