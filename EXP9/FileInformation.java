/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java;

import java.io.File;

/**
 *
 * @author Sowmya
 */
public class FileInformation 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here   
        File finfo = new File("C:\\Users\\Sowmya\\Documents\\NetBeansProjects\\JAVA\\src\\main\\java\\com\\mycompany\\java\\myfile.txt");  
        if (finfo.exists()) 
        {  
             System.out.println("The name of the file is: " + finfo.getName());  
             System.out.println("The absolute path of the file is: " + finfo.getAbsolutePath());
             System.out.println("Is file writeable: " + finfo.canWrite());
             System.out.println("Is file readable: " + finfo.canRead());
             System.out.println("The size of the file is: " + finfo.length());
        } else 
        
        {  
            System.out.println("The file does not exist.");  
         
    
        }  
    }
    
}
