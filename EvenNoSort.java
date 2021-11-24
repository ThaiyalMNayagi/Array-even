import java.util.*;
public class EvenNoSort {
    public static void main(String[] args){
    List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    //Java 8
     li.stream().filter(l -> l % 2 ==0).forEach(System.out::println);
     //Java 7
     for(int n : li){
         if(n % 2 == 0)
         System.out.println(n);
     }
      
     
    }
}
