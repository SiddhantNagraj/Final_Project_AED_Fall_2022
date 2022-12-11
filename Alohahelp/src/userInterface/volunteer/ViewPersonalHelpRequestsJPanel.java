/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.volunteer;

import business.orgapkg.OrgaDirect;
import business.userAccountpkg.UserAc;
import business.workQpkg.NeedHelpWorkReq;
import business.workQpkg.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shiba
 */
public class ViewPersonalHelpRequestsJPanel extends javax.swing.JPanel {
    
   private JPanel userProcessContainer;
   private UserAc userAccount;  
    private OrgaDirect od;
    /**
     * Creates new form ViewHelpRequests
     */
    public ViewPersonalHelpRequestsJPanel(JPanel userProcessContainer, UserAc userAccount, OrgaDirect od) {
        initComponents();
        
         this.userProcessContainer = userProcessContainer;
         this.userAccount = userAccount;
         this.od = od;
         
         populatehelpRequestTable();
         
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(153,197,85);
        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
    public void populatehelpRequestTable()
    {
        DefaultTableModel model = (DefaultTableModel)helpRequestListTable.getModel();
        
        model.setRowCount(0);
         DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
          if(request.getMessage().equalsIgnoreCase("Need Help"))
          {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender();
            row[2] = dateFormat.format(request.getRequestDate());
            row[3] = request.getStatus();
           
            model.addRow(row);
          }
          if((request.getMessage().equals("Request for Approval")))
          {
            String msg = ("Your account is approved by").concat(request.getReceiver().getPerson().getName());
           accountTxtAreaField.setText(msg);
           accountTxtAreaField.setEditable(false);
            }
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

        manageEnt1 = new javax.swing.JLabel();
        manageEnt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        helpRequestListTable = new javax.swing.JTable();
        processHelpRquestJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        accountTxtAreaField = new javax.swing.JTextArea();
        viewHelpSeekerBtn = new javax.swing.JButton();

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setText("Heart Help");

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Personal Help Requests");

        helpRequestListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Need Help", "Requestor", "Requested Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(helpRequestListTable);

        processHelpRquestJButton.setText("Process");
        processHelpRquestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processHelpRquestJButtonActionPerformed(evt);
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

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        accountTxtAreaField.setColumns(20);
        accountTxtAreaField.setRows(5);
        jScrollPane2.setViewportView(accountTxtAreaField);

        viewHelpSeekerBtn.setText("View Requestor Profile");
        viewHelpSeekerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHelpSeekerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(refreshJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backJButton)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(133, 133, 133)
                                    .addComponent(viewHelpSeekerBtn)
                                    .addGap(33, 33, 33)
                                    .addComponent(assignJButton)
                                    .addGap(34, 34, 34)
                                    .addComponent(processHelpRquestJButton))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(manageEnt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manageEnt)
                            .addComponent(refreshJButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processHelpRquestJButton)
                    .addComponent(assignJButton)
                    .addComponent(viewHelpSeekerBtn))
                .addGap(11, 11, 11)
                .addComponent(backJButton)
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processHelpRquestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processHelpRquestJButtonActionPerformed

        int selectedRow = helpRequestListTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        NeedHelpWorkReq request = (NeedHelpWorkReq)helpRequestListTable.getValueAt(selectedRow, 0);
        if(request.getReceiver() == null)
        {
            JOptionPane.showMessageDialog(null, "Please assign the request first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(request.getStatus().equalsIgnoreCase("Completed"))
        {
         JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
         return;    
        }
         if(request.getStatus().equalsIgnoreCase("Processing") ||  request.getStatus().equalsIgnoreCase("Pending"))
        {
         if(request.getReceiver()!=userAccount)
         {
         JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
         }
        }
        request.setStatus("Processing");

        ProcessHelpWorkRequestJPanel processWorkRequestJPanel = new ProcessHelpWorkRequestJPanel(userProcessContainer, request, userAccount, od);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processHelpRquestJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
       populatehelpRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
         int selectedRow = helpRequestListTable.getSelectedRow();

     if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest request = (WorkRequest)helpRequestListTable.getValueAt(selectedRow, 0);
         if(request.getReceiver()!=null)
        {
         JOptionPane.showMessageDialog(null, "Request has been processed by Other Volunteers!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
        }
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populatehelpRequestTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewHelpSeekerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHelpSeekerBtnActionPerformed
        int selectedRow = helpRequestListTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest)helpRequestListTable.getValueAt(selectedRow, 0);
        UserAc ua = request.getSender();

        ViewVolunteerProfile viewVolunteerProfile = new ViewVolunteerProfile(userProcessContainer, ua);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewHelpSeekerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea accountTxtAreaField;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable helpRequestListTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JButton processHelpRquestJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton viewHelpSeekerBtn;
    // End of variables declaration//GEN-END:variables
}
