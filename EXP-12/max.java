package lab;
import java.util.*;
public class max {
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
        System.out.println("\nEnter Beginning index:");
        Integer beg=scan.nextInt();
        System.out.println("\nEnter Ending index:");
        Integer end=scan.nextInt();
        Intlist<Integer> list=new Intlist<>(num);
        list.max_element(beg, end);
    }
}
class Intlist<T>
{
    T[] value;
    public Intlist(T[] value)
    {
        this.value=value;
    }
   
    public void max_element(int beg,int end)
    {
        int max_num=(Integer)value[0];
        for(int i=beg;i<end;i++)
        {
            if(((Integer)value[i])>max_num)
            {
                max_num=(Integer)value[i];
            }
        }
        System.out.println("Maximum Element in between " + beg +" and "+end+" is "+max_num);
    }

}
