/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trueproject;

import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class AM_Detail extends javax.swing.JFrame {

    /**
     * Creates new form AD_Detail
     */
    public AM_Detail() {
        initComponents();

        search.setHint("Search Detail Employee");
        search.setBorder(BorderFactory.createCompoundBorder(
        search.getBorder(),
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        ID.setHint("Your ID");
        ID.setBorder(BorderFactory.createCompoundBorder(
        ID.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        Password.setHint("Your Password");
        Password.setBorder(BorderFactory.createCompoundBorder(
        Password.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        name.setHint("Your Name");
        name.setBorder(BorderFactory.createCompoundBorder(
        name.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        mail.setHint("Your Email");
        mail.setBorder(BorderFactory.createCompoundBorder(
        mail.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        age.setHint("Your Age");
        age.setBorder(BorderFactory.createCompoundBorder(
        age.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        
        address.setHint("Your Address");
        address.setBorder(BorderFactory.createCompoundBorder(
        address.getBorder(), 
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }

    private void setTable() {
        String colum[] = {"ID", "Password", "Name", "Mail", "Age", "Address"};
        DefaultTableModel model = new DefaultTableModel(colum, 0);
        String s = search.getText();
        try {
            ConnectionDB db = new ConnectionDB();
            String Search = String.format("SELECT ID , Password , name , mail , age , address FROM employee WHERE Name = '%s'", s);
            ResultSet rs = db.get_resultset(Search);
            while (rs.next()) {
                String row[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)};
                model.addRow(row);
            }
            Show.setModel(model);
            db.disconnect();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
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

        ID2 = new swing.SearchText();
        Menu = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        Head = new javax.swing.JLabel();
        Orders = new javax.swing.JPanel();
        OrderButton = new javax.swing.JLabel();
        Employee = new javax.swing.JPanel();
        EmployeeButton = new javax.swing.JLabel();
        Admin = new javax.swing.JPanel();
        AdminButton = new javax.swing.JLabel();
        Check = new javax.swing.JPanel();
        CheckButton = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Detail = new javax.swing.JLabel();
        PrintButton = new javax.swing.JButton();
        search = new swing.SearchText();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Show = new javax.swing.JTable();
        Search = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        address = new swing.SearchText();
        ID = new swing.SearchText();
        name = new swing.SearchText();
        mail = new swing.SearchText();
        age = new swing.SearchText();
        Password = new swing.password();
        jButton1 = new javax.swing.JButton();

        ID2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setBackground(new java.awt.Color(54, 33, 89));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trueproject/image/icons8_shutdown_32px.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        Head.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Head.setForeground(new java.awt.Color(255, 255, 255));
        Head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Head.setText("WORLDWIDE");

        Orders.setBackground(new java.awt.Color(85, 65, 118));

        OrderButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OrderButton.setForeground(new java.awt.Color(255, 255, 255));
        OrderButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OrderButton.setText("NEW ORDERS");
        OrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OrderButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OrderButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout OrdersLayout = new javax.swing.GroupLayout(Orders);
        Orders.setLayout(OrdersLayout);
        OrdersLayout.setHorizontalGroup(
            OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        OrdersLayout.setVerticalGroup(
            OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        Employee.setBackground(new java.awt.Color(85, 65, 118));

        EmployeeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmployeeButton.setText("EMPLOYEE");
        EmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EmployeeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmployeeButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EmployeeLayout = new javax.swing.GroupLayout(Employee);
        Employee.setLayout(EmployeeLayout);
        EmployeeLayout.setHorizontalGroup(
            EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EmployeeLayout.setVerticalGroup(
            EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        Admin.setBackground(new java.awt.Color(85, 65, 118));

        AdminButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AdminButton.setForeground(new java.awt.Color(255, 255, 255));
        AdminButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminButton.setText("ADMIN");
        AdminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdminButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdminButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AdminLayout = new javax.swing.GroupLayout(Admin);
        Admin.setLayout(AdminLayout);
        AdminLayout.setHorizontalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AdminLayout.setVerticalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        Check.setBackground(new java.awt.Color(85, 65, 118));

        CheckButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CheckButton.setForeground(new java.awt.Color(255, 255, 255));
        CheckButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CheckButton.setText("CHECK");
        CheckButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CheckButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CheckButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CheckLayout = new javax.swing.GroupLayout(Check);
        Check.setLayout(CheckLayout);
        CheckLayout.setHorizontalGroup(
            CheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CheckButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CheckLayout.setVerticalGroup(
            CheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CheckButton, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Orders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Head, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Exit)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Head, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Orders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Detail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Detail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Detail.setText("DETAIL EMPLOYEE");
        jPanel2.add(Detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, 476, 40));

        PrintButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PrintButton.setText("Back");
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });
        jPanel2.add(PrintButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 435, 104, 31));

        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 211, 338, 27));

        Show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Show);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 83, -1, -1));

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel2.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 213, 87, -1));

        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel2.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 100, 31));

        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 210, 30));

        ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, 30));

        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 210, 30));

        mail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 210, 30));

        age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 210, 30));

        Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 210, 30));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 432, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        setTable();
    }//GEN-LAST:event_SearchActionPerformed

    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtonActionPerformed
        this.dispose();
        AM_menu menu = new AM_menu();
        menu.setVisible(true);
    }//GEN-LAST:event_PrintButtonActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        String id = ID.getText();
        String pw = Password.getText();
        String n = name.getText();
        String m = mail.getText();
        String a = age.getText();
        String ad = address.getText();
        String em = "Employee";

        String sql = String.format("INSERT INTO employee VALUES('%s','%s','%s','%s','%s','%s','%s');", id, pw, n, m, a, ad, em);
        try {
            ConnectionDB db = new ConnectionDB();
            JOptionPane.showMessageDialog(this, "You Register Complete");
            db.execute(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "You Cannot Register ");
        }

    }//GEN-LAST:event_insertActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String colum[] = {"ID", "Password", "Name", "Mail", "Age", "Address"};
        DefaultTableModel model = new DefaultTableModel(colum, 0);
        try {
            ConnectionDB db = new ConnectionDB();
            String Search = String.format("SELECT * FROM employee ");
            ResultSet rs = db.get_resultset(Search);
            while (rs.next()) {
                String row[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)};
                model.addRow(row);
            }
            Show.setModel(model);
            db.disconnect();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void OrderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderButtonMouseClicked
        this.dispose();
        Order order= new Order();
        order.setVisible(true);
    }//GEN-LAST:event_OrderButtonMouseClicked

    private void OrderButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderButtonMouseEntered
        Orders.setBackground(new Color(125,109,151));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_OrderButtonMouseEntered

    private void OrderButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderButtonMouseExited
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_OrderButtonMouseExited

    private void EmployeeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeButtonMouseClicked
        this.dispose();
        EM_Login lg= new EM_Login();
        lg.setVisible(true);
    }//GEN-LAST:event_EmployeeButtonMouseClicked

    private void EmployeeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeButtonMouseEntered
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(125,109,151));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_EmployeeButtonMouseEntered

    private void EmployeeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeButtonMouseExited
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_EmployeeButtonMouseExited

    private void AdminButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminButtonMouseClicked
        this.dispose();
        AM_login lg= new AM_login();
        lg.setVisible(true);
    }//GEN-LAST:event_AdminButtonMouseClicked

    private void AdminButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminButtonMouseEntered
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(125,109,151));
        Check.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_AdminButtonMouseEntered

    private void AdminButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminButtonMouseExited
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_AdminButtonMouseExited

    private void CheckButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckButtonMouseClicked

    private void CheckButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckButtonMouseEntered
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(125,109,151));
    }//GEN-LAST:event_CheckButtonMouseEntered

    private void CheckButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckButtonMouseExited
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_CheckButtonMouseExited

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

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
            java.util.logging.Logger.getLogger(AM_Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AM_Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AM_Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AM_Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AM_Detail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Admin;
    private javax.swing.JLabel AdminButton;
    private javax.swing.JPanel Check;
    private javax.swing.JLabel CheckButton;
    private javax.swing.JLabel Detail;
    private javax.swing.JPanel Employee;
    private javax.swing.JLabel EmployeeButton;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Head;
    private swing.SearchText ID;
    private swing.SearchText ID2;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel OrderButton;
    private javax.swing.JPanel Orders;
    private swing.password Password;
    private javax.swing.JButton PrintButton;
    private javax.swing.JButton Search;
    private javax.swing.JTable Show;
    private swing.SearchText address;
    private swing.SearchText age;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.SearchText mail;
    private swing.SearchText name;
    private swing.SearchText search;
    // End of variables declaration//GEN-END:variables
}
