package control;


import control.FrameHandler;
import javax.swing.*;

public class Redirect extends javax.swing.JPanel {

    private JFrame frame;
    private FrameHandler fh;
    
    Redirect(JFrame frame, FrameHandler fh) {
        this.frame = frame;
        this.fh = fh;
        try {
            load_redirect();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void load_redirect() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cashier_view = new javax.swing.JButton();
        manager_view = new javax.swing.JButton();
        home = new javax.swing.JButton();

        cashier_view.setText("Cashier View");
        cashier_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashier_viewActionPerformed(evt);
            }
        });

        manager_view.setText("Manager View");
        manager_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manager_viewActionPerformed(evt);
            }
        });

        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(446, 446, 446)
                .addComponent(cashier_view)
                .addGap(97, 97, 97)
                .addComponent(manager_view)
                .addContainerGap(439, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(home)
                .addGap(564, 564, 564))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashier_view)
                    .addComponent(manager_view))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                .addComponent(home)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        fh.actionPerformed(evt);
    }//GEN-LAST:event_homeActionPerformed

    private void manager_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manager_viewActionPerformed
        fh.actionPerformed(evt);
    }//GEN-LAST:event_manager_viewActionPerformed

    private void cashier_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashier_viewActionPerformed
        fh.actionPerformed(evt);
    }//GEN-LAST:event_cashier_viewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cashier_view;
    private javax.swing.JButton home;
    private javax.swing.JButton manager_view;
    // End of variables declaration//GEN-END:variables
}