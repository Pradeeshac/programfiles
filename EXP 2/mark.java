
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21cse079
 */
public class mark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
		String name;
		int days;
                int rollno;
                int total;
		System.out.println("Enter the name of the student: ");
		name=obj.next();
                System.out.println("Enter the roll number of the student: ");
		rollno=obj.nextInt();
                System.out.println("Enter total number of working days: ");
		total=obj.nextInt();
                System.out.println("Enter total number of  days present: ");
		days=obj.nextInt();
		double attendance_perc=(days*100)/total;
                System.out.println("Name: "+name);
                
		int marks;
		if (attendance_perc>=90)
                {
		    System.out.println("Mark:5 ");
		}
		else if(attendance_perc>=80)
                {
		    System.out.println("Mark:4 ");
		}
                else if (attendance_perc>=75)
                {
		    System.out.println("Mark:3 ");
		}
                else 
                {
		    System.out.println("Mark:0 ");
		}
		
	         System.out.println("ATTENDANCE PERCENTAGE--->"+attendance_perc);
		
    }
    
}