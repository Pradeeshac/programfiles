package employee_data;
import java.util.Scanner;
import packageexe.*;
public class Exercise5{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println(" 1. Arithmetic Calculation\n 2.String Manipulation\n 3.Pattern\n 4.Exit");
        int i=1;
        while(i==1)
        {
        System.out.println("enter your choice:");
        int ch=obj.nextInt();
            switch (ch) {
                case 1:
                    packageexe.pack1.Paackage1 p1=new  packageexe.pack1.Paackage1();
                    p1.calculation(50,20);
                    break;
                case 2:
                    packageexe.pack2.Package2 p2=new packageexe.pack2.Package2();
                    p2.strings("Java Programming");
                    break;
                case 3:
                    packageexe.pack3.Package3 p3=new packageexe.pack3.Package3();
                    p3.Pattern(10);
                    break;
                case 4:
                    i=0;
                    break;
                default:
                    break;
            }
    }
    }
}