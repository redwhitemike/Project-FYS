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
        panel12 = new java.awt.Panel();
        List = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Graphs = new javax.swing.JButton();
        help = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        LogoutButton1 = new javax.swing.JButton();

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

        panel12.setBackground(new java.awt.Color(187, 29, 20));
        panel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel12.setName(""); // NOI18N
        panel12.setPreferredSize(new java.awt.Dimension(1044, 55));

        List.setBackground(new java.awt.Color(157, 11, 15));
        List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        List.setForeground(new java.awt.Color(255, 255, 255));
        List.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        List.setText("List luggage");
        List.setBorder(null);
        List.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        List.setInheritsPopupMenu(true);
        List.setPreferredSize(new java.awt.Dimension(145, 25));
        List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListActionPerformed(evt);
            }
        });

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo.png"))); // NOI18N
        Home.setBorder(null);
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Home.setInheritsPopupMenu(true);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        Graphs.setBackground(new java.awt.Color(157, 11, 15));
        Graphs.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Graphs.setForeground(new java.awt.Color(255, 255, 255));
        Graphs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        Graphs.setText("Graphs");
        Graphs.setBorder(null);
        Graphs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Graphs.setInheritsPopupMenu(true);
        Graphs.setPreferredSize(new java.awt.Dimension(145, 25));
        Graphs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraphsActionPerformed(evt);
            }
        });

        help.setBackground(new java.awt.Color(187, 29, 20));
        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/questionmark.png"))); // NOI18N
        help.setBorder(null);
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        help.setInheritsPopupMenu(true);
        help.setPreferredSize(new java.awt.Dimension(31, 31));
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
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
                .addGap(3, 3, 3)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Graphs, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(List, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(help, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel12Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(Graphs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(help, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel8)
                .addGap(85, 85, 85)
                .addComponent(jLabel4)
                .addContainerGap(275, Short.MAX_VALUE))
            .addComponent(panel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(LogoutButton1))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListActionPerformed
        
    }//GEN-LAST:event_ListActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Main.getInstance().showPanel(new view.manager.ManagerMenu());
    }//GEN-LAST:event_HomeActionPerformed

    private void GraphsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraphsActionPerformed
        Main.getInstance().showPanel(new view.manager.Graph());
    }//GEN-LAST:event_GraphsActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
       Main.showHelpMenu(new Handleiding.HelpManager());
       Main.pressHelpKey(help);
    }//GEN-LAST:event_helpActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Main.getInstance().showPanel(new view.manager.Graph());
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main.getInstance().showPanel(new view.desk.ChangePassword());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LogoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButton1ActionPerformed
        Session.getInstance().logoutUser();
    }//GEN-LAST:event_LogoutButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Graphs;
    private javax.swing.JButton Home;
    private javax.swing.JButton List;
    private javax.swing.JButton LogoutButton1;
    private javax.swing.JButton help;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private java.awt.Panel panel12;
    // End of variables declaration//GEN-END:variables
}
