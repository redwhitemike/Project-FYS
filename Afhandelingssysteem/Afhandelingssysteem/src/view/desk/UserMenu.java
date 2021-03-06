/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.desk;

import Main.Main;
import Main.Session;

/**
 *
 * @author Laura
 */
public class UserMenu extends javax.swing.JPanel {
    private static final UserMenu um = new UserMenu();
    private static final FindCustomer fc = new FindCustomer();
    private static final FindLuggageUser flu = new FindLuggageUser();
    private static final LoginPanel login = new LoginPanel();
    
    /**
     * Creates new form usermenu
     */
    public UserMenu() {
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

        LuggageFindBlock = new javax.swing.JLabel();
        AddLuggageBlock = new javax.swing.JLabel();
        AddCustomerBlock = new javax.swing.JLabel();
        FindCustomerBlock = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        TopBar1 = new java.awt.Panel();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
<<<<<<< HEAD
=======
        jButton1 = new javax.swing.JButton();
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470

        setPreferredSize(new java.awt.Dimension(1024, 740));

        LuggageFindBlock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LuggageFindBlock.setForeground(new java.awt.Color(255, 255, 255));
        LuggageFindBlock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LuggageFindBlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/main_menu_button.PNG"))); // NOI18N
        LuggageFindBlock.setText("Find luggage");
        LuggageFindBlock.setToolTipText("");
        LuggageFindBlock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LuggageFindBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LuggageFindBlockMouseClicked(evt);
            }
        });

        AddLuggageBlock.setBackground(new java.awt.Color(204, 51, 0));
        AddLuggageBlock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        AddLuggageBlock.setForeground(new java.awt.Color(255, 255, 255));
        AddLuggageBlock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddLuggageBlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/main_menu_button.PNG"))); // NOI18N
        AddLuggageBlock.setText("Add luggage");
        AddLuggageBlock.setToolTipText("");
        AddLuggageBlock.setFocusable(false);
        AddLuggageBlock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddLuggageBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddLuggageBlockMouseClicked(evt);
            }
        });

        AddCustomerBlock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        AddCustomerBlock.setForeground(new java.awt.Color(255, 255, 255));
        AddCustomerBlock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddCustomerBlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/main_menu_button.PNG"))); // NOI18N
        AddCustomerBlock.setText("Add customer");
        AddCustomerBlock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddCustomerBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCustomerBlockMouseClicked(evt);
            }
        });

        FindCustomerBlock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FindCustomerBlock.setForeground(new java.awt.Color(255, 255, 255));
        FindCustomerBlock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FindCustomerBlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/main_menu_button.PNG"))); // NOI18N
        FindCustomerBlock.setText("Find customer");
        FindCustomerBlock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FindCustomerBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FindCustomerBlockMouseClicked(evt);
            }
        });

        LogoutButton.setText("Log out");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        TopBar1.setBackground(new java.awt.Color(187, 29, 20));
        TopBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TopBar1.setName(""); // NOI18N
        TopBar1.setPreferredSize(new java.awt.Dimension(1044, 55));

        jButton67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo.png"))); // NOI18N
        jButton67.setBorder(null);
        jButton67.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton67.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton67.setInheritsPopupMenu(true);
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        jButton68.setBackground(new java.awt.Color(157, 11, 15));
        jButton68.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton68.setForeground(new java.awt.Color(255, 255, 255));
        jButton68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        jButton68.setText("Add luggage");
        jButton68.setBorder(null);
        jButton68.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton68.setInheritsPopupMenu(true);
        jButton68.setPreferredSize(new java.awt.Dimension(145, 25));
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        jButton69.setBackground(new java.awt.Color(157, 11, 15));
        jButton69.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton69.setForeground(new java.awt.Color(255, 255, 255));
        jButton69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        jButton69.setText("Find luggage");
        jButton69.setBorder(null);
        jButton69.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton69.setInheritsPopupMenu(true);
        jButton69.setPreferredSize(new java.awt.Dimension(145, 25));
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });

        jButton70.setBackground(new java.awt.Color(187, 29, 20));
        jButton70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/questionmark.png"))); // NOI18N
        jButton70.setBorder(null);
        jButton70.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton70.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton70.setInheritsPopupMenu(true);
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText(Main.getLoggedLabel());
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton71.setBackground(new java.awt.Color(157, 11, 15));
        jButton71.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton71.setForeground(new java.awt.Color(255, 255, 255));
        jButton71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        jButton71.setText("Add customer");
        jButton71.setBorder(null);
        jButton71.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton71.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton71.setInheritsPopupMenu(true);
        jButton71.setPreferredSize(new java.awt.Dimension(145, 25));
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });

        jButton72.setBackground(new java.awt.Color(157, 11, 15));
        jButton72.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton72.setForeground(new java.awt.Color(255, 255, 255));
        jButton72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        jButton72.setText("Find customer");
        jButton72.setBorder(null);
        jButton72.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton72.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton72.setInheritsPopupMenu(true);
        jButton72.setPreferredSize(new java.awt.Dimension(145, 25));
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TopBar1Layout = new javax.swing.GroupLayout(TopBar1);
        TopBar1.setLayout(TopBar1Layout);
        TopBar1Layout.setHorizontalGroup(
            TopBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopBar1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
>>>>>>> 7027aaa1caae9aa171ca87e960bfaae977e12cef
                .addComponent(jLabel26)
                .addGap(54, 54, 54)
                .addComponent(jButton70)
                .addContainerGap())
        );
        TopBar1Layout.setVerticalGroup(
            TopBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopBar1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(TopBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26))
                    .addComponent(jButton70, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton1.setText("Change password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(AddLuggageBlock)
                        .addGap(85, 85, 85)
                        .addComponent(LuggageFindBlock))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(AddCustomerBlock)
                        .addGap(85, 85, 85)
                        .addComponent(FindCustomerBlock)))
                .addContainerGap(277, Short.MAX_VALUE))
