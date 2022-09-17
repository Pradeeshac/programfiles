package Employee_data.pack1;

import Employee_data.pack2.PaySlip;
import java.util.Scanner;

public class Employee extends PaySlip {
    String emp_name = "";
    String emp_id;
    String category = "";
    String address, mail_id, mobile_no;
    int Basic_pay;
    Scanner scan = new Scanner(System.in);

    public Employee() {
        super();
        System.out.println("Enter Employee Name : ");
        emp_name = scan.next();
        System.out.println("Enter Employee ID :");
        emp_id = scan.next();
        System.out.println("Enter Category (male/female)");
        category = scan.next();
        System.out.println("Enter Address : ");
        address = scan.next();
        System.out.println("Enter Mail Id :");
        mail_id = scan.next();
        System.out.println("Enter Mobile Number");
        mobile_no = scan.next();
        System.out.println("Enter Basic Pay : ");
        Basic_pay = scan.nextInt();

    }

    public void do_pay() {
        super.Basic_pay = this.Basic_pay;
        super.category = this.category;
        super.pay_calc();
    }

    public void calc_taxes() {
        super.category = this.category;
        super.Basic_pay = this.Basic_pay;
        do_taxes();
    }

    public void generate_slip() {
        System.out.println("\tPaySlip of Employee\n\n");
        System.out.println("Employee Name \t: " + emp_name);
        System.out.println("Employee ID \t: " + emp_id);
        System.out.println("Employee Category \t: " + category);
        System.out.println("Employee Address \t: " + address);
        System.out.println("Employee Mail ID \t: " + mail_id);
        System.out.println("Employee Mobile No \t: " + mobile_no);
        System.out.println("Employee Basic Pay \t: " + Basic_pay);
        System.out.println("Employee DA \t: " + super.DA);
        System.out.println("Employee HRA \t: " + super.HRA);
        System.out.println("Employee PF \t: " + super.PF);
        System.out.println("Employee Club Fund \t: " + super.club_fund);
        System.out.println("Employee Tax \t: " + super.tax);
        System.out.println("Employee net \t: " + super.net);
    }

}