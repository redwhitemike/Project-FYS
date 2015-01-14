package view.desk;

import Main.Main;
import Main.Session;
import connection.EmployeeManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import connection.*;
import javax.swing.JOptionPane;
import model.Luggage;

/**
 *
 * @author IS104_2
 */
public class FindLuggageUser extends javax.swing.JPanel {

    LuggageManager manager = new LuggageManager();
    FlightManager flightManager = new FlightManager();

    /**
     * Creates new form findluggageuser
     */
    public FindLuggageUser() {
        initComponents();
        fillTable(null);
    }

    private void fillTable(String filter) {
        Luggage luggageModel = new Luggage();
        DefaultTableModel tableModel = (DefaultTableModel) LuggageTable.getModel();

        ResultSet luggages;

        // We handle the way we retrieve luggage differently if there is a filter.
        if (filter == null || filter.isEmpty()) {
            luggages = manager.getLuggages();
        } else {
            luggages = manager.getLuggages(filter);
        }

        try {
            tableModel.setRowCount(0);

            while (luggages.next()) {
                String luggageText = null;
                String customerLabel = "No owner";

                // If we do manage to find an owner, show the customer ID
                if (flightManager.getOwnerByLabel(luggages.getInt("label_number")) > 0) {
                    customerLabel = Integer.toString(flightManager.getOwnerByLabel(luggages.getInt("label_number")));
                }
                
                // Get the text version of the status.
                luggageText = luggageModel.getStatusText(luggages.getInt("status"));

                tableModel.addRow(
                        new Object[]{
                            luggages.getInt("label_number"),
                            luggages.getString("flight_number"),
                            customerLabel,
                            luggageModel.typeToString(Integer.parseInt(luggages.getString("type"))),
                            luggages.getString("description"),
                            luggageText,
                            luggages.getDate("added_at")
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

        panel4 = new java.awt.Panel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SearchQuery = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        LuggageTable = new javax.swing.JTable();
        Search = new javax.swing.JButton();
        LogoutButton1 = new javax.swing.JButton();
        EditLuggage = new javax.swing.JButton();
        DeleteLuggage = new javax.swing.JButton();
        TopBar1 = new java.awt.Panel();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        panel4.setBackground(new java.awt.Color(187, 29, 20));
        panel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel4.setName(""); // NOI18N
        panel4.setPreferredSize(new java.awt.Dimension(1024, 55));

        jButton12.setBackground(new java.awt.Color(157, 11, 15));
        jButton12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Add found luggage");
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setInheritsPopupMenu(true);
        jButton12.setMaximumSize(null);
        jButton12.setPreferredSize(new java.awt.Dimension(145, 25));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setInheritsPopupMenu(true);
        jButton13.setMaximumSize(null);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(157, 11, 15));
        jButton14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Add missing luggage");
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setInheritsPopupMenu(true);
        jButton14.setMaximumSize(null);
        jButton14.setPreferredSize(new java.awt.Dimension(145, 25));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(157, 11, 15));
        jButton15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Find costumer");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setInheritsPopupMenu(true);
        jButton15.setMaximumSize(null);
        jButton15.setPreferredSize(new java.awt.Dimension(145, 25));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(157, 11, 15));
        jButton16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Find luggage");
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setInheritsPopupMenu(true);
        jButton16.setMaximumSize(null);
        jButton16.setPreferredSize(new java.awt.Dimension(145, 25));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(187, 29, 20));
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setInheritsPopupMenu(true);
        jButton17.setMaximumSize(null);
        jButton17.setPreferredSize(new java.awt.Dimension(31, 31));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Logged in as user");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setMaximumSize(null);

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        SearchQuery.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SearchQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchQueryActionPerformed(evt);
            }
        });

        LuggageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Label number", "Flight number", "Customer", "Type", "Description", "Status", "Registered at"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(LuggageTable);
        if (LuggageTable.getColumnModel().getColumnCount() > 0) {
            LuggageTable.getColumnModel().getColumn(0).setResizable(false);
            LuggageTable.getColumnModel().getColumn(1).setResizable(false);
            LuggageTable.getColumnModel().getColumn(2).setResizable(false);
            LuggageTable.getColumnModel().getColumn(3).setResizable(false);
            LuggageTable.getColumnModel().getColumn(4).setResizable(false);
            LuggageTable.getColumnModel().getColumn(5).setResizable(false);
            LuggageTable.getColumnModel().getColumn(6).setResizable(false);
            LuggageTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        }

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        LogoutButton1.setText("Log out");
        LogoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButton1ActionPerformed(evt);
            }
        });

        EditLuggage.setText("Edit luggage");
        EditLuggage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditLuggageActionPerformed(evt);
            }
        });

        DeleteLuggage.setText("Delete luggage");
        DeleteLuggage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteLuggageActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
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
            .addComponent(TopBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EditLuggage, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteLuggage, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LogoutButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TopBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search)
                    .addComponent(EditLuggage)
                    .addComponent(DeleteLuggage)
                    .addComponent(LogoutButton1))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchQueryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchQueryActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        this.fillTable(SearchQuery.getText());
    }//GEN-LAST:event_SearchActionPerformed

    private void LogoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButton1ActionPerformed
        Session.getInstance().logoutUser();
    }//GEN-LAST:event_LogoutButton1ActionPerformed

    private void EditLuggageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditLuggageActionPerformed
        int selectedRows = LuggageTable.getSelectedRows().length;

        if (selectedRows == 0) {
            JOptionPane.showMessageDialog(this, "You must select the luggage you want to edit first.");
        } else if (selectedRows > 1) {
            JOptionPane.showMessageDialog(this, "You can only edit one luggage at a time.");
        } else {
            int labelNumber = Integer.parseInt(LuggageTable.getValueAt(LuggageTable.getSelectedRow(), 0).toString());
            Main.getInstance().showPanel(new view.desk.EditLuggage(labelNumber));
        }
    }//GEN-LAST:event_EditLuggageActionPerformed

    private void DeleteLuggageActionPerformed(java.awt.event.ActionEvent evt) {                                              

        int selectedRows = LuggageTable.getSelectedRows().length;

        // Prevent deleting multiple employees
        if (selectedRows == 0) {
            JOptionPane.showMessageDialog(this, "You must select luggage first.");
        } else if (selectedRows > 1) {
            JOptionPane.showMessageDialog(this, "You may only delete one luggage at a time.");
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this luggage?\nThis action can not be reverted.");
            // Make sure the employee wants to delete the luggage to avoid mistakes.
            if (confirm == JOptionPane.YES_OPTION) {
                int labelNumber = Integer.parseInt(LuggageTable.getValueAt(LuggageTable.getSelectedRow(), 0).toString());
                manager.deleteLuggage(labelNumber);

                JOptionPane.showMessageDialog(this, "Luggage with label number " + labelNumber + " has been deleted.\nRefreshing table.");
                this.fillTable(SearchQuery.getText());
            }
        }
    }              
    
    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
       Main.showHelpMenu(new Handleiding.HelpEmployee());
       Main.pressHelpKey(jButton70);
    }//GEN-LAST:event_jButton65ActionPerformed
                                           

    private void jButton65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton65MouseClicked
        Main.showHelpMenu(new Handleiding.HelpEmployee());
    }//GEN-LAST:event_jButton65MouseClicked

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        Main.getInstance().showPanel(new UserMenu());
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed

    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        Main.getInstance().showPanel(new FindLuggageUser());
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        Main.getInstance().showPanel(new FindCustomer());
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main.getInstance().showPanel(new view.desk.ChangePassword());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteLuggage;
    private javax.swing.JButton EditLuggage;
    private javax.swing.JButton LogoutButton1;
    private javax.swing.JTable LuggageTable;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchQuery;
    private java.awt.Panel TopBar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
