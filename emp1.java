import java.io.*;
import java.util.*;
public class emp1 {
      private long id;
      private String firstname;
      private String lastname;
      private String address;
     private int age;
      private long salary;
      private List skills;
      emp1(long id,String firstname,String lastname,String address,int age,long salary,List skills)
      {
          super();
          this.id=id;
          this.firstname=firstname;
          this.lastname=lastname;
          this.address=address;
          this.age=age;
          this.salary=salary;
          this.skills=skills;
          }
     
      public long getId()
      {
          return id;
      }
      public void setId(long id)
      {
          this.id=id;
      }
     
      public String getFirstname()
      {
          return firstname;
      }
      public void setFirstname(String firstname)
      {
          this.firstname=firstname;
      }
      public String getLastname()
      {
          return lastname;
      }
      public void setLastname(String lastname)
      {
          this.lastname=lastname;
      }
      public String getAddress()
      {
          return address;
      }
      public void setAddress(String address)
      {
          this.address=address;
      }
      public int getAge()
      {
          return age;
      }
      public void setAge(int age)
      {
          this.age=age;
      }
      public long getSalary()
      {
          return salary;
      }
      public void setSalary(long salary)
      {
          this.salary=salary;
      }
      public List getSkills()
      {
          return skills;
      }
      
      public void setSkills (List skills) 
      {
          this.skills=skills;
      }
     
}
