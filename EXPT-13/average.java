import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class average {
    public static void main(String[] args)
    {
        Collection<Integer> above_average_list=new ArrayList<>();
        Collection<Integer> below_average_list=new ArrayList<>();
        int arr[]=new int[20];
        int sum=0;
        double avg;
        Scanner obj=new Scanner(System.in);
        System.out.println("Array Elements : ");
        for(int i=0;i<arr.length;i++)
        {
                arr[i]=(int)(Math.random()*90+10);
                System.out.print(arr[i]+" ");
                sum+=arr[i];
        }
        avg=sum/10;
        System.out.println("\n\nSum of the elements : "+sum);
        System.out.println("Average of the elements : "+avg);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>avg)
            {
                above_average_list.add(arr[i]);
            }
            if(arr[i]<avg)
            {
                below_average_list.add(arr[i]);
            }
        }
        System.out.println("\n\nvalues that are above average in the list : "+above_average_list);
        System.out.println("values that are below average in the list : "+below_average_list);
    }  
}