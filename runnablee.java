class Mythreaad implements Runnable{
    public void run(){
        int i = 1;
        while(i<=10){
            System.out.println("hello");
            i++;
        }
    }
}
class runnablee {
//implements Runnable{
//      public void run(){
//         int i = 1;
//         while(i<=10){
//             System.out.println("hello");
//             i++;
//         }
//     }
    public static void main(String[] agrs){
        Mythreaad m = new Mythreaad();
        Thread t = new Thread(m);
        t.start();
        int i = 1;
        while(i<=10){
            System.out.println("world");
            i++;
        }
    }
}