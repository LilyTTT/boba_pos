package cashier_panels;

import control.jdbcpostgreSQL;
import control.Cashier;
import cashier_panels.tarobean;
import cashier_panels.sgcane;
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

/**
 *
 * @author ltang
 */
public class drink extends javax.swing.JPanel {
    public Cashier worker;
    public String name;
    public int base_id;
    public List<String> used_ingredients = new ArrayList<>();
    public float price;
    public int num_toppings = 0;
    public int qty = 0;
    public int drink_id = 0;
    private JPanel panel;
    /**
     * Creates new form drink
     */
    public drink() {
        //initComponents();
    }

    public Connection connect(){
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        return conn;
    }
    
    public void load_drink(JPanel panel, Cashier worker,  String name, int drink_id, float price, List<String> ingredients){
        this.worker = worker;
        this.name = name;
        this.base_id = drink_id;
        this.used_ingredients = ingredients;
        this.price = price;
        this.panel = panel;
        
        this.panel.removeAll();
        this.panel.repaint();
        
        drink_name = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        drink_qty = new javax.swing.JSpinner();
        save_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        red_bean = new javax.swing.JCheckBox();
        lychee_coconut_jelly = new javax.swing.JCheckBox();
        sago = new javax.swing.JCheckBox();
        aiyu = new javax.swing.JCheckBox();
        agar_boba = new javax.swing.JCheckBox();
        aloe_vera = new javax.swing.JCheckBox();
        boba = new javax.swing.JCheckBox();
        cheese_foam = new javax.swing.JCheckBox();
        grass_jelly = new javax.swing.JCheckBox();
        black_glutinous_rice = new javax.swing.JCheckBox();
        taro_mochi = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(782, 803));

        drink_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        drink_name.setText(this.name);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Qty");

