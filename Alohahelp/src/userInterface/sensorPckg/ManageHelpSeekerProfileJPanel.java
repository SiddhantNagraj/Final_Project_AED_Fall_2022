/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.sensorPckg;

import business.EcoSystem;
import business.enterprisemainpkg.Enterprise;
import business.personpkg.HelpSeeker;
import business.userAccountpkg.UserAc;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userInterface.helpSeeker.ViewVitalSignHistoryJPanel;
import userInterface.helpSeeker.UpdateHelpSeekerProfile;
import userInterface.helpSeeker.ViewVitalSignInfoJPanel;

/**
 *
 * @author shiba
 */
public class ManageHelpSeekerProfileJPanel extends javax.swing.JPanel {
       private JPanel userProcessContainer;
    private UserAc userAccount; 
   private Enterprise enterprise;
   private EcoSystem ecoSystem;
    
    /**
     * Creates new form GetAlertFromAlohaHelpJPanel
     */
    public ManageHelpSeekerProfileJPanel(JPanel userProcessContainer, UserAc userAccount, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        helpSeekerName.setText(userAccount.getPerson().getName());
       
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        getAlertFromHH = new javax.swing.JLabel();
        manageVitalSignJBtn = new javax.swing.JButton();
        viewAndUpdateProfileBtn = new javax.swing.JButton();
        helpSeekerName = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        viewVitalSignHistory = new javax.swing.JButton();
        SendVitalDataToDoctorBtn = new javax.swing.JButton();
        viewVitalSignInfo = new javax.swing.JButton();

        setBackground(new java.awt.Color(220, 71, 96));

        getAlertFromHH.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        getAlertFromHH.setText("Manage Help Seeker Profile ");

        manageVitalSignJBtn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        manageVitalSignJBtn.setText("Manage Vital Signs");
        manageVitalSignJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVitalSignJBtnActionPerformed(evt);
            }
        });

        viewAndUpdateProfileBtn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        viewAndUpdateProfileBtn.setText("View / Update Profile");
        viewAndUpdateProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAndUpdateProfileBtnActionPerformed(evt);
            }
        });

        helpSeekerName.setText("Help Seeker Name");

        backJButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        viewVitalSignHistory.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        viewVitalSignHistory.setText("View Vital Sign History");
        viewVitalSignHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalSignHistoryActionPerformed(evt);
            }
        });

        SendVitalDataToDoctorBtn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SendVitalDataToDoctorBtn.setText("Send Vital Info To Doctor");
        SendVitalDataToDoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendVitalDataToDoctorBtnActionPerformed(evt);
            }
        });

        viewVitalSignInfo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        viewVitalSignInfo.setText("View Vital Sign Info");
        viewVitalSignInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalSignInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(getAlertFromHH, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(helpSeekerName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(421, 421, 421))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(manageVitalSignJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(SendVitalDataToDoctorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                        .addGap(310, 310, 310))))
            .addGroup(layout.createSequentialGroup()
                .addGap(473, 473, 473)
                .addComponent(viewVitalSignInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(viewAndUpdateProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(viewVitalSignHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(519, 519, 519)
                        .addComponent(backJButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(getAlertFromHH)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(helpSeekerName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewAndUpdateProfileBtn)
                            .addComponent(viewVitalSignHistory))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manageVitalSignJBtn)
                            .addComponent(SendVitalDataToDoctorBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(viewVitalSignInfo)
                .addGap(55, 55, 55)
                .addComponent(backJButton)
                .addGap(99, 99, 99))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageVitalSignJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVitalSignJBtnActionPerformed
        ManageVitalSignJPanel manageVitalSignJPanel = new ManageVitalSignJPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageVitalSignJPanel", manageVitalSignJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVitalSignJBtnActionPerformed

    private void viewAndUpdateProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAndUpdateProfileBtnActionPerformed
        UpdateHelpSeekerProfile viewVolunteerProfile = new UpdateHelpSeekerProfile(userProcessContainer, userAccount, enterprise.getUserAccountDirectory());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAndUpdateProfileBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewVitalSignHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalSignHistoryActionPerformed
       HelpSeeker customer = (HelpSeeker)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
        JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        ViewVitalSignHistoryJPanel viewVitalSignHistoryJPanel = new ViewVitalSignHistoryJPanel(userProcessContainer, userAccount, enterprise.getUserAccountDirectory());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVolunteerProfile", viewVitalSignHistoryJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewVitalSignHistoryActionPerformed

    private void SendVitalDataToDoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendVitalDataToDoctorBtnActionPerformed
       HelpSeeker customer = (HelpSeeker)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
        JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        SendVitalSignDataToDoctorPanel sendVitalSignDataToDoctorPanel = new SendVitalSignDataToDoctorPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("SendVitalSignDataToDoctorPanel", sendVitalSignDataToDoctorPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_SendVitalDataToDoctorBtnActionPerformed

    private void viewVitalSignInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalSignInfoActionPerformed
        HelpSeeker customer = (HelpSeeker)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
        JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        ViewVitalSignInfoJPanel viewVitalSignInfoJPanel = new ViewVitalSignInfoJPanel(userProcessContainer, userAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVitalSignInfoJPanel", viewVitalSignInfoJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewVitalSignInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SendVitalDataToDoctorBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel getAlertFromHH;
    private javax.swing.JLabel helpSeekerName;
    private javax.swing.JButton manageVitalSignJBtn;
    private javax.swing.JButton viewAndUpdateProfileBtn;
    private javax.swing.JButton viewVitalSignHistory;
    private javax.swing.JButton viewVitalSignInfo;
    // End of variables declaration//GEN-END:variables
}
