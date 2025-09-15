interface a{
    int a=19;
    String  area= "mayur sonwane ji";
public void print();
}

interface b {
    public void print()
    {
        System.out.println("mayur");
    }
}

class c implements a,b{
    public  void print(){
        System.out.println("der");
    }
}

public class inheritanceee {
    public static void main(String[] args) {
       c myobj = new c();
    myobj.print();
       System.out.println("name = " + a.area + " age = " + a.a);
    }
}
