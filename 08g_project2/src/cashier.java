import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class cashier {
	
	public void fill_header(JPanel panel) {
		JButton btn1 = new JButton("Teas");    
		JButton btn2 = new JButton("Brown Sugar");    
		JButton btn3 = new JButton("Milk Tea");    
		JButton btn4 = new JButton("Fruits");    
		JButton btn5 = new JButton("Fresh Sugarcane");    
		JButton btn6 = new JButton("Fresh Taro/Red Bean");    
		JButton btn7 = new JButton("Traditional");    

		panel.add(btn1); panel.add(btn2); panel.add(btn3);  
		panel.add(btn4); panel.add(btn5); panel.add(btn6);  
		panel.add(btn7);
		
		panel.setLayout(new GridLayout(3, 3)); 
	}
	

}
