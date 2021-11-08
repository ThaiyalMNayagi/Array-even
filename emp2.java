
import java.io.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
public class emp2 {
    private static List<emp1> li=new ArrayList<emp1>();
    static{
        li.add(new emp1(1,"Shivaji","Rao","Chennai TamilNadu",78,24000,Arrays.asList("Java","C")));
         li.add(new emp1(2,"Puneeth","Raj","Bangalore Karnataka",46,40000,Arrays.asList("Java","Python")));
         li.add(new emp1(3,"Nivin","Pauli","Kochin Kerala",35,34000,Arrays.asList(".Net","Javascript")));
        li.add(new emp1(4,"Allu","Arjun","Hyderabad AndraPradesh",32,65000,Arrays.asList("Angular","React")));
        li.add(new emp1(5,"KL","Rahul","Bangalore Karnataka",26,24000,Arrays.asList("C++","Java")));
    }
   
   
     
   static Consumer<emp1> c1=per -> {
       if(per.getSkills().contains("Java"))
      { System.out.println(per.getFirstname()+per.getLastname());
         System.out.println("Employee Id: "+per.getId());
        System.out.println("Address:"+per.getAddress());
        System.out.println("Age:"+per.getAge()+"\t"+"Salary: "+per.getSalary());
    System.out.println("***************************************");}
   };
    public static void main(String[] args)
    {
       li.forEach(c1);
     Map<Long,String>  map=new HashMap<Long,String>();
     for(emp1 e:li)
     {
         map.put(e.getId(),e.getFirstname()+e.getLastname());
     }
      System.out.println(map);
      
    }
    
}

    