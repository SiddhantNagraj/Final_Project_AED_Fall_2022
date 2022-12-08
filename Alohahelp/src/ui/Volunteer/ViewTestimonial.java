/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Volunteer;

/**
 *
 * @author shiba
 */
public class ViewTestimonial extends javax.swing.JPanel {

    /**
     * Creates new form ViewTestimonial
     */
    public ViewTestimonial() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        testimonialListJTable = new javax.swing.JTable();
        manageEnt = new javax.swing.JLabel();
        testimonialJPanel = new javax.swing.JPanel();
        viewTestiBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTestimonialField = new javax.swing.JTextArea();
        backJButton = new javax.swing.JButton();

        testimonialListJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Testimonial Id", "Written By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(testimonialListJTable);

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("View Testimonials");

        testimonialJPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout testimonialJPanelLayout = new javax.swing.GroupLayout(testimonialJPanel);
        testimonialJPanel.setLayout(testimonialJPanelLayout);
        testimonialJPanelLayout.setHorizontalGroup(
            testimonialJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );
        testimonialJPanelLayout.setVerticalGroup(
            testimonialJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        viewTestiBtn.setText("View Testimonial");
        viewTestiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTestiBtnActionPerformed(evt);
            }
        });

        viewTestimonialField.setEditable(false);
        viewTestimonialField.setColumns(20);
        viewTestimonialField.setRows(5);
        jScrollPane1.setViewportView(viewTestimonialField);

        backJButton.setText(" Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2)
                                .addComponent(jScrollPane1))
                            .addComponent(viewTestiBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                        .addComponent(testimonialJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(manageEnt)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(viewTestiBtn)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(testimonialJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewTestiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTestiBtnActionPerformed
//        int selectedRow = testimonialListJTable.getSelectedRow();
//        if(selectedRow<0)
//        {
//            JOptionPane.showMessageDialog(this, "Please select a row", "warning", JOptionPane.PLAIN_MESSAGE);
//            return;
//        }
//
//        Testimonial testimonial = (Testimonial)testimonialListJTable.getValueAt(selectedRow, 0);
//
//        testimonialHeadingLabel.setText(testimonial.getDate() + " written by "+testimonial.getWriterName() );
//        viewTestimonialField.setText(testimonial.getTestimonialTxt());
//        testimonialHeadingLabel.setVisible(true);
//        viewTestimonialField.setVisible(true);

    }//GEN-LAST:event_viewTestiBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

//        userProcessContainer.remove(this);
//        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JPanel testimonialJPanel;
    private javax.swing.JTable testimonialListJTable;
    private javax.swing.JButton viewTestiBtn;
    private javax.swing.JTextArea viewTestimonialField;
    // End of variables declaration//GEN-END:variables
}
