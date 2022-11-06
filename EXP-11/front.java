package IOstreams;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class front implements ActionListener{
    JFrame f;
    JLabel l1;
    JButton b1,b2;
    front()
    {
        f=new JFrame();
        l1=new JLabel("ONLINE BOOK STORE");
        l1.setBounds(150,50,2000,20);
        l1.setForeground(Color.BLUE);
        l1.setFont(new Font("Constantia", Font.BOLD, 20));
        b1=new JButton("User");
        b1.setBounds(180,100,100,50);
        b1.addActionListener(this);
        b2=new JButton("Admin");
        b2.setBounds(180,200,100,50);
        b2.addActionListener(this);
        f.add(l1);
        f.add(b1);f.add(b2);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
        f.setTitle("BOOK SHOP");
        f.getContentPane().setBackground(Color.PINK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
    }
    @Override
       public void actionPerformed(ActionEvent a)
       {
        if(a.getSource()==b1)
        {
           Userpage up= new Userpage(); 
        }
        if(a.getSource()==b2)
        {
            adminpage ap=new adminpage();
        }
    }
    public static void main(String[] args) {
       new front();
    }
}