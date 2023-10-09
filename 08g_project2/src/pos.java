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
	private JFrame frame = new JFrame();
	private JPanel start_panel = new JPanel();
	private JPanel cashier_panel = new JPanel(); //cashier home
	
	public void log_in() {
		frame.setSize(500, 600); // 400 width and 500 height
		frame.setLayout(new BorderLayout());
		frame.add(start_panel, BorderLayout.CENTER);
		start_panel.setLayout(null);
        
        // Create JButtons
        JButton connect_btn = new JButton("Connect to Server");
        JButton submit_btn = new JButton("Submit");
        JTextField textField = new JTextField(20); // 20 columns wide
        textField.setToolTipText("Enter your employee ID here");
        
        submit_btn.addActionListener(e -> {
            staff = Integer.parseInt(textField.getText()); // Get the text from the text field
            if(conn == null) {
            	JOptionPane.showMessageDialog(frame, "Connect to the server first");
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
            	    	JOptionPane.showMessageDialog(frame, "Successful log in");
            	    	if(role_list.get(id_list.indexOf(staff)).equals("Cashier")) {
            	    		this.cashier_main(); 
            	    	}
            	    	else {
            	    		this.manager_main();
            	    	}
            	    }
            	    else {
            	    	JOptionPane.showMessageDialog(frame, "Staff ID not found");
            	    }
            	}
            	catch (Exception x){
            	       x.printStackTrace();
            	       System.err.println(e.getClass().getName()+": "+x.getMessage());
            	       JOptionPane.showMessageDialog(frame, "Invalid");
            	       
            	}
            }
        });
        
        
        connect_btn.addActionListener(new ActionListener() {
         
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
        frame.setVisible(true);
	}
	
	public void cashier_main() {
		// clear log in page
		frame.remove(start_panel);
    	frame.repaint();
    	frame.setSize(500, 600);
    	
    	JButton log_out= new JButton("Log Out");
    	JLabel drink_name = new JLabel("Name");
    	JLabel drink_qty = new JLabel("Qty");
    	JLabel price_each = new JLabel("Each");
    	JLabel price_tot = new JLabel("Total");
    	JLabel discount = new JLabel("Discount");
    	JLabel tips = new JLabel("Tips %");
    	
    	JPanel leftPanel = new JPanel();
    	JPanel rightPanel = new JPanel();
    	
    	frame.add(cashier_panel);
		cashier_panel.setLayout(new GridBagLayout());
		cashier_panel.setSize(500, 600);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding
        
        // order summary header
        JPanel head_panel = new JPanel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; // Column 0
        gbc.gridy = 0; // Row 0
        gbc.weightx = 1;
        gbc.weighty = 0.10;
        cashier_panel.add(head_panel, gbc);
        head_panel.setLayout(new GridBagLayout());
        
        gbc.weightx = 1;
        head_panel.add(new JLabel("Name"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0.15;
        head_panel.add(new JLabel("Qty"), gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 0.15;
        head_panel.add(new JLabel("Each"), gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.weightx = 0.15;
        head_panel.add(new JLabel("Total"), gbc);
        
        // order list scroll panel
        JPanel order_panel = new JPanel();
        JScrollPane order_scroll = new JScrollPane(order_panel);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 0.2;
        gbc.weightx = 0.4;
        cashier_panel.add(order_panel, gbc);
        
        JPanel payment_panel = new JPanel();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 0.2;
        gbc.weightx = 0.4;
        cashier_panel.add(payment_panel, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        payment_panel.add(discount, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.5;
        payment_panel.add(tips, gbc);
        
        //menu display
        JPanel menu_header = new JPanel();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weighty = 0.1;
        gbc.weightx = 0.6;
        cashier_panel.add(menu_header, gbc);
        
        JPanel menu_panel = new JPanel();
        JScrollPane menu_scroll = new JScrollPane(menu_panel);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weighty = 0.85;
        gbc.weightx = 0.5;
        cashier temp = new cashier();
        temp.fill_header(menu_panel);
        menu_scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        cashier_panel.add(menu_scroll, gbc);
        

        
        
        
        gbc.gridx = 1; // Column 1
        gbc.gridy = 0; // Row 0
        JTextField textField1 = new JTextField(15);
        //order_panel.add(textField1, gbc);
    	
    	
        log_out.addActionListener(e -> {
        	frame.remove(cashier_panel);
        	frame.repaint();
        	staff = 0;
        	this.log_in();
        });
        
//        cashier_panel.add(log_out);
//    	cashier_panel.add(drink_name);
//    	cashier_panel.add(drink_qty, );
        frame.add(cashier_panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
	}
	
	private void manager_main() {
		frame.remove(start_panel);
    	frame.repaint();
    	
    	JLabel temp = new JLabel("Manager");
    	temp.setBounds(50, 50, 50, 50);
    	frame.add(temp);
	}
	// Main driver method
	public static void main(String[] args)
	{
		 
		 pos test = new pos();
		 test.log_in();
		
		

	}
}
