
package Principais;

import Conexoes.ConexaoUsuarios;
import Propriedades.Usuario;
import java.awt.Color;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePrincipal.png")).getImage());
        txtInvalido.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        versao = new javax.swing.JLabel();
        vigilante = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        btEntrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        txtInvalido = new javax.swing.JLabel();
        ip = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIGILANTE | Sua segurança realmente importa!  v0.1.18 rev0.4");
        setMinimumSize(new java.awt.Dimension(588, 367));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        versao.setBackground(new java.awt.Color(153, 153, 153));
        versao.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        versao.setForeground(new java.awt.Color(153, 153, 153));
        versao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        versao.setText("BETA 0.1.18 rev0.4");
        getContentPane().add(versao);
        versao.setBounds(240, 60, 100, 10);

        vigilante.setBackground(new java.awt.Color(204, 204, 204));
        vigilante.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        vigilante.setForeground(new java.awt.Color(255, 255, 255));
        vigilante.setText("VIGILANTE");
        getContentPane().add(vigilante);
        vigilante.setBounds(170, 10, 240, 50);

        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/usuario.png"))); // NOI18N
        getContentPane().add(usuario);
        usuario.setBounds(60, 130, 32, 30);

        senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/senha.png"))); // NOI18N
        getContentPane().add(senha);
        senha.setBounds(60, 200, 32, 32);

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(100, 130, 170, 30);

        txtSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtSenha);
        txtSenha.setBounds(100, 200, 170, 30);

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(290, 110, 2, 180);

        btEntrar.setBackground(new java.awt.Color(51, 153, 0));
        btEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar.setText("ENTRAR");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btEntrar);
        btEntrar.setBounds(100, 240, 170, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Caso não tenha acesso,");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 120, 210, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" entre em contato com");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 140, 200, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("a administração.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 160, 150, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Senha");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 180, 50, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Login");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 110, 50, 20);

        btSair.setBackground(new java.awt.Color(153, 0, 0));
        btSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSair.setForeground(new java.awt.Color(255, 255, 255));
        btSair.setText("SAIR");
        btSair.setFocusable(false);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair);
        btSair.setBounds(350, 190, 140, 30);

        txtInvalido.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtInvalido.setForeground(new java.awt.Color(153, 0, 0));
        txtInvalido.setText("USUÁRIO OU SENHA INVÁLIDOS!");
        getContentPane().add(txtInvalido);
        txtInvalido.setBounds(90, 280, 190, 16);

        ip.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ip.setForeground(new java.awt.Color(204, 204, 204));
        ip.setText("192.168.0.1");
        getContentPane().add(ip);
        ip.setBounds(10, 310, 140, 16);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 590, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        Logar();
    }//GEN-LAST:event_btEntrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                try {
            String ipPc = InetAddress.getLocalHost().getHostAddress();
            ip.setText("IP: " + ipPc);
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(null, "Não encontramos o IP LOCAL.");
        }
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel ip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel txtInvalido;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel versao;
    private javax.swing.JLabel vigilante;
    // End of variables declaration//GEN-END:variables

    
    public void Logar(){
        try {
            Usuario usuario = new Usuario();
            String loginUser = txtUsuario.getText();
            usuario.setUsuario(loginUser);
            String loginPassword = txtSenha.getText();
            usuario.setSenha(loginPassword);
            ConexaoUsuarios metodos = new ConexaoUsuarios();
            ResultSet resultadologin = metodos.autenticarUsuario(usuario);
            
            if(resultadologin.next()){
                Menu menu = new Menu();
                usuario.setUsuario(loginUser);
                menu.setVisible(true);
                menu.inicializar(loginUser);
                this.dispose();     
                
            }else{
                        txtInvalido.setVisible(true);
                        txtSenha.setBackground(Color.red.darker().darker());
                        txtUsuario.setBackground(Color.red.darker().darker());
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Login: " + erro);
            
        }

}}
