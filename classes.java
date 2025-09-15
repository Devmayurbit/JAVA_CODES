public class classes {
    public static void main(String[] args) {
        pen ob = new pen();
        ob.setclr("blue");
        System.out.println("the color is " + ob.color);
        ob.setprice(69);
        System.out.println("the price is " +ob.price);
    }
}
class pen{
    int price;
    String color;

    void setclr(String color){
        this.color = color;
    }

    void setprice(int price){
        this.price= price;
    }
}
