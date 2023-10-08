import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// Main class
public class pos extends JFrame{
	public int employee_id;
	Connection conn = null;
	public void log_in(JFrame frame) {
        
        // Create a JButton
        JButton connect_btn = new JButton("Connect to Server");
        JButton submit_btn = new JButton("Submit");
        JTextField textField = new JTextField(20); // 20 columns wide
        textField.setToolTipText("Enter your employee ID here");
        
        submit_btn.addActionListener(e -> {
            employee_id = Integer.parseInt(textField.getText()); // Get the text from the text field
            if(conn == null) {
            	JOptionPane.showMessageDialog(frame, "Connect to the server first");
            }
            else {
            	try {
            		Statement stmt = conn.createStatement();
            	    String sqlStatement = "SELECT employee_id FROM employee";
            	    ResultSet result = stmt.executeQuery(sqlStatement);	
            	    List<Integer> id_list = new ArrayList<>();
            	    while(result.next()) {
            	    	id_list.add(Integer.parseInt(result.toString()));
            	    }
            	    if(id_list.contains(employee_id)) {
            	    	JOptionPane.showMessageDialog(frame, "Success log in");
            	    }
            	    else {
            	    	JOptionPane.showMessageDialog(frame, "Employee ID not found");
            	    }
            	}
            	catch (Exception x){
            	       x.printStackTrace();
            	       System.err.println(e.getClass().getName()+": "+x.getMessage());
            	       System.exit(0);
            	}
            }
            

            
            JOptionPane.showMessageDialog(frame, "You entered: " + employee_id);
        });
        
        
        connect_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the label's text when the button is clicked
            	jdbcpostgreSQL connection = new jdbcpostgreSQL();
            	conn = connection.connect();
            	connect_btn.setText(connection.status);
            }
        });
        connect_btn.setBounds(150, 200, 220, 50);
        textField.setBounds(150, 300, 100, 25);
        submit_btn.setBounds(270, 300, 100, 25);
        frame.add(connect_btn);
        frame.add(submit_btn);
        frame.add(textField);
        connect_btn.setVisible(true);
	}
	// Main driver method
	public static void main(String[] args)
	{
		 JFrame frame = new JFrame();
		 pos test = new pos();
		 test.log_in(frame);
		 frame.setSize(500, 600); // 400 width and 500 height
	     frame.setLayout(null); // using no layout managers
	     frame.setVisible(true);
		
		

	}
}
