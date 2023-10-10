import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JPanel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;  
import java.util.Scanner;  
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */


public class sgcane extends javax.swing.JPanel {

    private int drink_id = 0;
    private String name = "";
    private float price;
    private List<String> ingredients = new ArrayList<>();
    private JPanel panel;
    public List<drink> drinks = new ArrayList<>();
    public Cashier worker;
    
    /**
     * Creates new form sgcane
     */

    public sgcane() {
        initComponents();
    }

    public Connection connect(){
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        return conn;
    }
    public void load_sgcane(JPanel panel, Cashier worker){
        this.worker = worker;
        this.panel = panel;
        drink1 = new javax.swing.JButton();
        drink2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(782, 803));

        drink1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink1.setText("<html> sugarcane mountain tea");
        drink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink1ActionPerformed(evt);
            }
        });

        drink2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink2.setText("<html> sugarcane lemon mountain tea");
        drink2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(panel);
        panel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(401, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(576, Short.MAX_VALUE))
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

        drink1 = new javax.swing.JButton();
        drink2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(782, 803));

        drink1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink1.setText("<html> sugarcane mountain tea");
        drink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink1ActionPerformed(evt);
            }
        });

        drink2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink2.setText("<html> sugarcane lemon mountain tea");
        drink2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(401, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(576, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void find_drink(String name){
        try{
            String line;
            BufferedReader br = new BufferedReader(new FileReader("./src/base_drinks.csv"));  
            String[] this_drink = null;
            while ((line = br.readLine()) != null){  
                this_drink = line.split(","); 
                if(this_drink[1].equals(this.name.substring(7))){
                    break;
                }
            }
            
            this.drink_id = Integer.parseInt(this_drink[0]);
            this.price = Float.parseFloat(this_drink[2]);
            for(int i = 3; i < this_drink.length; ++i ){
                this.ingredients.add(this_drink[i]);
            }
            drink temp = new drink();
            temp.load_drink(this.panel, this.worker, name, this.drink_id, this.price, this.ingredients);
            for(int i = 0; i < temp.qty; ++i){
                this.worker.drinks.add(temp);
            }
            this.worker.load_order();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    private void drink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink1ActionPerformed
        this.name = drink1.getText();
        this.find_drink(drink1.getText()); 
    }//GEN-LAST:event_drink1ActionPerformed

    private void drink2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink2ActionPerformed
        this.name = drink2.getText();
        this.find_drink(drink2.getText());
    }//GEN-LAST:event_drink2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton drink1;
    private javax.swing.JButton drink2;
    // End of variables declaration//GEN-END:variables
}
