
package Admin;

public class MenuAdmin extends javax.swing.JFrame {


    public MenuAdmin() {
        initComponents();
      this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeAdmin.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mUser = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mMoradores = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VIGILANTE (ADMIN) | MENU");
        setMaximumSize(new java.awt.Dimension(686, 451));
        setMinimumSize(new java.awt.Dimension(686, 451));
        setPreferredSize(new java.awt.Dimension(686, 451));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 930, 450);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENU", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_red.png"))); // NOI18N
        jMenu1.setText("Usuários");
        jMenu1.setToolTipText("USUÁRIOS");

        mUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_edit.png"))); // NOI18N
        mUser.setText("Menu de usuários");
        mUser.setToolTipText("Menu de usuários");
        mUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mUserActionPerformed(evt);
            }
        });
        jMenu1.add(mUser);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/house.png"))); // NOI18N
        jMenu2.setText("Condomínios");
        jMenu2.setToolTipText("CONDOMÍNIOS");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/house_go.png"))); // NOI18N
        jMenuItem1.setText("Menu de condomínios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/grupoImg.png"))); // NOI18N
        jMenu3.setText("Moradores");
        jMenu3.setToolTipText("MORADORES");

        mMoradores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mMoradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/group_edit.png"))); // NOI18N
        mMoradores.setText("Menu de moradores");
        mMoradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMoradoresActionPerformed(evt);
            }
        });
        jMenu3.add(mMoradores);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/page_white_gear.png"))); // NOI18N
        jMenu4.setText("Configurações");
        jMenu4.setToolTipText("CONFIGURAÇÕES");
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/phone.png"))); // NOI18N
        jMenu5.setText("Aplicativo");
        jMenu5.setToolTipText("APLICATIVO");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mUserActionPerformed
        MenuUsuario u = new MenuUsuario();
        u.setVisible(true);
    }//GEN-LAST:event_mUserActionPerformed

    private void mMoradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMoradoresActionPerformed
        MenuMorador m = new MenuMorador();
        m.setVisible(true);
    }//GEN-LAST:event_mMoradoresActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MenuCondominio m = new MenuCondominio();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mMoradores;
    private javax.swing.JMenuItem mUser;
    // End of variables declaration//GEN-END:variables
}
