/*
-------------------------------------------------------------------
    NAMA    : M. INDRA GUNAWAN
    NRP     : 152020068
    KELAS   : BB Project Tugas Besar
-------------------------------------------------------------------
 */
package View;
import com.Admin;
import com.Login;
import Execute.ExcuteLogin;
import javax.swing.JOptionPane;

public class GuiLogin extends javax.swing.JFrame {
    
    public GuiLogin() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Login = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tobacoshop = new javax.swing.JLabel();
        btnRegis = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        cbPass = new javax.swing.JCheckBox();
        btn_exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Login.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_Login.setText("Login");
        btn_Login.setToolTipText("");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        txtUsername.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        tobacoshop.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tobacoshop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tobacoshop.setText("TOBACO SHOP");
        jPanel1.add(tobacoshop, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        btnRegis.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnRegis.setText("Register");
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 70, -1));

        Password.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, 30));

        cbPass.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbPass.setText("Show Password");
        cbPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPassActionPerformed(evt);
            }
        });
        jPanel1.add(cbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 140, 30));

        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Sudah Memiliki Akun?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 373, 278));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        String username = txtUsername.getText();
        char[] password_char = Password.getPassword();
        String password = String.valueOf(password_char);
   
        String user = txtUsername.getText();
        char[] pass_char = Password.getPassword();
        String pass = String.valueOf(pass_char);
        
        Login Lgn = new Login(user, pass);
        Admin adm = new Admin(username, password);
        int hasil = 0;
        Execute.ExcuteLogin eLgn= new Execute.ExcuteLogin();
        hasil = eLgn.getAdmin(adm);
        if (hasil==0){
            hasil= eLgn.getAllLogin(Lgn); 
            if (hasil==0){
                JOptionPane.showMessageDialog(null, "User/Admin Tidak Di Temukan, Lakukan Registrasi (User)/Input Data Admin (Admin)!!");
            }else{
                GuiCustumer gcstm = new GuiCustumer();
                gcstm.setVisible(true);
                this.dispose();
                
                JOptionPane.showMessageDialog(null, "Selamat Datang Custumer");
            }
        }else{
            GuiAdmin db = new GuiAdmin();
            db.setVisible(true);
            this.dispose();
            
            JOptionPane.showMessageDialog(null, "Selamat Datang Admin");
        }
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        Register Rgstr = new Register();
        Rgstr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisActionPerformed

    private void cbPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPassActionPerformed
        if (cbPass.isSelected()) {
            Password.setEchoChar((char)0);
        }
        else{
            Password.setEchoChar('*');
        }
    }//GEN-LAST:event_cbPassActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        int quest = JOptionPane.showConfirmDialog(this, "Keluar Aplikasi?", "Pertanyaan", 
                JOptionPane.YES_NO_OPTION);
        
        if (quest == JOptionPane.YES_OPTION) {
            System.exit(0);
        } 
    }//GEN-LAST:event_btn_exitActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton btnRegis;
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_exit;
    private javax.swing.JCheckBox cbPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tobacoshop;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
