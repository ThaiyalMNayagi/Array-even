import java.io.*;
import java.util.*;
import java.util.function.Consumer;
public class doc2 {
    
    private static List<doc1>  li=new ArrayList<doc1>();
    static{
        li.add(new doc1("Naren Karthikeyan",25,"Kind",Arrays.asList("Payslip=55000","PAN = ABCTP3424O","AADHAR=129066781025")));
        li.add(new doc1("Ashwin Sundar",23,"Hot headed",Arrays.asList("Payslip=56000","PAN = ERTOU7896K","AADHAR=904548561736")));
        li.add(new doc1("Akhil Rabindra",29,"Kind",Arrays.asList("Payslip=58000","PAN = YTHRF3924L","AADHAR=167810252906")));
        li.add(new doc1("Tarun Reddy",20,"Kind",Arrays.asList("Payslip=84000","PAN = HUJMK3976M","AADHAR=252167810906")));
    }
    private static List<doc1> li2=new ArrayList<doc1>();
     static Consumer<doc1> c1= per ->
    {
        if(per.getCharecter().contains("Kind") && per.getAge()>=24)
        {
            System.out.println(per.getName());
            li2.add(per);
        }

    };
    public static void main(String[] args)
    {
       

        li.forEach(c1);
        Map <String,List> m=new HashMap<String,List>();
        for(doc1 d:li2)
        {
            m.put(d.getName()+" "+d.getCharecter(),d.getDoc());
            
        }
        System.out.println(m);
        
    }
    
}
