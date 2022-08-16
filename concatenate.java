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
public class concatenate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num;
        System.out.println("enter the number:")
        num=obj.nextInt();
        String result = "";
	for (int i = 1; i <= num; i++) {

			result = result + i + " ";

		}
		System.out.println(result);

    }
    
}
