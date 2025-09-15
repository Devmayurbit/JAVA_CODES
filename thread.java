import java.lang.*;
class ATMSyn {
    public synchronized void useAtm(String name, int amount) {
        // Synchronized block for the complete ATM usage
        System.out.print(name + " Checking");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(" Balance");

        System.out.print(name + " Withdrawing");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(amount);
    }
}

class Customer extends Thread {
    String name;
    int amount;
    ATMSyn at;

    Customer(String name, int amount, ATMSyn at) {
        this.name = name;
        this.amount = amount;
        this.at = at;
    }

    public void run() {
        at.useAtm(name, amount); // Using the synchronized method
    }
}

public class thread {
    public static void main(String[] args) {
        ATMSyn atm = new ATMSyn();
        Customer c1 = new Customer("Smith", 1000, atm);
        Customer c2 = new Customer("John", 2000, atm);
        c1.start();
        c2.start();
    }
}