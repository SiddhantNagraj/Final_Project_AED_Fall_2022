/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.volunteer;

import business.EcoSystem;
import business.enterprisemainpkg.Enterprise;
import business.orgapkg.Orga;
import business.orgapkg.VolunteerOrga;
import business.personpkg.Volunteer;
import business.userAccountpkg.UserAc;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shiba
 */
public class VolunteerWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAc userAccount;  
    private VolunteerOrga organization;
    private EcoSystem ecoSystem;
    /**
     * Creates new form VolunteerWorkAreaJPanel
     */
    public VolunteerWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise , UserAc userAccount, Orga organization, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.organization = (VolunteerOrga)organization;
        this.ecoSystem = ecoSystem;
        
      
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
//       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageEnt = new javax.swing.JLabel();
        manageVolunteerProfileBtn = new javax.swing.JButton();
        viewTestimonialsBtn = new javax.swing.JButton();
        manageEnt1 = new javax.swing.JLabel();
        viewAnonymousReqBtn = new javax.swing.JButton();
        viewVolProfileBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(220, 71, 96));

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        manageEnt.setText("Volunteer Work Area");

        manageVolunteerProfileBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        manageVolunteerProfileBtn.setText("Update Profile ");
        manageVolunteerProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVolunteerProfileBtnActionPerformed(evt);
            }
        });

        viewTestimonialsBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewTestimonialsBtn.setText("View Testimonials");
        viewTestimonialsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTestimonialsBtnActionPerformed(evt);
            }
        });

        manageEnt1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        manageEnt1.setText("Welcome to AlohaHelp");

        viewAnonymousReqBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewAnonymousReqBtn.setText("View Help Requests");
        viewAnonymousReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAnonymousReqBtnActionPerformed(evt);
            }
        });

        viewVolProfileBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewVolProfileBtn.setText("View Profile");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(334, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewVolProfileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(viewTestimonialsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewAnonymousReqBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageVolunteerProfileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(302, 302, 302))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(manageEnt1)
                .addGap(18, 18, 18)
                .addComponent(manageEnt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewVolProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageVolunteerProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewAnonymousReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewTestimonialsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageVolunteerProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVolunteerProfileBtnActionPerformed
         UpdateVolunteerProfile updateVolunteerProfile = new UpdateVolunteerProfile(userProcessContainer, userAccount, enterprise.getUserAccountDirectory());
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("UpdateVolunteerProfile", updateVolunteerProfile);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVolunteerProfileBtnActionPerformed

    private void viewAnonymousReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAnonymousReqBtnActionPerformed
        if(organization.getworkQ().getWorkRequestList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Help Requests to display as of now! ","warning", JOptionPane.WARNING_MESSAGE);
        return;     
        } 
         ViewAnonymousRequestJPanel viewAnonymousRequestJPanel = new ViewAnonymousRequestJPanel(userProcessContainer, userAccount,  organization, enterprise.getOrganizationDirectory());
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewAnonymousRequestJPanel", viewAnonymousRequestJPanel);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAnonymousReqBtnActionPerformed

    private void viewTestimonialsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTestimonialsBtnActionPerformed
        Volunteer volunteer = (Volunteer)userAccount.getPerson();
        if(volunteer.getTestimonialList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Testimonials to display as of now! ","warning", JOptionPane.WARNING_MESSAGE);
        return;     
        }
         ViewTestimonialJPanel viewTestimonialJPanel = new ViewTestimonialJPanel(userProcessContainer, userAccount);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewTestimonialJPanel", viewTestimonialJPanel);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewTestimonialsBtnActionPerformed

    private void viewVolProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVolProfileBtnActionPerformed
        ViewVolunteerProfile viewVolunteerProfile = new ViewVolunteerProfile(userProcessContainer, userAccount);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewVolProfileBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JButton manageVolunteerProfileBtn;
    private javax.swing.JButton viewAnonymousReqBtn;
    private javax.swing.JButton viewTestimonialsBtn;
    private javax.swing.JButton viewVolProfileBtn;
    // End of variables declaration//GEN-END:variables
}
