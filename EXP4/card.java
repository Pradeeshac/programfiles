/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.*;
/**
 *
 * @author USER
 */
public class card {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number of customer:");
        int n=ob.nextInt();
        customer obj[] = new customer[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter customer name:");
            String m=ob.next();
            System.out.println("enter card no:");
            int ca=ob.nextInt();
            System.out.println("enter pin number:");
            int pi=ob.nextInt();
            System.out.println("enter amount:");
            int amt=ob.nextInt();
            obj[i]=new customer(m,ca,pi,amt);
            System.out.println("- - - - - - - -");
            obj[i].viewcreditamount();
            obj[i].viewpin();
            System.out.println("-> -> -> -> -> -> -> ->");
            obj[i].changepin();
            System.out.println("-> -> -> -> -> -> -> ->");
            System.out.println("ENTER AMOUNT:");
            int pa=ob.nextInt();
            obj[i].paybalance(pa);
            System.out.println(obj[i]);
            System.out.println();

        }
    }
    
}
interface credit_card_interface
{
    void viewcreditamount();
    void viewpin();
    void changepin();
    void paybalance(int pay);
}
class customer implements credit_card_interface
{
    String name;
    int cardno;
    int pin;
    int creditamount=0;
    customer(String m,int ca,int pi,int credit)
    {
        name=m;
        cardno=ca;
        pin=pi;
        creditamount=credit;
    }
    @Override
    public void viewcreditamount()
    {
        System.out.println("CREDIT AMOUNT = "+creditamount);
    }
    @Override
    public void viewpin()
    {
        System.out.println("PIN = "+pin);
    }
    @Override
    public void changepin()
    {
        System.out.println("CURRENT PIN NUMBER = "+pin);
        Scanner o=new Scanner(System.in);
        System.out.println("ENTER NEW PIN NUMBER-->");
        int n=o.nextInt();
        pin=n;
    }
    @Override
    public void paybalance(int pay)
    {
        if(creditamount!=0)
        {
            creditamount=creditamount-pay;
            System.out.println("BALANCE--> "+creditamount);
        }
        else
        {
            System.out.println("ALL CREDITS CLEARED");
        }
    }
    @Override
    public String toString()
    {
        return "name = "+name+" card no = "+cardno+" pin = "+pin+" balance = "+creditamount;
    }
}