import java.util.*;
public class std_cgpa {
    public static void main(String[] args) {
        int num;
        Scanner obj=new Scanner(System.in);
        Std arr[]=new Std[20];
        System.out.println("enter the no of student:");
        num=obj.nextInt();
        ArrayList<Std> list=new ArrayList<>();
        if (num<=20)
        {
        for(int i=1;i<=num;i++)
        {
            arr[i]=new Std( );
            arr[i].getdata(i,num);
            list.add(arr[i]);
        }
        System.out.println("              students details                  ");
        System.out.println(list);
        System.out.println("\n\n\n");
        System.out.println("Student Details after Sorted  by their CGPA: ");
        Collections.sort(list, new sorting());
        System.out.println(list);
        }
        else 
        {
                    System.out.println("NOT ENOUGH MEMORY TO ADD STUDENT DETAILS");
        
        }
    }
}
class Std
{
    String name;
    String rollno;
    double cgpa;
    void getdata( int i,int num)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter student"+ i +" Name:");
        name=obj.next();
        System.out.println("Enter student " + i+ " Roll number:");
        rollno=obj.next();
        System.out.println("Enter student " + i+" CGPA:");
        cgpa=obj.nextDouble();
    }
    @Override
    public String toString()
            
    {      
        return "\n NAME :"+ name + "  :: Roll No.=" + rollno +  "  :: CGPA=" + cgpa + "\n";
        
    }
    
}

class sorting implements Comparator<Std>
{
    public int compare(Std s1,Std s2)
    {
        return Double.compare(s2.cgpa, s1.cgpa);
    }
}