import java.io.*;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.List;
class Mycode
{
   private static List<employee1> l12=new ArrayList<employee1>();
        static{
            l12.add(new employee1("Arun", 7, 30000));
            l12.add(new employee1("Aruna",37,24000));
            l12.add(new employee1("Tharun",29,50000));
        }
          static  BiConsumer<String,Integer> income=(id,salary)->System.out.println(id+"'s salary is "+salary);
        
           static void getdetails()
          {
              BiConsumer<Integer,Integer> id=(empid,salary)->System.out.println(empid +" "+salary);
              l12.forEach(per ->{ id.accept(per.getEmpid(),per.getSalary());
            });
          }
    public static void main(String[] args)
    {
        BiConsumer<Integer,Integer> c1=(x,y) ->System.out.println(x+y);
        Consumer<Integer> c3=(x)->System.out.println(x+3);
        c3.accept(2);
        c1.accept(3,4);
        List<Integer> l1=Arrays.asList(1,2,4);
        List<Integer> l2=Arrays.asList(3,5,7);
        BiConsumer<List<Integer>,List<Integer>> c2=(list1,list2)->{
            if(list1.size()==list2.size())
            System.out.println("True");
            else
            System.out.println("False");
        };
        c2.accept(l1,l2);
        getdetails();
         
          
         l12.forEach( per -> {
             income.accept(per.getName(),per.getSalary());
            }
            );
        }
}