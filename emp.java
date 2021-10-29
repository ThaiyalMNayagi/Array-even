import java.io.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.List;
public  class emp {
    private static List li=new ArrayList<>();
    static{
        li.add(new employee1("Raj",6,30000));
        li.add(new employee1("Arun",3,35000));
        li.add(new employee1("Vishnu",5,20000));
        }
        static Consumer<employee1> c1=per ->{if(per.getSalary() >=30000){System.out.println(per);}};
        static Consumer<employee1> c2=per ->System.out.println(per.getName().toLowerCase());
    public static void main(String[] args)
    {
      
      li.forEach(c1);
      condition();
         }
         static void condition()
         {
              Consumer<employee1> c3=per ->{if(per.getName().equals("Raj")){System.out.println(per.getEmpid());}};
            li.forEach(c3); }
      
    
}
