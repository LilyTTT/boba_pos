
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JPanel;

public class OrderHistory extends javax.swing.JPanel {

    private static final java.util.List<String> order_id_list = new ArrayList<>();
    private static final java.util.List<String> staff_id_list = new ArrayList<>();
    private static final java.util.List<String> transaction_date_list = new ArrayList<>();
    private static final java.util.List<String> payment_method_list = new ArrayList<>();
    private static final java.util.List<String> payment_amount_list = new ArrayList<>();
    private static final java.util.List<String> timestamp_list = new ArrayList<>();
    private static String pm = null;
    private static String pm_times = null;
    private static String hsp = null;
    private static String hsp_times = null;
    
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
            
            sqlStatement = "SELECT payment_method, COUNT(*) AS payment_count FROM orders GROUP BY payment_method ORDER BY payment_count DESC LIMIT 1";
            result = stmt.executeQuery(sqlStatement);
            while(result.next()) {
                pm = result.getString("payment_method");
                pm_times = result.getString("payment_count");
            }
            
            sqlStatement = "SELECT d.name AS highest_selling_drink, COUNT(*) AS total_orders FROM drinks d JOIN orders o ON d.order_id = o.order_id GROUP BY d.name ORDER BY total_orders DESC LIMIT 1";
            result = stmt.executeQuery(sqlStatement);
            while(result.next()) {
                hsp = result.getString("highest_selling_drink");
                hsp = hsp.substring(1);
                hsp_times = result.getString("total_orders");
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
        
        total_orders.setText(String.valueOf(order_id_list.size()));
        frequent_pm.setText(pm + ": " + pm_times);
        popular_item.setText(hsp + ": " + hsp_times);
        Object [][] data = new Object[order_id_list.size()][5];
        for (int i = 0; i < order_id_list.size(); i++) {
            Object[] row = { order_id_list.get(i), staff_id_list.get(i), transaction_date_list.get(i), payment_method_list.get(i), payment_amount_list.get(i), timestamp_list.get(i)};
            data[i] = row;
        }
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Total Orders");

        total_orders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel2.setText("Most Frequent Payment Method");

        frequent_pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setText("Most Popular Item");

        popular_item.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(panel);
        panel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(total_orders)
                    .addComponent(frequent_pm)
                    .addComponent(popular_item))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_orders)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frequent_pm)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(popular_item)))
                .addGap(20, 20, 20))
        );
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
        jLabel1 = new javax.swing.JLabel();
        total_orders = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        frequent_pm = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        popular_item = new javax.swing.JLabel();

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

        jLabel1.setText("Total Orders");

        total_orders.setText("test");

        jLabel2.setText("Most Frequent Payment Method");

        frequent_pm.setText("test");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Most Popular Item");

        popular_item.setText("test");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(total_orders)
                    .addComponent(frequent_pm)
                    .addComponent(popular_item))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_orders)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frequent_pm)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(popular_item)))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel frequent_pm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel popular_item;
    private javax.swing.JLabel total_orders;
    // End of variables declaration//GEN-END:variables
}
