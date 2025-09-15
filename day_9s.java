
import java.io.*;
import java.util.*;

public class day_9s {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T-->0){
            String palindrome = sc.nextLine();
            String result =brkpalindrome(palindrome);
            System.out.println(result);}
        sc.close();
           
        }
    public static String brkpalindrome(String palindrome){
         int mid_index = palindrome.length();
        if(mid_index == 1) return "-1";
        char []chars =palindrome.toCharArray();
        
            for(int i =0 ; i<mid_index/2;i++){
                 if (chars[i] != 'a') {
                chars[i] = 'a';
                return new String(chars);
            }
            
            
    }
     chars[mid_index - 1] = 'b';
        return new String(chars);
    }
}