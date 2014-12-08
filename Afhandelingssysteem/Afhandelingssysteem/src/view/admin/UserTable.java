package view.admin;

import Main.Main;
import connection.EmployeeManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IS104_2
 */
public class UserTable extends javax.swing.JPanel {
    private static final AddUser adduser = new AddUser();
    private static UserTable overview = new UserTable();
    private static final AdminMenu adminMenu = new AdminMenu();
    /**
     * Creates new form overview
     */
    public UserTable() {
        initComponents();
        fillTable(null);
    }

    private void fillTable(String filter) {
        DefaultTableModel tableModel = (DefaultTableModel) UserOverviewTable.getModel();
        
        EmployeeManager manager = new EmployeeManager();
        ResultSet employees;
        
        if (filter == null || filter.isEmpty()) {
            employees = manager.getEmployees();
        } else {
            employees = manager.getEmployees(filter);
        }
        
        try {
            tableModel.setRowCount(0);
            
            while (employees.next()) {
                String functionName;
                
                switch (employees.getInt("function")) {
                    case Main.FUNCTION_EMPLOYEE:
                        functionName = "Employee";
                        break;
                        
                    case Main.FUNCTION_MANAGER:
                        functionName = "Manager";
                        break;
                        
                    case Main.FUNCTION_APP_MANAGER:
                        functionName = "Administrator";
                        break;
                        
                    default:
                        functionName = "Unknown";
                        break;
                }
                
                tableModel.addRow(
                        new Object[] {
                            employees.getString("name"), 
                            employees.getInt("employee_number"), 
                            employees.getString("location"), 
                            functionName
                    }
                );
            }
        } catch (SQLException e) {
            Main.exceptionPrint(e);
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

        menuoverview = new java.awt.Panel();
        overviewusers = new javax.swing.JButton();
        logocorendon = new javax.swing.JButton();
        addusers = new javax.swing.JButton();
        help = new javax.swing.JButton();
        loggedinas = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        SearchQuery = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserOverviewTable = new javax.swing.JTable();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

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

        SearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/view.png"))); // NOI18N
        SearchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
        });
        add(SearchButton);
        SearchButton.setBounds(930, 90, 50, 40);

        SearchQuery.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SearchQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchQueryActionPerformed(evt);
            }
        });
        add(SearchQuery);
        SearchQuery.setBounds(720, 90, 210, 40);

        UserOverviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Employee Number", "Location", "Function"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(UserOverviewTable);
        if (UserOverviewTable.getColumnModel().getColumnCount() > 0) {
            UserOverviewTable.getColumnModel().getColumn(0).setResizable(false);
            UserOverviewTable.getColumnModel().getColumn(1).setResizable(false);
            UserOverviewTable.getColumnModel().getColumn(2).setResizable(false);
            UserOverviewTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(110, 140, 820, 402);

        EditButton.setText("Edit employee");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        add(EditButton);
        EditButton.setBounds(110, 110, 130, 23);

        DeleteButton.setText("Delete employee");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        add(DeleteButton);
        DeleteButton.setBounds(250, 110, 150, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void overviewusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewusersActionPerformed
        Main.getInstance().showPanel(new view.admin.UserTable());
    }//GEN-LAST:event_overviewusersActionPerformed

    private void logocorendonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logocorendonActionPerformed
        Main.getInstance().showPanel(new view.admin.AdminMenu());
    }//GEN-LAST:event_logocorendonActionPerformed

    private void addusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addusersActionPerformed
        Main.getInstance().showPanel(new view.admin.AddUser());
    }//GEN-LAST:event_addusersActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpActionPerformed

    private void SearchQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchQueryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchQueryActionPerformed

    private void SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseClicked
        this.fillTable(SearchQuery.getText());
    }//GEN-LAST:event_SearchButtonMouseClicked

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        int selectedRows = UserOverviewTable.getSelectedRows().length;
        
        if (selectedRows == 0) {
            JOptionPane.showMessageDialog(this, "You didn't select an employee.");
        } else if(selectedRows > 1) {
            JOptionPane.showMessageDialog(this, "You may only edit one employee at the time.");
        } else {
            // We need to get the employee number of the selected row.
            int employeeNumber = Integer.parseInt(UserOverviewTable.getValueAt(UserOverviewTable.getSelectedRow(), 1).toString());
            System.out.println(employeeNumber);
        }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        EmployeeManager manager = new EmployeeManager();
        
        int selectedRows = UserOverviewTable.getSelectedRows().length;
        
        if (selectedRows == 0) {
            JOptionPane.showMessageDialog(this, "You didn't select an employee.");
        } else if(selectedRows > 1) {
            JOptionPane.showMessageDialog(this, "You may only delete one employee at the time.");
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this employee?\nThis action can not be reverted.");
            
            if (confirm == JOptionPane.YES_OPTION) {
                int employeeNumber = Integer.parseInt(UserOverviewTable.getValueAt(UserOverviewTable.getSelectedRow(), 1).toString());
                manager.deleteEmployee(employeeNumber);
                
                JOptionPane.showMessageDialog(this, "Employee " + employeeNumber + " has been deleted.\nRefreshing table.");
                this.fillTable(SearchQuery.getText());
            }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchQuery;
    private javax.swing.JTable UserOverviewTable;
    private javax.swing.JButton addusers;
    private javax.swing.JButton help;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loggedinas;
    private javax.swing.JButton logocorendon;
    private java.awt.Panel menuoverview;
    private javax.swing.JButton overviewusers;
    // End of variables declaration//GEN-END:variables
}