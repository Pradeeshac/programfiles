package exceptionhandling; 
  
 import java.util.Scanner; 
  
 public class DistanceFromAverageWithExceptionHandling { 
     public static void main(String[] args) { 
         Scanner obj=new Scanner(System.in); 
         double distance[]=new double[20]; 
         int Arraysize=0; 
         double Total=0,Average=0,element=0; 
         int flag=0; 
         int x=0; 
         try 
         { 
             System.out.println("Enter Valid Array Size upto 20:"); 
             Arraysize=obj.nextInt(); 
             if(Arraysize>20 || Arraysize<0) 
             { 
                 throw new ArrayIndexOutOfBoundsException(); 
             } 
         } 
         catch(ArrayIndexOutOfBoundsException e) 
         { 
             System.out.println("<-----Invalid Array Size----->\nEnter Valid Array Size"); 
             flag=1; 
             obj.nextLine(); 
             
         }    
         if(flag==0) 
         { 
             while(x<Arraysize) 
             { 
                 try 
                 { 
                     System.out.println("Enter element"); 
                     element=obj.nextDouble(); 
                 } 
                 catch(Exception e) 
                 { 
                     System.out.println(e); 
                     obj.nextLine(); 
                      
                 } 
                 distance[x]=element; 
                 x++; 
             } 
         } 
         if(x!=0) 
         { 
             for(int i=0;i<Arraysize;i++) 
                 Total+=distance[i]; 
             Average=Total/Arraysize; 
             System.out.println("You entered " + x +" numbers and their average is " + Average); 
             for(int j = 0; j < x;++j) 
                System.out.println(distance[j] + " is " + 
                   (Average-distance[j]) + " away from the average"); 
         } 
                  
     } 
 }