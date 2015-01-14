package view.manager;

import Main.Main;
import Main.Session;

/**
 *
 * @author IS104_2
 */
public class ManagerMenu extends javax.swing.JPanel {

    /**
     * Creates new form managermenu1
     */
    public ManagerMenu() {
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

        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        LogoutButton1 = new javax.swing.JButton();
        MenuOverview2 = new java.awt.Panel();
        List2 = new javax.swing.JButton();
        logocorendon2 = new javax.swing.JButton();
        Graphs = new javax.swing.JButton();
        help2 = new javax.swing.JButton();
        loggedinas2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1024, 740));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/main_menu_button.PNG"))); // NOI18N
        jLabel8.setText("Graphs");
        jLabel8.setToolTipText("");
        jLabel8.setFocusable(false);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/main_menu_button.PNG"))); // NOI18N
        jLabel4.setText("List luggage");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setText("Change password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LogoutButton1.setText("Log out");
        LogoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButton1ActionPerformed(evt);
            }
        });

        MenuOverview2.setBackground(new java.awt.Color(187, 29, 20));
        MenuOverview2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuOverview2.setName(""); // NOI18N
        MenuOverview2.setPreferredSize(new java.awt.Dimension(1044, 55));

        List2.setBackground(new java.awt.Color(157, 11, 15));
        List2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        List2.setForeground(new java.awt.Color(255, 255, 255));
        List2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        List2.setText("List luggage");
        List2.setBorder(null);
        List2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        List2.setInheritsPopupMenu(true);
        List2.setPreferredSize(new java.awt.Dimension(145, 25));
        List2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                List2ActionPerformed(evt);
            }
        });

        logocorendon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo.png"))); // NOI18N
        logocorendon2.setBorder(null);
        logocorendon2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logocorendon2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logocorendon2.setInheritsPopupMenu(true);
        logocorendon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logocorendon2ActionPerformed(evt);
            }
        });

        Graphs.setBackground(new java.awt.Color(157, 11, 15));
        Graphs.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Graphs.setForeground(new java.awt.Color(255, 255, 255));
        Graphs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        Graphs.setText("Graphs");
        Graphs.setToolTipText("");
        Graphs.setBorder(null);
        Graphs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Graphs.setInheritsPopupMenu(true);
        Graphs.setPreferredSize(new java.awt.Dimension(145, 25));
        Graphs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraphsActionPerformed(evt);
            }
        });

        help2.setBackground(new java.awt.Color(187, 29, 20));
        help2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/questionmark.png"))); // NOI18N
        help2.setBorder(null);
        help2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        help2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        help2.setInheritsPopupMenu(true);
        help2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help2ActionPerformed(evt);
            }
        });

        loggedinas2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        loggedinas2.setForeground(new java.awt.Color(255, 255, 255));
        loggedinas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loggedinas2.setText(Main.getLoggedLabel());
        loggedinas2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout MenuOverview2Layout = new javax.swing.GroupLayout(MenuOverview2);
        MenuOverview2.setLayout(MenuOverview2Layout);
        MenuOverview2Layout.setHorizontalGroup(
            MenuOverview2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuOverview2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(logocorendon2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Graphs, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(List2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(422, 422, 422)
                .addComponent(loggedinas2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(help2)
                .addContainerGap())
        );
        MenuOverview2Layout.setVerticalGroup(
            MenuOverview2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuOverview2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenuOverview2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuOverview2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(List2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loggedinas2)
                        .addComponent(Graphs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(help2)
                    .addComponent(logocorendon2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel8)
                .addGap(85, 85, 85)
                .addComponent(jLabel4)
                .addContainerGap(255, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(LogoutButton1))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addComponent(MenuOverview2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuOverview2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(395, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Main.getInstance().showPanel(new view.manager.Graph());
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main.getInstance().showPanel(new view.manager.ChangePassword());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LogoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButton1ActionPerformed
        Session.getInstance().logoutUser();
    }//GEN-LAST:event_LogoutButton1ActionPerformed

    private void List2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_List2ActionPerformed
        Main.getInstance().showPanel(new view.manager.Lists());
    }//GEN-LAST:event_List2ActionPerformed

    private void logocorendon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logocorendon2ActionPerformed

    }//GEN-LAST:event_logocorendon2ActionPerformed

    private void GraphsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraphsActionPerformed
        Main.getInstance().showPanel(new view.manager.Graph());
    }//GEN-LAST:event_GraphsActionPerformed

    private void help2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help2ActionPerformed
        Main.showHelpMenu(new Handleiding.HelpAdmin());
    }//GEN-LAST:event_help2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Graphs;
    private javax.swing.JButton List2;
    private javax.swing.JButton LogoutButton1;
    private java.awt.Panel MenuOverview2;
    private javax.swing.JButton help2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel loggedinas2;
    private javax.swing.JButton logocorendon2;
    // End of variables declaration//GEN-END:variables
}
