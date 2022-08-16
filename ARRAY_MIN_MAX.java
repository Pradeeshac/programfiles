/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pradee;

/**
 *
 * @author 21CSE079
 */
public class ARRAY_MIN_MAX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = new int[]{2,5,567,678,100};
        int smallest = arr[0];
        int largest = arr[0];
        for(int i=1; i< arr.length; i++)
{
if(arr[i] > largest)
largest = arr[i];
else if (arr[i] < smallest)
smallest = arr[i];
 
}
System.out.println("Smallest Number is : " + smallest);
System.out.println("Largest Number is : " + largest);
    
}
