/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trueproject;

import java.awt.Color;

/**
 *
 * @author user
 */
public class AM_menu extends javax.swing.JFrame {

    /**
     * Creates new form AM_Login
     */
    public AM_menu() {
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
        EM_menu = new javax.swing.JLabel();
        detail = new javax.swing.JPanel();
        Detail = new javax.swing.JLabel();
        order = new javax.swing.JPanel();
        orders = new javax.swing.JLabel();
        emplo = new javax.swing.JPanel();
        employee = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        EM_menu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EM_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EM_menu.setText("ADMIN MENU");

        detail.setBackground(new java.awt.Color(85, 65, 118));
        detail.setPreferredSize(new java.awt.Dimension(344, 102));

        Detail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Detail.setForeground(new java.awt.Color(255, 255, 255));
        Detail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Detail.setText("DETAIL CUSTOMER");
        Detail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DetailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DetailMouseExited(evt);
            }
        });

        javax.swing.GroupLayout detailLayout = new javax.swing.GroupLayout(detail);
        detail.setLayout(detailLayout);
        detailLayout.setHorizontalGroup(
            detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Detail, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );
        detailLayout.setVerticalGroup(
            detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Detail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        order.setBackground(new java.awt.Color(85, 65, 118));
        order.setPreferredSize(new java.awt.Dimension(344, 102));

        orders.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orders.setForeground(new java.awt.Color(255, 255, 255));
        orders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orders.setText("ORDERS");
        orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ordersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ordersMouseExited(evt);
            }
        });

        javax.swing.GroupLayout orderLayout = new javax.swing.GroupLayout(order);
        order.setLayout(orderLayout);
        orderLayout.setHorizontalGroup(
            orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(orders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
        );
        orderLayout.setVerticalGroup(
            orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
            .addGroup(orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(orders, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
        );

        emplo.setBackground(new java.awt.Color(85, 65, 118));
        emplo.setPreferredSize(new java.awt.Dimension(344, 102));

        employee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        employee.setForeground(new java.awt.Color(255, 255, 255));
        employee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employee.setText("DETAIL EMPLOYEE");
        employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                employeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                employeeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout emploLayout = new javax.swing.GroupLayout(emplo);
        emplo.setLayout(emploLayout);
        emploLayout.setHorizontalGroup(
            emploLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(emploLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(employee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
        );
        emploLayout.setVerticalGroup(
            emploLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
            .addGroup(emploLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(employee, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EM_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detail, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addComponent(order, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addComponent(emplo, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(EM_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emplo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        detail.setBackground(new Color(85,65,118));
        order.setBackground(new Color(85,65,118));
        emplo.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_OrderButtonMouseEntered

    private void OrderButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderButtonMouseExited
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
        detail.setBackground(new Color(85,65,118));
        order.setBackground(new Color(85,65,118));
        emplo.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_OrderButtonMouseExited

    private void EmployeeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeButtonMouseEntered
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(125,109,151));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
        detail.setBackground(new Color(85,65,118));
        order.setBackground(new Color(85,65,118));
        emplo.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_EmployeeButtonMouseEntered

    private void EmployeeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeButtonMouseClicked
        this.dispose();
        EM_Login lg= new EM_Login();
        lg.setVisible(true);
    }//GEN-LAST:event_EmployeeButtonMouseClicked

    private void EmployeeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeButtonMouseExited
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
        detail.setBackground(new Color(85,65,118));
        order.setBackground(new Color(85,65,118));
        emplo.setBackground(new Color(85,65,118));
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
        detail.setBackground(new Color(85,65,118));
        order.setBackground(new Color(85,65,118));
        emplo.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_AdminButtonMouseEntered

    private void AdminButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminButtonMouseExited
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
        detail.setBackground(new Color(85,65,118));
        order.setBackground(new Color(85,65,118));
        emplo.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_AdminButtonMouseExited

    private void CheckButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckButtonMouseClicked

    private void CheckButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckButtonMouseEntered
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(125,109,151));
        detail.setBackground(new Color(85,65,118));
        order.setBackground(new Color(85,65,118));
        emplo.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_CheckButtonMouseEntered

    private void CheckButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckButtonMouseExited
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
        detail.setBackground(new Color(85,65,118));
        order.setBackground(new Color(85,65,118));
        emplo.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_CheckButtonMouseExited

    private void DetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailMouseClicked
        this.dispose();
        AM_DetailCustomer dt= new AM_DetailCustomer();
        dt.setVisible(true);
    }//GEN-LAST:event_DetailMouseClicked

    private void DetailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailMouseEntered
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
        detail.setBackground(new Color(125,109,151));
        order.setBackground(new Color(85,65,118));
        emplo.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_DetailMouseEntered

    private void DetailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailMouseExited
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
        detail.setBackground(new Color(85,65,118));
        order.setBackground(new Color(85,65,118));
        emplo.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_DetailMouseExited

    private void ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersMouseClicked
        this.dispose();
        EM_Orders or= new EM_Orders();
        or.setVisible(true);
    }//GEN-LAST:event_ordersMouseClicked

    private void ordersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersMouseEntered
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
        detail.setBackground(new Color(85,65,118));
        order.setBackground(new Color(125,109,151));
        emplo.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_ordersMouseEntered

    private void ordersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersMouseExited
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
        detail.setBackground(new Color(85,65,118));
        order.setBackground(new Color(85,65,118));
        emplo.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_ordersMouseExited

    private void employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeMouseClicked
        this.dispose();
        AM_Detail d= new AM_Detail();
        d.setVisible(true);
    }//GEN-LAST:event_employeeMouseClicked

    private void employeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeMouseEntered
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
        detail.setBackground(new Color(85,65,118));
        order.setBackground(new Color(85,65,118));
        emplo.setBackground(new Color(125,109,151));
    }//GEN-LAST:event_employeeMouseEntered

    private void employeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeMouseExited
        Orders.setBackground(new Color(85,65,118));
        Employee.setBackground(new Color(85,65,118));
        Admin.setBackground(new Color(85,65,118));
        Check.setBackground(new Color(85,65,118));
        detail.setBackground(new Color(85,65,118));
        order.setBackground(new Color(85,65,118));
        emplo.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_employeeMouseExited

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
            java.util.logging.Logger.getLogger(AM_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AM_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AM_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AM_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AM_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Admin;
    private javax.swing.JLabel AdminButton;
    private javax.swing.JPanel Check;
    private javax.swing.JLabel CheckButton;
    private javax.swing.JLabel Detail;
    private javax.swing.JLabel EM_menu;
    private javax.swing.JPanel Employee;
    private javax.swing.JLabel EmployeeButton;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Head;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel OrderButton;
    private javax.swing.JPanel Orders;
    private javax.swing.JPanel detail;
    private javax.swing.JPanel emplo;
    private javax.swing.JLabel employee;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel order;
    private javax.swing.JLabel orders;
    // End of variables declaration//GEN-END:variables
}
