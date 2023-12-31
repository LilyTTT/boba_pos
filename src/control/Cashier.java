package control;

import cashier_panels.drink;
import cashier_panels.tarobean;
import cashier_panels.sgcane;
import cashier_panels.tea;
import cashier_panels.bwsg;
import cashier_panels.fruit;
import cashier_panels.traditional;
import cashier_panels.milktea;
import control.FrameHandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import manager_panels.OrderHistory;
import control.FrameHandler;
import control.Manager;
import manager_panels.Ingredient;

public class Cashier extends javax.swing.JPanel {
    
    private int staff_id;
    private int order_id;
    private int drink_id;
    private JFrame frame;
    private FrameHandler fh;
    public List<drink> drinks = new ArrayList<>();
    
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
    
    public void set_staff_id(int id){
        this.staff_id = id;
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
        seasonal_btn = new javax.swing.JButton();
        menu_header = new javax.swing.JLabel();
        pay_btn = new javax.swing.JButton();
        home = new javax.swing.JButton();

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

        seasonal_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        seasonal_btn.setText("Seasonal");
        seasonal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seasonal_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(traditional_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fruits_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sgcane_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bwsg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seasonal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mktea_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarobean_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bwsg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mktea_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fruits_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sgcane_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarobean_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(traditional_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seasonal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtotal_lable)
                            .addComponent(balance_label))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total_label)
                            .addComponent(tax_label))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pay_btn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(home)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(order_scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))))
                        .addGap(14, 14, 14)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(menu_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                        .addComponent(menu_header)
                        .addContainerGap(318, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(home)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(order_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(subtotal_lable)
                                    .addComponent(tax_label))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(balance_label)
                                    .addComponent(total_label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pay_btn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(menu_header)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(menu_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
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
        jPanel2.removeAll();
        jPanel2.repaint();
        tea temp = new tea();
        temp.load_tea(jPanel2, this);
    }//GEN-LAST:event_tea_btnActionPerformed

    private void bwsg_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bwsg_btnActionPerformed
        jPanel2.removeAll();
        jPanel2.repaint();
        bwsg temp = new bwsg();
        temp.load_bwsg(jPanel2, this);
    }//GEN-LAST:event_bwsg_btnActionPerformed

    private void fruits_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruits_btnActionPerformed
        jPanel2.removeAll();
        jPanel2.repaint();
        fruit temp = new fruit();
        temp.load_fruit(jPanel2, this);
    }//GEN-LAST:event_fruits_btnActionPerformed

    private void traditional_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traditional_btnActionPerformed
        jPanel2.removeAll();
        jPanel2.repaint();
        traditional temp = new traditional();
        temp.load_traditional(jPanel2, this);
    }//GEN-LAST:event_traditional_btnActionPerformed

    private void mktea_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mktea_btnActionPerformed
        jPanel2.removeAll();
        jPanel2.repaint();
        milktea temp = new milktea();
        temp.load_milktea(jPanel2, this);
    }//GEN-LAST:event_mktea_btnActionPerformed

    private void pay_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_btnActionPerformed
        // get order ID for this order
        Connection conn = this.connect();
        String order_str = "";
        float tot_price = 0;
        
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
        
        //orders: order_id, staff_id, data, payment, amount, time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate curr_date = LocalDate.now();
        
        String date = dtf.format(curr_date);
        
        dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime curr_time = LocalTime.now();
        
        String time = dtf.format(curr_time);
        
        String method = "Cash";
        if(Math.random() < 0.5){
            method = "Card";
        }
        
        int p = 0;
        while(p < this.drinks.size()){
            drink temp = drinks.get(p);
            tot_price += temp.price * temp.qty;

            if(temp.qty == 1){
                p += 1;
            }
            else{
                p += temp.qty;
            }
            
        }
        
        try{
            Statement stmt = conn.createStatement();
            String sqlStatement = "INSERT INTO orders (order_id, staff_id, transaction_date, payment_method, payment_amount, timestamp) VALUES (" + order_id + ","+ staff_id + ", '"+ date + "','"+ method + "',"+ String.format("%.2f", tot_price*(1+0.075)) + ",'"+ time + "')";
            stmt.executeUpdate(sqlStatement);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        
        //load drinks, toppings, drinks_ingredients
        for(int i = 0; i < this.drinks.size(); ++i){
            drink curr = this.drinks.get(i);
            int drink_id = curr.drink_id;
            System.out.println(drink_id);
            int num_toppings = curr.num_toppings;
            int topping_id = 0;
            String drink_name = curr.name;
            float base_price = (float) (curr.price - curr.num_toppings * 0.75);
            List<String> ingredients_list = new ArrayList<>();
            List<Integer> ingredients_id_list = new ArrayList<>();
            
            tot_price += curr.price;
            
            // load ingredients and their IDs into lists
            try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "SELECT * FROM ingredients";

            ResultSet result = stmt.executeQuery(sqlStatement);
            
                while(result.next()) {
                    ingredients_id_list.add(result.getInt("ingredient_id"));
                    ingredients_list.add(result.getString("name").substring(1));
                }
            }
            catch (Exception e) {
                    e.printStackTrace();
                    System.err.println(e.getClass().getName()+": "+e.getMessage());
            }
            
            // append to drinks: drink_id, order_id, name, base_price, # toppings
            try{
                Statement stmt = conn.createStatement();
                String sqlStatement = "INSERT INTO drinks (drink_id, order_id, name, price, num_toppings) VALUES (" + drink_id + ","+ this.order_id + ",'"+ drink_name + "',"+ (double)base_price + "," + num_toppings + ")";
                stmt.executeUpdate(sqlStatement);
            }
            catch (Exception e) {
                e.printStackTrace();
                System.err.println(e.getClass().getName()+": "+e.getMessage());
            }
            
            
            for(int k = 0; k < curr.used_ingredients.size(); ++k){
                int ingredient_id = ingredients_id_list.get(ingredients_list.indexOf(curr.used_ingredients.get(k)));
                try{
                    //append to drinks_ingredients: drink_id, ingredient_id
                    Statement stmt = conn.createStatement();
                    String sqlStatement = "INSERT INTO drinks_ingredients (drink_id, ingredient_id) VALUES (" + drink_id + ","+ ingredient_id + ")";
                    stmt.executeUpdate(sqlStatement);
                    
                    //TODO DEDUCT AMOUNT IN INVENTORY
                    stmt = conn.createStatement();
                    sqlStatement = "UPDATE ingredients SET stock_level = stock_level - 1 WHERE ingredient_id=" + ingredient_id;
                    stmt.executeUpdate(sqlStatement);

                }
                catch (Exception e) {
                    e.printStackTrace();
                    System.err.println(e.getClass().getName()+": "+e.getMessage());
                }
            }
           
            
            //append to topping: topping_id, drink_id, name
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
                    sqlStatement = "INSERT INTO toppings (topping_id, drink_id, name) VALUES (" + topping_id + ","+ drink_id + ",'"+ curr.used_ingredients.get(x)+ "')";
                    stmt.executeUpdate(sqlStatement);
                }
                catch (Exception e) {
                    e.printStackTrace();
                    System.err.println(e.getClass().getName()+": "+e.getMessage());
                }
            }
        }
        
        fh.getManager().getOrder_history().getOrder_id_list().clear();
        fh.getManager().getOrder_history().getStaff_id_list().clear();
        fh.getManager().getOrder_history().getTransaction_date_list().clear();
        fh.getManager().getOrder_history().getPayment_method_list().clear();
        fh.getManager().getOrder_history().getPayment_amount_list().clear();
        fh.getManager().getOrder_history().getTimestamp_list().clear();
        
        fh.getManager().get_order_log().removeAll();
        fh.getManager().get_order_log().repaint();
        
        DefaultTableModel model1 = (DefaultTableModel) fh.getManager().getOrder_history().getjTable1().getModel();
        model1.setRowCount(0);
        
        fh.getManager().getOrder_history().load_table();
        fh.getManager().getOrder_history().load_order_history(fh.getManager().get_order_log());
        
        fh.getManager().setOrder_history(fh.getManager().getOrder_history());
        
        fh.getManager().getIngredient().getId_list().clear();
        fh.getManager().getIngredient().getIngredients_list().clear();
        fh.getManager().getIngredient().getStock_list().clear();
        fh.getManager().getIngredient().getRestock_list().clear();
        fh.getManager().getIngredient().getSupplier_list().clear();
        
        fh.getManager().get_inventory().removeAll();
        fh.getManager().get_inventory().repaint();
        
        DefaultTableModel model2 = (DefaultTableModel) fh.getManager().getIngredient().getjTable1().getModel();
        model2.setRowCount(0);
        
        fh.getManager().getIngredient().load_table();
        fh.getManager().getIngredient().load_ingredients(fh.getManager().get_inventory());
        
        fh.getManager().setIngredient(fh.getManager().getIngredient());
        
        //clear order info
        tax_label.setText("Tax: ");
        subtotal_lable.setText("Subtotal: ");
        total_label.setText("Total: " );
        balance_label.setText("Balance Due: ");
        
        drinks.clear();
        
        DefaultTableModel model = (DefaultTableModel) order_content.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_pay_btnActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
       fh.actionPerformed(evt);
    }//GEN-LAST:event_homeActionPerformed

    private void seasonal_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seasonal_btnActionPerformed
        jPanel2.removeAll();
        jPanel2.repaint();
        drink temp = new drink();
        temp.load_seasonal(jPanel2, this);
    }//GEN-LAST:event_seasonal_btnActionPerformed
    
    public void load_order(){
        float sum = 0;
        int i = 0;
        int last_row = 0;
        while(i < this.drinks.size()){
            drink temp = drinks.get(i);
            sum += temp.price * temp.qty;
            
            if(order_content.getRowCount() <= i){
                DefaultTableModel model = (DefaultTableModel) order_content.getModel();
                model.addRow(new Object[]{"Column 1", "Column 2", "Column 3"});
            }
            
            order_content.setValueAt(temp.name, last_row, 0);
            order_content.setValueAt(temp.qty, last_row, 1);
            order_content.setValueAt(temp.price, last_row, 2);
            order_content.setValueAt(temp.price*temp.qty, last_row, 3);
           
            last_row += 1;
            
            if(temp.qty == 1){
                i += 1;
            }
            else{
                i += temp.qty;
            }
            
        }
        
        tax_label.setText("Tax: " + String.format("%.2f", (0.075 * sum)));
        subtotal_lable.setText("Subtotal: " +String.format("%.2f", sum));
        total_label.setText("Total: " + String.format("%.2f", (0.075 * sum + sum)));
        balance_label.setText("Balance Due: "  + String.format("%.2f", (0.075 * sum + sum)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balance_label;
    private javax.swing.JButton bwsg_btn;
    private javax.swing.JButton fruits_btn;
    private javax.swing.JButton home;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel menu_header;
    private javax.swing.JScrollPane menu_scroll;
    private javax.swing.JButton mktea_btn;
    private javax.swing.JTable order_content;
    private javax.swing.JScrollPane order_scroll;
    private javax.swing.JButton pay_btn;
    private javax.swing.JButton seasonal_btn;
    private javax.swing.JButton sgcane_btn;
    private javax.swing.JLabel subtotal_lable;
    private javax.swing.JButton tarobean_btn;
    private javax.swing.JLabel tax_label;
    private javax.swing.JButton tea_btn;
    private javax.swing.JLabel total_label;
    private javax.swing.JButton traditional_btn;
    // End of variables declaration//GEN-END:variables
}
