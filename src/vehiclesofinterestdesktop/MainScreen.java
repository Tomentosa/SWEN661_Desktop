/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclesofinterestdesktop;

import java.awt.Image;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bavad
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jP_TopPanel = new java.awt.Panel();
        jL_ShieldImage = new javax.swing.JLabel();
        jB_Search = new javax.swing.JButton();
        tF_SearchBar = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_VOIdata = new javax.swing.JTable();
        jP_Management = new javax.swing.JPanel();
        jB_ViewReason = new javax.swing.JButton();
        jB_CreateVOI = new javax.swing.JButton();
        jL_Reason = new javax.swing.JLabel();
        jL_VOI = new javax.swing.JLabel();
        jL_MakeModel = new javax.swing.JLabel();
        jB_EditSelectedVOI = new javax.swing.JButton();
        jB_DeleteSelectedVOI = new javax.swing.JButton();
        jB_ViewMakeModel = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jMB_TopLeftMenu = new javax.swing.JMenuBar();
        jM_File = new javax.swing.JMenu();
        jMI_RefreshTable = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jM_Manage = new javax.swing.JMenu();
        jM_VOI = new javax.swing.JMenu();
        jMI_AddNew = new javax.swing.JMenuItem();
        jMI_EditSelected = new javax.swing.JMenuItem();
        jMI_DeleteSelected = new javax.swing.JMenuItem();
        jM_VOI1 = new javax.swing.JMenu();
        jMI_AddNew1 = new javax.swing.JMenuItem();
        jMI_EditSelected1 = new javax.swing.JMenuItem();
        jMI_DeleteSelected1 = new javax.swing.JMenuItem();
        jM_VOI2 = new javax.swing.JMenu();
        jMI_AddNew2 = new javax.swing.JMenuItem();
        jMI_EditSelected2 = new javax.swing.JMenuItem();
        jMI_DeleteSelected2 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MARYLAND STATE POLICE - VEHICLES OF INTEREST");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(javax.swing.UIManager.getDefaults().getColor("EditorPane.selectionBackground"));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                whenWindowOpens(evt);
            }
        });

        jP_TopPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jP_TopPanel.setForeground(new java.awt.Color(255, 255, 255));

        jL_ShieldImage.setText(" ");
        ImageIcon shield = new ImageIcon("MD_shield.jpg");
        shield.setImage(shield.getImage().getScaledInstance(40, 50, Image.SCALE_DEFAULT));
        jL_ShieldImage.setIcon(shield);

        jB_Search.setText("Search");
        jB_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tF_SearchBar.setText("textField2");

        javax.swing.GroupLayout jP_TopPanelLayout = new javax.swing.GroupLayout(jP_TopPanel);
        jP_TopPanel.setLayout(jP_TopPanelLayout);
        jP_TopPanelLayout.setHorizontalGroup(
            jP_TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_ShieldImage, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 529, Short.MAX_VALUE)
                .addComponent(tF_SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jP_TopPanelLayout.setVerticalGroup(
            jP_TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_ShieldImage)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jB_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tF_SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setText("Maryland State Police - Vehicle of Interest Database");

        jT_VOIdata.setBackground(new java.awt.Color(255, 255, 255));
        jT_VOIdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "License Plate", "Alert Type", "Make", "Model", "Year", "Color", "Owners Name", "Owners Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_VOIdata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jT_VOIdata);

        jP_Management.setBackground(new java.awt.Color(255, 204, 0));
        jP_Management.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP_Management.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jB_ViewReason.setText("View");
        jB_ViewReason.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_ViewReason.setPreferredSize(new java.awt.Dimension(70, 20));
        jB_ViewReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ViewReasonActionPerformed(evt);
            }
        });

        jB_CreateVOI.setText("Create");
        jB_CreateVOI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_CreateVOI.setPreferredSize(new java.awt.Dimension(70, 20));
        jB_CreateVOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CreateVOIActionPerformed(evt);
            }
        });

        jL_Reason.setForeground(new java.awt.Color(0, 0, 0));
        jL_Reason.setText("Manage Reasons for Interest");

        jL_VOI.setForeground(new java.awt.Color(0, 0, 0));
        jL_VOI.setText("Manage Vehicle(s) of Interest");

        jL_MakeModel.setForeground(new java.awt.Color(0, 0, 0));
        jL_MakeModel.setText("Manage Make / Model");

        jB_EditSelectedVOI.setText("Edit Selected");
        jB_EditSelectedVOI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_EditSelectedVOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_EditSelectedVOIActionPerformed(evt);
            }
        });

        jB_DeleteSelectedVOI.setText("Delete Selected");
        jB_DeleteSelectedVOI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_DeleteSelectedVOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_DeleteSelectedVOIActionPerformed(evt);
            }
        });

        jB_ViewMakeModel.setText("View");
        jB_ViewMakeModel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_ViewMakeModel.setPreferredSize(new java.awt.Dimension(70, 20));
        jB_ViewMakeModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ViewMakeModelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_ManagementLayout = new javax.swing.GroupLayout(jP_Management);
        jP_Management.setLayout(jP_ManagementLayout);
        jP_ManagementLayout.setHorizontalGroup(
            jP_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_ManagementLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jP_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jL_Reason, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_ViewReason, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jP_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_EditSelectedVOI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_CreateVOI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_DeleteSelectedVOI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_VOI))
                .addGap(53, 53, 53)
                .addGroup(jP_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_ViewMakeModel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_ManagementLayout.createSequentialGroup()
                        .addComponent(jL_MakeModel)
                        .addGap(19, 19, 19)))
                .addGap(11, 11, 11))
        );
        jP_ManagementLayout.setVerticalGroup(
            jP_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_ManagementLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jP_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Reason)
                    .addComponent(jL_VOI)
                    .addComponent(jL_MakeModel))
                .addGap(18, 18, 18)
                .addGroup(jP_ManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_ViewReason, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_CreateVOI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_ViewMakeModel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_EditSelectedVOI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jB_DeleteSelectedVOI, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jM_File.setText("File");

        jMI_RefreshTable.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMI_RefreshTable.setText("Refresh Database     ");
        jMI_RefreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_RefreshTableActionPerformed(evt);
            }
        });
        jM_File.add(jMI_RefreshTable);

        jMenuItem3.setText("Close");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jM_File.add(jMenuItem3);

        jMB_TopLeftMenu.add(jM_File);

        jM_Manage.setText("Manage");

        jM_VOI.setText("Vehicles of Interest (VOI)     ");

        jMI_AddNew.setText("Add  NEW");
        jM_VOI.add(jMI_AddNew);

        jMI_EditSelected.setText("Edit Selected");
        jM_VOI.add(jMI_EditSelected);

        jMI_DeleteSelected.setText("Remove Selected");
        jMI_DeleteSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_DeleteSelectedActionPerformed(evt);
            }
        });
        jM_VOI.add(jMI_DeleteSelected);

        jM_Manage.add(jM_VOI);

        jM_VOI1.setText("Reasons for Interest");

        jMI_AddNew1.setText("Add  NEW");
        jM_VOI1.add(jMI_AddNew1);

        jMI_EditSelected1.setText("Edit Reasons");
        jM_VOI1.add(jMI_EditSelected1);

        jMI_DeleteSelected1.setText("Remove Reasons");
        jMI_DeleteSelected1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_DeleteSelected1ActionPerformed(evt);
            }
        });
        jM_VOI1.add(jMI_DeleteSelected1);

        jM_Manage.add(jM_VOI1);

        jM_VOI2.setText("Vehicle Make / Models");

        jMI_AddNew2.setText("Add  NEW");
        jM_VOI2.add(jMI_AddNew2);

        jMI_EditSelected2.setText("Edit Reasons");
        jM_VOI2.add(jMI_EditSelected2);

        jMI_DeleteSelected2.setText("Remove Reasons");
        jMI_DeleteSelected2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_DeleteSelected2ActionPerformed(evt);
            }
        });
        jM_VOI2.add(jMI_DeleteSelected2);

        jM_Manage.add(jM_VOI2);

        jMB_TopLeftMenu.add(jM_Manage);

        setJMenuBar(jMB_TopLeftMenu);

        jP_Management.setAlignmentX((float)(jP_TopPanel.getSize().getWidth()/2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
            .addComponent(jP_TopPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP_Management, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jP_TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jP_Management, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(90, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMI_RefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_RefreshTableActionPerformed
        this.updateTable();
    }//GEN-LAST:event_jMI_RefreshTableActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMI_DeleteSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_DeleteSelectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMI_DeleteSelectedActionPerformed

    private void jMI_DeleteSelected1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_DeleteSelected1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMI_DeleteSelected1ActionPerformed

    private void jMI_DeleteSelected2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_DeleteSelected2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMI_DeleteSelected2ActionPerformed

    private void jB_ViewReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ViewReasonActionPerformed
        JF_ManageReason reason = new JF_ManageReason();
        reason.show();
    }//GEN-LAST:event_jB_ViewReasonActionPerformed

    private void jB_ViewMakeModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ViewMakeModelActionPerformed
        JF_ManageMakeModel makeModel = new JF_ManageMakeModel();
        makeModel.show();
    }//GEN-LAST:event_jB_ViewMakeModelActionPerformed

    private void jB_CreateVOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CreateVOIActionPerformed
        JF_ManageVOI createdVOI = new JF_ManageVOI();
        createdVOI.show();
    }//GEN-LAST:event_jB_CreateVOIActionPerformed

    private void whenWindowOpens(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_whenWindowOpens
        this.updateTable();
    }//GEN-LAST:event_whenWindowOpens

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.updateTable();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jB_DeleteSelectedVOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DeleteSelectedVOIActionPerformed
        //stores the value of the row the user has clicked
        try {
            int row = jT_VOIdata.getSelectedRow();
            String licensePlate = (String) jT_VOIdata.getModel().getValueAt(row, 0);
            voi_c.deleteVehicleOfInterest(licensePlate);
        } catch (Exception e) {
            System.out.println("No VOI Selected!");
        }
        this.updateTable();
    }//GEN-LAST:event_jB_DeleteSelectedVOIActionPerformed

    private void jB_EditSelectedVOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_EditSelectedVOIActionPerformed
        int row = jT_VOIdata.getSelectedRow();
        
        String alertType    = jT_VOIdata.getModel().getValueAt(row, 1).toString();
        String licensePlate = jT_VOIdata.getModel().getValueAt(row, 0).toString();
        String make         = jT_VOIdata.getModel().getValueAt(row, 2).toString();
        String model        = jT_VOIdata.getModel().getValueAt(row, 3).toString();
        String year         = jT_VOIdata.getModel().getValueAt(row, 4).toString();
        String color        = jT_VOIdata.getModel().getValueAt(row, 5).toString();
        String ownersName   = jT_VOIdata.getModel().getValueAt(row, 6).toString();
        String ownersPhone  = jT_VOIdata.getModel().getValueAt(row, 7).toString();

        System.out.println("Sent Values: " + licensePlate + ", " + alertType + ", " + make + ", " + model + ", " + year + ", " + color + ", " + ownersName + ", " + ownersPhone);


        JF_ManageVOI createdVOI = new JF_ManageVOI(licensePlate, alertType, make, model, year, color, ownersName, ownersPhone);
        createdVOI.show();

    }//GEN-LAST:event_jB_EditSelectedVOIActionPerformed

    private void updateTable() {
        String voiData[][] = voi_c.allVehicleOfInterest();

        DefaultTableModel model = (DefaultTableModel) jT_VOIdata.getModel();

        for (int y = model.getRowCount() - 1; y >= 0; y--) {
            model.removeRow(y);
        }

        for (int x = 0; x < voiData.length; x++) {
            String[] row = new String[8];

            row[0] = voiData[x][0];
            row[1] = voiData[x][1];
            row[2] = voiData[x][2];
            row[3] = voiData[x][3];
            row[4] = voiData[x][4];
            row[5] = voiData[x][5];
            row[6] = voiData[x][6];
            row[7] = voiData[x][7];

            model.addRow(row);
        }
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }
    private VehiclesOfInterestController voi_c = new VehiclesOfInterestController();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jB_CreateVOI;
    private javax.swing.JButton jB_DeleteSelectedVOI;
    private javax.swing.JButton jB_EditSelectedVOI;
    private javax.swing.JButton jB_Search;
    private javax.swing.JButton jB_ViewMakeModel;
    private javax.swing.JButton jB_ViewReason;
    private javax.swing.JLabel jL_MakeModel;
    private javax.swing.JLabel jL_Reason;
    private javax.swing.JLabel jL_ShieldImage;
    private javax.swing.JLabel jL_VOI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMB_TopLeftMenu;
    private javax.swing.JMenuItem jMI_AddNew;
    private javax.swing.JMenuItem jMI_AddNew1;
    private javax.swing.JMenuItem jMI_AddNew2;
    private javax.swing.JMenuItem jMI_DeleteSelected;
    private javax.swing.JMenuItem jMI_DeleteSelected1;
    private javax.swing.JMenuItem jMI_DeleteSelected2;
    private javax.swing.JMenuItem jMI_EditSelected;
    private javax.swing.JMenuItem jMI_EditSelected1;
    private javax.swing.JMenuItem jMI_EditSelected2;
    private javax.swing.JMenuItem jMI_RefreshTable;
    private javax.swing.JMenu jM_File;
    private javax.swing.JMenu jM_Manage;
    private javax.swing.JMenu jM_VOI;
    private javax.swing.JMenu jM_VOI1;
    private javax.swing.JMenu jM_VOI2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jP_Management;
    private java.awt.Panel jP_TopPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_VOIdata;
    private java.awt.TextField tF_SearchBar;
    // End of variables declaration//GEN-END:variables
}
