
    
import java.io.*;
import java.util.*;
 class solution
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        fruits[] f= new fruits[3];
        fruits2[] f2=new fruits2[3];
        fruits3[] f3=new fruits3[f.length+f2.length];
        int price;
        String name;
        System.out.println("Enter first Array");
        for(int i=0;i<f.length;i++)
        {
            name=s.nextLine();
            price=s.nextInt();
            s.nextLine();
            f[i]=new fruits(name,price);
        }
        System.out.println("Enter second Array");
        for(int i=0;i<f2.length;i++)
        {
            name=s.nextLine();
            price=s.nextInt();
            s.nextLine();
            f2[i]=new fruits2(name,price);
        }
        for(int i=0;i<f.length;i++)
        {
            name=f[i].getName();
             price=f[i].getprice();
              f3[i]=new fruits3(name,price);
        }
        int k=0;
        for(int i=f.length;i<f3.length;i++)
        {
            name=f2[k].getName();
            price=f2[k].getprice();
             f3[i]=new fruits3(name,price);
             k++;
        }

        
        fruits[] a =sortArr(f);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i].getprice());
        }
        fruits2[] b =sortArr2(f2);
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i].getprice());
        }
        fruits3[] c =sortArr3(f3);
        for(int i=0;i<f3.length;i++)
        {
            System.out.println(f3[i].getprice());
        }
        
    }
    public static fruits[] sortArr(fruits[] f)
        {
            for(int i=0;i<f.length;i++)
            {
                for(int j=i+1;j<f.length;j++)
                {
                    if(f[i].getprice()>f[j].getprice())
                    {
                    fruits temp=f[i];
                        f[i]=f[j];
                        f[j]=temp;
                    }
                }
            }

             return f;
         }
         public static fruits2[] sortArr2(fruits2[] f2)
        {
            for(int i=0;i<f2.length;i++)
            {
                for(int j=i+1;j<f2.length;j++)
                {
                    if(f2[i].getprice()>f2[j].getprice())
                    {
                    fruits2 temp=f2[i];
                        f2[i]=f2[j];
                        f2[j]=temp;
                    }
                }
            }

             return f2;
         }
         public static fruits3[] sortArr3(fruits3[] f3)
        {
            for(int i=0;i<f3.length;i++)
            {
                for(int j=i+1;j<f3.length;j++)
                {
                    if(f3[i].getprice()>f3[j].getprice())
                    {
                    fruits3 temp=f3[i];
                        f3[i]=f3[j];
                        f3[j]=temp;
                    }
                }
            }

             return f3;
         }
         
}
class fruits
{

    private int price;
    private String name;

    fruits(String name,int price)
    {
        super();
        this.name=name;
        this.price=price;

    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getprice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
} 

class fruits2
{

    private int price;
    private String name;

    fruits2(String name,int price)
    {
        super();
        this.name=name;
        this.price=price;

    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getprice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
} 
class fruits3
{

    private int price;
    private String name;

    fruits3(String name,int price)
    {
        super();
        this.name=name;
        this.price=price;

    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getprice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
} 
                      
                      


    



    

