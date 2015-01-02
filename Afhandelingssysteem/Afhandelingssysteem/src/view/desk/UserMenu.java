/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.desk;

import Main.Main;

/**
 *
 * @author Laura
 */
public class UserMenu extends javax.swing.JPanel {
    private static final UserMenu um = new UserMenu();
    private static final AddFoundLuggage afl = new AddFoundLuggage();
    private static final AddMissingLuggage aml =  new AddMissingLuggage();
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

        FoundLuggageBlock = new javax.swing.JLabel();
        MissingLuggageBlock = new javax.swing.JLabel();
        FindLuggageBlock = new javax.swing.JLabel();
        FindCustomerBlock = new javax.swing.JLabel();
        panel12 = new java.awt.Panel();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1024, 740));

        FoundLuggageBlock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FoundLuggageBlock.setForeground(new java.awt.Color(255, 255, 255));
        FoundLuggageBlock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FoundLuggageBlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/main_menu_button.PNG"))); // NOI18N
        FoundLuggageBlock.setText("Add found luggage");
        FoundLuggageBlock.setToolTipText("");
        FoundLuggageBlock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FoundLuggageBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FoundLuggageBlockMouseClicked(evt);
            }
        });

        MissingLuggageBlock.setBackground(new java.awt.Color(204, 51, 0));
        MissingLuggageBlock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        MissingLuggageBlock.setForeground(new java.awt.Color(255, 255, 255));
        MissingLuggageBlock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MissingLuggageBlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/main_menu_button.PNG"))); // NOI18N
        MissingLuggageBlock.setText("Add missing luggage");
        MissingLuggageBlock.setToolTipText("");
        MissingLuggageBlock.setFocusable(false);
        MissingLuggageBlock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MissingLuggageBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MissingLuggageBlockMouseClicked(evt);
            }
        });

        FindLuggageBlock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FindLuggageBlock.setForeground(new java.awt.Color(255, 255, 255));
        FindLuggageBlock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FindLuggageBlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/main_menu_button.PNG"))); // NOI18N
        FindLuggageBlock.setText("Find luggage");
        FindLuggageBlock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FindLuggageBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FindLuggageBlockMouseClicked(evt);
            }
        });

        FindCustomerBlock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FindCustomerBlock.setForeground(new java.awt.Color(255, 255, 255));
        FindCustomerBlock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FindCustomerBlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/main_menu_button.PNG"))); // NOI18N
        FindCustomerBlock.setText("Find costumer");
        FindCustomerBlock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FindCustomerBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FindCustomerBlockMouseClicked(evt);
            }
        });

        panel12.setBackground(new java.awt.Color(187, 29, 20));
        panel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel12.setName(""); // NOI18N
        panel12.setPreferredSize(new java.awt.Dimension(1024, 55));

        jButton60.setBackground(new java.awt.Color(157, 11, 15));
        jButton60.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton60.setForeground(new java.awt.Color(255, 255, 255));
        jButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        jButton60.setText("Add found luggage");
        jButton60.setBorder(null);
        jButton60.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton60.setInheritsPopupMenu(true);
        jButton60.setPreferredSize(new java.awt.Dimension(145, 25));
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo.png"))); // NOI18N
        jButton61.setBorder(null);
        jButton61.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton61.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton61.setInheritsPopupMenu(true);
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        jButton62.setBackground(new java.awt.Color(157, 11, 15));
        jButton62.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton62.setForeground(new java.awt.Color(255, 255, 255));
        jButton62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        jButton62.setText("Add missing luggage");
        jButton62.setBorder(null);
        jButton62.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton62.setInheritsPopupMenu(true);
        jButton62.setPreferredSize(new java.awt.Dimension(145, 25));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton63.setBackground(new java.awt.Color(157, 11, 15));
        jButton63.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton63.setForeground(new java.awt.Color(255, 255, 255));
        jButton63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        jButton63.setText("Find customer");
        jButton63.setBorder(null);
        jButton63.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton63.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton63.setInheritsPopupMenu(true);
        jButton63.setPreferredSize(new java.awt.Dimension(145, 25));
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        jButton64.setBackground(new java.awt.Color(157, 11, 15));
        jButton64.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton64.setForeground(new java.awt.Color(255, 255, 255));
        jButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        jButton64.setText("Find luggage");
        jButton64.setBorder(null);
        jButton64.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton64.setInheritsPopupMenu(true);
        jButton64.setPreferredSize(new java.awt.Dimension(145, 25));
        jButton64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton64MouseClicked(evt);
            }
        });
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton65.setBackground(new java.awt.Color(187, 29, 20));
        jButton65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/questionmark.png"))); // NOI18N
        jButton65.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton65.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton65.setInheritsPopupMenu(true);
        jButton65.setPreferredSize(new java.awt.Dimension(31, 31));
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(Main.getLoggedLabel());
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel12Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel12Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(MissingLuggageBlock)
                        .addGap(85, 85, 85)
                        .addComponent(FoundLuggageBlock))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(FindLuggageBlock)
                        .addGap(85, 85, 85)
                        .addComponent(FindCustomerBlock)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FoundLuggageBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MissingLuggageBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FindLuggageBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FindCustomerBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        Main.getInstance().showPanel(afl);
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        Main.getInstance().showPanel(um);
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        Main.getInstance().showPanel(aml);
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        Main.getInstance().showPanel(fc);
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton65ActionPerformed

    private void MissingLuggageBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MissingLuggageBlockMouseClicked
        Main.getInstance().showPanel(aml);
    }//GEN-LAST:event_MissingLuggageBlockMouseClicked

    private void FoundLuggageBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FoundLuggageBlockMouseClicked
        Main.getInstance().showPanel(afl);
    }//GEN-LAST:event_FoundLuggageBlockMouseClicked

    private void FindLuggageBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindLuggageBlockMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FindLuggageBlockMouseClicked

    private void FindCustomerBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindCustomerBlockMouseClicked
        Main.getInstance().showPanel(fc);
    }//GEN-LAST:event_FindCustomerBlockMouseClicked

    private void jButton64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton64MouseClicked
        Main.getInstance().showPanel(new view.desk.FindLuggageUser());
    }//GEN-LAST:event_jButton64MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FindCustomerBlock;
    private javax.swing.JLabel FindLuggageBlock;
    private javax.swing.JLabel FoundLuggageBlock;
    private javax.swing.JLabel MissingLuggageBlock;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JLabel jLabel11;
    private java.awt.Panel panel12;
    // End of variables declaration//GEN-END:variables
}
