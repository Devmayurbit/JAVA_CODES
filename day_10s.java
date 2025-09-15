 

import java.io.*;
import java.util.*;
public class day_10s {

    public static void main(String[] args) {
    
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Map<String , Integer> cdays = new HashMap<>();
        cdays.put("jan",0);
         cdays.put("feb",31);
         cdays.put("mar",59);
         cdays.put("apr",90);
         cdays.put("may",120);
         cdays.put("jun",151);
         cdays.put("jul",181);
         cdays.put("aug",212);
         cdays.put("sep",243);
         cdays.put("oct",273);
         cdays.put("nov",304);
         cdays.put("dec",334);
        
        Scanner sc =  new Scanner(System.in);
        int T= sc.nextInt();
        sc.nextLine();
    
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            String date = sc.nextLine().trim();
            int day = Integer.parseInt(date.substring(0, 2)); 
            String month = date.substring(2).toLowerCase(); 
            int dayOfYear = cdays.get(month) + day;
            results.add(dayOfYear);
        }
        for (int result : results) {
            System.out.println(result);
        }
        sc.close();
    }
}