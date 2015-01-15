package view.admin;

import Main.*;
import connection.EmployeeManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import model.Employee;

/**
 *
 * @author IS104_2
 */
public class UserOverview extends javax.swing.JPanel {
    /**
     * Creates new form overview
     */
    public UserOverview() {
        initComponents();
        fillTable(null);
        
        SearchQuery.addKeyListener(new KeyListener(){
             @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                int key = ke.getKeyCode();
                if (key == KeyEvent.VK_ENTER) {
                    SearchButton.doClick(0);
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
            });
    }

    /**
     * Fills the table with user data, based on filter
     * @param filter 
     */
    private void fillTable(String filter) {
        DefaultTableModel tableModel = (DefaultTableModel) UserOverviewTable.getModel();
        
        EmployeeManager manager = new EmployeeManager();
        Employee employee = new Employee();
        
        ResultSet employees;
        
        // Do we want to filter the results?
        if (filter == null || filter.isEmpty()) {
            employees = manager.getEmployees();
        } else {
            employees = manager.getEmployees(filter);
        }
        
        try {
            tableModel.setRowCount(0);
            
            while (employees.next()) {
                String functionName;
                String lastName;
                
                // Get the function name from the function ID
                functionName = employee.getFunctionName(employees.getInt("function"));
                
                String insertion = employees.getString("insertion");
                
                if (insertion == null || insertion.equals("")) {
                    lastName = employees.getString("last_name");
                } else {
                    lastName = employees.getString("last_name") + ", " + employees.getString("insertion");
                }
                
                // Fill the table with information
                tableModel.addRow(
                        new Object[] {
                            employees.getString("username"),
                            employees.getString("name"),
                            lastName,
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

        SearchButton = new javax.swing.JButton();
        SearchQuery = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserOverviewTable = new javax.swing.JTable();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        LogoutButton1 = new javax.swing.JButton();
        MenuOverview = new java.awt.Panel();
        overviewusers = new javax.swing.JButton();
        logocorendon = new javax.swing.JButton();
        addusers = new javax.swing.JButton();
        help = new javax.swing.JButton();
        loggedinas = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1044, 600));

        SearchButton.setText("Search");
        SearchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
        });

        SearchQuery.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SearchQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchQueryActionPerformed(evt);
            }
        });

        UserOverviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "First Name", "Last Name", "Employee Number", "Location", "Function"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            UserOverviewTable.getColumnModel().getColumn(4).setResizable(false);
            UserOverviewTable.getColumnModel().getColumn(5).setResizable(false);
        }

        EditButton.setText("Edit employee");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete employee");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

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

        MenuOverview.setBackground(new java.awt.Color(187, 29, 20));
        MenuOverview.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuOverview.setName(""); // NOI18N
        MenuOverview.setPreferredSize(new java.awt.Dimension(1044, 55));

        overviewusers.setBackground(new java.awt.Color(157, 11, 15));
        overviewusers.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        overviewusers.setForeground(new java.awt.Color(255, 255, 255));
        overviewusers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menu_button.png"))); // NOI18N
        overviewusers.setText("Overview users");
        overviewusers.setBorder(null);
        overviewusers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        overviewusers.setInheritsPopupMenu(true);
        overviewusers.setPreferredSize(new java.awt.Dimension(145, 25));
        overviewusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewusersActionPerformed(evt);
            }
        });

        logocorendon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo.png"))); // NOI18N
        logocorendon.setBorder(null);
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
        addusers.setBorder(null);
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
        help.setBorder(null);
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        help.setInheritsPopupMenu(true);
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        loggedinas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        loggedinas.setForeground(new java.awt.Color(255, 255, 255));
        loggedinas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loggedinas.setText(Main.getLoggedLabel());
        loggedinas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout MenuOverviewLayout = new javax.swing.GroupLayout(MenuOverview);
        MenuOverview.setLayout(MenuOverviewLayout);
        MenuOverviewLayout.setHorizontalGroup(
            MenuOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuOverviewLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(logocorendon, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addusers, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(overviewusers, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loggedinas)
                .addGap(71, 71, 71)
                .addComponent(help)
                .addContainerGap())
        );
        MenuOverviewLayout.setVerticalGroup(
            MenuOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuOverviewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenuOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(overviewusers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loggedinas)
                        .addComponent(addusers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(help)
                    .addComponent(logocorendon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuOverview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogoutButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SearchQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 125, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuOverview, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutButton1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DeleteButton)
                        .addComponent(SearchQuery)
                        .addComponent(SearchButton)))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

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
            int employeeNumber = Integer.parseInt(UserOverviewTable.getValueAt(UserOverviewTable.getSelectedRow(), 3).toString());
            
            Main.getInstance().showPanel(new view.admin.EditUser(employeeNumber));
        }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        EmployeeManager manager = new EmployeeManager();
        
        int selectedRows = UserOverviewTable.getSelectedRows().length;
        
        // Prevent deleting multiple employees
        if (selectedRows == 0) {
            JOptionPane.showMessageDialog(this, "You didn't select an employee.");
        } else if(selectedRows > 1) {
            JOptionPane.showMessageDialog(this, "You may only delete one employee at the time.");
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this employee?\nThis action can not be reverted.");
            
            // Make sure the administrator wants to delete the employee to avoid mistakes
            if (confirm == JOptionPane.YES_OPTION) {
                int employeeNumber = Integer.parseInt(UserOverviewTable.getValueAt(UserOverviewTable.getSelectedRow(), 3).toString());
                manager.deleteEmployee(employeeNumber);
                
                JOptionPane.showMessageDialog(this, "Employee " + employeeNumber + " has been deleted.\nRefreshing table.");
                this.fillTable(SearchQuery.getText());
            }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main.getInstance().showPanel(new view.admin.ChangePassword());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LogoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButton1ActionPerformed
        Session.getInstance().logoutUser();
    }//GEN-LAST:event_LogoutButton1ActionPerformed

    private void overviewusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewusersActionPerformed
        Main.getInstance().showPanel(new view.admin.UserOverview());
    }//GEN-LAST:event_overviewusersActionPerformed

    private void logocorendonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logocorendonActionPerformed
        Main.getInstance().showPanel(new view.admin.AdminMenu());
    }//GEN-LAST:event_logocorendonActionPerformed

    private void addusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addusersActionPerformed
        Main.getInstance().showPanel(new view.admin.AddUser());
    }//GEN-LAST:event_addusersActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        Main.showHelpMenu(new Handleiding.HelpAdmin());
    }//GEN-LAST:event_helpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton LogoutButton1;
    private java.awt.Panel MenuOverview;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchQuery;
    private javax.swing.JTable UserOverviewTable;
    private javax.swing.JButton addusers;
    private javax.swing.JButton help;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loggedinas;
    private javax.swing.JButton logocorendon;
    private javax.swing.JButton overviewusers;
    // End of variables declaration//GEN-END:variables
}
