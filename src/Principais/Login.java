
package Principais;

import Conexoes.ConexaoUsuarios;
import Propriedades.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {


    ImageIcon i;
    public Login() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon.png")).getImage());
        txtInvalid.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btExit = new javax.swing.JButton();
        btMin = new javax.swing.JButton();
        btMax = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btLogin = new javax.swing.JButton();
        txtInvalid = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 300));
        setMinimumSize(new java.awt.Dimension(600, 300));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BETA 0.1.18 rev0.4");
        jLabel2.setToolTipText("BETA 0.1.18 rev0.4");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 60, 150, 20);

        btExit.setBackground(new java.awt.Color(255, 255, 255));
        btExit.setToolTipText("FECHAR");
        btExit.setBorder(null);
        btExit.setBorderPainted(false);
        btExit.setContentAreaFilled(false);
        btExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExit.setFocusPainted(false);
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        getContentPane().add(btExit);
        btExit.setBounds(572, 10, 20, 23);

        btMin.setToolTipText("MINIMIZAR");
        btMin.setBorder(null);
        btMin.setBorderPainted(false);
        btMin.setContentAreaFilled(false);
        btMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMin.setFocusPainted(false);
        btMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMinActionPerformed(evt);
            }
        });
        getContentPane().add(btMin);
        btMin.setBounds(535, 10, 16, 20);

        btMax.setToolTipText("MAXIMIZAR");
        btMax.setBorder(null);
        btMax.setContentAreaFilled(false);
        btMax.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMax.setFocusPainted(false);
        btMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaxActionPerformed(evt);
            }
        });
        getContentPane().add(btMax);
        btMax.setBounds(556, 10, 15, 20);

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.setToolTipText("USUÁRIO");
        txtUser.setBorder(null);
        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtUser);
        txtUser.setBounds(30, 152, 160, 23);

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        txtPass.setToolTipText("SENHA");
        txtPass.setBorder(null);
        getContentPane().add(txtPass);
        txtPass.setBounds(30, 208, 160, 23);

        btLogin.setToolTipText("LOGIN");
        btLogin.setBorder(null);
        btLogin.setBorderPainted(false);
        btLogin.setContentAreaFilled(false);
        btLogin.setFocusPainted(false);
        btLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btLoginMouseExited(evt);
            }
        });
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btLogin);
        btLogin.setBounds(10, 242, 200, 30);

        txtInvalid.setFont(new java.awt.Font("Myanmar Text", 1, 10)); // NOI18N
        txtInvalid.setForeground(new java.awt.Color(204, 0, 0));
        txtInvalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInvalid.setText("USUÁRIO E/OU SENHA INVÁLIDOS");
        getContentPane().add(txtInvalid);
        txtInvalid.setBounds(20, 280, 180, 20);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LoginInterface.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 600, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMinActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btMinActionPerformed

    private void btMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaxActionPerformed

        JOptionPane.showMessageDialog(null, "Janela de Login já está no tamanho máximo.");
    }//GEN-LAST:event_btMaxActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLoginMouseEntered
        i = new ImageIcon(getClass().getResource("/Imagens/LoginButton.png"));
        btLogin.setIcon(i);
    }//GEN-LAST:event_btLoginMouseEntered

    private void btLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLoginMouseExited

        btLogin.setIcon(null);
    }//GEN-LAST:event_btLoginMouseExited

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        Logar();
    }//GEN-LAST:event_btLoginActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btMax;
    private javax.swing.JButton btMin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtInvalid;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
      
    
    
       // verificando usuário/senha para autenticar.
       public void Logar(){
        try {
            Usuario user = new Usuario();
            String loginUser = txtUser.getText();
            user.setUsuario(loginUser);
            String loginPassword = txtPass.getText();
            user.setSenha(loginPassword);
            ConexaoUsuarios uc = new ConexaoUsuarios();
            ResultSet resultLogin = uc.autenticarUsuario(user);
            
            if(resultLogin.next()){
                Menu menu = new Menu();
                user.setUsuario(loginUser);
                menu.setVisible(true);
                menu.inicializar(loginUser);
                this.dispose();     
                
            }else{
                        txtInvalid.setVisible(true);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Login: " + erro);
            
        }

}

}
