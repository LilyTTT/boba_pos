package manager_panels;

import control.jdbcpostgreSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author linhnguyen
 */
public class Menu extends javax.swing.JPanel {
    
    private static final java.util.List<String> drink_id_list = new ArrayList<>();
    private static final java.util.List<String> name_list = new ArrayList<>();
    private static final java.util.List<String> price_list = new ArrayList<>();
    private static final java.util.List<String> ingredients_list = new ArrayList<>();
    private JPanel panel;

    public Menu() {
        initComponents();
    }
    
    public void load_table() {
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "SELECT * FROM base_drinks";

            ResultSet result = stmt.executeQuery(sqlStatement);
            
            while(result.next()) {
                drink_id_list.add(result.getString("base_id"));
                name_list.add(result.getString("name"));
                price_list.add(result.getString("price"));
                ingredients_list.add(result.getString("list_ingredients"));
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
                    
    public void load_drinks(JPanel panel) {
        this.panel = panel;
        
        Object [][] data = new Object[drink_id_list.size()][4];
        for (int i = 0; i < drink_id_list.size(); i++) {
            Object[] row = { drink_id_list.get(i), name_list.get(i), price_list.get(i), ingredients_list.get(i)};
            data[i] = row;
        }
      
//        jScrollPane1 = new javax.swing.JScrollPane();
//        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            data,
            new String [] {
                "Drink ID", "Name", "Price", "Ingredients List"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
//        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(500);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(panel);
        panel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_drinks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove_drinks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_price)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_ingredients)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(add_drinks)
                    .addComponent(remove_drinks)
                    .addComponent(change_price)
                    .addComponent(change_name)
                    .addComponent(change_ingredients))
                .addContainerGap())
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
        add_drinks = new javax.swing.JButton();
        remove_drinks = new javax.swing.JButton();
        change_price = new javax.swing.JButton();
        change_name = new javax.swing.JButton();
        change_ingredients = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drink ID", "Name", "Price", "Ingredients List"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(500);
        }

        add_drinks.setText("Add");
        add_drinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_drinksActionPerformed(evt);
            }
        });

        remove_drinks.setText("Remove");
        remove_drinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_drinksActionPerformed(evt);
            }
        });

        change_price.setText("Price");
        change_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_priceActionPerformed(evt);
            }
        });

        change_name.setText("Name");
        change_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_nameActionPerformed(evt);
            }
        });

        change_ingredients.setText("Ingredients");
        change_ingredients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_ingredientsActionPerformed(evt);
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
                        .addComponent(add_drinks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove_drinks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_price)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_ingredients)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(add_drinks)
                    .addComponent(remove_drinks)
                    .addComponent(change_price)
                    .addComponent(change_name)
                    .addComponent(change_ingredients))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void add_drinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_drinksActionPerformed
        String input = JOptionPane.showInputDialog(this, "Add New Drink: id, name, price, ingredient list");
        String[] split_input = input.split(", ");
        
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "INSERT INTO base_drinks (base_id, name, price, list_ingredients) VALUES (" + split_input[0] + ", '" + split_input[1] + "', " + split_input[2] + ", '{" + split_input[3] + "}')";
            stmt.executeQuery(sqlStatement);
        }
        catch (SQLException e) {
            String[] error_input = e.getMessage().split("\n");
            if ("ERROR: duplicate key value violates unique constraint \"base_drinks_pkey\"".equals(error_input[0])) {
                JOptionPane.showMessageDialog(this, "Cannot add duplicate Ingredient ID");
            }
            
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        
        try {
            conn.close();
        } 
        catch(SQLException e) {
            System.out.println("Connection NOT Closed.");
        }
        
        drink_id_list.clear();
        name_list.clear();
        price_list.clear();
        ingredients_list.clear();
        
        this.panel.removeAll();
        this.panel.repaint();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        load_table();
        load_drinks(panel);
    }//GEN-LAST:event_add_drinksActionPerformed

    private void remove_drinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_drinksActionPerformed
        String input = JOptionPane.showInputDialog(this, "Remove Drink: id");
        
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "DELETE FROM base_drinks WHERE base_id = " + input;
            stmt.executeQuery(sqlStatement);
        }
        catch (SQLException e) {
            if (!drink_id_list.contains(input)) {
                JOptionPane.showMessageDialog(this, "Ingredient ID does not exist.");
            }
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        
        try {
            conn.close();
        } 
        catch(SQLException e) {
            System.out.println("Connection NOT Closed.");
        }
        
        drink_id_list.clear();
        name_list.clear();
        price_list.clear();
        ingredients_list.clear();
        
        this.panel.removeAll();
        this.panel.repaint();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        load_table();
        load_drinks(panel);
    }//GEN-LAST:event_remove_drinksActionPerformed

    private void change_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_priceActionPerformed
        String input = JOptionPane.showInputDialog(this, "Change Price: price, id");
        String[] split_input = input.split(", ");
        
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "UPDATE base_drinks SET price = " + split_input[0] + " WHERE base_id = " + split_input[1];
            stmt.executeQuery(sqlStatement);
        }
        catch (SQLException e) {
            if (!drink_id_list.contains(split_input[1])) {
                JOptionPane.showMessageDialog(this, "Drink ID does not exist.");
            }
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        
        try {
            conn.close();
        } 
        catch(SQLException e) {
            System.out.println("Connection NOT Closed.");
        }
        
        drink_id_list.clear();
        name_list.clear();
        price_list.clear();
        ingredients_list.clear();
        
        this.panel.removeAll();
        this.panel.repaint();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        load_table();
        load_drinks(panel);
    }//GEN-LAST:event_change_priceActionPerformed

    private void change_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_nameActionPerformed
        String input = JOptionPane.showInputDialog(this, "Change Name: name, id");
        String[] split_input = input.split(", ");
        
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "UPDATE base_drinks SET name = '" + split_input[0] + "' WHERE base_id = " + split_input[1];
            stmt.executeQuery(sqlStatement);
        }
        catch (SQLException e) {
            if (!drink_id_list.contains(split_input[1])) {
                JOptionPane.showMessageDialog(this, "Drink ID does not exist.");
            }
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        
        try {
            conn.close();
        } 
        catch(SQLException e) {
            System.out.println("Connection NOT Closed.");
        }
        
        drink_id_list.clear();
        name_list.clear();
        price_list.clear();
        ingredients_list.clear();
        
        this.panel.removeAll();
        this.panel.repaint();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        load_table();
        load_drinks(panel);
    }//GEN-LAST:event_change_nameActionPerformed

    private void change_ingredientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_ingredientsActionPerformed
        String input = JOptionPane.showInputDialog(this, "Change Ingredients: ingredients, id");
        String[] split_input = input.split(", ");
        
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "UPDATE base_drinks SET list_ingredients = '{" + split_input[0] + "}' WHERE base_id = " + split_input[1];
            stmt.executeQuery(sqlStatement);
        }
        catch (SQLException e) {
            if (!drink_id_list.contains(split_input[1])) {
                JOptionPane.showMessageDialog(this, "Drink ID does not exist.");
            }
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        
        try {
            conn.close();
        } 
        catch(SQLException e) {
            System.out.println("Connection NOT Closed.");
        }
        
        drink_id_list.clear();
        name_list.clear();
        price_list.clear();
        ingredients_list.clear();
        
        this.panel.removeAll();
        this.panel.repaint();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        load_table();
        load_drinks(panel);
    }//GEN-LAST:event_change_ingredientsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_drinks;
    private javax.swing.JButton change_ingredients;
    private javax.swing.JButton change_name;
    private javax.swing.JButton change_price;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton remove_drinks;
    // End of variables declaration//GEN-END:variables
}
