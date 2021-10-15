import java.io.*;
import java.util.*;

class MynewProg
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Input");
        for(int i=0;i<10;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("output");
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Even numbers");
        for(int i=0;i<10;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        }

    }
}