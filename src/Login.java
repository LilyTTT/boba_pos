
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Login extends javax.swing.JPanel {

    private JFrame frame;
    private FrameHandler fh;
    private static List<Integer> id_list = new ArrayList<>();
    private static List<String> role_list = new ArrayList<>();
    public int staff_id;
    
    Login(JFrame frame, FrameHandler fh) {
        this.frame = frame;
        this.fh = fh;
        staff_id = 0;
        try {
            load_staff();
            load_login();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Boolean is_manager() {
        String tf = staff_tf.getText();
        
        if(id_list.contains(Integer.valueOf(tf))) {
            staff_id = Integer.parseInt(tf);
            JOptionPane.showMessageDialog(frame, "Successful log in");
            if (role_list.get(id_list.indexOf(staff_id)).equals("Manager")) {
                return true; 
            }
        }
        else {
            JOptionPane.showMessageDialog(frame, "Staff ID not found");
        }
        return false;
    }
    
    private void load_staff() {
        
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();

        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "SELECT * FROM staff";

            ResultSet result = stmt.executeQuery(sqlStatement);
            
            while(result.next()) {
                id_list.add(Integer.valueOf(result.getString("staff_id")));
                role_list.add(result.getString("role"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        
        try {
            conn.close();
        } 
        catch(Exception e) {
            System.out.println("Connection NOT Closed.");
        }
    }
    
    private void load_login() {
        initComponents();
        status.setText("Connected to database.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        status = new javax.swing.JLabel();
        staff_label = new javax.swing.JLabel();
        staff_tf = new javax.swing.JTextField();
        login = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1200, 800));

        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setText("hi");

        staff_label.setText("Enter Staff ID");

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(562, 562, 562)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(staff_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staff_label))
                .addContainerGap(561, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(status)
                .addGap(206, 206, 206)
                .addComponent(staff_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staff_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login)
                .addGap(0, 484, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        fh.actionPerformed(evt);
    }//GEN-LAST:event_loginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton login;
    private javax.swing.JLabel staff_label;
    private javax.swing.JTextField staff_tf;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
