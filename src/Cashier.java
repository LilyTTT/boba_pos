
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Cashier extends javax.swing.JPanel {
    
    private int order_id;
    private int drink_id;
    private JFrame frame;
    private FrameHandler fh;
    List<drink> drinks = new ArrayList<>();
    
    Cashier(JFrame frame, FrameHandler fh) {
        this.frame = frame;
        this.fh = fh;
        try {
            load_cashier();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void load_cashier() {
        initComponents();
    }
    
    public Connection connect(){
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        return conn;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        subtotal_lable = new javax.swing.JLabel();
        tax_label = new javax.swing.JLabel();
        balance_label = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        order_scroll = new javax.swing.JScrollPane();
        order_content = new javax.swing.JTable();
        menu_scroll = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        tea_btn = new javax.swing.JButton();
        bwsg_btn = new javax.swing.JButton();
        mktea_btn = new javax.swing.JButton();
        fruits_btn = new javax.swing.JButton();
        sgcane_btn = new javax.swing.JButton();
        tarobean_btn = new javax.swing.JButton();
        traditional_btn = new javax.swing.JButton();
        menu_header = new javax.swing.JLabel();
        pay_btn = new javax.swing.JButton();
        discount_tips_btn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1200, 800));
        setVerifyInputWhenFocusTarget(false);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        subtotal_lable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subtotal_lable.setText("Subtotal:");

        tax_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tax_label.setText("Tax:");

        balance_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        balance_label.setText("Balance Due:");

        total_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        total_label.setText("Total:");

        order_scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        order_scroll.setToolTipText("");

        order_content.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        order_content.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Qty", "Each", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        order_content.setRowHeight(30);
        order_scroll.setViewportView(order_content);
        if (order_content.getColumnModel().getColumnCount() > 0) {
            order_content.getColumnModel().getColumn(0).setPreferredWidth(450);
        }

        menu_scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tea_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tea_btn.setText("Teas");
        tea_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tea_btnActionPerformed(evt);
            }
        });

        bwsg_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bwsg_btn.setText("Brown Sugar");
        bwsg_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bwsg_btnActionPerformed(evt);
            }
        });

        mktea_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mktea_btn.setText("Milk Tea");
        mktea_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mktea_btnActionPerformed(evt);
            }
        });

        fruits_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fruits_btn.setText("Fruits");
        fruits_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruits_btnActionPerformed(evt);
            }
        });

        sgcane_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sgcane_btn.setText("Fresh Sugarcane");
        sgcane_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgcane_btnActionPerformed(evt);
            }
        });

        tarobean_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tarobean_btn.setText("Fresh Taro/Red Bea");
        tarobean_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarobean_btnActionPerformed(evt);
            }
        });

        traditional_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        traditional_btn.setText("Traditional");
        traditional_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traditional_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(traditional_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fruits_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bwsg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sgcane_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mktea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tarobean_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bwsg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mktea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fruits_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sgcane_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarobean_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(traditional_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        menu_scroll.setViewportView(jPanel2);

        menu_header.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_header.setText("Home");

        pay_btn.setText("Pay Now");
        pay_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_btnActionPerformed(evt);
            }
        });

        discount_tips_btn.setText("begone");
        discount_tips_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discount_tips_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtotal_lable)
                            .addComponent(balance_label))
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total_label)
                            .addComponent(tax_label)
                            .addComponent(pay_btn))
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(order_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(menu_header)))
                .addContainerGap(455, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(menu_header)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menu_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(order_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(subtotal_lable)
                                    .addComponent(tax_label))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(balance_label)
                                    .addComponent(total_label))
                                .addGap(36, 36, 36)
                                .addComponent(pay_btn)))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tarobean_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarobean_btnActionPerformed
        jPanel2.removeAll();
        jPanel2.repaint();
        tarobean temp = new tarobean();
        temp.load_tarobean(jPanel2, this);
    }//GEN-LAST:event_tarobean_btnActionPerformed

    private void sgcane_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgcane_btnActionPerformed
        jPanel2.removeAll();
        jPanel2.repaint();
        sgcane temp = new sgcane();
        temp.load_sgcane(jPanel2, this);
    }//GEN-LAST:event_sgcane_btnActionPerformed

    private void tea_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tea_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tea_btnActionPerformed

    private void bwsg_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bwsg_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bwsg_btnActionPerformed

    private void fruits_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruits_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fruits_btnActionPerformed

    private void traditional_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traditional_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_traditional_btnActionPerformed

    private void mktea_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mktea_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mktea_btnActionPerformed

    private void discount_tips_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discount_tips_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discount_tips_btnActionPerformed

    private void pay_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_btnActionPerformed
        // get order ID for this order
        Connection conn = this.connect();
        String order_str = "";
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "SELECT * FROM orders";

            ResultSet result = stmt.executeQuery(sqlStatement);
            
            while(result.next()) {
                order_str = (result.getString("order_id"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        
        this.order_id = Integer.parseInt(order_str) + 1;
        
        
        for(int i = 0; i < this.drinks.size(); ++i){
            drink curr = this.drinks.get(i);
            int drink_id = curr.drink_id;
            int num_toppings = curr.num_toppings;
            int topping_id = 0;
            String name = curr.name;
            float base_price = (float) (curr.price - curr.num_toppings * 0.75);
            
            for(int k = 0; k < curr.used_ingredients.size(); ++k){
                //TODO WRITE TO INGREDIENTS IN DATABASE
                
                //TODO DEDUCT AMOUNT IN INVENTORY
            }
            
            //topping_id, drink_id, name <- last [num_toppings] of used_ingre
            for(int x = curr.used_ingredients.size() - num_toppings; x < num_toppings; ++x){
                String topping_str = "";
                try {
                    Statement stmt = conn.createStatement();
                    String sqlStatement = "SELECT * FROM toppings";

                    ResultSet result = stmt.executeQuery(sqlStatement);

                    while(result.next()) {
                        topping_str = (result.getString("topping_id"));
                    }
                    topping_id = Integer.parseInt(topping_str) + 1;
                    stmt = conn.createStatement();
                    sqlStatement = "INSERT INTO toppings (topping_id, drink_id, name) VALUES (" + topping_id + drink_id + curr.used_ingredients.get(x)+ ")";
                    
                }
                catch (Exception e) {
                    e.printStackTrace();
                    System.err.println(e.getClass().getName()+": "+e.getMessage());
                }

                
                
                // TODO add topping -> topping_id, drink_id, name
            }
            
            // drink: drink_id, order_id, name, base_price, # toppings
            for(int j = 0; j < curr.qty; ++j){
                //TODO WRITE TO DRINKS IN DATABASE 
            }
            
            // drink_id, ingredients_id
  
        }
        
        //orders: order_id, employee_id, data, payment, amount, time
    }//GEN-LAST:event_pay_btnActionPerformed
    
    public void load_order(){
        System.out.println("order test");
        float sum = 0;
        for (int i = 0; i < this.drinks.size(); ++i){
            drink temp = drinks.get(i);
            sum += temp.price * temp.qty;
            
            if(order_content.getRowCount() <= i){
                DefaultTableModel model = (DefaultTableModel) order_content.getModel();
                model.addRow(new Object[]{"Column 1", "Column 2", "Column 3"});
            }
            
            order_content.setValueAt(temp.name, i, 0);
            order_content.setValueAt(temp.qty, i, 1);
            order_content.setValueAt(temp.price, i, 2);
            order_content.setValueAt(temp.price*temp.qty, i, 3);
           
        }
        
        System.out.println(sum);
        
        tax_label.setText("Tax: " + Float.toString((float) (0.075 * sum)));
        subtotal_lable.setText("Subtotal: " +Float.toString(sum));
        total_label.setText("Total: " + Float.toString((float) (0.075 * sum + sum)) );
        balance_label.setText("Balance Due: "  + Float.toString((float) (0.075 * sum + sum)) );
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balance_label;
    private javax.swing.JButton bwsg_btn;
    private javax.swing.JButton discount_tips_btn;
    private javax.swing.JButton fruits_btn;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel menu_header;
    private javax.swing.JScrollPane menu_scroll;
    private javax.swing.JButton mktea_btn;
    private javax.swing.JTable order_content;
    private javax.swing.JScrollPane order_scroll;
    private javax.swing.JButton pay_btn;
    private javax.swing.JButton sgcane_btn;
    private javax.swing.JLabel subtotal_lable;
    private javax.swing.JButton tarobean_btn;
    private javax.swing.JLabel tax_label;
    private javax.swing.JButton tea_btn;
    private javax.swing.JLabel total_label;
    private javax.swing.JButton traditional_btn;
    // End of variables declaration//GEN-END:variables
}
