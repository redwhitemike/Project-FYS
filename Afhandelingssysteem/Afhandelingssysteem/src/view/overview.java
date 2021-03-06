/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Laura
 */
public class overview extends javax.swing.JPanel {

    /**
     * Creates new form overview
     */
    public overview() {
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

        menuoverview = new java.awt.Panel();
        overviewusers = new javax.swing.JButton();
        logocorendon = new javax.swing.JButton();
        addusers = new javax.swing.JButton();
        help = new javax.swing.JButton();
        loggedinas = new javax.swing.JLabel();
        Functiondummytext = new javax.swing.JLabel();
        locationdummytext = new javax.swing.JLabel();
        employeenamedummytext = new javax.swing.JLabel();
        namedummytext = new javax.swing.JLabel();
        deletebutton = new javax.swing.JButton();
        editbutton = new javax.swing.JButton();
        overviewbackground = new javax.swing.JLabel();
        searchbutton = new javax.swing.JButton();
        search = new javax.swing.JTextField();

        setLayout(null);

        menuoverview.setBackground(new java.awt.Color(187, 29, 20));
        menuoverview.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuoverview.setName(""); // NOI18N
        menuoverview.setPreferredSize(new java.awt.Dimension(1044, 55));

        overviewusers.setBackground(new java.awt.Color(157, 11, 15));
        overviewusers.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        overviewusers.setForeground(new java.awt.Color(255, 255, 255));
        overviewusers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        overviewusers.setText("Overview users");
        overviewusers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        overviewusers.setInheritsPopupMenu(true);
        overviewusers.setPreferredSize(new java.awt.Dimension(145, 25));
        overviewusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewusersActionPerformed(evt);
            }
        });

        logocorendon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo.png"))); // NOI18N
        logocorendon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logocorendon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logocorendon.setInheritsPopupMenu(true);
        logocorendon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logocorendonActionPerformed(evt);
            }
        });

        addusers.setBackground(new java.awt.Color(157, 11, 15));
        addusers.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addusers.setForeground(new java.awt.Color(255, 255, 255));
        addusers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        addusers.setText("Add user");
        addusers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addusers.setInheritsPopupMenu(true);
        addusers.setPreferredSize(new java.awt.Dimension(145, 25));
        addusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addusersActionPerformed(evt);
            }
        });

        help.setBackground(new java.awt.Color(187, 29, 20));
        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/questionmark.png"))); // NOI18N
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        help.setInheritsPopupMenu(true);
        help.setPreferredSize(new java.awt.Dimension(31, 31));
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        loggedinas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        loggedinas.setForeground(new java.awt.Color(255, 255, 255));
        loggedinas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loggedinas.setText("Logged in as admin");
        loggedinas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout menuoverviewLayout = new javax.swing.GroupLayout(menuoverview);
        menuoverview.setLayout(menuoverviewLayout);
        menuoverviewLayout.setHorizontalGroup(
            menuoverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuoverviewLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(logocorendon, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addusers, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(overviewusers, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(422, 422, 422)
                .addComponent(loggedinas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(help, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        menuoverviewLayout.setVerticalGroup(
            menuoverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuoverviewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuoverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuoverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(overviewusers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loggedinas)
                        .addComponent(addusers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(help, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logocorendon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        add(menuoverview);
        menuoverview.setBounds(0, 0, 1044, 55);

        Functiondummytext.setText("Function");
        Functiondummytext.setToolTipText("");
        add(Functiondummytext);
        Functiondummytext.setBounds(190, 220, 110, 16);

        locationdummytext.setText("Location");
        locationdummytext.setToolTipText("");
        add(locationdummytext);
        locationdummytext.setBounds(190, 200, 110, 16);

        employeenamedummytext.setText("Employee number");
        employeenamedummytext.setToolTipText("");
        add(employeenamedummytext);
        employeenamedummytext.setBounds(190, 180, 120, 16);

        namedummytext.setText("Name");
        add(namedummytext);
        namedummytext.setBounds(190, 160, 80, 16);

        deletebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/delete.png"))); // NOI18N
        deletebutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deletebutton.setPreferredSize(new java.awt.Dimension(30, 25));
        add(deletebutton);
        deletebutton.setBounds(340, 200, 30, 25);

        editbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/edit.png"))); // NOI18N
        editbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editbutton.setPreferredSize(new java.awt.Dimension(30, 25));
        add(editbutton);
        editbutton.setBounds(340, 160, 30, 25);

        overviewbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/overviewbackground.png"))); // NOI18N
        add(overviewbackground);
        overviewbackground.setBounds(170, 150, 200, 95);

        searchbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/view.png"))); // NOI18N
        searchbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(searchbutton);
        searchbutton.setBounds(890, 100, 30, 25);

        search.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        add(search);
        search.setBounds(720, 90, 210, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void overviewusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewusersActionPerformed

    }//GEN-LAST:event_overviewusersActionPerformed

    private void logocorendonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logocorendonActionPerformed

    }//GEN-LAST:event_logocorendonActionPerformed

    private void addusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addusersActionPerformed

    }//GEN-LAST:event_addusersActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Functiondummytext;
    private javax.swing.JButton addusers;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton editbutton;
    private javax.swing.JLabel employeenamedummytext;
    private javax.swing.JButton help;
    private javax.swing.JLabel locationdummytext;
    private javax.swing.JLabel loggedinas;
    private javax.swing.JButton logocorendon;
    private java.awt.Panel menuoverview;
    private javax.swing.JLabel namedummytext;
    private javax.swing.JLabel overviewbackground;
    private javax.swing.JButton overviewusers;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchbutton;
    // End of variables declaration//GEN-END:variables
}
