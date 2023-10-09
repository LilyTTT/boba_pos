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

// Main class
public class pos extends JFrame{
	public int staff = 0;
	private Connection conn = null;
	private JFrame start_frame = new JFrame();
	private JPanel start_panel = new JPanel();
	private JPanel order_panel = new JPanel(); 
	
	public void log_in() {
		
		pos test = new pos();
		start_frame.setSize(500, 600); // 400 width and 500 height
		start_frame.setLayout(new BorderLayout());
		start_frame.add(start_panel, BorderLayout.CENTER);
		start_panel.setLayout(null);
        
        // Create a JButton
        JButton connect_btn = new JButton("Connect to Server");
        JButton submit_btn = new JButton("Submit");
        JTextField textField = new JTextField(20); // 20 columns wide
        textField.setToolTipText("Enter your employee ID here");
        
        submit_btn.addActionListener(e -> {
            staff = Integer.parseInt(textField.getText()); // Get the text from the text field
            if(conn == null) {
            	JOptionPane.showMessageDialog(start_frame, "Connect to the server first");
            }
            else {
            	try {
            		Statement stmt = conn.createStatement();
            	    String sqlStatement = "SELECT * FROM staff";
            	    ResultSet result = stmt.executeQuery(sqlStatement);	
            	    List<Integer> id_list = new ArrayList<>();
            	    List<String> role_list = new ArrayList<>();
            	    while(result.next()) {
            	    	id_list.add(Integer.parseInt(result.getString("staff_id")));
            	    	role_list.add(result.getString("role"));
            	    }
            	    if(id_list.contains(staff)) {
            	    	JOptionPane.showMessageDialog(start_frame, "Successful log in");
            	    	if(role_list.get(id_list.indexOf(staff)).equals("Cashier")) {
            	    		this.cashier_main(); 
            	    	}
            	    	else {
            	    		this.manager_main();
            	    	}
            	    }
            	    else {
            	    	JOptionPane.showMessageDialog(start_frame, "Staff ID not found");
            	    }
            	}
            	catch (Exception x){
            	       x.printStackTrace();
            	       System.err.println(e.getClass().getName()+": "+x.getMessage());
            	       JOptionPane.showMessageDialog(start_frame, "Invalid");
            	       
            	}
            }
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
        start_panel.add(connect_btn);
        start_panel.add(submit_btn);
        start_panel.add(textField);
        start_frame.setVisible(true);
        
        if(conn != null && staff != 0) {
        	this.cashier_main();
        	connect_btn.setText("uh");
        }
	}
	
	private void cashier_main() {
		// clear log in page
		start_frame.remove(start_panel);
    	start_frame.repaint();
    	
    	JLabel temp = new JLabel("Cashier");
    	temp.setBounds(50, 50, 50, 50);
    	start_frame.add(temp);
//    	
//    	JPanel leftPanel = new JPanel();
//    	JPanel rightPanel = new JPanel();
//    	
//    	start_frame.add(order_panel, BorderLayout.CENTER);
//		order_panel.setLayout(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.insets = new Insets(5, 5, 5, 5); // Padding
//        
//        // Label and Text Field 1
//        gbc.gridx = 0; // Column 0
//        gbc.gridy = 0; // Row 0
//        order_panel.add(new JLabel("Label 1:"), gbc);
//        
//        gbc.gridx = 1; // Column 1
//        gbc.gridy = 0; // Row 0
//        JTextField textField1 = new JTextField(15);
//        order_panel.add(textField1, gbc);
//        
//        // Label and Text Field 2
//        gbc.gridx = 0; // Column 0
//        gbc.gridy = 1; // Row 1
//        order_panel.add(new JLabel("Label 2:"), gbc);
//        
//        gbc.gridx = 1; // Column 1
//        gbc.gridy = 1; // Row 1
//        JTextField textField2 = new JTextField(15);
//        order_panel.add(textField2, gbc);
//        
//        start_frame.add(order_panel);
//        start_frame.pack();
//        start_frame.setLocationRelativeTo(null);
	}
	
	private void manager_main() {
		start_frame.remove(start_panel);
    	start_frame.repaint();
    	
    	JLabel temp = new JLabel("Manager");
    	temp.setBounds(50, 50, 50, 50);
    	start_frame.add(temp);
	}
	// Main driver method
	public static void main(String[] args)
	{
		 
		 pos test = new pos();
		 test.log_in();
		
		

	}
}
