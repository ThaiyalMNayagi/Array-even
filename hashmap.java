import java.io.*;
import java.util.*;
class Mycode
{
    public static void main(String[] args)
    {
        HashMap hm = new HashMap();
        hm.put(1,"Ann,Recliner,₹22000");
        hm.put(2,"Alan,Table,₹25000");
        hm.put(3,"Arun,Sofa,₹65000");
        Set s= hm.entrySet();
        Iterator i =s.iterator();
        while(i.hasNext())
        {
            Map.Entry m = (Map.Entry)i.next();
            System.out.println(m.getKey()+" : ");
            System.out.println(m.getValue()) ;
        }

    }
}