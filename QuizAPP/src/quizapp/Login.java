
package quizapp;


import javax.swing.*;     // for jframe
import java.awt.*;            //for color
import java.awt.event.*;  // to set click event on button




public class Login extends JFrame implements ActionListener{
    
    
    JButton rules,back;           // globally defines bcz it is also used in actionPerformed method(niche use hua hai).
    JTextField tfname;             // globally declared bcz it passes in another jframe(Rules class).
    
   
    Login(){
        getContentPane().setBackground(Color.WHITE);
        //khud ka layout
        setLayout(null);
        
        //for image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        add(image);
        image.setBounds(0,0,600,500);
        
        JLabel heading = new JLabel("Welcome to Quiz");
        heading.setBounds(750,60,300,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        
        JLabel name  = new JLabel("Enter your name");
        name.setBounds(810,120,300,20);
        name.setFont(new Font("Viner Hand ITC",Font.BOLD,18));
        name.setForeground( Color.BLACK);
         add(name);
        
         tfname = new JTextField();
        tfname.setBounds(735,160,300,35);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
       // rules and back is globally defined in avobe line 
       
        rules = new JButton("Rules");
        rules.setBounds(780,220,70,30);
        add(rules);
        // for action set  on button
        rules.addActionListener(this);
        rules.setBackground(Color.green);
        rules.setForeground(Color.white);
        
        
        back = new JButton("Back");
        back.setBounds(910,220,70,30);
        add(back);
        //for action set of button
        back.addActionListener(this);
        back.setBackground(Color.green);
        back.setForeground(Color.white);
        
        setVisible(true);
        setSize(1200,500);
        setLocation(200,200);
    }
    
    
    
    
    // to override unimplemented method of ActionListener interface.
   
    public void actionPerformed(ActionEvent ae){
       //check is rules button clicked
        if(ae.getSource()==rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
            
        }else if(ae.getSource()==back){
            setVisible(false);
            
        }
    }
    
    
    
    public static void main(String[] args){
        new Login();
    }
}
