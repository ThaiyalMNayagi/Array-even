 import java.io.*;
 import java.util.*;
 public class doc1 {
     private String name;
     private int age;
     private String charecter;
     private List doc;
     doc1(String name,int age,String charecter,List doc)
     {
         super();
         this.name=name;
         this.age=age;
        this.charecter=charecter;
         this.doc=doc;
     }
     public String getName()
     {
         return name;
     }
     public void setName(String name)
     {
         this.name=name;
     }
     public int getAge()
     {
         return age;
     }
     public void setAge(int age)
     {
         this.age=age;
     }
    
     public String getCharecter()
     {
         return charecter;
     }
     public void setCharecter(String charecter)
     {
         this.charecter=charecter;
     }
     public List getDoc()
     {
         return doc;
     }
     public void setDoc(List doc)
     {
         this.doc=doc;
     }
    
}
