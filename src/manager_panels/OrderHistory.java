package manager_panels;

import control.jdbcpostgreSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

public class OrderHistory extends javax.swing.JPanel {

    private static final java.util.List<String> order_id_list = new ArrayList<>();
    private static final java.util.List<String> staff_id_list = new ArrayList<>();
    private static final java.util.List<String> transaction_date_list = new ArrayList<>();
    private static final java.util.List<String> payment_method_list = new ArrayList<>();
    private static final java.util.List<String> payment_amount_list = new ArrayList<>();
    private static final java.util.List<String> timestamp_list = new ArrayList<>();
    private static String pm = null;
    private static String pm_times = null;
    
    public OrderHistory() {
        initComponents();
    }
    
    public void load_table() {
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "SELECT * FROM orders";

            ResultSet result = stmt.executeQuery(sqlStatement);
            
            while(result.next()) {
                order_id_list.add(result.getString("order_id"));
                staff_id_list.add(result.getString("staff_id"));
                transaction_date_list.add(result.getString("transaction_date"));
                payment_method_list.add(result.getString("payment_method"));
                payment_amount_list.add(result.getString("payment_amount"));
                timestamp_list.add(result.getString("timestamp"));
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
    
    public void load_order_history(JPanel panel) {

        Object [][] data = new Object[order_id_list.size()][5];
        for (int i = 0; i < order_id_list.size(); i++) {
            Object[] row = { order_id_list.get(i), staff_id_list.get(i), transaction_date_list.get(i), payment_method_list.get(i), payment_amount_list.get(i), timestamp_list.get(i)};
            data[i] = row;
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            data,
            new String [] {
                "Order ID", "Staff ID", "Transaction Date", "Payment Method", "Payment Amount", "Timestamp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(panel);
        panel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(total_orders)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(best_seller)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payment_method)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(peak_day)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slow_day))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_orders)
                    .addComponent(best_seller)
                    .addComponent(payment_method)
                    .addComponent(peak_day)
                    .addComponent(slow_day))
                .addContainerGap())
        );
    }

    public static List<String> getOrder_id_list() {
        return order_id_list;
    }

    public static List<String> getStaff_id_list() {
        return staff_id_list;
    }

    public static List<String> getTransaction_date_list() {
        return transaction_date_list;
    }

    public static List<String> getPayment_method_list() {
        return payment_method_list;
    }

    public static List<String> getPayment_amount_list() {
        return payment_amount_list;
    }

    public static List<String> getTimestamp_list() {
        return timestamp_list;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        total_orders = new javax.swing.JButton();
        best_seller = new javax.swing.JButton();
        payment_method = new javax.swing.JButton();
        peak_day = new javax.swing.JButton();
        slow_day = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Staff ID", "Transaction Date", "Payment Method", "Payment Amount", "Timestamp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        total_orders.setText("Total # of Orders");
        total_orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_ordersActionPerformed(evt);
            }
        });

        best_seller.setText("Best Seller");
        best_seller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                best_sellerActionPerformed(evt);
            }
        });

        payment_method.setText("Most Common Payment Method");
        payment_method.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment_methodActionPerformed(evt);
            }
        });

        peak_day.setText("Peak Day");
        peak_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peak_dayActionPerformed(evt);
            }
        });

        slow_day.setText("Slow Day");
        slow_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slow_dayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(total_orders)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(best_seller)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payment_method)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(peak_day)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slow_day))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_orders)
                    .addComponent(best_seller)
                    .addComponent(payment_method)
                    .addComponent(peak_day)
                    .addComponent(slow_day))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void total_ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_ordersActionPerformed
        JOptionPane.showMessageDialog(this, String.valueOf(order_id_list.size()));
    }//GEN-LAST:event_total_ordersActionPerformed

    private void best_sellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_best_sellerActionPerformed
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();

            String sqlStatement = "SELECT d.name AS highest_selling_drink, COUNT(*) AS total_orders FROM drinks d JOIN orders o ON d.order_id = o.order_id GROUP BY d.name ORDER BY total_orders DESC LIMIT 1";
            ResultSet result = stmt.executeQuery(sqlStatement);
            while(result.next()) {
                pm = result.getString("highest_selling_drink").substring(1);
                pm_times = result.getString("total_orders");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        
        JOptionPane.showMessageDialog(this, pm + ": " + pm_times);
    }//GEN-LAST:event_best_sellerActionPerformed

    private void payment_methodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payment_methodActionPerformed
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();

            String sqlStatement = "SELECT payment_method, COUNT(*) AS payment_count FROM orders GROUP BY payment_method ORDER BY payment_count DESC LIMIT 1";
            ResultSet result = stmt.executeQuery(sqlStatement);
            while(result.next()) {
                pm = result.getString("payment_method");
                pm_times = result.getString("payment_count");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        
        JOptionPane.showMessageDialog(this, pm + ": " + pm_times);
    }//GEN-LAST:event_payment_methodActionPerformed

    private void peak_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peak_dayActionPerformed
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();

            String sqlStatement = "SELECT transaction_date AS order_day, SUM(payment_amount) AS total_order_amount FROM orders GROUP BY transaction_date ORDER BY total_order_amount DESC LIMIT 10";
            ResultSet result = stmt.executeQuery(sqlStatement);
            while(result.next()) {
                pm = result.getString("order_day");
                pm_times = result.getString("total_order_amount");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        
        JOptionPane.showMessageDialog(this, pm + ": " + String.format("%.2f", Double.valueOf(pm_times)));
    }//GEN-LAST:event_peak_dayActionPerformed

    private void slow_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slow_dayActionPerformed
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();

            String sqlStatement = "SELECT transaction_date, SUM(payment_amount) AS total_sales FROM orders GROUP BY transaction_date ORDER BY total_sales ASC LIMIT 10";
            ResultSet result = stmt.executeQuery(sqlStatement);
            while(result.next()) {
                pm = result.getString("transaction_date");
                pm_times = result.getString("total_sales");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        
        JOptionPane.showMessageDialog(this, pm + ": " + String.format("%.2f", Double.valueOf(pm_times)));
    }//GEN-LAST:event_slow_dayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton best_seller;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton payment_method;
    private javax.swing.JButton peak_day;
    private javax.swing.JButton slow_day;
    private javax.swing.JButton total_orders;
    // End of variables declaration//GEN-END:variables
}
