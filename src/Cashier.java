
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Cashier extends javax.swing.JPanel {

    private JFrame frame;
    private FrameHandler fh;
    
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
    
    private void load_cashier() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        drink_name = new javax.swing.JLabel();
        drink_qty = new javax.swing.JLabel();
        each_price = new javax.swing.JLabel();
        total_price = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        disocunt_label = new javax.swing.JLabel();
        tips_label = new javax.swing.JLabel();
        subtotal_lable = new javax.swing.JLabel();
        tax_label = new javax.swing.JLabel();
        balance_label = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        order_scroll = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
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

        setPreferredSize(new java.awt.Dimension(1200, 800));
        setVerifyInputWhenFocusTarget(false);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        drink_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink_name.setText("Name");

        drink_qty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink_qty.setText("Qty");

        each_price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        each_price.setText("Each");

        total_price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        total_price.setText("Total");

        disocunt_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        disocunt_label.setText("Discount:");

        tips_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tips_label.setText("Tips(%):");

        subtotal_lable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subtotal_lable.setText("Subtotal:");

        tax_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tax_label.setText("Tax:");

        balance_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        balance_label.setText("Balance Due:");

        total_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        total_label.setText("Total:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        order_scroll.setViewportView(jPanel1);

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
                .addGap(22, 22, 22)
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
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(drink_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(drink_qty)
                        .addGap(60, 60, 60)
                        .addComponent(each_price)
                        .addGap(56, 56, 56)
                        .addComponent(total_price)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(order_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tips_label)
                            .addComponent(disocunt_label))
                        .addGap(247, 247, 247)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtotal_lable)
                            .addComponent(balance_label)
                            .addComponent(tax_label)
                            .addComponent(total_label))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menu_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(menu_header)))
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drink_name)
                    .addComponent(drink_qty)
                    .addComponent(each_price)
                    .addComponent(total_price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(order_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disocunt_label)
                    .addComponent(subtotal_lable))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tips_label)
                    .addComponent(tax_label))
                .addGap(28, 28, 28)
                .addComponent(balance_label)
                .addGap(40, 40, 40)
                .addComponent(total_label)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu_header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tarobean_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarobean_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarobean_btnActionPerformed

    private void sgcane_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgcane_btnActionPerformed
        jPanel2.removeAll();
        jPanel2.repaint();
        sgcane temp = new sgcane();
        temp.load_sgcane(jPanel2);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balance_label;
    private javax.swing.JButton bwsg_btn;
    private javax.swing.JLabel disocunt_label;
    private javax.swing.JLabel drink_name;
    private javax.swing.JLabel drink_qty;
    private javax.swing.JLabel each_price;
    private javax.swing.JButton fruits_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel menu_header;
    private javax.swing.JScrollPane menu_scroll;
    private javax.swing.JButton mktea_btn;
    private javax.swing.JScrollPane order_scroll;
    private javax.swing.JButton sgcane_btn;
    private javax.swing.JLabel subtotal_lable;
    private javax.swing.JButton tarobean_btn;
    private javax.swing.JLabel tax_label;
    private javax.swing.JButton tea_btn;
    private javax.swing.JLabel tips_label;
    private javax.swing.JLabel total_label;
    private javax.swing.JLabel total_price;
    private javax.swing.JButton traditional_btn;
    // End of variables declaration//GEN-END:variables
}
