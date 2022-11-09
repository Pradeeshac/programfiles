package lab;
import java.util.*;
public class exchanging
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n=scan.nextInt();
        Integer num[]=new Integer[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
            num[i]=scan.nextInt();
        }
        System.out.println("Elements of5"
                + " array before exchanging:");
        for (Integer num1 : num) {
            System.out.print(num1 + "  ");
        }
        System.out.println("\nEnter element 1 to swap:");
        Integer e1=scan.nextInt();
        System.out.println("Enter element 2 to swap:");
        Integer e2=scan.nextInt();
        Exchange ex=new Exchange<>(e1,e2,num);
        ex.swap();
    }
}
class Exchange<T,V>
{
    T data1;
    T data2;
    V[] array;
    Exchange(T d1,T d2,V[] a)
    {
        data1=d1;
        data2=d2;
        array=a;
    }
    public void swap()
    {
        int e1 = 0,e2 = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==data1)
            {
                 e1=i;
            }
            if(array[i]==data2)
            {
                 e2=i;
            }
        }
        array[e1]=(V) data2;
        array[e2]=(V) data1;
        System.out.println("Elements of array after exchanging:");
        for (V array1 : array) {
            System.out.print(array1 + "   ");
        }
    }
}