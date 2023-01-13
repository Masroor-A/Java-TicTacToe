import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;

import javax.swing.*;
import javax.swing.border.*;


public class tictactoe extends JPanel implements ActionListener 
{
	public static int squareSize = 2; 
	JTextField box1 = new JTextField(squareSize); 
	JTextField box2 = new JTextField(squareSize); 
	JTextField box3 = new JTextField(squareSize); 
	JTextField box4 = new JTextField(squareSize); 
	JTextField box5 = new JTextField(squareSize); 
	JTextField box6 = new JTextField(squareSize); 
	JTextField box7 = new JTextField(squareSize); 
  JTextField box8 = new JTextField(squareSize); 
  JTextField box9 = new JTextField(squareSize);

	JLabel answer = new JLabel(); 
 public tictactoe()
  {
		Panel grid = new Panel(new GridLayout(3,3));
		JLabel title = new JLabel("                Tic-Tac-Toe                ");
		
		JButton check = new JButton("Click After Every Turn");
		check.addActionListener(this);
		check.setActionCommand("a");
		JLabel pic = new JLabel(createImageIcon("tictactoe.png"));
		add(title);
		add(grid);
		grid.add(box1);
		grid.add(box2);
		grid.add(box3);
		grid.add(box4);
		grid.add(box5);
		grid.add(box6);
		grid.add(box7);
		grid.add(box8);
  	grid.add(box9);
		add(check);
    add(answer);
		add(pic);


 }

  //gets called when button pressed
 public void actionPerformed(ActionEvent e) 
{
	String one = box1.getText();
	String two = box2.getText();
	String three = box3.getText();
	String four = box4.getText();
	String five = box5.getText();
	String six = box6.getText();
	String seven = box7.getText();
	String eight = box8.getText();
	String nine = box9.getText();

	if(one.equalsIgnoreCase("X") && two.equalsIgnoreCase("X") && three.equalsIgnoreCase("X")){
	answer.setText("                                     X Won O Lost                                     ");
}
	else if(four.equalsIgnoreCase("X") && five.equalsIgnoreCase("X") && six.equalsIgnoreCase("X")){
	answer.setText("                                     X Won O Lost                                     ");
}
	else if(seven.equalsIgnoreCase("X") && eight.equalsIgnoreCase("X") && nine.equalsIgnoreCase("X")){
	answer.setText("                                     X Won O Lost                                     ");
}
	else if(one.equalsIgnoreCase("X") && four.equalsIgnoreCase("X") && seven.equalsIgnoreCase("X")){
	answer.setText("                                     X Won O Lost                                     ");
}
	else if(two.equalsIgnoreCase("X") && five.equalsIgnoreCase("X") && eight.equalsIgnoreCase("X")){
	answer.setText("                                     X Won O Lost                                     ");
}
	else if(three.equalsIgnoreCase("X") && nine.equalsIgnoreCase("X") && six.equalsIgnoreCase("X")){
	answer.setText("                                     X Won O Lost                                     ");
}
	else if(one.equalsIgnoreCase("X") && nine.equalsIgnoreCase("X") && five.equalsIgnoreCase("X")){
	answer.setText("                                     X Won O Lost                                     ");
}
	else if(three.equalsIgnoreCase("X") && five.equalsIgnoreCase("X") && seven.equalsIgnoreCase("X")){
	answer.setText("                                     X Won O Lost                                     ");
}
	else if(one.equalsIgnoreCase("O") && two.equalsIgnoreCase("O") && three.equalsIgnoreCase("O")){
	answer.setText("                                     O Won X Lost                                     ");
}
	else if(four.equalsIgnoreCase("O") && five.equalsIgnoreCase("O") && six.equalsIgnoreCase("O")){
	answer.setText("                                     O Won X Lost                                     ");
}
	else if(seven.equalsIgnoreCase("O") && eight.equalsIgnoreCase("O") && nine.equalsIgnoreCase("O")){
	answer.setText("                                     O Won X Lost                                     ");
}
	else if(one.equalsIgnoreCase("O") && four.equalsIgnoreCase("O") && seven.equalsIgnoreCase("O")){
	answer.setText("                                     O Won X Lost                                     ");
}
	else if(two.equalsIgnoreCase("O") && five.equalsIgnoreCase("O") && eight.equalsIgnoreCase("O")){
	answer.setText("                                     O Won X Lost                                     ");
}
	else if(three.equalsIgnoreCase("O") && nine.equalsIgnoreCase("O") && six.equalsIgnoreCase("O")){
	answer.setText("                                     O Won X Lost                                     ");
}
	else if(one.equalsIgnoreCase("O") && nine.equalsIgnoreCase("O") && five.equalsIgnoreCase("O")){
	answer.setText("                                     O Won X Lost                                     ");
}
	else if(three.equalsIgnoreCase("O") && five.equalsIgnoreCase("O") && seven.equalsIgnoreCase("O")){
	answer.setText("                                     O Won X Lost                                     ");
		}
	else{
		answer.setText("");
	}
}

protected static ImageIcon createImageIcon(String path) 
  {
 java.net.URL imgURL = tictactoe.class.getResource(path);
 if (imgURL != null) 
 {
 return new ImageIcon(imgURL);
 } else 
 {
 System.err.println("Couldn't find file: " + path);
 return null;
 }
 }

 }
