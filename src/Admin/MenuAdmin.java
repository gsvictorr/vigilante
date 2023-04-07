
package Admin;

import java.awt.Color;

public class MenuAdmin extends javax.swing.JFrame {


    public MenuAdmin() {
        initComponents();
       this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cond = new javax.swing.JLabel();
        usuarios = new javax.swing.JLabel();
        moradores = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VIGILANTE (ADMIN) | MENU");
        setMaximumSize(new java.awt.Dimension(496, 288));
        setMinimumSize(new java.awt.Dimension(496, 288));
        setPreferredSize(new java.awt.Dimension(496, 288));
        setResizable(false);
        getContentPane().setLayout(null);

        cond.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cond.setForeground(new java.awt.Color(255, 255, 255));
        cond.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/house.png"))); // NOI18N
        cond.setText("CONDOMÍNIOS");
        cond.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                condMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                condMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                condMouseExited(evt);
            }
        });
        getContentPane().add(cond);
        cond.setBounds(180, 130, 130, 20);

        usuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuarios.setForeground(new java.awt.Color(255, 255, 255));
        usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_gray.png"))); // NOI18N
        usuarios.setText("USUÁRIOS");
        usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usuariosMouseExited(evt);
            }
        });
        getContentPane().add(usuarios);
        usuarios.setBounds(200, 180, 90, 20);

        moradores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        moradores.setForeground(new java.awt.Color(255, 255, 255));
        moradores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/grupoImg.png"))); // NOI18N
        moradores.setText("MORADORES");
        moradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moradoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                moradoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                moradoresMouseExited(evt);
            }
        });
        getContentPane().add(moradores);
        moradores.setBounds(190, 80, 110, 20);

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENU DO ADMINISTRADOR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 30, 360, 46);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/backG.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 290);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void moradoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moradoresMouseEntered
       moradores.setForeground(Color.red);
    }//GEN-LAST:event_moradoresMouseEntered

    private void moradoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moradoresMouseExited
       moradores.setForeground(Color.WHITE);
    }//GEN-LAST:event_moradoresMouseExited

    private void condMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_condMouseEntered
       cond.setForeground(Color.red);
    }//GEN-LAST:event_condMouseEntered

    private void condMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_condMouseExited
       cond.setForeground(Color.WHITE);
    }//GEN-LAST:event_condMouseExited

    private void usuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosMouseEntered

        usuarios.setForeground(Color.red);
    }//GEN-LAST:event_usuariosMouseEntered

    private void usuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosMouseExited
        usuarios.setForeground(Color.WHITE);
    }//GEN-LAST:event_usuariosMouseExited

    private void moradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moradoresMouseClicked
 
        MenuMorador mm = new MenuMorador();
        mm.setVisible(true);
    }//GEN-LAST:event_moradoresMouseClicked

    private void condMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_condMouseClicked

        MenuCondominio mc = new MenuCondominio();
        mc.setVisible(true);
    }//GEN-LAST:event_condMouseClicked

    private void usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosMouseClicked

        MenuUsuario mu = new MenuUsuario();
        mu.setVisible(true);
    }//GEN-LAST:event_usuariosMouseClicked


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
    private javax.swing.JLabel cond;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel moradores;
    private javax.swing.JLabel usuarios;
    // End of variables declaration//GEN-END:variables
}
