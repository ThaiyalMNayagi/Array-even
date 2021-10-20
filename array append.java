import java.io.*;
import java.util.*;
class MyCode
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a[]={21,12,3};
        int b[]={43,5,26};
        int c[]= new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        int k=0;
        for(int i=a.length;i<c.length;i++)
        {
            
             c[i]=b[k++];
        
            
        }
        for(int i=0;i<c.length;i++)
        {
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]>c[j])
                {
                    int temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        for(int i=0;i<c.length;i++){
        System.out.println(c[i]);
        }
        
        
    }
}