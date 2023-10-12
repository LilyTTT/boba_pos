package cashier_panels;
import control.Cashier;
import control.jdbcpostgreSQL;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
/**
 *
 * @author nishka
 */
public class fruit extends javax.swing.JPanel {
    private int base_drink_id = 0;
    private String name = "";
    private float price;
    private List<String> ingredients = new ArrayList<>();
    private JPanel panel;
    public List<drink> drinks = new ArrayList<>();
    public Cashier worker;
    /**
     * Creates new form fruit
     */
    public fruit() {
        initComponents();
    }
    public Connection connect(){
        jdbcpostgreSQL connection = new jdbcpostgreSQL();
        Connection conn = connection.connect();
        
        return conn;
    }
    
    public void load_fruit(JPanel panel, Cashier worker){
        this.worker = worker;
        this.panel = panel;

        back_btn = new javax.swing.JButton();
        drink1 = new javax.swing.JButton();
        drink2 = new javax.swing.JButton();
        drink3 = new javax.swing.JButton();
        drink4 = new javax.swing.JButton();
        drink5 = new javax.swing.JButton();
        drink6 = new javax.swing.JButton();
        drink7 = new javax.swing.JButton();
        drink8 = new javax.swing.JButton();
        drink9 = new javax.swing.JButton();
        drink10 = new javax.swing.JButton();
        drink11 = new javax.swing.JButton();
        drink12 = new javax.swing.JButton();
        drink13 = new javax.swing.JButton();
        drink14 = new javax.swing.JButton();
        drink15 = new javax.swing.JButton();
        drink16 = new javax.swing.JButton();
        drink17 = new javax.swing.JButton();
        
        back_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        drink1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink1.setText("<html> avocado mango agar cooler");
        drink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink1ActionPerformed(evt);
            }
        });

        drink2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink2.setText("<html> mango pomelo sago cooler");
        drink2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink2ActionPerformed(evt);
            }
        });

        drink3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink3.setText("<html> yiFang taiwan fruit tea");
        drink3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink3ActionPerformed(evt);
            }
        });

        drink4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink4.setText("<html> watermelon coconut agar cooler");
        drink4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink6ActionPerformed(evt);
            }
        });

        drink5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink5.setText("<html> kumquat passion gruit tea");
        drink5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink5ActionPerformed(evt);
            }
        });
        
        drink6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink6.setText("<html> green plum green tea");
        drink6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink1ActionPerformed(evt);
            }
        });

        drink7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink7.setText("<html> peach fruit tea");
        drink7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink2ActionPerformed(evt);
            }
        });

        drink8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink8.setText("<html> peach soda pop");
        drink8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink3ActionPerformed(evt);
            }
        });

        drink9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink9.setText("<html> strawberry fruit tea");
        drink9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink6ActionPerformed(evt);
            }
        });

        drink10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink10.setText("<html> strawberry milk (blended)");
        drink10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink5ActionPerformed(evt);
            }
        });
        
        drink11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink11.setText("<html> yakult fruit tea");
        drink11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink1ActionPerformed(evt);
            }
        });

        drink12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink12.setText("<html> passion fruit green tea");
        drink12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink2ActionPerformed(evt);
            }
        });

        drink13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink13.setText("<html> pineapple green tea");
        drink13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink3ActionPerformed(evt);
            }
        });

        drink14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink14.setText("<html> wintermelon lemon tea");
        drink14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink6ActionPerformed(evt);
            }
        });

        drink15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink15.setText("<html> lemon mountain tea");
        drink15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink5ActionPerformed(evt);
            }
        });
        
        drink16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink16.setText("<html> lemon green tea");
        drink16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink6ActionPerformed(evt);
            }
        });

        drink17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink17.setText("<html> aiyu jelly lemon tea");
        drink17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.panel);
        this.panel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_btn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drink7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drink5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drink15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drink8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drink13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(drink10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drink11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(drink5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(drink6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(drink9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drink7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(drink15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(drink16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drink8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drink13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        drink1 = new javax.swing.JButton();
        drink2 = new javax.swing.JButton();
        drink3 = new javax.swing.JButton();
        drink4 = new javax.swing.JButton();
        drink5 = new javax.swing.JButton();
        drink6 = new javax.swing.JButton();
        drink7 = new javax.swing.JButton();
        drink8 = new javax.swing.JButton();
        drink9 = new javax.swing.JButton();
        drink10 = new javax.swing.JButton();
        drink11 = new javax.swing.JButton();
        drink12 = new javax.swing.JButton();
        drink13 = new javax.swing.JButton();
        drink14 = new javax.swing.JButton();
        drink15 = new javax.swing.JButton();
        drink16 = new javax.swing.JButton();
        drink17 = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();

        drink1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink1.setText("<html> mango pomelo sago cooler");
        drink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink1ActionPerformed(evt);
            }
        });

        drink2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink2.setText("<html> avocado moon agar cooler");
        drink2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink2ActionPerformed(evt);
            }
        });

        drink3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink3.setText("<html> watermelon coconut agar cooler");
        drink3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink3ActionPerformed(evt);
            }
        });

        drink4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink4.setText("<html> kumquat passion gruit tea");
        drink4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink4ActionPerformed(evt);
            }
        });

        drink5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink5.setText("<html> green plum green tea");
        drink5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink5ActionPerformed(evt);
            }
        });

        drink6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink6.setText("<html> peach fruit tea");
        drink6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink6ActionPerformed(evt);
            }
        });

        drink7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink7.setText("<html> yakult fruit tea");
        drink7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink7ActionPerformed(evt);
            }
        });

        drink8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink8.setText("<html> strawberry fruit tea");
        drink8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink8ActionPerformed(evt);
            }
        });

        drink9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink9.setText("<html> peach soda pop");
        drink9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink9ActionPerformed(evt);
            }
        });

        drink10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink10.setText("<html> yiFang taiwan fruit tea");
        drink10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink10ActionPerformed(evt);
            }
        });

        drink11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink11.setText("<html> passion fruit green tea");
        drink11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink11ActionPerformed(evt);
            }
        });

        drink12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink12.setText("<html> pineapple green tea");
        drink12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink12ActionPerformed(evt);
            }
        });

        drink13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink13.setText("<html> strawberry milk (blended)");
        drink13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink13ActionPerformed(evt);
            }
        });

        drink14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink14.setText("<html> lemon mountain tea");
        drink14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink14ActionPerformed(evt);
            }
        });

        drink15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink15.setText("<html> lemon green tea");
        drink15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink15ActionPerformed(evt);
            }
        });

        drink16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink16.setText("<html> aiyu jelly lemon tea");
        drink16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink16ActionPerformed(evt);
            }
        });

        drink17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        drink17.setText("<html> wintermelon lemon tea");
        drink17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink17ActionPerformed(evt);
            }
        });

        back_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_btn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drink7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(drink11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(drink12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drink5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(drink6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(drink9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drink15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(drink16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drink8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(drink17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drink13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(drink4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(drink10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drink11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(drink5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(drink6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(drink9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drink7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(drink15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(drink16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drink8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drink13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void drink8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink8ActionPerformed
        this.name = drink8.getText();
        this.find_drink(drink8.getText());
    }//GEN-LAST:event_drink8ActionPerformed

    private void drink9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink9ActionPerformed
        this.name = drink9.getText();
        this.find_drink(drink9.getText());
    }//GEN-LAST:event_drink9ActionPerformed

    private void drink10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink10ActionPerformed
        this.name = drink10.getText();
        this.find_drink(drink10.getText());
    }//GEN-LAST:event_drink10ActionPerformed

    private void drink11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink11ActionPerformed
        this.name = drink11.getText();
        this.find_drink(drink11.getText());
    }//GEN-LAST:event_drink11ActionPerformed

    private void drink12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink12ActionPerformed
        this.name = drink12.getText();
        this.find_drink(drink12.getText());
    }//GEN-LAST:event_drink12ActionPerformed

    private void drink13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink13ActionPerformed
        this.name = drink13.getText();
        this.find_drink(drink13.getText());
    }//GEN-LAST:event_drink13ActionPerformed

    private void drink14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink14ActionPerformed
        this.name = drink4.getText();
        this.find_drink(drink14.getText());
    }//GEN-LAST:event_drink14ActionPerformed

    private void drink15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink15ActionPerformed
        this.name = drink15.getText();
        this.find_drink(drink15.getText());
    }//GEN-LAST:event_drink15ActionPerformed

    private void drink16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink16ActionPerformed
        this.name = drink16.getText();
        this.find_drink(drink16.getText());
    }//GEN-LAST:event_drink16ActionPerformed

    private void drink17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink17ActionPerformed
        this.name = drink17.getText();
        this.find_drink(drink17.getText());
    }//GEN-LAST:event_drink17ActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        panel.removeAll();
        panel.repaint();
        order_home temp = new order_home();
        temp.load_home(this.panel, this.worker);
    }//GEN-LAST:event_back_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton drink1;
    private javax.swing.JButton drink10;
    private javax.swing.JButton drink11;
    private javax.swing.JButton drink12;
    private javax.swing.JButton drink13;
    private javax.swing.JButton drink14;
    private javax.swing.JButton drink15;
    private javax.swing.JButton drink16;
    private javax.swing.JButton drink17;
    private javax.swing.JButton drink2;
    private javax.swing.JButton drink3;
    private javax.swing.JButton drink4;
    private javax.swing.JButton drink5;
    private javax.swing.JButton drink6;
    private javax.swing.JButton drink7;
    private javax.swing.JButton drink8;
    private javax.swing.JButton drink9;
    // End of variables declaration//GEN-END:variables
}
