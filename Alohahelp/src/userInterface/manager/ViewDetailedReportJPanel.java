/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.manager;

import business.cmn.SendEmailAndTextMessage;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.util.List;
import java.util.Map.Entry;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shiba
 */
public class ViewDetailedReportJPanel extends javax.swing.JPanel {
     private List<Entry<String, Integer>> topVolunteeerList;
     private List<Entry<String, Integer>> topDonorList;
     private JPanel userProcessContainer;
    /**
     * Creates new form ViewDetailedReportJPanel
     */
    public ViewDetailedReportJPanel(JPanel userProcessContainer, List<Entry<String, Integer>> topVolunteeerList, List<Entry<String, Integer>> topDonorList ) {
        initComponents();
        this.topVolunteeerList = topVolunteeerList;
        this.topDonorList = topDonorList;
        this.userProcessContainer = userProcessContainer;
        
        volunteerPanel.setVisible(false);
        donorPanel.setVisible(false);
    
        populateTopVolunteerTableDetails();
        populateTopDonorTableDetails();
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
    
     public void populateTopVolunteerTableDetails()
    {
     volunteerPanel.removeAll();
     volunteerPanel.revalidate();
      
        int count = 0;
        
        DefaultTableModel dtm = (DefaultTableModel)volTable.getModel();
        dtm.setRowCount(0);
      if(count<3)
      {
        for (Entry<String, Integer> entry : topVolunteeerList)
            {
                Object[] rowData = new Object[2];
            rowData[0] = entry.getKey();
            rowData[1] = String.valueOf(entry.getValue());
           
            dtm.addRow(rowData);
            }
       }
      volunteerPanel.revalidate();
      volunteerPanel.setVisible(true);
   }
   public void populateTopDonorTableDetails()
    {
     volunteerPanel.removeAll();
     volunteerPanel.revalidate();
      
        int count = 0;
        
        DefaultTableModel dtm = (DefaultTableModel)donTable.getModel();
        dtm.setRowCount(0);
      if(count<3)
      {
        for (Entry<String, Integer> entry : topDonorList)
            {
                Object[] rowData = new Object[2];
            rowData[0] = entry.getKey();
            rowData[1] = String.valueOf(entry.getValue());
           
            dtm.addRow(rowData);
            }
       }
      donorPanel.revalidate();
      donorPanel.setVisible(true);
   }
        
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volunteerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        volTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        donorPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        donTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        volunteerPanel.setBackground(new java.awt.Color(204, 255, 153));

        volTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Volunteer Name", "Requests Completed"
            }
        ));
        jScrollPane1.setViewportView(volTable);

        jLabel6.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel6.setText("Top Volunteers");

        javax.swing.GroupLayout volunteerPanelLayout = new javax.swing.GroupLayout(volunteerPanel);
        volunteerPanel.setLayout(volunteerPanelLayout);
        volunteerPanelLayout.setHorizontalGroup(
            volunteerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(volunteerPanelLayout.createSequentialGroup()
                .addGroup(volunteerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(volunteerPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(volunteerPanelLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        volunteerPanelLayout.setVerticalGroup(
            volunteerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(volunteerPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        donorPanel.setBackground(new java.awt.Color(204, 255, 153));

        donTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(donTable);

        jLabel8.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel8.setText("Top Donors");

        javax.swing.GroupLayout donorPanelLayout = new javax.swing.GroupLayout(donorPanel);
        donorPanel.setLayout(donorPanelLayout);
        donorPanelLayout.setHorizontalGroup(
            donorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donorPanelLayout.createSequentialGroup()
                .addGroup(donorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(donorPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(donorPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        donorPanelLayout.setVerticalGroup(
            donorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donorPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel7.setText("Heart Help");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(volunteerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addComponent(donorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(501, 501, 501)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(donorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volunteerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backJButton)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable donTable;
    private javax.swing.JPanel donorPanel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable volTable;
    private javax.swing.JPanel volunteerPanel;
    // End of variables declaration//GEN-END:variables
}
