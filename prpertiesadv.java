import java.util.*;
import java.io.*;

public class prpertiesadv {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("name", "Mayur");
        p.setProperty("age", "21");
        p.setProperty("Brand", "Dell");
        p.setProperty("Color", "Black");
        p.setProperty("Model", "Inspiron 15");
        p.setProperty("Price", "50000");
        p.setProperty("Processor", "Intel i5");
        p.setProperty("RAM", "8GB");
        p.setProperty("Storage", "512GB SSD");
        p.setProperty("Graphics", "NVIDIA GTX 1650");
        p.setProperty("Operating System", "Windows 10");
        p.setProperty("Warranty", "1 Year");
        p.setProperty("Weight", "2.5kg");
        p.setProperty("Battery", "6 hours");
        p.setProperty("Display", "15.6 inch FHD");  
        p.setProperty("Keyboard", "Backlit");
        p.setProperty("Ports", "USB-C, HDMI, Audio Jack");  
        p.setProperty("Webcam", "720p HD");
        p.setProperty("Audio", "Stereo Speakers");
        p.setProperty("Connectivity", "Wi-Fi 6, Bluetooth 5.0");

        // try {
        //     FileOutputStream fos = new FileOutputStream("C:/Users/Dell/Downloads/JAVA/javaadvance.xml");
        //     p.storeToXML(fos, "Laptop");
        //     fos.close();
        //     System.out.println("Properties saved successfully!");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        p.load(new FileOutputStream("C:/Users/Dell/Downloads/JAVA/javaadvance.txt"));
  System.out.println(p.getProperty("name"));
    
    }
}
