package cashier_panels;

import control.Cashier;
import cashier_panels.tarobean;
import cashier_panels.sgcane;
import javax.swing.JPanel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author ltang
 */
public class order_home extends javax.swing.JPanel {
    private Cashier worker;
    private JPanel panel;

    /**
     * Creates new form order_home
     */
    public order_home() {
        
    }

    public void load_home(JPanel panel, Cashier worker){
        this.panel = panel;
        this.worker = worker;
        tea_btn = new javax.swing.JButton();
        bwsg_btn = new javax.swing.JButton();
        mktea_btn = new javax.swing.JButton();
        tarobean_btn = new javax.swing.JButton();
        sgcane_btn = new javax.swing.JButton();
        fruits_btn = new javax.swing.JButton();
        traditional_btn = new javax.swing.JButton();
        seasonal_btn = new javax.swing.JButton();

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

        tarobean_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tarobean_btn.setText("Fresh Taro/Red Bea");
        tarobean_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarobean_btnActionPerformed(evt);
            }
        });

        sgcane_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sgcane_btn.setText("Fresh Sugarcane");
        sgcane_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgcane_btnActionPerformed(evt);
            }
        });

        fruits_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fruits_btn.setText("Fruits");
        fruits_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruits_btnActionPerformed(evt);
            }
        });

        traditional_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        traditional_btn.setText("Traditional");
        traditional_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traditional_btnActionPerformed(evt);
            }
        });

        seasonal_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        seasonal_btn.setText("Seasonal");
        seasonal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seasonal_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.panel);
        this.panel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fruits_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(traditional_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bwsg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sgcane_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mktea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tarobean_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(seasonal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bwsg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mktea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fruits_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sgcane_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarobean_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(traditional_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seasonal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
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

        tea_btn = new javax.swing.JButton();
        bwsg_btn = new javax.swing.JButton();
        mktea_btn = new javax.swing.JButton();
        tarobean_btn = new javax.swing.JButton();
        sgcane_btn = new javax.swing.JButton();
        fruits_btn = new javax.swing.JButton();
        traditional_btn = new javax.swing.JButton();
        seasonal_btn = new javax.swing.JButton();

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

        tarobean_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tarobean_btn.setText("Fresh Taro/Red Bea");
        tarobean_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarobean_btnActionPerformed(evt);
            }
        });

        sgcane_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sgcane_btn.setText("Fresh Sugarcane");
        sgcane_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgcane_btnActionPerformed(evt);
            }
        });

        fruits_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fruits_btn.setText("Fruits");
        fruits_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruits_btnActionPerformed(evt);
            }
        });

        traditional_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        traditional_btn.setText("Traditional");
        traditional_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traditional_btnActionPerformed(evt);
            }
        });

        seasonal_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        seasonal_btn.setText("Seasonal");
        seasonal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seasonal_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fruits_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(traditional_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bwsg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sgcane_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mktea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tarobean_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(seasonal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bwsg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mktea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fruits_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sgcane_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarobean_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(traditional_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seasonal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tea_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tea_btnActionPerformed
        this.panel.removeAll();
        this.panel.repaint();
        tea temp = new tea();
        temp.load_tea(this.panel, this.worker);
    }//GEN-LAST:event_tea_btnActionPerformed

    private void bwsg_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bwsg_btnActionPerformed
        this.panel.removeAll();
        this.panel.repaint();
        bwsg temp = new bwsg();
        temp.load_bwsg(this.panel, this.worker);
    }//GEN-LAST:event_bwsg_btnActionPerformed

    private void mktea_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mktea_btnActionPerformed
        this.panel.removeAll();
        this.panel.repaint();
        milktea temp = new milktea();
        temp.load_milktea(this.panel, this.worker);
    }//GEN-LAST:event_mktea_btnActionPerformed

    private void tarobean_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarobean_btnActionPerformed
        this.panel.removeAll();
        this.panel.repaint();
        tarobean temp = new tarobean();
        temp.load_tarobean(this.panel, this.worker);
    }//GEN-LAST:event_tarobean_btnActionPerformed

    private void sgcane_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgcane_btnActionPerformed
        this.panel.removeAll();
        this.panel.repaint();
        sgcane temp = new sgcane();
        temp.load_sgcane(this.panel, this.worker);
    }//GEN-LAST:event_sgcane_btnActionPerformed

    private void fruits_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruits_btnActionPerformed
        this.panel.removeAll();
        this.panel.repaint();
        fruit temp = new fruit();
        temp.load_fruit(this.panel, this.worker);
    }//GEN-LAST:event_fruits_btnActionPerformed

    private void traditional_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traditional_btnActionPerformed
        this.panel.removeAll();
        this.panel.repaint();
        traditional temp = new traditional();
        temp.load_traditional(this.panel, this.worker);
    }//GEN-LAST:event_traditional_btnActionPerformed

    private void seasonal_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seasonal_btnActionPerformed
        this.panel.removeAll();
        this.panel.repaint();
        drink temp = new drink();
        temp.load_seasonal(this.panel, this.worker);
    }//GEN-LAST:event_seasonal_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bwsg_btn;
    private javax.swing.JButton fruits_btn;
    private javax.swing.JButton mktea_btn;
    private javax.swing.JButton seasonal_btn;
    private javax.swing.JButton sgcane_btn;
    private javax.swing.JButton tarobean_btn;
    private javax.swing.JButton tea_btn;
    private javax.swing.JButton traditional_btn;
    // End of variables declaration//GEN-END:variables
}
