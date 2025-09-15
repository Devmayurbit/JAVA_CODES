// class Mythreaad extends Thread{
//     public void run(){
//         int i = 1;
//         while(i<=10){
//             System.out.println("hello");
//             i++;
//         }
//     }
// }
class thred extends Thread{
     public void run(){
        int i = 1;
        while(i<=10){
            System.out.println("hello");
            i++;
        }
    }
    public static void main(String[] agrs){
        thred m = new thred();
        m.start();
        int i = 1;
        while(i<=10){
            System.out.println("world");
            i++;
        }
    }
}