package lab;
import java.util.*;
public class odd{
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
        Intlist<Integer> list=new Intlist<>(num);
        list.oddnum();
        
    }
}
class Intlist<T>
{
    T[] value;
    public Intlist(T[] value)
    {
        this.value=value;
    }
    public void oddnum()
    {
        System.out.println("Odd numbers in the entered array:" );
        for (T value1 : value) {
            int s = (Integer) value1;         
            if (s%2!=0) 
            {
                System.out.println(value1);
            }
        }
    }
    
}
