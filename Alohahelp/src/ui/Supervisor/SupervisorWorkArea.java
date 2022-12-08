/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Supervisor;

/**
 *
 * @author shiba
 */
public class SupervisorWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SupervisorWorkArea
     */
    public SupervisorWorkArea() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        updateSupervisorProfile = new javax.swing.JButton();
        viewProfileBtn = new javax.swing.JButton();
        viewRequestorProfile = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        viewReqToBeProcessedBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        updateSupervisorProfile.setText("Create My Profile");
        updateSupervisorProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSupervisorProfileActionPerformed(evt);
            }
        });

        viewProfileBtn.setText("View My Profile");
        viewProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileBtnActionPerformed(evt);
            }
        });

        viewRequestorProfile.setText("View Requestor Profile");
        viewRequestorProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestorProfileActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel6.setText("Supervisor Work Area");

        viewReqToBeProcessedBtn.setText("View Request to be Processed");
        viewReqToBeProcessedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReqToBeProcessedBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel7.setText("Work Requests:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232)
                        .addComponent(refreshJButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateSupervisorProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewReqToBeProcessedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewRequestorProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(refreshJButton)))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(viewProfileBtn)
                        .addGap(39, 39, 39)
                        .addComponent(updateSupervisorProfile)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(assignJButton)
                .addGap(37, 37, 37)
                .addComponent(processJButton)
                .addGap(32, 32, 32)
                .addComponent(viewRequestorProfile)
                .addGap(36, 36, 36)
                .addComponent(viewReqToBeProcessedBtn)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

//        int selectedRow = workRequestJTable.getSelectedRow();
//
//        if (selectedRow < 0){
//            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//
//        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
//        if(request.getReceiver()!=null)
//        {
//            JOptionPane.showMessageDialog(null, "Request has been processed earlier !", "warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        request.setReceiver(userAccount);
//        request.setStatus("Pending");
//        populateWorkRequestTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

//        int selectedRow = workRequestJTable.getSelectedRow();
//
//        if (selectedRow < 0){
//            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//
//        SupervisorWorkRequest request = (SupervisorWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
//        if(request.getReceiver() == null)
//        {
//            JOptionPane.showMessageDialog(null, "Please assign the request first", "warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        if(request.getStatus().equalsIgnoreCase("Completed"))
//        {
//            JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        if(request.getStatus().equalsIgnoreCase("Processing") ||  request.getStatus().equalsIgnoreCase("Pending"))
//        {
//            if(request.getReceiver()!=userAccount)
//            {
//                JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
//                return;
//            }
//        }
//
//        request.setStatus("Processing");
//
//        SupervisorProcessRequestAreaJPanel swrajp = new SupervisorProcessRequestAreaJPanel(userProcessContainer, request, ecoSystem);
//        userProcessContainer.add("processWorkRequestJPanel", swrajp);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        //populateWorkRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void updateSupervisorProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSupervisorProfileActionPerformed
//        CreateSupervisorProfileJPanel createSupervisorProfileJPanel = new CreateSupervisorProfileJPanel(userProcessContainer, userAccount);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        userProcessContainer.add("CreateSupervisorProfileJPanel", createSupervisorProfileJPanel);
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_updateSupervisorProfileActionPerformed

    private void viewReqToBeProcessedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReqToBeProcessedBtnActionPerformed
       // populateWorkRequestToBeProcessedTable();
    }//GEN-LAST:event_viewReqToBeProcessedBtnActionPerformed

    private void viewRequestorProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestorProfileActionPerformed

//        int selectedRow = workRequestJTable.getSelectedRow();
//
//        if (selectedRow < 0){
//            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//
//        SupervisorWorkRequest request = (SupervisorWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
//        UserAccount ua = request.getSender();
//
//        ViewVolunteerProfile viewVolunteerProfile = new ViewVolunteerProfile(userProcessContainer, ua);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
//        layout.next(userProcessContainer);

    }//GEN-LAST:event_viewRequestorProfileActionPerformed

    private void viewProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileBtnActionPerformed
//
//        ViewMyProfile viewMyProfile = new ViewMyProfile(userProcessContainer, userAccount);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        userProcessContainer.add("ViewMyProfile", viewMyProfile);
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewProfileBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton updateSupervisorProfile;
    private javax.swing.JButton viewProfileBtn;
    private javax.swing.JButton viewReqToBeProcessedBtn;
    private javax.swing.JButton viewRequestorProfile;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
