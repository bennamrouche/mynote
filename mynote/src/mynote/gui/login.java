package mynote.gui;
import mynote.*;
import mynote.Event.LabelMouseEvent;

public class login extends javax.swing.JPanel {

    private  void Setup()
{
    LabelMouseEvent even = new LabelMouseEvent(Views.FORGET_PASSWORD);
    lblForgetPassword.addMouseMotionListener(even);
    lblForgetPassword.addMouseListener(even);
    
    
      even = new LabelMouseEvent(Views.SIGN_UP);
    lblSignUp.addMouseMotionListener(even);
    lblSignUp.addMouseListener(even);

    
}
  
    public login() {
        initComponents();
        Setup();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftSide = new javax.swing.JPanel();
        rigthSide = new javax.swing.JPanel();
        mainContianer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblProgramIcon = new javax.swing.JLabel();
        lblProgramName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblSignUp = new javax.swing.JLabel();
        lblForgetPassword = new javax.swing.JLabel();

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
            .addGap(0, 500, Short.MAX_VALUE)
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
            .addGap(0, 500, Short.MAX_VALUE)
        );

        add(rigthSide, java.awt.BorderLayout.LINE_END);

        mainContianer.setOpaque(false);
        mainContianer.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(443, 66));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setMaximumSize(new java.awt.Dimension(100, 0));
        jPanel1.add(jLabel3);

        lblProgramIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/logo.png"))); // NOI18N
        jPanel1.add(lblProgramIcon);

        lblProgramName.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        lblProgramName.setForeground(new java.awt.Color(239, 243, 150));
        lblProgramName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgramName.setText("My Note");
        lblProgramName.setMaximumSize(new java.awt.Dimension(120, 64));
        lblProgramName.setMinimumSize(new java.awt.Dimension(120, 64));
        lblProgramName.setPreferredSize(new java.awt.Dimension(64, 120));
        lblProgramName.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(lblProgramName);

        mainContianer.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(239, 243, 150));
        jLabel4.setText("UserName");
        jLabel4.setMaximumSize(new java.awt.Dimension(444, 32));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 32));
        jLabel4.setPreferredSize(new java.awt.Dimension(42, 32));

        txtPassword.setBackground(new java.awt.Color(239, 243, 150));
        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(33, 28, 106));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setText("adimn");
        txtPassword.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtPassword.setMinimumSize(new java.awt.Dimension(64, 40));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtUserName.setBackground(new java.awt.Color(239, 243, 150));
        txtUserName.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(33, 28, 106));
        txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserName.setText("alphaben");
        txtUserName.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtUserName.setMinimumSize(new java.awt.Dimension(0, 40));
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(239, 243, 150));
        jLabel5.setText("Password");
        jLabel5.setMaximumSize(new java.awt.Dimension(444, 32));
        jLabel5.setMinimumSize(new java.awt.Dimension(0, 32));
        jLabel5.setPreferredSize(new java.awt.Dimension(42, 32));

        jButton1.setBackground(new java.awt.Color(239, 243, 150));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 26)); // NOI18N
        jButton1.setForeground(new java.awt.Color(33, 28, 106));
        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblSignUp.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(239, 243, 150));
        lblSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignUp.setText("Sign Up");

        lblForgetPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lblForgetPassword.setForeground(new java.awt.Color(239, 243, 150));
        lblForgetPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblForgetPassword.setText("Forget Password");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblForgetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblForgetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        mainContianer.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        add(mainContianer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Frame.getInstance().setContentPane(Views.getViewById(Views.HOME));
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblForgetPassword;
    private javax.swing.JLabel lblProgramIcon;
    private javax.swing.JLabel lblProgramName;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JPanel leftSide;
    private javax.swing.JPanel mainContianer;
    private javax.swing.JPanel rigthSide;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
