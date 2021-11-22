import java.util.*;
public class HashMapDemo {
    public static void main(String[] args){
        //Java7
       TreeMap<Integer, String> tm = new TreeMap<> ();
       tm.put(1, "Java");
       tm.put(2, "C++");
       tm.put(3, "Python");
       tm.put(4, ".Net");
       tm.put(5, "JSON"); 
       for(Map.Entry<Integer, String> map : tm.entrySet()){
           System.out.println(map.getKey()+"\t"+map.getValue());
       }
       //Java8
       tm.forEach((k,v)->System.out.println("Key "+ k+ " Value "+ v));
    }
    
}
