package manager_panels;

import control.jdbcpostgreSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author linhnguyen
 */
public class Ingredient extends javax.swing.JPanel {
    
    private static final java.util.List<String> id_list = new ArrayList<>();
    private static final java.util.List<String> ingredients_list = new ArrayList<>();
    private static final java.util.List<String> stock_list = new ArrayList<>();
    private static final java.util.List<String> restock_list = new ArrayList<>();
    private static final java.util.List<String> supplier_list = new ArrayList<>();
    private JPanel panel;
    
    public Ingredient() {
        initComponents();
    }
    
    public void load_table() {
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "SELECT * FROM ingredients";

            ResultSet result = stmt.executeQuery(sqlStatement);
            
            while(result.next()) {
                id_list.add(result.getString("ingredient_id"));
                ingredients_list.add(result.getString("name").substring(1));
                stock_list.add(result.getString("stock_level"));
                restock_list.add(result.getString("restock_date").substring(1));
                supplier_list.add(result.getString("supplier").substring(1));
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
    
    public void load_ingredients(JPanel panel) {
        this.panel = panel;
        
        Object [][] data = new Object[id_list.size()][5];
        for (int i = 0; i < id_list.size(); i++) {
            Object[] row = { id_list.get(i), ingredients_list.get(i), stock_list.get(i), restock_list.get(i), supplier_list.get(i)};
            data[i] = row;
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            data,
            new String [] {
                "Ingredient ID", "Name", "Stock Level", "Restock Date", "Supplier"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_ingredient, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove_ingredient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_stock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_restock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_supplier)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_ingredient)
                    .addComponent(remove_ingredient)
                    .addComponent(change_name)
                    .addComponent(change_stock)
                    .addComponent(change_supplier)
                    .addComponent(change_restock))
                .addContainerGap())
        );
    }

    public static List<String> getId_list() {
        return id_list;
    }

    public static List<String> getIngredients_list() {
        return ingredients_list;
    }

    public static List<String> getStock_list() {
        return stock_list;
    }

    public static List<String> getRestock_list() {
        return restock_list;
    }

    public static List<String> getSupplier_list() {
        return supplier_list;
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
        add_ingredient = new javax.swing.JButton();
        remove_ingredient = new javax.swing.JButton();
        change_restock = new javax.swing.JButton();
        change_supplier = new javax.swing.JButton();
        change_name = new javax.swing.JButton();
        change_stock = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingredient ID", "Name", "Stock Level", "Restock Date", "Supplier"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        add_ingredient.setText("Add");
        add_ingredient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_ingredientActionPerformed(evt);
            }
        });

        remove_ingredient.setText("Remove");
        remove_ingredient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_ingredientActionPerformed(evt);
            }
        });

        change_restock.setText("Restock Date");
        change_restock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_restockActionPerformed(evt);
            }
        });

        change_supplier.setText("Supplier");
        change_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_supplierActionPerformed(evt);
            }
        });

        change_name.setText("Name");
        change_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_nameActionPerformed(evt);
            }
        });

        change_stock.setText("Stock Level");
        change_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_stockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_ingredient, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove_ingredient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_stock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_restock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_supplier)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_ingredient)
                    .addComponent(remove_ingredient)
                    .addComponent(change_name)
                    .addComponent(change_stock)
                    .addComponent(change_supplier)
                    .addComponent(change_restock))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void add_ingredientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_ingredientActionPerformed
        String input = JOptionPane.showInputDialog(this, "Add New Ingredient: id, name, stock, restock date, supplier");
        String[] split_input = input.split(", ");
        
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "INSERT INTO ingredients (ingredient_id, name, stock_level, restock_date, supplier) VALUES (" + split_input[0] + ", ' " + split_input[1] + "', " + split_input[2] + ", ' " + split_input[3] + "', ' " + split_input[4] + "')";
            stmt.executeQuery(sqlStatement);
        }
        catch (SQLException e) {
            String[] error_input = e.getMessage().split("\n");
            if ("ERROR: duplicate key value violates unique constraint \"ingredients_pkey\"".equals(error_input[0])) {
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
       
        id_list.clear();
        ingredients_list.clear();
        stock_list.clear();
        restock_list.clear();
        supplier_list.clear();
        
        this.panel.removeAll();
        this.panel.repaint();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        load_table();
        load_ingredients(panel);
    }//GEN-LAST:event_add_ingredientActionPerformed

    private void remove_ingredientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_ingredientActionPerformed
        String input = JOptionPane.showInputDialog(this, "Remove Ingredient: id");
        
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "DELETE FROM ingredients WHERE ingredient_id = " + input;
            stmt.executeQuery(sqlStatement);
        }
        catch (SQLException e) {
            if (!id_list.contains(input)) {
                JOptionPane.showMessageDialog(this, "Ingredient ID does not exist.");
            }
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        
        try {
            conn.close();
        } 
        catch(Exception e) {
            System.out.println("Connection NOT Closed.");
        }
        
        id_list.clear();
        ingredients_list.clear();
        stock_list.clear();
        restock_list.clear();
        supplier_list.clear();
        
        this.panel.removeAll();
        this.panel.repaint();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        load_table();
        load_ingredients(panel);
    }//GEN-LAST:event_remove_ingredientActionPerformed

    private void change_restockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_restockActionPerformed
        String input = JOptionPane.showInputDialog(this, "Change Restock Date: date, id");
        String[] split_input = input.split(", ");
        
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "UPDATE ingredients SET restock_date = ' " + split_input[0] + "' WHERE ingredient_id = " + split_input[1];
            stmt.executeQuery(sqlStatement);
        }
        catch (SQLException e) {
            if (!id_list.contains(split_input[1])) {
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
        
        id_list.clear();
        ingredients_list.clear();
        stock_list.clear();
        restock_list.clear();
        supplier_list.clear();
        
        this.panel.removeAll();
        this.panel.repaint();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        load_table();
        load_ingredients(panel);
    }//GEN-LAST:event_change_restockActionPerformed

    private void change_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_supplierActionPerformed
        String input = JOptionPane.showInputDialog(this, "Change Supplier: supplier, id");
        String[] split_input = input.split(", ");
        
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "UPDATE ingredients SET supplier = ' " + split_input[0] + "' WHERE ingredient_id = " + split_input[1];
            stmt.executeQuery(sqlStatement);
        }
        catch (SQLException e) {
            if (!id_list.contains(split_input[1])) {
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
        
        id_list.clear();
        ingredients_list.clear();
        stock_list.clear();
        restock_list.clear();
        supplier_list.clear();
        
        this.panel.removeAll();
        this.panel.repaint();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        load_table();
        load_ingredients(panel);
    }//GEN-LAST:event_change_supplierActionPerformed

    private void change_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_nameActionPerformed
        String input = JOptionPane.showInputDialog(this, "Change Name: name, id");
        String[] split_input = input.split(", ");
        
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "UPDATE ingredients SET name = ' " + split_input[0] + "' WHERE ingredient_id = " + split_input[1];
            stmt.executeQuery(sqlStatement);
        }
        catch (SQLException e) {
            if (!id_list.contains(split_input[1])) {
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
        
        id_list.clear();
        ingredients_list.clear();
        stock_list.clear();
        restock_list.clear();
        supplier_list.clear();
        
        this.panel.removeAll();
        this.panel.repaint();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        load_table();
        load_ingredients(panel);
    }//GEN-LAST:event_change_nameActionPerformed

    private void change_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_stockActionPerformed
        String input = JOptionPane.showInputDialog(this, "Change Stock Level: level, id");
        String[] split_input = input.split(", ");
        
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "UPDATE ingredients SET stock_level = ' " + split_input[0] + "' WHERE ingredient_id = " + split_input[1];
            stmt.executeQuery(sqlStatement);
        }
        catch (SQLException e) {
            if (!id_list.contains(split_input[1])) {
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
        
        id_list.clear();
        ingredients_list.clear();
        stock_list.clear();
        restock_list.clear();
        supplier_list.clear();
        
        this.panel.removeAll();
        this.panel.repaint();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        load_table();
        load_ingredients(panel);
    }//GEN-LAST:event_change_stockActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_ingredient;
    private javax.swing.JButton change_name;
    private javax.swing.JButton change_restock;
    private javax.swing.JButton change_stock;
    private javax.swing.JButton change_supplier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton remove_ingredient;
    // End of variables declaration//GEN-END:variables
}