<<<<<<< HEAD
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(965, Short.MAX_VALUE)
                .addComponent(LogoutButton)
                .addContainerGap())
            .addComponent(TopBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
            .addComponent(TopBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                .addComponent(LogoutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutButton)
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
>>>>>>> 7027aaa1caae9aa171ca87e960bfaae977e12cef
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LuggageFindBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddLuggageBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddCustomerBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FindCustomerBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddLuggageBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddLuggageBlockMouseClicked
        Main.getInstance().showPanel(new view.desk.AddLuggage());
    }//GEN-LAST:event_AddLuggageBlockMouseClicked

    private void LuggageFindBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LuggageFindBlockMouseClicked
        Main.getInstance().showPanel(new view.desk.FindLuggageUser());
    }//GEN-LAST:event_LuggageFindBlockMouseClicked
<<<<<<< HEAD

    private void AddCustomerBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCustomerBlockMouseClicked
        Main.getInstance().showPanel(new view.desk.AddCustomer());
    }//GEN-LAST:event_AddCustomerBlockMouseClicked

    private void FindCustomerBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindCustomerBlockMouseClicked
        Main.getInstance().showPanel(new view.desk.FindCustomer());
    }//GEN-LAST:event_FindCustomerBlockMouseClicked

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        Session.getInstance().logoutUser();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        Main.getInstance().showPanel(new UserMenu());
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed

    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        Main.getInstance().showPanel(new FindLuggageUser());
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        Main.showHelpMenu(new Handleiding.employee());
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        Main.getInstance().showPanel(new FindCustomer());
    }//GEN-LAST:event_jButton72ActionPerformed
=======

    private void AddCustomerBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCustomerBlockMouseClicked
        Main.getInstance().showPanel(new view.desk.AddCustomer());
    }//GEN-LAST:event_AddCustomerBlockMouseClicked

    private void FindCustomerBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindCustomerBlockMouseClicked
        Main.getInstance().showPanel(new view.desk.FindCustomer());
    }//GEN-LAST:event_FindCustomerBlockMouseClicked

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        Session.getInstance().logoutUser();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        Main.getInstance().showPanel(new UserMenu());
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        Main.getInstance().showPanel(new view.desk.AddLuggage());
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        Main.showHelpMenu(new Handleiding.HelpEmployee());
        Main.pressHelpKey(jButton70);
    }//GEN-LAST:event_jButton65ActionPerformed


    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        Main.getInstance().showPanel(new FindLuggageUser());
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        Main.getInstance().showPanel(new view.desk.AddCustomer());
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        Main.getInstance().showPanel(new FindCustomer());
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main.getInstance().showPanel(new view.desk.ChangePassword());
    }//GEN-LAST:event_jButton1ActionPerformed
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddCustomerBlock;
    private javax.swing.JLabel AddLuggageBlock;
    private javax.swing.JLabel FindCustomerBlock;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel LuggageFindBlock;
    private java.awt.Panel TopBar1;
<<<<<<< HEAD
=======
    private javax.swing.JButton jButton1;
>>>>>>> 453ec5a2e2e6fecf2f1ae237a3c80af816e53470
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JLabel jLabel26;
    // End of variables declaration//GEN-END:variables
}
