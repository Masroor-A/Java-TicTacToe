//Libraries are code written by experts
//Methods inside of them will be used

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Main 
{
 public static void main(String[] args) 
  {
 //   
 JFrame frame = new JFrame("tictactoe");
 frame.setSize(270, 375);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JComponent newContentPane = new tictactoe();
 newContentPane.setOpaque(true);
 frame.setContentPane(newContentPane);
 frame.setLocationRelativeTo(null);
 frame.setVisible(true);
 }
}
