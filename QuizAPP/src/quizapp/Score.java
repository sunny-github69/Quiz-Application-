/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapp;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Sunny
 */
public class Score extends JFrame implements ActionListener{
    Score(String name, int score){
        setBounds(400,150,750,550);    
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
      
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
      Image i2 = i1.getImage().getScaledInstance(300, 150,Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
        add(image);
        image.setBounds(0,150,300,150);
         
        
        JLabel heading = new JLabel("Thank you "+name+" for playing Quiz");
        heading.setBounds(45,60,700,45);
        heading.setFont(new Font("Tahoma",Font.PLAIN,40));
        add(heading);
        
         JLabel lbscore = new JLabel("Your Score "+ score);
        lbscore.setBounds(350,150,700,45);
        lbscore.setFont(new Font("Tahoma",Font.PLAIN,40));
        add(lbscore);
        
        JButton submit = new JButton("Play Again");
         submit.setBounds(400,250,120,30);
         submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.white);
        submit.addActionListener(this);
         add(submit);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
          setVisible(false);
          new Login();
    }
    public static void main(String[] args){
        new Score("user",0);
    }
}
