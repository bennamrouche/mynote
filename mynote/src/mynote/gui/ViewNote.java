package mynote.gui;
import mynote.*;
import mynote.Event.LabelMouseEvent;
/**
 *
 * @author ebennamr
 */
public class ViewNote extends javax.swing.JPanel  implements updatableView{

        private  void Setup()
{
    LabelMouseEvent even = new LabelMouseEvent(Views.HOME);
    lblBack.addMouseMotionListener(even);
    lblBack.addMouseListener(even);
    
  


}

    public ViewNote() {
        initComponents();
        Setup();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftSide = new javax.swing.JPanel();
        rigthSide = new javax.swing.JPanel();
        mainContianer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        leftSide1 = new javax.swing.JPanel();
        rigthSide1 = new javax.swing.JPanel();
        mainContianer1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        leftSide2 = new javax.swing.JPanel();
        rigthSide2 = new javax.swing.JPanel();
        mainContianer2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        lblProgramIcon = new javax.swing.JLabel();
        lblProgramName = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtContent = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(33, 28, 106));
        setForeground(CONST.SECONDARY_COLLOR);
        setLocation(new java.awt.Point(500, 500));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setLayout(new java.awt.BorderLayout());

        leftSide.setOpaque(false);
        leftSide.setPreferredSize(new java.awt.Dimension(30, 500));
        leftSide.setRequestFocusEnabled(false);

