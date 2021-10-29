 public class employee1 {
     private String name;
   private  int empid;
   private int salary; 
   employee1(String name,int empid,int salary)
   {
       super();
       this.name=name;
       this.empid=empid;
       this.salary=salary;
     }
     public String getName()
     {
         return name;
     }
     public void setName(String name)
     {
         this.name=name;
     }
     public int getEmpid()
     {
         return empid;
     }
     public void setEmpid(int empid)
     {
         this.empid=empid;
     }
     public int getSalary()
     {
         return salary;
     }
     public void setSalary(int salary)
     {
         this.salary=salary;
     }
     public String toString()
     {
         return name+" "+empid+" "+salary;
     }
}
