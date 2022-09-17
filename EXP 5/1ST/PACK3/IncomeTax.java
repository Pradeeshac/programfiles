package Employee_data.pack3;

public class IncomeTax {
    protected int res = 0;
    protected String category = "";

    protected IncomeTax() {
    }

    protected void do_tax(int Basic_pay) {
        if (category.contains("male") || category.contains("Male")) {
            if (Basic_pay <= 190000)
                res = 0;
            else if (Basic_pay <= 200000)
                res = ((Basic_pay) / 100) * 10;
            else if (Basic_pay <= 500000)
                res = (Basic_pay / 100) * 20;
            else if (Basic_pay > 500000)
                res = (Basic_pay / 100) * 25;
        }
        if (category.contains("female") || category.contains("Female")) {
            if (Basic_pay <= 190000)
                res = 0;
            else if (Basic_pay <= 200000)
                res = 0;
            else if (Basic_pay <= 500000)
                res = (Basic_pay / 100) * 10;
            else if (Basic_pay > 500000)
                res = (Basic_pay / 100) * 20;
        }
    }
}