import java.io.*;
import java.util.*;
import java.util.stream.*;
class fruit2 {
    public static void main(String[] args)
    {
        System.out.println("Sorted based on name");
       Collections.sort(li3,Comparator.comparing((fruit1 Price)->Price.getName()));
       li3.stream().forEach(System.out::println);
       System.out.println("*****************************");
       System.out.println("Sorted based on price");
       Collections.sort(li3,Comparator.comparing((fruit1 Name)->Name.getPrice()));
       li3.stream().forEach(price ->System.out.println(price));
    }
    private static List li1=new ArrayList<>();
    static{
        li1.add(new fruit1("Apple",45,"Red"));
        li1.add(new fruit1("Orange",35,"Orange"));
        li1.add(new fruit1("Mango",55,"Yellow"));
    }
    private static List li2=new ArrayList<>();
    static
    {
      li2.add(new fruit1("Custard apple",65,"Green"));
      li2.add(new fruit1("Peach",25,"Peach"));
      li2.add(new fruit1("Strawberry",70,"Pink"));
    } 
    private static List li3=new ArrayList<>();
    static{
        li3.addAll(li1);
        li3.addAll(li2);
    }
}