        javax.swing.GroupLayout leftSideLayout = new javax.swing.GroupLayout(leftSide);
        leftSide.setLayout(leftSideLayout);
        leftSideLayout.setHorizontalGroup(
            leftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        leftSideLayout.setVerticalGroup(
            leftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(leftSide, java.awt.BorderLayout.LINE_START);

        rigthSide.setOpaque(false);
        rigthSide.setPreferredSize(new java.awt.Dimension(30, 500));
        rigthSide.setRequestFocusEnabled(false);

        javax.swing.GroupLayout rigthSideLayout = new javax.swing.GroupLayout(rigthSide);
        rigthSide.setLayout(rigthSideLayout);
        rigthSideLayout.setHorizontalGroup(
            rigthSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        rigthSideLayout.setVerticalGroup(
            rigthSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(rigthSide, java.awt.BorderLayout.LINE_END);

        mainContianer.setOpaque(false);
        mainContianer.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(443, 66));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(239, 243, 150));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/back.png"))); // NOI18N
        jLabel3.setText("Back");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel3.setMaximumSize(new java.awt.Dimension(120, 40));
        jLabel3.setMinimumSize(new java.awt.Dimension(120, 40));
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 40));
        jPanel1.add(jLabel3);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/logo.png"))); // NOI18N
        jPanel1.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(239, 243, 150));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("My Note");
        jLabel2.setMaximumSize(new java.awt.Dimension(120, 64));
        jLabel2.setMinimumSize(new java.awt.Dimension(120, 64));
        jLabel2.setPreferredSize(new java.awt.Dimension(64, 120));
        jLabel2.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jLabel2);

        mainContianer.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setOpaque(false);

        jButton1.setBackground(new java.awt.Color(239, 243, 150));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 26)); // NOI18N
        jButton1.setForeground(new java.awt.Color(33, 28, 106));
        jButton1.setText("Seve");

        jTextField3.setBackground(new java.awt.Color(239, 243, 150));
        jTextField3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(33, 28, 106));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("my first Day");
        jTextField3.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        jTextField3.setMinimumSize(new java.awt.Dimension(0, 40));
        jTextField3.setPreferredSize(new java.awt.Dimension(64, 40));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(239, 243, 150));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Title");

        jTextArea1.setBackground(new java.awt.Color(239, 243, 150));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(33, 28, 106));
        jTextArea1.setRows(5);
        jTextArea1.setText("to day i learn ");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );

        mainContianer.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        add(mainContianer, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(33, 28, 106));
        jPanel2.setForeground(CONST.SECONDARY_COLLOR);
        jPanel2.setLocation(new java.awt.Point(500, 500));
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel2.setLayout(new java.awt.BorderLayout());

        leftSide1.setOpaque(false);
        leftSide1.setPreferredSize(new java.awt.Dimension(30, 500));
        leftSide1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout leftSide1Layout = new javax.swing.GroupLayout(leftSide1);
        leftSide1.setLayout(leftSide1Layout);
        leftSide1Layout.setHorizontalGroup(
            leftSide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        leftSide1Layout.setVerticalGroup(
            leftSide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel2.add(leftSide1, java.awt.BorderLayout.LINE_START);

        rigthSide1.setOpaque(false);
        rigthSide1.setPreferredSize(new java.awt.Dimension(30, 500));
        rigthSide1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout rigthSide1Layout = new javax.swing.GroupLayout(rigthSide1);
        rigthSide1.setLayout(rigthSide1Layout);
        rigthSide1Layout.setHorizontalGroup(
            rigthSide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        rigthSide1Layout.setVerticalGroup(
            rigthSide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel2.add(rigthSide1, java.awt.BorderLayout.LINE_END);

        mainContianer1.setOpaque(false);
        mainContianer1.setLayout(new java.awt.BorderLayout());

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(443, 66));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(239, 243, 150));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/back.png"))); // NOI18N
        jLabel4.setText("Back");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel4.setMaximumSize(new java.awt.Dimension(120, 40));
        jLabel4.setMinimumSize(new java.awt.Dimension(120, 40));
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 40));
        jPanel4.add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/logo.png"))); // NOI18N
        jPanel4.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(239, 243, 150));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("My Note");
        jLabel6.setMaximumSize(new java.awt.Dimension(120, 64));
        jLabel6.setMinimumSize(new java.awt.Dimension(120, 64));
        jLabel6.setPreferredSize(new java.awt.Dimension(64, 120));
        jLabel6.setVerifyInputWhenFocusTarget(false);
        jPanel4.add(jLabel6);

        mainContianer1.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setOpaque(false);

        jButton2.setBackground(new java.awt.Color(239, 243, 150));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 26)); // NOI18N
        jButton2.setForeground(new java.awt.Color(33, 28, 106));
        jButton2.setText("Seve");

        jTextField4.setBackground(new java.awt.Color(239, 243, 150));
        jTextField4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(33, 28, 106));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("my first Day");
        jTextField4.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        jTextField4.setMinimumSize(new java.awt.Dimension(0, 40));
        jTextField4.setPreferredSize(new java.awt.Dimension(64, 40));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(239, 243, 150));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Title");

        jTextArea2.setBackground(new java.awt.Color(239, 243, 150));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(33, 28, 106));
        jTextArea2.setRows(5);
        jTextArea2.setText("to day i learn ");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(15, 15, 15))
        );

        mainContianer1.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(mainContianer1, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(33, 28, 106));
        jPanel6.setForeground(CONST.SECONDARY_COLLOR);
        jPanel6.setLocation(new java.awt.Point(500, 500));
        jPanel6.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel6.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel6.setLayout(new java.awt.BorderLayout());

        leftSide2.setOpaque(false);
        leftSide2.setPreferredSize(new java.awt.Dimension(30, 500));
        leftSide2.setRequestFocusEnabled(false);

        javax.swing.GroupLayout leftSide2Layout = new javax.swing.GroupLayout(leftSide2);
        leftSide2.setLayout(leftSide2Layout);
        leftSide2Layout.setHorizontalGroup(
            leftSide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        leftSide2Layout.setVerticalGroup(
            leftSide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel6.add(leftSide2, java.awt.BorderLayout.LINE_START);

        rigthSide2.setOpaque(false);
        rigthSide2.setPreferredSize(new java.awt.Dimension(30, 500));
        rigthSide2.setRequestFocusEnabled(false);

        javax.swing.GroupLayout rigthSide2Layout = new javax.swing.GroupLayout(rigthSide2);
        rigthSide2.setLayout(rigthSide2Layout);
        rigthSide2Layout.setHorizontalGroup(
            rigthSide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        rigthSide2Layout.setVerticalGroup(
            rigthSide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel6.add(rigthSide2, java.awt.BorderLayout.LINE_END);

        mainContianer2.setOpaque(false);
        mainContianer2.setLayout(new java.awt.BorderLayout());

        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(443, 66));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        lblBack.setFont(new java.awt.Font("Helvetica Neue", 0, 26)); // NOI18N
        lblBack.setForeground(new java.awt.Color(239, 243, 150));
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/back.png"))); // NOI18N
        lblBack.setText("Back");
        lblBack.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblBack.setMaximumSize(new java.awt.Dimension(120, 40));
        lblBack.setMinimumSize(new java.awt.Dimension(120, 40));
        lblBack.setPreferredSize(new java.awt.Dimension(120, 40));
        jPanel7.add(lblBack);

        lblProgramIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/logo.png"))); // NOI18N
        jPanel7.add(lblProgramIcon);

        lblProgramName.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        lblProgramName.setForeground(new java.awt.Color(239, 243, 150));
        lblProgramName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgramName.setText("My Note");
        lblProgramName.setMaximumSize(new java.awt.Dimension(120, 64));
        lblProgramName.setMinimumSize(new java.awt.Dimension(120, 64));
        lblProgramName.setPreferredSize(new java.awt.Dimension(64, 120));
        lblProgramName.setVerifyInputWhenFocusTarget(false);
        jPanel7.add(lblProgramName);

        mainContianer2.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setOpaque(false);

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(239, 243, 150));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Title");

        txtContent.setBackground(new java.awt.Color(239, 243, 150));
        txtContent.setColumns(20);
        txtContent.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtContent.setForeground(new java.awt.Color(33, 28, 106));
        txtContent.setRows(5);
        txtContent.setText("to day i learn ");
        jScrollPane3.setViewportView(txtContent);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        mainContianer2.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        jPanel6.add(mainContianer2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblProgramIcon;
    private javax.swing.JLabel lblProgramName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel leftSide;
    private javax.swing.JPanel leftSide1;
    private javax.swing.JPanel leftSide2;
    private javax.swing.JPanel mainContianer;
    private javax.swing.JPanel mainContianer1;
    private javax.swing.JPanel mainContianer2;
    private javax.swing.JPanel rigthSide;
    private javax.swing.JPanel rigthSide1;
    private javax.swing.JPanel rigthSide2;
    private javax.swing.JTextArea txtContent;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateView() 
    {
        txtContent.setText("for testing now");
        lblTitle.setText("for testing now");
    }
}
