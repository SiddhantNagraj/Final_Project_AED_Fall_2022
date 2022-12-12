/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.helpSeeker;

import business.userAccountpkg.UserAc;
import business.workQpkg.NeedHelpWorkReq;
import business.workQpkg.NeedSensorDWorkReq;
import business.workQpkg.DatatoDoctorWorkReq;
import business.workQpkg.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Siddhant
 */
public class ViewHelpRequestHistory extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAc userAccount; 
    /**
     * Creates new form ViewHelpRequestHistory
     */
    public ViewHelpRequestHistory(JPanel userProcessContainer, UserAc userAccount) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        
       populateHelpSeekerRequestsHistoryTable();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(220,71,96);
        Color c2 = Color.white;
    }
//        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
//        setOpaque( false );
//        g2d.setPaint(gp);
//        g2d.fillRect(0, 0, w, h);
//        setOpaque( true );
//    }
    
    public void populateHelpSeekerRequestsHistoryTable()
    {
     DefaultTableModel dtm = (DefaultTableModel)workRequestHistoryTable.getModel();
        dtm.setRowCount(0);
         DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
     for(WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList())
        {
         
           Object[] rowData = new Object[5];
           rowData[0] = workRequest.getMessage();
           rowData[1] = dateFormat.format(workRequest.getRequestDate());
           rowData[2] = workRequest.getReceiver() == null ? null : workRequest.getReceiver().getUserName() ;
           rowData[3] = workRequest.getStatus();
           if(workRequest.getMessage().equalsIgnoreCase("Need Help"))
           {
            NeedHelpWorkReq nhwr = (NeedHelpWorkReq)workRequest;
            rowData[4] = nhwr.getRequestResult();   
           }
           else if(workRequest.getMessage().equalsIgnoreCase("Need Sensor Device"))
           {
               NeedSensorDWorkReq nsdwr = (NeedSensorDWorkReq)workRequest ;
                 rowData[4] = nsdwr.getdonationReqResult();
           }
           else if(workRequest.getMessage().equalsIgnoreCase("Vital Sign Data"))
           {
                DatatoDoctorWorkReq sdtdwr = (DatatoDoctorWorkReq)workRequest ;
                 rowData[4] = sdtdwr.getReqResult();
           }
           else
           {
                rowData[4] = "";
           }
           dtm.addRow(rowData);
        
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

        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestHistoryTable = new javax.swing.JTable();
        manageEnt = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(220, 71, 96));

        workRequestHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Help Recieved", "Requested Date", "Reciever ", "Status", "Request Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestHistoryTable);

        manageEnt.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        manageEnt.setText("View History of Help Requests");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(backJButton)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(manageEnt)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(backJButton)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JTable workRequestHistoryTable;
    // End of variables declaration//GEN-END:variables
}
