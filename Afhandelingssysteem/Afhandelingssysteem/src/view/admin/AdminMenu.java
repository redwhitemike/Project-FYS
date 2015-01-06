package view.admin;

import Main.Main;

/**
 *
 * @author IS104_2
 */
public class AdminMenu extends javax.swing.JPanel {

    /**
     * Creates new form adminmenu1
     */
    public AdminMenu() {
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

        AddUserBlock = new javax.swing.JLabel();
        OverviewUsersBlock = new javax.swing.JLabel();
        panel12 = new java.awt.Panel();
        addUser = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        overviewUsers = new javax.swing.JButton();
        Help = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1024, 740));

        AddUserBlock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        AddUserBlock.setForeground(new java.awt.Color(255, 255, 255));
        AddUserBlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/main_menu_button.PNG"))); // NOI18N
        AddUserBlock.setText("Add user");
        AddUserBlock.setToolTipText("");
        AddUserBlock.setFocusable(false);
        AddUserBlock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddUserBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddUserBlockMouseClicked(evt);
            }
        });

        OverviewUsersBlock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        OverviewUsersBlock.setForeground(new java.awt.Color(255, 255, 255));
        OverviewUsersBlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/main_menu_button.PNG"))); // NOI18N
        OverviewUsersBlock.setText("Overview users");
        OverviewUsersBlock.setToolTipText("");
        OverviewUsersBlock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OverviewUsersBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OverviewUsersBlockMouseClicked(evt);
            }
        });

        panel12.setBackground(new java.awt.Color(187, 29, 20));
        panel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel12.setName(""); // NOI18N
        panel12.setPreferredSize(new java.awt.Dimension(1044, 55));

        addUser.setBackground(new java.awt.Color(157, 11, 15));
        addUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addUser.setForeground(new java.awt.Color(255, 255, 255));
        addUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        addUser.setText("Add user");
        addUser.setBorder(null);
        addUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addUser.setInheritsPopupMenu(true);
        addUser.setPreferredSize(new java.awt.Dimension(145, 25));
        addUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addUserMouseClicked(evt);
            }
        });
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo.png"))); // NOI18N
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Home.setInheritsPopupMenu(true);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        overviewUsers.setBackground(new java.awt.Color(157, 11, 15));
        overviewUsers.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        overviewUsers.setForeground(new java.awt.Color(255, 255, 255));
        overviewUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        overviewUsers.setText("Overview users");
        overviewUsers.setBorder(null);
        overviewUsers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        overviewUsers.setInheritsPopupMenu(true);
        overviewUsers.setPreferredSize(new java.awt.Dimension(145, 25));
        overviewUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                overviewUsersMouseClicked(evt);
            }
        });
        overviewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewUsersActionPerformed(evt);
            }
        });

        Help.setBackground(new java.awt.Color(187, 29, 20));
        Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/questionmark.png"))); // NOI18N
        Help.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Help.setInheritsPopupMenu(true);
        Help.setPreferredSize(new java.awt.Dimension(31, 31));
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Logged in as user");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setMaximumSize(null);

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(overviewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(344, 344, 344)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Help, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel12Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel12Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(overviewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel12Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Help, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(AddUserBlock)
                .addGap(85, 85, 85)
                .addComponent(OverviewUsersBlock)
                .addContainerGap(255, Short.MAX_VALUE))
            .addComponent(panel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddUserBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OverviewUsersBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        
    }//GEN-LAST:event_addUserActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        
    }//GEN-LAST:event_HomeActionPerformed

    private void overviewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewUsersActionPerformed

    }//GEN-LAST:event_overviewUsersActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        Main.getInstance().showPanel(new Handleiding.HelpAdmin());
    }//GEN-LAST:event_HelpActionPerformed

    private void addUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserMouseClicked
        Main.getInstance().showPanel(new view.admin.AddUser());
    }//GEN-LAST:event_addUserMouseClicked

    private void overviewUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_overviewUsersMouseClicked
        Main.getInstance().showPanel(new view.admin.UserTable());
    }//GEN-LAST:event_overviewUsersMouseClicked

    private void AddUserBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddUserBlockMouseClicked
        Main.getInstance().showPanel(new view.admin.AddUser());
    }//GEN-LAST:event_AddUserBlockMouseClicked

    private void OverviewUsersBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OverviewUsersBlockMouseClicked
        Main.getInstance().showPanel(new view.admin.UserTable());
    }//GEN-LAST:event_OverviewUsersBlockMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddUserBlock;
    private javax.swing.JButton Help;
    private javax.swing.JButton Home;
    private javax.swing.JLabel OverviewUsersBlock;
    private javax.swing.JButton addUser;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JButton overviewUsers;
    private java.awt.Panel panel12;
    // End of variables declaration//GEN-END:variables
}
