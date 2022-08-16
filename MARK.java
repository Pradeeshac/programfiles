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
public class program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int mark;    
    Scanner obj=new Scanner(System.in);
    System.out.println("ENTER YOUR MARK:");
    mark=obj.nextInt();
    if(mark>=90)
        System.out.println("EXCELLENT");
    else if(mark>=80)
         System.out.println("VERY GOOD");
    else if(mark>=70)
        System.out.println("GOOD");
    else
        System.out.println("SATISFACTORY");


        
        
    
}
