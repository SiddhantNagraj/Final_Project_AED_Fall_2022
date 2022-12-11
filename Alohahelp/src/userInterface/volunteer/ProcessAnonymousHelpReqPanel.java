/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.volunteer;

import business.orgapkg.Orga;
import business.orgapkg.OrgaDirect;
import business.orgapkg.TransportOrga;
import business.userAccountpkg.UserAc;
import business.workQpkg.NeedHelpWorkReq;
import business.workQpkg.NeedTransportWorkReq;
import business.workQpkg.SupervisorWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shiba
 */
public class ProcessAnonymousHelpReqPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private NeedHelpWorkReq request;
    private UserAc userAccount;
    private OrgaDirect od;
    /**
     * Creates new form ProcessAnonymousHelpReqPanel
     */
    public ProcessAnonymousHelpReqPanel(JPanel userProcessContainer, NeedHelpWorkReq request, UserAc userAccount, OrgaDirect od) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.od = od;
        
        requestResultCombo.removeAllItems();
        requestResultCombo.addItem(SupervisorWorkRequest.REQUEST_ACCEPT);
        requestResultCombo.addItem(SupervisorWorkRequest.REQUEST_REJECT);
        
        needTransportCombo.removeAllItems();
        needTransportCombo.addItem("YES");
        needTransportCombo.addItem("NO");
        
       
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitRequest = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsTxtAreaField = new javax.swing.JTextArea();
        needTransport = new javax.swing.JLabel();
        needTransportCombo = new javax.swing.JComboBox();
        requestStatus = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        requestResultCombo = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();

        submitRequest.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        submitRequest.setText("Process Work Request :");

        jLabel2.setText("Add comments: ");

        commentsTxtAreaField.setColumns(20);
        commentsTxtAreaField.setRows(5);
        jScrollPane1.setViewportView(commentsTxtAreaField);

        needTransport.setText("Need Transport:");

        needTransportCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        requestStatus.setText("Help Request ");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        requestResultCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(backJButton, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(79, 79, 79)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(requestStatus))
                                            .addGap(50, 50, 50)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(requestResultCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(needTransport)
                                            .addGap(50, 50, 50)
                                            .addComponent(needTransportCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(submitJButton)))
                .addContainerGap(396, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(submitRequest)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestStatus)
                    .addComponent(requestResultCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                        .addComponent(backJButton)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(needTransport)
                            .addComponent(needTransportCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(submitJButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewAnonymousRequestJPanel viewAnonymousRequestPanel = (ViewAnonymousRequestJPanel) component;
        viewAnonymousRequestPanel.populateAnonymousHelpRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(requestResultCombo.getSelectedIndex()<0 || commentsTxtAreaField.getText().trim().isEmpty()
            || needTransportCombo.getSelectedIndex()<0     )
        {
            JOptionPane.showMessageDialog(null, "Please enter data in all fields", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
         if(commentsTxtAreaField.getText().length()>50 )
        {
        JOptionPane.showMessageDialog(null, "Please enter few words in text area", "warning", JOptionPane.WARNING_MESSAGE);
        return;      
        }
        request.setRequestResult((String)requestResultCombo.getSelectedItem());
        request.setComments(commentsTxtAreaField.getText());
        request.setStatus(SupervisorWorkRequest.REQUEST_COMPLETED);
        request.setResolveDate(new Date());
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        String needTransport = (String)needTransportCombo.getSelectedItem();

        JOptionPane.showMessageDialog(null, "Help Request has been processed successfully", "success", JOptionPane.PLAIN_MESSAGE);

        if(needTransport.equals("YES"))
        {
            NeedTransportWorkReq needTransportWorkRequest = new NeedTransportWorkReq();
            needTransportWorkRequest.setMessage("Need Transport");
            needTransportWorkRequest.setSender(userAccount);
            needTransportWorkRequest.setStatus("Sent");
            needTransportWorkRequest.setNeedTransport((String)needTransportCombo.getSelectedItem());
            needTransportWorkRequest.setRequestDate(new Date());
            Orga organization = null;
            for(Orga org : od.getOrganizationList())
            {
                if(org instanceof TransportOrga)
                {
                    organization = org;
                }
            }
            if(organization == null)
            {
                JOptionPane.showMessageDialog(null, "Unable to create transport request! Please create transport organization !!", "warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            organization.getworkQ().getWorkRequestList().add(needTransportWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(needTransportWorkRequest);

            JOptionPane.showMessageDialog(null, "Transport Request has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
            commentsTxtAreaField.setText("");
        }

    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextArea commentsTxtAreaField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel needTransport;
    private javax.swing.JComboBox needTransportCombo;
    private javax.swing.JComboBox requestResultCombo;
    private javax.swing.JLabel requestStatus;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel submitRequest;
    // End of variables declaration//GEN-END:variables
}
