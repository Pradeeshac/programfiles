/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sowmya
 */


public class LineCount {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        System.out.println("Totsl no. of files : "+args.length);
        for (int i = 0; i < args.length; i++) {
            countlines(args[i]);
        }

    }

    public static void countlines(String fn) throws FileNotFoundException, IOException {
        String s = fn;
        File f = new File(s);
        FileReader fr = new FileReader(s);
        BufferedReader br = new BufferedReader(fr);
        String str;
        int count = 0;
        while ((str = br.readLine()) != null) {
            count++;
        }
        System.out.println("FileName: " + f.getName() + "\nNo.of lines: "+count);
    }
}