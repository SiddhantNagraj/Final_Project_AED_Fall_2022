/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.transport;

import business.orgapkg.Orga;
import business.orgapkg.OrgaDirect;
import business.orgapkg.TransportOrga;
import business.userAccountpkg.UserAc;
import business.workQpkg.NeedTransportWorkReq;
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
import userInterface.volunteer.ViewVolunteerProfile;

/**
 *
 * @author shiba
 */
public class DriverWorkAreaJPanel extends javax.swing.JPanel {
   private JPanel userProcessContainer;
   private UserAc userAccount;  
    private OrgaDirect od;
    private TransportOrga to;
    
    /**
     * Creates new form DriverWorkAreaJPanel
     */
    public DriverWorkAreaJPanel(JPanel userProcessContainer, UserAc userAccount, Orga organization, OrgaDirect od) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
         this.userAccount = userAccount;
         this.od = od;
         this.to = (TransportOrga)organization;
         
         populatetransportRequestTable();
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
    
     public void populatetransportRequestTable()
    {
        DefaultTableModel model = (DefaultTableModel)transportRequestListTable.getModel();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
        model.setRowCount(0);
        if(!to.getworkQ().getWorkRequestList().isEmpty())
        {
        for(WorkRequest request : to.getworkQ().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getPerson().getName();
            row[2] = dateFormat.format(request.getRequestDate());
            row[3] = request.getStatus();
           
            model.addRow(row);
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

        manageEnt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transportRequestListTable = new javax.swing.JTable();
        processHelpRquestJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        viewVolProfileBtn = new javax.swing.JButton();

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Transport Requests");

        transportRequestListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Destination Location", "Requestor", "Requested Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transportRequestListTable);

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

        viewVolProfileBtn.setText("View Volunteer Details");
        viewVolProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVolProfileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshJButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(viewVolProfileBtn)
                            .addGap(74, 74, 74)
                            .addComponent(assignJButton)
                            .addGap(18, 18, 18)
                            .addComponent(processHelpRquestJButton))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(343, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageEnt)
                    .addComponent(refreshJButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewVolProfileBtn)
                    .addComponent(assignJButton)
                    .addComponent(processHelpRquestJButton))
                .addContainerGap(168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processHelpRquestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processHelpRquestJButtonActionPerformed

        int selectedRow = transportRequestListTable.getSelectedRow();

        if (selectedRow < 0){
          JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        NeedTransportWorkReq ntwr = (NeedTransportWorkReq)transportRequestListTable.getValueAt(selectedRow, 0);
        if(ntwr.getReceiver() == null)
        {
            JOptionPane.showMessageDialog(null, "Please assign the request first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(ntwr.getStatus().equalsIgnoreCase("Completed"))
        {
         JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
        }
         if(ntwr.getStatus().equalsIgnoreCase("Processing") ||  ntwr.getStatus().equalsIgnoreCase("Pending"))
        {
         if(ntwr.getReceiver()!=userAccount)
         {
         JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
         }
        }
        ntwr.setStatus("Processing");
        ntwr.setReceiver(userAccount);
        ProcessTransportWorkRequestJPanel ptwrjp = new ProcessTransportWorkRequestJPanel(userProcessContainer, ntwr, userAccount);
        userProcessContainer.add("ProcessTransportWorkRequestJPanel", ptwrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processHelpRquestJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populatetransportRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = transportRequestListTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest)transportRequestListTable.getValueAt(selectedRow, 0);
        if(request.getReceiver()!=null)
        {
         JOptionPane.showMessageDialog(null, "Request has been processed earlier!", "warning", JOptionPane.WARNING_MESSAGE);
         return;     
        }
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populatetransportRequestTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void viewVolProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVolProfileBtnActionPerformed
       
        int selectedRow = transportRequestListTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest)transportRequestListTable.getValueAt(selectedRow, 0);
        UserAc ua = (UserAc)request.getSender();
        
         ViewVolunteerProfile viewVolunteerProfile = new ViewVolunteerProfile(userProcessContainer, ua);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewVolProfileBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JButton processHelpRquestJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable transportRequestListTable;
    private javax.swing.JButton viewVolProfileBtn;
    // End of variables declaration//GEN-END:variables
}
