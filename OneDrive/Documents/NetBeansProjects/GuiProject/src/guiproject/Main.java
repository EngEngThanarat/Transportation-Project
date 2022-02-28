/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiproject;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    boolean a=true;
    public Main() {
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

        Header = new javax.swing.JPanel();
        IconSizeClose = new javax.swing.JPanel();
        max = new javax.swing.JPanel();
        maxClick = new javax.swing.JLabel();
        close = new javax.swing.JPanel();
        closeClick = new javax.swing.JLabel();
        min = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        menuIcon = new javax.swing.JPanel();
        LineMenu = new javax.swing.JPanel();
        Setting = new javax.swing.JPanel();
        ButtonSetting = new javax.swing.JLabel();
        ButtonSetting1 = new javax.swing.JLabel();
        LineSetting1 = new javax.swing.JPanel();
        LineSetting = new javax.swing.JPanel();
        hideMenu = new javax.swing.JPanel();
        ButtonHide = new javax.swing.JLabel();
        LineSetting3 = new javax.swing.JPanel();
        menuHide = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        Header.setBackground(new java.awt.Color(54, 33, 89));
        Header.setPreferredSize(new java.awt.Dimension(450, 50));
        Header.setLayout(new java.awt.BorderLayout());

        IconSizeClose.setBackground(new java.awt.Color(64, 43, 100));
        IconSizeClose.setPreferredSize(new java.awt.Dimension(150, 50));
        IconSizeClose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        max.setBackground(new java.awt.Color(54, 33, 89));

        maxClick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maxClick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproject/icon/icons8_expand_32px.png"))); // NOI18N
        maxClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxClickMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maxClickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maxClickMouseExited(evt);
            }
        });

        javax.swing.GroupLayout maxLayout = new javax.swing.GroupLayout(max);
        max.setLayout(maxLayout);
        maxLayout.setHorizontalGroup(
            maxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(maxClick, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        maxLayout.setVerticalGroup(
            maxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maxLayout.createSequentialGroup()
                .addComponent(maxClick, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        IconSizeClose.add(max, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        close.setBackground(new java.awt.Color(54, 33, 89));

        closeClick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeClick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproject/icon/icons8_shutdown_32px.png"))); // NOI18N
        closeClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeClickMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeClickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeClickMouseExited(evt);
            }
        });

        javax.swing.GroupLayout closeLayout = new javax.swing.GroupLayout(close);
        close.setLayout(closeLayout);
        closeLayout.setHorizontalGroup(
            closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeLayout.createSequentialGroup()
                .addComponent(closeClick, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        closeLayout.setVerticalGroup(
            closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeLayout.createSequentialGroup()
                .addComponent(closeClick, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        IconSizeClose.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        min.setBackground(new java.awt.Color(54, 33, 89));

        javax.swing.GroupLayout minLayout = new javax.swing.GroupLayout(min);
        min.setLayout(minLayout);
        minLayout.setHorizontalGroup(
            minLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        minLayout.setVerticalGroup(
            minLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        IconSizeClose.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Header.add(IconSizeClose, java.awt.BorderLayout.LINE_END);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("   WORLDWIDE SHIPPING");
        Header.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        menu.setPreferredSize(new java.awt.Dimension(270, 450));
        menu.setLayout(new java.awt.BorderLayout());

        menuIcon.setBackground(new java.awt.Color(54, 33, 89));
        menuIcon.setPreferredSize(new java.awt.Dimension(50, 450));
        menuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LineMenu.setBackground(new java.awt.Color(54, 33, 89));
        LineMenu.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout LineMenuLayout = new javax.swing.GroupLayout(LineMenu);
        LineMenu.setLayout(LineMenuLayout);
        LineMenuLayout.setHorizontalGroup(
            LineMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        LineMenuLayout.setVerticalGroup(
            LineMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        menuIcon.add(LineMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 5));

        Setting.setBackground(new java.awt.Color(54, 33, 89));
        Setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingMouseExited(evt);
            }
        });
        Setting.setLayout(new java.awt.BorderLayout());

        ButtonSetting.setBackground(new java.awt.Color(54, 33, 89));
        ButtonSetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproject/icon/icons8_settings_32px.png"))); // NOI18N
        Setting.add(ButtonSetting, java.awt.BorderLayout.CENTER);

        ButtonSetting1.setBackground(new java.awt.Color(54, 33, 89));
        ButtonSetting1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonSetting1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproject/icon/icons8_employee_32px.png"))); // NOI18N
        Setting.add(ButtonSetting1, java.awt.BorderLayout.CENTER);

        LineSetting1.setBackground(new java.awt.Color(54, 33, 89));
        LineSetting1.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout LineSetting1Layout = new javax.swing.GroupLayout(LineSetting1);
        LineSetting1.setLayout(LineSetting1Layout);
        LineSetting1Layout.setHorizontalGroup(
            LineSetting1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        LineSetting1Layout.setVerticalGroup(
            LineSetting1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        Setting.add(LineSetting1, java.awt.BorderLayout.PAGE_START);

        menuIcon.add(Setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, 50));

        LineSetting.setBackground(new java.awt.Color(54, 33, 89));
        LineSetting.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout LineSettingLayout = new javax.swing.GroupLayout(LineSetting);
        LineSetting.setLayout(LineSettingLayout);
        LineSettingLayout.setHorizontalGroup(
            LineSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        LineSettingLayout.setVerticalGroup(
            LineSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        menuIcon.add(LineSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, 5));

        hideMenu.setBackground(new java.awt.Color(54, 33, 89));
        hideMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hideMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hideMenuMouseExited(evt);
            }
        });
        hideMenu.setLayout(new java.awt.BorderLayout());

        ButtonHide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproject/icon/icons8_menu_vertical_32px.png"))); // NOI18N
        hideMenu.add(ButtonHide, java.awt.BorderLayout.CENTER);

        menuIcon.add(hideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 50, 50));

        LineSetting3.setBackground(new java.awt.Color(54, 33, 89));
        LineSetting3.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout LineSetting3Layout = new javax.swing.GroupLayout(LineSetting3);
        LineSetting3.setLayout(LineSetting3Layout);
        LineSetting3Layout.setHorizontalGroup(
            LineSetting3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        LineSetting3Layout.setVerticalGroup(
            LineSetting3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        menuIcon.add(LineSetting3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 50, 5));

        menu.add(menuIcon, java.awt.BorderLayout.LINE_START);

        menuHide.setBackground(new java.awt.Color(64, 43, 100));

        javax.swing.GroupLayout menuHideLayout = new javax.swing.GroupLayout(menuHide);
        menuHide.setLayout(menuHideLayout);
        menuHideLayout.setHorizontalGroup(
            menuHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        menuHideLayout.setVerticalGroup(
            menuHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        menu.add(menuHide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        dashboard.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(dashboard, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void changecolor(JPanel hover,Color rand){
        hover.setBackground(rand);
    }
    
    public void clickmenu(JPanel h1,JPanel h2, int numberbool){
        if(numberbool == 1){
            h1.setBackground(new Color(25,29,74));
            h2.setBackground(new Color(54,33,89));
            
        }
        else {
            h1.setBackground(new Color(54,33,89));
            h2.setBackground(new Color(25,29,74));
        }
    }
    
    public void changeimage(JLabel button, String resourcheimg){
        ImageIcon aimg = new ImageIcon(); 
        button.setIcon(aimg);
    }
    
    public void hideshow(JPanel menushowhide, boolean dashboard,JLabel Button){
        if(dashboard == true){
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(Button,"/icon/icons8_menu_32px.png");
        }
        else{
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));}
            changeimage(Button,"/icon/icons8_menu_vertical_32px.png");
    }
    
    private void closeClickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeClickMouseEntered
        changecolor(close,new Color(85,65,118));
    }//GEN-LAST:event_closeClickMouseEntered

    private void closeClickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeClickMouseExited
        changecolor(close,new Color(54,33,89));
    }//GEN-LAST:event_closeClickMouseExited

    private void closeClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeClickMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeClickMouseClicked

    private void maxClickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxClickMouseEntered
        changecolor(max,new Color(85,65,118));
    }//GEN-LAST:event_maxClickMouseEntered

    private void maxClickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxClickMouseExited
        changecolor(max,new Color(54,33,89));
    }//GEN-LAST:event_maxClickMouseExited

    private void maxClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxClickMouseClicked
        if(this.getExtendedState() != Main.MAXIMIZED_BOTH){
            this.setExtendedState(Main.MAXIMIZED_BOTH);
    }
        else{
            this.setExtendedState(Main.NORMAL);}
    }//GEN-LAST:event_maxClickMouseClicked
    
    private void hideMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMenuMouseEntered
        changecolor(LineMenu,new Color(255,0,0));
    }//GEN-LAST:event_hideMenuMouseEntered

    private void hideMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMenuMouseExited
        changecolor(LineMenu,new Color(54,33,89));
    }//GEN-LAST:event_hideMenuMouseExited

    private void hideMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMenuMouseClicked
        clickmenu(hideMenu, Setting,1);
        //create void for methode hide and show panel menu
        if(a == true){
            hideshow(menu,a,ButtonHide);
            SwingUtilities.updateComponentTreeUI(this);
            a=false;
        }
        else{
            hideshow(menu,a,ButtonHide);
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
        }
    }//GEN-LAST:event_hideMenuMouseClicked

    private void SettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingMouseEntered
        changecolor(LineSetting,new Color(255,0,0));
    }//GEN-LAST:event_SettingMouseEntered

    private void SettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingMouseExited
        changecolor(LineSetting,new Color(54,33,89));
    }//GEN-LAST:event_SettingMouseExited

    private void SettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingMouseClicked
        clickmenu(hideMenu, Setting,2);
    }//GEN-LAST:event_SettingMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonHide;
    private javax.swing.JLabel ButtonSetting;
    private javax.swing.JLabel ButtonSetting1;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel IconSizeClose;
    private javax.swing.JPanel LineMenu;
    private javax.swing.JPanel LineSetting;
    private javax.swing.JPanel LineSetting1;
    private javax.swing.JPanel LineSetting3;
    private javax.swing.JPanel Setting;
    private javax.swing.JPanel close;
    private javax.swing.JLabel closeClick;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel hideMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel max;
    private javax.swing.JLabel maxClick;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuHide;
    private javax.swing.JPanel menuIcon;
    private javax.swing.JPanel min;
    // End of variables declaration//GEN-END:variables
}