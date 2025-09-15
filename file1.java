import java.io.*;
public class file1 {
    public static void main(String[] args) throws Exception
    {
        
        try(FileOutputStream fos=new FileOutputStream("C:/Users/Dell/Downloads/JAVA/text.txt.txt");)
            {
        
        String str="earn Java Programming.";
        
        byte b[]=str.getBytes();
        
        
       // fos.write(str.getBytes());
        // for(byte x:b)
        //     fos.write(x);
        fos.write(b, 3, str.length()-6);
        
       // fos.write(b);
        
        fos.close();
        
        // }
        // /*catch(FileNotFoundException e)
        // {
        //     System.out.println(e);
        // }
        // catch(IOException e)
        // {
        //     System.out.println(e);
        // }
    }
}
}