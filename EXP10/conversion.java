/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXP10;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 21CSE079
 */


   public class conversion implements ActionListener
   {  
    JLabel l1,l3;
    JTextField tf1,tf3;  
    JButton b;  
    conversion(){  
        JFrame f= new JFrame(); 
        l1=new JLabel("MILE");
        l1.setBounds(50,50,150,20);
        l3=new JLabel("KILOMETER");
        l3.setBounds(50,150,150,20); 
        tf1=new JTextField();  
        tf1.setBounds(200,50,150,20);  
          
        tf3=new JTextField();  
        tf3.setBounds(200,150,150,20);  
        tf3.setEditable(false);   
        b=new JButton("CONVERT!");  
        b.setBounds(100,250,200,50);  
        b.addActionListener(this);  
         
        f.add(l1);f.add(l3);
        f.add(tf1);f.add(tf3);f.add(b);
        f.setSize(500,500);  
        f.setLayout(null);
        f.getContentPane().setBackground(Color.GRAY);
        f.setVisible(true);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }         
    @Override
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        int a=Integer.parseInt(s1);  
        double k=1.607;
        double c=0;  
        
        if(e.getSource()==b)
        {  
            c=a*k;  
        }
          
        String result=String.valueOf(c);  
        tf3.setText(result);  
    }  
public static void main(String[] args) {  
        new conversion();  
} }  
      

