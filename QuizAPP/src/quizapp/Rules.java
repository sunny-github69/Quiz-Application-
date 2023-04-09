
package quizapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Rules extends JFrame implements ActionListener {
    
    
    
     String name;
     JButton start,back;
     
     
    Rules(String name){
        
        this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(800,650);
        setLocation(300,150);
        
        JLabel heading = new JLabel("Welcome " + name + " to " +" Sunny quiz");
        heading.setBounds(20,10,400,35);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,25));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules = new JLabel();
       rules.setBounds(20,60,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,15));
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
            );
        add(rules);
        
        
        
        start = new JButton("Start");
        start.setBounds(230,440,70,30);
        add(start);        // for action set  on button
        start.addActionListener(this);
        start.setBackground(Color.green);
        start.setForeground(Color.white);
        
        back = new JButton("Back");
        back.setBounds(330,440,70,30);
        add(back);        // for action set  on button
        back.addActionListener(this);
        back.setBackground(Color.green);
        back.setForeground(Color.white);
        
        
         setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
       //check is rules button clicked
        if(ae.getSource()==start){
            setVisible(false);
           new Quiz(name);
          
            
        }else if(ae.getSource()==back){
            setVisible(false);
            new Login();
            
        }
    }
    
    
    
    
    public static void main(String[] args){
         new  Rules("user");
    }
    
    
    
}
