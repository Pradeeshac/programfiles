/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXP10;

/**
 *
 * @author 21CSE079
 */



import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.*;  
class slider implements AdjustmentListener  
{ 
    JFrame f;
    JScrollBar s,s1,s2;
    
slider(){  
f= new JFrame("Scrollbar Example");
s=new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 128);  
s1=new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 128); 
s2=new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 128); 
s.setBounds(10,100, 30,100);  
s1.setBounds(155,100, 30,100);
s2.setBounds(300,100, 30,100);
s.addAdjustmentListener(this);
s1.addAdjustmentListener(this);
s2.addAdjustmentListener(this);
f.add(s);  
f.add(s1); 
f.add(s2); 

f.setSize(300,300);  
f.setLayout(null);
f.setVisible(true); 
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
public void adjustmentValueChanged(AdjustmentEvent ae)
{
    int red= s.getValue();
    int blue = s1.getValue();
    int green =s2.getValue();
    System.out.println(red);
    System.out.println(green);
    System.out.println(blue);
    f.getContentPane().setBackground(new Color(red,green,blue));
   
}
public static void main(String args[])  
{  
new slider();  
}}  