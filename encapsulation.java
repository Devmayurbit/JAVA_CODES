import java.nio.channels.FileChannel.MapMode;

class capsule{
    private int age;
    private String name;

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }

    public void setdata(int a , String b){
        age = a;
        name = b;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        capsule c = new capsule();
        c.setdata(21, "mayur sonwane");

        System.out.println(c.getname() + " age is : "+c.getage());
    }
}