        drink_qty.setName(""); // NOI18N
        drink_qty.setValue(1);

        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        red_bean.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        red_bean.setText("red bean");
        red_bean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red_beanActionPerformed(evt);
            }
        });

        lychee_coconut_jelly.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lychee_coconut_jelly.setText("lychee coconut jelly");
        lychee_coconut_jelly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lychee_coconut_jellyActionPerformed(evt);
            }
        });

        sago.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sago.setText("sago");
        sago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sagoActionPerformed(evt);
            }
        });

        aiyu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aiyu.setText("aiyu");
        aiyu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aiyuActionPerformed(evt);
            }
        });

        agar_boba.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        agar_boba.setText("agar boba");
        agar_boba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agar_bobaActionPerformed(evt);
            }
        });

        aloe_vera.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aloe_vera.setText("aloe vera");
        aloe_vera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aloe_veraActionPerformed(evt);
            }
        });

        boba.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boba.setText("boba");
        boba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bobaActionPerformed(evt);
            }
        });

        cheese_foam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cheese_foam.setText("cheese foam");
        cheese_foam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheese_foamActionPerformed(evt);
            }
        });

        grass_jelly.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        grass_jelly.setText("grass jelly");
        grass_jelly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grass_jellyActionPerformed(evt);
            }
        });

        black_glutinous_rice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        black_glutinous_rice.setText("black glutinous rice");
        black_glutinous_rice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                black_glutinous_riceActionPerformed(evt);
            }
        });

        taro_mochi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        taro_mochi.setText("taro mochi");
        taro_mochi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taro_mochiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.panel);
        this.panel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(drink_name))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lychee_coconut_jelly)
                            .addComponent(sago, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aiyu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agar_boba)
                            .addComponent(aloe_vera)
                            .addComponent(boba, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(red_bean, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cheese_foam)
                                    .addComponent(grass_jelly)
                                    .addComponent(black_glutinous_rice)
                                    .addComponent(taro_mochi)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(save_btn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(cancel_btn))
                        .addGap(18, 18, 18)
                        .addComponent(drink_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(drink_name)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(red_bean, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boba, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lychee_coconut_jelly, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cheese_foam, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sago, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grass_jelly, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aiyu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(black_glutinous_rice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agar_boba, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taro_mochi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(aloe_vera, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(drink_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );
    }
    
    public void load_seasonal(JPanel panel, Cashier worker){
        this.panel = panel;
        this.worker = worker;
        
        this.panel.removeAll();
        this.panel.repaint();
        
        boba = new javax.swing.JCheckBox();
        lychee_coconut_jelly = new javax.swing.JCheckBox();
        sago = new javax.swing.JCheckBox();
        aiyu = new javax.swing.JCheckBox();
        agar_boba = new javax.swing.JCheckBox();
        aloe_vera = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        drink_qty = new javax.swing.JSpinner();
        taro_mochi = new javax.swing.JCheckBox();
        black_glutinous_rice = new javax.swing.JCheckBox();
        grass_jelly = new javax.swing.JCheckBox();
        cheese_foam = new javax.swing.JCheckBox();
        red_bean = new javax.swing.JCheckBox();
        seasonal_name = new javax.swing.JComboBox<>();
        cancel_btn = new javax.swing.JButton();
        save_btn = new javax.swing.JButton();

        boba.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boba.setText("boba");
        boba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bobaActionPerformed(evt);
            }
        });

        lychee_coconut_jelly.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lychee_coconut_jelly.setText("lychee coconut jelly");
        lychee_coconut_jelly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lychee_coconut_jellyActionPerformed(evt);
            }
        });

        sago.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sago.setText("sago");
        sago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sagoActionPerformed(evt);
            }
        });

        aiyu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aiyu.setText("aiyu");
        aiyu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aiyuActionPerformed(evt);
            }
        });

        agar_boba.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        agar_boba.setText("agar boba");
        agar_boba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agar_bobaActionPerformed(evt);
            }
        });

        aloe_vera.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aloe_vera.setText("aloe vera");
        aloe_vera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aloe_veraActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Qty");

        drink_qty.setName(""); // NOI18N
        drink_qty.setValue(1);

        taro_mochi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        taro_mochi.setText("taro mochi");
        taro_mochi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taro_mochiActionPerformed(evt);
            }
        });

        black_glutinous_rice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        black_glutinous_rice.setText("black glutinous rice");
        black_glutinous_rice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                black_glutinous_riceActionPerformed(evt);
            }
        });

        grass_jelly.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        grass_jelly.setText("grass jelly");
        grass_jelly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grass_jellyActionPerformed(evt);
            }
        });

        cheese_foam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cheese_foam.setText("cheese foam");
        cheese_foam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheese_foamActionPerformed(evt);
            }
        });

        red_bean.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        red_bean.setText("red bean");
        red_bean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red_beanActionPerformed(evt);
            }
        });

        seasonal_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seasonal Items" }));
        seasonal_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seasonal_nameActionPerformed(evt);
            }
        });

        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.panel);
        this.panel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(drink_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lychee_coconut_jelly)
                                    .addComponent(sago, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aiyu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(agar_boba)
                                    .addComponent(aloe_vera)
                                    .addComponent(boba, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(red_bean, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cheese_foam)
                                    .addComponent(grass_jelly)
                                    .addComponent(black_glutinous_rice)
                                    .addComponent(taro_mochi)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(save_btn))
                            .addComponent(cancel_btn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(seasonal_name, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(seasonal_name, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(red_bean, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boba, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lychee_coconut_jelly, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cheese_foam, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sago, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grass_jelly, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aiyu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(black_glutinous_rice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agar_boba, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taro_mochi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(aloe_vera, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(drink_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        this.load_seasonal_name();
    }
    
    private void load_seasonal_name(){
        try{
            String line;
            BufferedReader br = new BufferedReader(new FileReader("./src/csv_files/base_drinks.csv"));  
            String[] this_drink = null;
            while ((line = br.readLine()) != null){  
                this_drink = line.split(","); 
                if(Integer.parseInt(this_drink[0]) > 44){
                    this.seasonal_name.addItem("<html> " + this_drink[1]);
                }
            }
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

        drink_name = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        drink_qty = new javax.swing.JSpinner();
        save_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        red_bean = new javax.swing.JCheckBox();
        lychee_coconut_jelly = new javax.swing.JCheckBox();
        sago = new javax.swing.JCheckBox();
        aiyu = new javax.swing.JCheckBox();
        agar_boba = new javax.swing.JCheckBox();
        aloe_vera = new javax.swing.JCheckBox();
        boba = new javax.swing.JCheckBox();
        cheese_foam = new javax.swing.JCheckBox();
        grass_jelly = new javax.swing.JCheckBox();
        black_glutinous_rice = new javax.swing.JCheckBox();
        taro_mochi = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(782, 803));

        drink_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        drink_name.setText("jLabel1");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Qty");

        drink_qty.setName(""); // NOI18N
        drink_qty.setValue(1);

        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        red_bean.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        red_bean.setText("red bean");
        red_bean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red_beanActionPerformed(evt);
            }
        });

        lychee_coconut_jelly.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lychee_coconut_jelly.setText("lychee coconut jelly");
        lychee_coconut_jelly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lychee_coconut_jellyActionPerformed(evt);
            }
        });

        sago.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sago.setText("sago");
        sago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sagoActionPerformed(evt);
            }
        });

        aiyu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aiyu.setText("aiyu");
        aiyu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aiyuActionPerformed(evt);
            }
        });

        agar_boba.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        agar_boba.setText("agar boba");
        agar_boba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agar_bobaActionPerformed(evt);
            }
        });

        aloe_vera.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aloe_vera.setText("aloe vera");
        aloe_vera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aloe_veraActionPerformed(evt);
            }
        });

        boba.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boba.setText("boba");
        boba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bobaActionPerformed(evt);
            }
        });

        cheese_foam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cheese_foam.setText("cheese foam");
        cheese_foam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheese_foamActionPerformed(evt);
            }
        });

        grass_jelly.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        grass_jelly.setText("grass jelly");
        grass_jelly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grass_jellyActionPerformed(evt);
            }
        });

        black_glutinous_rice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        black_glutinous_rice.setText("black glutinous rice");
        black_glutinous_rice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                black_glutinous_riceActionPerformed(evt);
            }
        });

        taro_mochi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        taro_mochi.setText("taro mochi");
        taro_mochi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taro_mochiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(drink_name))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lychee_coconut_jelly)
                            .addComponent(sago, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aiyu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agar_boba)
                            .addComponent(aloe_vera)
                            .addComponent(boba, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(red_bean, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cheese_foam)
                                    .addComponent(grass_jelly)
                                    .addComponent(black_glutinous_rice)
                                    .addComponent(taro_mochi)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(save_btn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(cancel_btn))
                        .addGap(18, 18, 18)
                        .addComponent(drink_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(drink_name)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(red_bean, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boba, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lychee_coconut_jelly, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cheese_foam, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sago, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grass_jelly, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aiyu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(black_glutinous_rice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agar_boba, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taro_mochi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(aloe_vera, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(drink_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
   
        // update used_ingredients
        used_ingredients.add("cups");
        used_ingredients.add("straws");
        used_ingredients.add("lids");
        
        this.qty = (Integer)drink_qty.getValue();
        
        this.price += this.num_toppings * 0.75;
        
        Connection conn = this.connect();
        String drink_str = "";
        
        try {
            Statement stmt = conn.createStatement();
            String sqlStatement = "SELECT * FROM drinks";

            ResultSet result = stmt.executeQuery(sqlStatement);
            
            while(result.next()) {
                drink_str = (result.getString("drink_id"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        
        this.drink_id = Integer.parseInt(drink_str) + 1;
        
        //add this drink to the drinks in checkout
       
        int curr_id = this.drink_id;
        for (int i = 0; i < this.qty; ++i){
            drink temp = new drink();
            temp.worker = this.worker;
            temp.name = this.name;
            temp.base_id = this.base_id;
            temp.used_ingredients = this.used_ingredients;
            temp.price = this.price;
            temp.num_toppings = this.num_toppings;
            temp.qty = this.qty;
            temp.drink_id = curr_id;
            temp.panel = this.panel;

            if((temp.name.equals("Seasonal Items") == false) && (temp.qty > 0)){
                this.worker.drinks.add(temp);
                curr_id += 1;
            }
        }
  
        //display the drink in checkout
        this.worker.load_order();
        
        this.panel.removeAll();
        this.panel.repaint();
        
        if(this.base_id < 6){
            tea temp = new tea();
            temp.load_tea(this.panel, this.worker);
        }
        else if(this.base_id < 9){
            bwsg temp = new bwsg();
            temp.load_bwsg(this.panel, this.worker);
        }
        else if(this.base_id < 14){
            milktea temp = new milktea();
            temp.load_milktea(this.panel, this.worker);
        }
        else if(this.base_id < 31){
            fruit temp = new fruit();
            temp.load_fruit(this.panel, this.worker);
        }
        else if(this.base_id < 33){
            sgcane temp = new sgcane();
            temp.load_sgcane(this.panel, this.worker);
        }
        else if(this.base_id < 39){
            tarobean temp = new tarobean();
            temp.load_tarobean(this.panel, this.worker);
        }
        else if(this.base_id < 45){
            traditional temp = new traditional();
            temp.load_traditional(this.panel, this.worker);
        }
        else{
            order_home temp = new order_home();
            temp.load_home(panel, worker);
        }
    
        
        
        
        
        
    }//GEN-LAST:event_save_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        this.panel.removeAll();
        this.panel.repaint();
        
        if(this.base_id < 6){
            tea temp = new tea();
            temp.load_tea(this.panel, this.worker);
        }
        else if(this.base_id < 9){
            bwsg temp = new bwsg();
            temp.load_bwsg(this.panel, this.worker);
        }
        else if(this.base_id < 14){
            milktea temp = new milktea();
            temp.load_milktea(this.panel, this.worker);
        }
        else if(this.base_id < 31){
            fruit temp = new fruit();
            temp.load_fruit(this.panel, this.worker);
        }
        else if(this.base_id < 33){
            sgcane temp = new sgcane();
            temp.load_sgcane(this.panel, this.worker);
        }
        else if(this.base_id < 39){
            tarobean temp = new tarobean();
            temp.load_tarobean(this.panel, this.worker);
        }
        else if(this.base_id < 45){
            traditional temp = new traditional();
            temp.load_traditional(this.panel, this.worker);
        }
        else{
            order_home temp = new order_home();
            temp.load_home(panel, worker);
        }
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void red_beanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red_beanActionPerformed
        if (red_bean.isSelected()){
            this.used_ingredients.add("red bean");
            this.num_toppings += 1;
        }
        else{
            for(int i = this.used_ingredients.size() - this.num_toppings; i < this.used_ingredients.size(); ++i){
                if(this.used_ingredients.get(i).equals("red bean")){
                    this.used_ingredients.remove(i);
                    this.num_toppings -= 1;
                    break;
                }
            }
        }
    }//GEN-LAST:event_red_beanActionPerformed

    private void cheese_foamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheese_foamActionPerformed
        if (cheese_foam.isSelected()){
            this.used_ingredients.add("cheese foam");
            this.num_toppings += 1;
        }
        else{
            for(int i = this.used_ingredients.size() - this.num_toppings; i < this.used_ingredients.size(); ++i){
                if(this.used_ingredients.get(i).equals("cheese foam")){
                    this.used_ingredients.remove(i);
                    this.num_toppings -= 1;
                    break;
                }
            }
        }
    }//GEN-LAST:event_cheese_foamActionPerformed

    private void grass_jellyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grass_jellyActionPerformed
        if (grass_jelly.isSelected()){
            this.used_ingredients.add("grass jelly");
            this.num_toppings += 1;
        }
        else{
            for(int i = this.used_ingredients.size() - this.num_toppings; i < this.used_ingredients.size(); ++i){
                if(this.used_ingredients.get(i).equals("grass jelly")){
                    this.used_ingredients.remove(i);
                    this.num_toppings -= 1;
                    break;
                }
            }
        }
    }//GEN-LAST:event_grass_jellyActionPerformed

    private void black_glutinous_riceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_black_glutinous_riceActionPerformed
        if (black_glutinous_rice.isSelected()){
            this.used_ingredients.add("black glutinous rice");
            this.num_toppings += 1;
        }
        else{
            for(int i = this.used_ingredients.size() - this.num_toppings; i < this.used_ingredients.size(); ++i){
                if(this.used_ingredients.get(i).equals("black glutinous rice")){
                    this.used_ingredients.remove(i);
                    this.num_toppings -= 1;
                    break;
                }
            }
        }
    }//GEN-LAST:event_black_glutinous_riceActionPerformed

    private void taro_mochiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taro_mochiActionPerformed
        if (taro_mochi.isSelected()){
            this.used_ingredients.add("taro mochi");
            this.num_toppings += 1;
        }
        else{
            for(int i = this.used_ingredients.size() - this.num_toppings; i < this.used_ingredients.size(); ++i){
                if(this.used_ingredients.get(i).equals("taro mochi")){
                    this.used_ingredients.remove(i);
                    this.num_toppings -= 1;
                    break;
                }
            }
        }
    }//GEN-LAST:event_taro_mochiActionPerformed

    private void bobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bobaActionPerformed
        if (boba.isSelected()){
            this.used_ingredients.add("boba");
            this.num_toppings += 1;
        }
        else{
            for(int i = this.used_ingredients.size() - this.num_toppings; i < this.used_ingredients.size(); ++i){
                if(this.used_ingredients.get(i).equals("boba")){
                    this.used_ingredients.remove(i);
                    this.num_toppings -= 1;
                    break;
                }
            }
        }
    }//GEN-LAST:event_bobaActionPerformed

    private void lychee_coconut_jellyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lychee_coconut_jellyActionPerformed
        if (lychee_coconut_jelly.isSelected()){
            this.used_ingredients.add("lychee coconut jelly");
            this.num_toppings += 1;
        }
        else{
            for(int i = this.used_ingredients.size() - this.num_toppings; i < this.used_ingredients.size(); ++i){
                if(this.used_ingredients.get(i).equals("lychee coconut jelly")){
                    this.used_ingredients.remove(i);
                    this.num_toppings -= 1;
                    break;
                }
            }
        }
    }//GEN-LAST:event_lychee_coconut_jellyActionPerformed

    private void sagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sagoActionPerformed
        if (sago.isSelected()){
            this.used_ingredients.add("sago");
            this.num_toppings += 1;
        }
        else{
            for(int i = this.used_ingredients.size() - this.num_toppings; i < this.used_ingredients.size(); ++i){
                if(this.used_ingredients.get(i).equals("sago")){
                    this.used_ingredients.remove(i);
                    this.num_toppings -= 1;
                    break;
                }
            }
        }
    }//GEN-LAST:event_sagoActionPerformed

    private void aiyuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aiyuActionPerformed
        if (aiyu.isSelected()){
            this.used_ingredients.add("aiyu");
            this.num_toppings += 1;
        }
        else{
            for(int i = this.used_ingredients.size() - this.num_toppings; i < this.used_ingredients.size(); ++i){
                if(this.used_ingredients.get(i).equals("aiyu")){
                    this.used_ingredients.remove(i);
                    this.num_toppings -= 1;
                    break;
                }
            }
        }
    }//GEN-LAST:event_aiyuActionPerformed

    private void agar_bobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agar_bobaActionPerformed
        if (agar_boba.isSelected()){
            this.used_ingredients.add("agar boba");
            this.num_toppings += 1;
        }
        else{
            for(int i = this.used_ingredients.size() - this.num_toppings; i < this.used_ingredients.size(); ++i){
                if(this.used_ingredients.get(i).equals("agar boba")){
                    this.used_ingredients.remove(i);
                    this.num_toppings -= 1;
                    break;
                }
            }
        }
    }//GEN-LAST:event_agar_bobaActionPerformed

    private void aloe_veraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aloe_veraActionPerformed
        if (aloe_vera.isSelected()){
            this.used_ingredients.add("aloe vera");
            this.num_toppings += 1;
        }
        else{
            for(int i = this.used_ingredients.size() - this.num_toppings; i < this.used_ingredients.size(); ++i){
                if(this.used_ingredients.get(i).equals("aloe vera")){
                    this.used_ingredients.remove(i);
                    this.num_toppings -= 1;
                    break;
                }
            }
        }
    }//GEN-LAST:event_aloe_veraActionPerformed

    private void seasonal_nameActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.name = seasonal_name.getItemAt(seasonal_name.getSelectedIndex());
        if(this.name.equals("Seasonal Items") == false){
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

                this.base_id = Integer.parseInt(this_drink[0]);
                this.price = Float.parseFloat(this_drink[2]);
                for(int i = 3; i < this_drink.length; ++i ){
                    this.used_ingredients.add(this_drink[i]);
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agar_boba;
    private javax.swing.JCheckBox aiyu;
    private javax.swing.JCheckBox aloe_vera;
    private javax.swing.JCheckBox black_glutinous_rice;
    private javax.swing.JCheckBox boba;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JCheckBox cheese_foam;
    private javax.swing.JLabel drink_name;
    private javax.swing.JSpinner drink_qty;
    private javax.swing.JCheckBox grass_jelly;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JCheckBox lychee_coconut_jelly;
    private javax.swing.JCheckBox red_bean;
    private javax.swing.JCheckBox sago;
    private javax.swing.JButton save_btn;
    private javax.swing.JCheckBox taro_mochi;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JComboBox<String> seasonal_name;
}
