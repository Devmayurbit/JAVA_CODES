/**
 * arr_of_obj
 */

 class Student{
   int marks;
   String name;
   int rollno;
 }

public class arr_of_obj {
public static void main(String[] args) {
    Student s1 = new Student();
    s1.marks = 69;
    s1.name  = "mayur";
    s1.rollno= 1;

    Student s2 = new Student();
    s2.marks  = 78;
    s2.name   = "yash";
    s2.rollno = 2;

    Student s3 = new Student();
    s3.marks = 39;
    s3.name ="keshav";
    s3.rollno = 3;

   Student students[]= new Student[3];

    students[0] = s1;
  
    students[1] = s2;   

    students[2] = s3;


//we can also use for each loop or enhanced for loop

 for(Student stud : students)
 {
    System.out.println(stud.rollno+ "." +stud.name + " : " + stud.marks);
 }

    // for( int i = 0 ; i<students.length ; i++)
    // {
    //     System.out.println(students[i].name +  " : " + students[i].marks );
    // }


}
    
}