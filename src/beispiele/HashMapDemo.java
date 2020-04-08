package beispiele;

import java.util.*;

public class HashMapDemo {
 
  public static void main(String[] args) {
 
    HashMap<String, Double> hm = new HashMap<String, Double>();
    hm.put("Rohit", new Double(3434.34));
    hm.put("Mohit", new Double(123.22));
    hm.put("Ashish", new Double(1200.34));
    hm.put("Khariwal", new Double(99.34));
    hm.put("Pankaj", new Double(-19.34));
 
    for( String name: hm.keySet() )
    {
       System.out.println(name + ": "+ hm.get(name));    
    }
 
    // Rohit's um 1000 erhoehen
    double balance = ((Double)hm.get("Rohit")).doubleValue();
    hm.put("Rohit", new Double(balance + 1000));
 
    System.out.println("Rohits neuer Kontostand : " + hm.get("Rohit"));
  }
}