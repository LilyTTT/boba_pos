package cashier_panels;
import control.Cashier;
import control.jdbcpostgreSQL;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class tea extends javax.swing.JPanel {
    private int base_drink_id = 0;
    private String name = "";
    private float price;
    private List<String> ingredients = new ArrayList<>();
    private JPanel panel;
    public List<drink> drinks = new ArrayList<>();
    public Cashier worker;

    public tea() {
        initComponents();
    }
    
    public Connection connect(){
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        return conn;
    }

    public void load_tea(JPanel panel, Cashier worker){
        this.worker = worker;
        this.panel = panel;

        back_btn = new javax.swing.JButton();
        drink1 = new javax.swing.JButton();
        drink2 = new javax.swing.JButton();
        drink3 = new javax.swing.JButton();
        drink6 = new javax.swing.JButton();
        drink5 = new javax.swing.JButton();

        back_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        drink1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink1.setText("<html> sun moon lake black tea");
        drink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink1ActionPerformed(evt);
            }
        });

        drink2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink2.setText("<html> pouchong green tea");
        drink2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink2ActionPerformed(evt);
            }
        });

        drink3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink3.setText("<html> songboling mountain tea");
        drink3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink3ActionPerformed(evt);
            }
        });

        drink6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink6.setText("<html> lugu oolong tea");
        drink6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink6ActionPerformed(evt);
            }
        });

        drink5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink5.setText("<html> tea w/ original salty cream");
        drink5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.panel);
        this.panel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_btn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(drink6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drink5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(374, Short.MAX_VALUE))
        );
    }
    
    private void find_drink(String name){
        try{
            String line;
            BufferedReader br = new BufferedReader(new FileReader("./src/csv_files/base_drinks.csv"));  
            String[] this_drink = null;
            while ((line = br.readLine()) != null){  
                this_drink = line.split(","); 
                if(this_drink[1].equals(this.name.substring(7))){
                    break;
                }
            }
            
            this.base_drink_id = Integer.parseInt(this_drink[0]);
            this.price = Float.parseFloat(this_drink[2]);
            for(int i = 3; i < this_drink.length; ++i ){
                this.ingredients.add(this_drink[i]);
            }
            drink temp = new drink();
            temp.load_drink(this.panel, this.worker, this.name, this.base_drink_id, this.price, this.ingredients);
            for(int i = 0; i < temp.qty; ++i){
                this.worker.drinks.add(temp);
            }
            this.worker.load_order();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_btn = new javax.swing.JButton();
        drink1 = new javax.swing.JButton();
        drink2 = new javax.swing.JButton();
        drink3 = new javax.swing.JButton();
        drink6 = new javax.swing.JButton();
        drink5 = new javax.swing.JButton();

        back_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        drink1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink1.setText("<html> sun moon lake black tea");
        drink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink1ActionPerformed(evt);
            }
        });

        drink2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink2.setText("<html> pouchong green tea");
        drink2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink2ActionPerformed(evt);
            }
        });

        drink3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink3.setText("<html> songboling mountain tea");
        drink3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink3ActionPerformed(evt);
            }
        });

        drink6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink6.setText("<html> lugu oolong tea");
        drink6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink6ActionPerformed(evt);
            }
        });

        drink5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink5.setText("<html> tea w/ original salty cream");
        drink5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_btn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(drink6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drink5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(374, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        panel.removeAll();
        panel.repaint();
        order_home temp = new order_home();
        temp.load_home(this.panel, this.worker);
    }//GEN-LAST:event_back_btnActionPerformed

    private void drink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink1ActionPerformed
        this.name = drink1.getText();
        this.find_drink(drink1.getText());
    }//GEN-LAST:event_drink1ActionPerformed

    private void drink2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink2ActionPerformed
        this.name = drink2.getText();
        this.find_drink(drink2.getText());
    }//GEN-LAST:event_drink2ActionPerformed

    private void drink3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink3ActionPerformed
        this.name = drink3.getText();
        this.find_drink(drink3.getText());
    }//GEN-LAST:event_drink3ActionPerformed

    private void drink6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink6ActionPerformed
        this.name = drink6.getText();
        this.find_drink(drink6.getText());
    }//GEN-LAST:event_drink6ActionPerformed

    private void drink5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink5ActionPerformed
        this.name = drink5.getText();
        this.find_drink(drink5.getText());
    }//GEN-LAST:event_drink5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton drink1;
    private javax.swing.JButton drink2;
    private javax.swing.JButton drink3;
    private javax.swing.JButton drink5;
    private javax.swing.JButton drink6;
    // End of variables declaration//GEN-END:variables
}
