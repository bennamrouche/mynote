package mynote.gui;
import mynote.*;
import mynote.Event.LabelMouseEvent;
/**
 *
 * @author ebennamr
 */
public class ForgetPassword extends javax.swing.JPanel implements updatableView{

      private  void Setup()
{
    LabelMouseEvent even = new LabelMouseEvent(Views.SIGN_UP);
    lblSignUp.addMouseMotionListener(even);
    lblSignUp.addMouseListener(even);
    
    
      even = new LabelMouseEvent(Views.LOGIN);
    lblLogin.addMouseMotionListener(even);
    lblLogin.addMouseListener(even);

    
}
    public ForgetPassword() {
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
        lblProgramIcon = new javax.swing.JLabel();
        lblProgramName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        lblSignUp = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

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
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Email");
        jLabel4.setMaximumSize(new java.awt.Dimension(444, 32));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 32));
        jLabel4.setPreferredSize(new java.awt.Dimension(42, 32));

        btnSend.setBackground(new java.awt.Color(239, 243, 150));
        btnSend.setFont(new java.awt.Font("Helvetica Neue", 0, 26)); // NOI18N
        btnSend.setForeground(new java.awt.Color(33, 28, 106));
        btnSend.setText("Send ");

        lblSignUp.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(239, 243, 150));
        lblSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignUp.setText("Sign Up");

        lblLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(239, 243, 150));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Login");

        txtEmail.setBackground(new java.awt.Color(239, 243, 150));
        txtEmail.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(33, 28, 106));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtEmail.setMinimumSize(new java.awt.Dimension(0, 40));
        txtEmail.setPreferredSize(new java.awt.Dimension(64, 40));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(239, 243, 150));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Forget Password");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Enter your Email and click Send to receive link in your Email");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSend)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        mainContianer.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        add(mainContianer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblProgramIcon;
    private javax.swing.JLabel lblProgramName;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JPanel leftSide;
    private javax.swing.JPanel mainContianer;
    private javax.swing.JPanel rigthSide;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateView() 
    {
       txtEmail.setText("");
    }
}
