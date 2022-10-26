/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author Sowmya
 */

      import java.io.*;

public class bytestream
{
	public static void main(String[] args) 
	{
		System.out.println("Reading binary file into byte array ");
		try{
		//Instantiate the file object
		File file = new File("test.zip");
		//Instantiate the input stread
		InputStream insputStream = new FileInputStream(file);
		long length = file.length();
		byte[] bytes = new byte[(int) length];

		insputStream.read(bytes);
		insputStream.close();
	
		String s = new String(bytes);
		//Print the byte data into string format
		System.out.println(s);
		}catch(Exception e){
			System.out.println("Error is:" + e.getMessage());
		}
	}
}
    
    

