package Employee_data;

import Employee_data.pack1.Employee;

public class file {
    public static void main(String args[]) {
        Employee emp[] = new Employee[5];

        for (int x = 0; x < 5; x++) {
            System.out.println("\n\nEntering Details of Employee " + (x + 1) + "\n\n");
            emp[x] = new Employee();
        }
        for (int x = 0; x < 5; x++) {
            System.out.println("\n\nDisplaying Details of Employee " + (x + 1) + "\n\n");
            emp[x].do_pay();
            emp[x].calc_taxes();
            emp[x].generate_slip();
        }
    }
}