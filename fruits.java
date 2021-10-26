import java.io.*;
import java.util.*;
import java.util.stream.*;

 class foodie
 {
     public static void main(String[] args)
     {
         System.out.println("sort based on name");
         Collections.sort(li,Comparator.comparing((food Name) ->Name.getName()));
         li.stream().forEach(System.out::println);
         System.out.println("sort based on price");
         Collections.sort(li,Comparator.comparing((food Price) -> Price.getPrice()));
         li.stream().forEach(System.out::println);
     }
     private static List li=new ArrayList<>();
     static{
         li.add(new food("Noodles",205,"Chinese"));
         li.add(new food("Idly",175,"Indian"));
         li.add(new food("Enchiladas",200,"Italian"));
     }
 }

    
