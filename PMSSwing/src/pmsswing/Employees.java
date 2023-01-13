/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pmsswing;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.Login;

/**
 *
 * @author BSP
 */
public class Employees extends javax.swing.JFrame {

    /**
     * Creates new form Employees
     */
    public Employees() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Emp_Name = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Emp_GrandT = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Card = new javax.swing.JRadioButton();
        Cash = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cust_C = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cust_N = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cust_G = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Emp_ComboBox = new javax.swing.JComboBox<>();
        Emp_Qty = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Emp_Price = new javax.swing.JTextField();
        Add_totbl = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Emp_Stock = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Cart_table = new javax.swing.JTable();
        Emp_LogOutBtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setText("MyPharmacy");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 6, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setText("Welcome");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        Emp_Name.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Emp_Name.setForeground(new java.awt.Color(255, 51, 51));
        Emp_Name.setText(Login.myEmpName);
        getContentPane().add(Emp_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel12.setText("Cart");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        Emp_GrandT.setEditable(false);
        Emp_GrandT.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Emp_GrandT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_GrandTActionPerformed(evt);
            }
        });
        jPanel3.add(Emp_GrandT, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 140, -1));

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel13.setText("Grand Total:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel14.setText("CheckOut");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel15.setText("Method:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        Card.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Card.setText("Card");
        Card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardActionPerformed(evt);
            }
        });
        jPanel4.add(Card, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        Cash.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Cash.setText("Cash");
        Cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashActionPerformed(evt);
            }
        });
        jPanel4.add(Cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jButton2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton2.setText("Proceed");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 260, 130));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setText("Contact:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        cust_C.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cust_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cust_CActionPerformed(evt);
            }
        });
        jPanel2.add(cust_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 110, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setText("Name:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        cust_N.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cust_N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cust_NActionPerformed(evt);
            }
        });
        jPanel2.add(cust_N, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 110, -1));

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel11.setText("Gender:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        cust_G.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jPanel2.add(cust_G, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 110, -1));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel10.setText("Customer Info");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 250, 170));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 660, 220));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("Quantity:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        Emp_ComboBox.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Emp_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_ComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(Emp_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 110, -1));

        Emp_Qty.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Emp_Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_QtyActionPerformed(evt);
            }
        });
        jPanel1.add(Emp_Qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 110, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setText("Select Medicine:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setText("Price:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        Emp_Price.setEditable(false);
        Emp_Price.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Emp_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_PriceActionPerformed(evt);
            }
        });
        jPanel1.add(Emp_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 70, -1));

        Add_totbl.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Add_totbl.setText("Add");
        Add_totbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_totblActionPerformed(evt);
            }
        });
        jPanel1.add(Add_totbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 100, -1));

        jButton3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton3.setText("Remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        Emp_Stock.setEditable(false);
        Emp_Stock.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Emp_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_StockActionPerformed(evt);
            }
        });
        jPanel1.add(Emp_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 50, -1));

        jLabel16.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel16.setText("Stock:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 170));

        Cart_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr No.", "Item", "Price", "Quantity", "TotalPrice"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Cart_table);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 350, 170));

        Emp_LogOutBtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Emp_LogOutBtn.setText("LogOut");
        Emp_LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_LogOutBtnActionPerformed(evt);
            }
        });
        jPanel5.add(Emp_LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 290, -1));

        jButton5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton5.setText("Click me to start selling");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 660, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Emp_QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_QtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Emp_QtyActionPerformed

    private void Emp_GrandTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_GrandTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Emp_GrandTActionPerformed

    private void cust_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cust_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cust_CActionPerformed

    private void cust_NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cust_NActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cust_NActionPerformed

    private void Emp_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Emp_PriceActionPerformed
    private int i;
    private float gtotal;
    private void Add_totblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_totblActionPerformed
    // Adding to cart table
    
    i+=1;
    Cash.setSelected(true);
    int tbl_Srno = i;
    String tbl_item = Emp_ComboBox.getSelectedItem().toString();
    float tbl_price = Float.parseFloat(Price);
    int tbl_qty = Integer.parseInt(Emp_Qty.getText());
    
    float tbl_tot = tbl_price*tbl_qty;
    if(Emp_GrandT.getText().isEmpty()){
        gtotal =0;
    }
    else{
    gtotal = Float.parseFloat(Emp_GrandT.getText());
    }
    gtotal += tbl_tot;
    String toSetGT = String.valueOf(gtotal);
    Emp_GrandT.setText(toSetGT);
    
    Object[] row = { tbl_Srno, tbl_item, tbl_price, tbl_qty, tbl_tot };

    DefaultTableModel model = (DefaultTableModel) Cart_table.getModel();

    model.addRow(row);
    Emp_Qty.setText("");    
    }//GEN-LAST:event_Add_totblActionPerformed

    private void CardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardActionPerformed
        // TODO add your handling code here:
        if(Card.isSelected()){
            Cash.setSelected(false);
        }
    }//GEN-LAST:event_CardActionPerformed

    private void CashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashActionPerformed
        // TODO add your handling code here:
        if(Cash.isSelected()){
            Card.setSelected(false);
        }
    }//GEN-LAST:event_CashActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(Card.isSelected()){
            JOptionPane.showMessageDialog(null, "Card option unavailable");
            return;
        }
        ConnectToDatabase();
        String N,C,G;
        N = cust_N.getText();
        C = cust_C.getText();
        G = cust_G.getSelectedItem().toString();
        float Gran = Float.parseFloat(Emp_GrandT.getText());
        AddCust(1,N,C,G,Gran);
        JOptionPane.showMessageDialog(null, "Printing bill for "+cust_N.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ConnectToDatabase ()
	{
		try
		{
			con = DriverManager.getConnection("jdbc:ucanaccess://D:\\DSA Theory Summers\\Project\\ODBC connectivity issue resolved\\MediDB.accdb");
			st = con.createStatement();
		}
		catch (Exception e) {System.out.println(e);}
    }
        
    private void AddCust(int Id,String Name, String Contact, String Gender, float Grand ){
        try
		{
			//prepare statement
			String qry = "Insert into Customers values (?, ?, ?, ?, ?)";
                        
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setInt(1, Id);
			ps.setString(2, Name);
			ps.setString(3, Contact);
			ps.setString(4, Gender);
                        ps.setFloat(5, Grand);
                        //JOptionPane.showConfirmDialog(this, "Are you sure?");
			ps.executeUpdate();
		}
		catch(Exception e) {System.out.println(e + "\t" + e.getMessage());	}
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Emp_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_StockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Emp_StockActionPerformed

    private void Emp_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_ComboBoxActionPerformed
        // TODO add your handling code here:
        SP();
    }//GEN-LAST:event_Emp_ComboBoxActionPerformed

    private void Emp_LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_LogOutBtnActionPerformed
        // TODO add your handling code here:
        Login bck = new Login();
        bck.setVisible(true);
        dispose();
    }//GEN-LAST:event_Emp_LogOutBtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        GetData();
    }//GEN-LAST:event_jButton5ActionPerformed
    public  String Price,Stock;
    private void SP(){
        try{        
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\DSA Theory Summers\\Project\\ODBC connectivity issue resolved\\MediDB.accdb");
            st = con.createStatement();  
            ResultSet myRes = st.executeQuery("Select * from MediInfo where MedicineId="+Id);
        
        while (myRes.next()){
            Price = myRes.getString("Price"); 
            Stock = myRes.getString("Qty");
            Emp_Price.setText(Price);
            Emp_Stock.setText(Stock);
        }
        con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private Connection con;
    private Statement st;
    int times;
    private String Med;
    private String Id;
    private void GetData(){
        try{        
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\DSA Theory Summers\\Project\\ODBC connectivity issue resolved\\MediDB.accdb");
            //create statement
            st = con.createStatement();  
            ResultSet myRes = st.executeQuery("Select * from MediInfo");
        if (times>0){
            return;
        }
        while (myRes.next()){
            times++;
            
            Med = myRes.getString("MediTitle");
            Id = myRes.getString("MedicineID");
            Emp_ComboBox.addItem(Med);
         
        }
        con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_totbl;
    private javax.swing.JRadioButton Card;
    private javax.swing.JTable Cart_table;
    private javax.swing.JRadioButton Cash;
    private javax.swing.JComboBox<String> Emp_ComboBox;
    private javax.swing.JTextField Emp_GrandT;
    private javax.swing.JButton Emp_LogOutBtn;
    private static javax.swing.JLabel Emp_Name;
    private javax.swing.JTextField Emp_Price;
    private javax.swing.JTextField Emp_Qty;
    private javax.swing.JTextField Emp_Stock;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField cust_C;
    private javax.swing.JComboBox<String> cust_G;
    private javax.swing.JTextField cust_N;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
