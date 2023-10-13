package cashier_panels;
import control.Cashier;
import control.jdbcpostgreSQL;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author nishka
 */
public class traditional extends javax.swing.JPanel {
    private int base_drink_id = 0;
    private String name = "";
    private double price;
    private List<String> ingredients = new ArrayList<>();
    private JPanel panel;
    public List<drink> drinks = new ArrayList<>();
    public Cashier worker;

    /**
     * Creates new form traditional
     */
    public traditional() {
        initComponents();
    }
    public Connection connect(){
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        return conn;
    }
    
    public void load_traditional(JPanel panel, Cashier worker){
        this.worker = worker;
        this.panel = panel;

        back_btn = new javax.swing.JButton();
        drink7 = new javax.swing.JButton();
        drink2 = new javax.swing.JButton();
        drink3 = new javax.swing.JButton();
        drink4 = new javax.swing.JButton();
        drink6 = new javax.swing.JButton();
        drink5 = new javax.swing.JButton();

        back_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        drink4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink4.setText("<html> super trio wintermelon tea");
        drink4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink4ActionPerformed(evt);
            }
        });

        drink2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink2.setText("<html> wintermelon tea");
        drink2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink2ActionPerformed(evt);
            }
        });

        drink3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink3.setText("<html> wintermelon latte");
        drink3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink3ActionPerformed(evt);
            }
        });

        drink7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink7.setText("<html> grass jelly tea");
        drink7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink6ActionPerformed(evt);
            }
        });

        drink5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink5.setText("<html> black sesame milk");
        drink5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink5ActionPerformed(evt);
            }
        });
        
        drink6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink6.setText("<html> thai tea");
        drink6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.panel);
        this.panel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_btn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drink7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drink5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(drink4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(493, Short.MAX_VALUE))
        );
    }
    
        private void find_drink(String name){
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "SELECT * FROM base_drinks";
            ResultSet result = stmt.executeQuery(sqlStatement);
            String ing_list = "";
            while(result.next()){
                if(name.contains(result.getString("name"))){
                    this.base_drink_id = result.getInt("base_id");
                    System.out.println(base_drink_id+" base_id");
                    this.price = result.getDouble("price");
                    System.out.println(price+" price");
                    
                    ing_list = result.getString("list_ingredients").substring(1, result.getString("list_ingredients").length()-1);
                    System.out.println(ing_list);
                    String[] stringArray = ing_list.split(",");
                    for (int i = 0; i < stringArray.length; ++i){
                        if(stringArray[i].startsWith("\"")){
                            this.ingredients.add(stringArray[i].substring(1, stringArray[i].length()-1));
                        }
                        else{
                            this.ingredients.add(stringArray[i]);
                        }
                    }
                     break;
                }
            }
            System.out.println(price);
            System.out.println(ingredients);
            drink temp = new drink();
            temp.load_drink(this.panel, this.worker, this.name, this.base_drink_id, this.price, this.ingredients);
        }
        catch (SQLException e) {
            String[] error_input = e.getMessage().split("\n");
            if ("ERROR: duplicate key value violates unique constraint \"base_drinks_pkey\"".equals(error_input[0])) {
                JOptionPane.showMessageDialog(this, "Cannot add duplicate Ingredient ID");
            }
            
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
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
        drink2 = new javax.swing.JButton();
        drink3 = new javax.swing.JButton();
        drink4 = new javax.swing.JButton();
        drink5 = new javax.swing.JButton();
        drink6 = new javax.swing.JButton();
        drink7 = new javax.swing.JButton();

        back_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        drink2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink2.setText("<html> wintermelon tea");
        drink2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink2ActionPerformed(evt);
            }
        });

        drink3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink3.setText("<html> wintermelon latte");
        drink3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink3ActionPerformed(evt);
            }
        });

        drink4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink4.setText("<html> super trio wintermelon tea");
        drink4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink4ActionPerformed(evt);
            }
        });

        drink5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink5.setText("<html> black sesame milk");
        drink5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink5ActionPerformed(evt);
            }
        });

        drink6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink6.setText("<html> thai tea");
        drink6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink6ActionPerformed(evt);
            }
        });

        drink7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink7.setText("<html> grass jelly tea");
        drink7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_btn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drink7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drink5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(drink4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(497, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        panel.removeAll();
        panel.repaint();
        order_home temp = new order_home();
        temp.load_home(this.panel, this.worker);
    }//GEN-LAST:event_back_btnActionPerformed

    private void drink2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink2ActionPerformed
        this.name = drink2.getText();
        this.find_drink(drink2.getText());
    }//GEN-LAST:event_drink2ActionPerformed

    private void drink3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink3ActionPerformed
        this.name = drink3.getText();
        this.find_drink(drink3.getText());
    }//GEN-LAST:event_drink3ActionPerformed

    private void drink4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink4ActionPerformed
        this.name = drink4.getText();
        this.find_drink(drink4.getText());
    }//GEN-LAST:event_drink4ActionPerformed

    private void drink5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink5ActionPerformed
        this.name = drink5.getText();
        this.find_drink(drink5.getText());
    }//GEN-LAST:event_drink5ActionPerformed

    private void drink6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink6ActionPerformed
        this.name = drink6.getText();
        this.find_drink(drink6.getText());
    }//GEN-LAST:event_drink6ActionPerformed

    private void drink7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink7ActionPerformed
        this.name = drink7.getText();
        this.find_drink(drink7.getText());
    }//GEN-LAST:event_drink7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton drink2;
    private javax.swing.JButton drink3;
    private javax.swing.JButton drink4;
    private javax.swing.JButton drink5;
    private javax.swing.JButton drink6;
    private javax.swing.JButton drink7;
    // End of variables declaration//GEN-END:variables
}
