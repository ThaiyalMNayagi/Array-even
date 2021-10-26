import java.io.*;
import java.util.*;
import java.util.stream.*;

 class foodie
 {
     public static void main(String[] args)
     {
         System.out.println("sort based on name");
         Collections.sort(li1,Comparator.comparing((food Name) ->Name.getName()));
         li1.stream().forEach(System.out::println);
         System.out.println("sort based on price");
         Collections.sort(li1,Comparator.comparing((food Price) -> Price.getPrice()));
         li1.stream().forEach(price ->System.out.println(price));
     }
     static List li1=new ArrayList<>();
     private static List li=new ArrayList<>();
     static{
         li.add(new food("Noodles",205,"Chinese"));
         li.add(new food("Idly",175,"Indian"));
         li.add(new food("Enchiladas",200,"Italian"));
         li1.addAll(li);
         
     }
     private static List li2=new ArrayList<>();
     static{
         li2.add(new food("Fried rice",300,"Chinese"));
         li2.add(new food("Dosa",75,"Indian"));
         li2.add(new food("Ravioli",150,"Italian"));
          li1.addAll(li2);
         System.out.println(li1);
     }
 }

    
