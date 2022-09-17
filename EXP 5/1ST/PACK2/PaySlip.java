package Employee_data.pack2;

import Employee_data.pack3.IncomeTax;

public class PaySlip extends IncomeTax {
    protected int DA, HRA, PF, club_fund, gross, net, Basic_pay, tax;
    protected String category;

    protected PaySlip() {
    }

    protected void pay_calc() {

        DA = (Basic_pay / 100) * 97;
        HRA = (Basic_pay / 100) * 10;
        PF = (Basic_pay / 100) * 12;
        club_fund = (Basic_pay / 1000);
        net = (gross + DA + HRA + club_fund);
        net = net - PF;
    }

    protected void do_taxes() {
        super.category = this.category;
        super.do_tax(Basic_pay);
        this.tax = super.res;
        net = net + tax;
    }

}