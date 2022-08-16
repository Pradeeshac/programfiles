/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pradee;

import java.util.Scanner;

/**
 *
 * @author 21CSE079
 */
public class MAXIMUM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a1,b1;
        System.out.println("ENTER TWO NUMBERS");
        a1=obj.nextInt();
        b1=obj.nextInt();
    if(a1>b1)
         System.out.println("THE NUMBER"+a1+":IS GREATER THAN"+b1);
        // System.out.println("IS GREATER THAN:"+b1);
    else
          System.out.println("THE NUMBER:"+b1);
          //System.out.println("IS GREATER THAN:"+a1);
    }
    
}
