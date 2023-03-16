
package Secundarias;


public class NotasVersao extends javax.swing.JFrame {


    public NotasVersao() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePrincipal.png")).getImage());;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NOTAS DA VERSÃO (ATUAL 0.1.16)");
        setMaximumSize(new java.awt.Dimension(517, 522));
        setMinimumSize(new java.awt.Dimension(517, 522));
        setResizable(false);
        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOTAS DA VERSÃO (ATUAL: BETA 0.1.18 rev0.4)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(153, 153, 0));
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane1.setText("Versão de testes BETA 0.1.18 rev0.4 (06/03/2023)\n\n+ Corrigido BUGS referente a registro de entradas/saídas de visitantes/prestadores.\n+ Adicionado sistema de busca de visitantes/prestadores recentes.\n+ Adicionado sistema para encerrar as entradas.\n+ Corrigido sistema de observações do condomínio.\n\n\nVersão de testes BETA 0.1.16 rev 0.1 (03/03/2023)\n\n+ Adicionado sistema de cadastro de fotos dos moradores.\n+ Novo visual geral: Menu administrativo e de usuário.\n+ Novo ícone do Software VIGILANTE.\n+ Adicionado sistema de observações para os condomínios.\n+ Adicionado sistema de configurações de data/hora do sistema, sincronizado com o computador local.\n+ Adicionado sistema de registro de visitantes/prestadores de serviços.\n+ Adicionado sistema de busca de moradores pelo número do apartamento ou nome do morador.\n+ Adicionado sistema de atualização de sistema clicando no botão \"Atualizar\", localizado na barra principal do Menu.\n+ Adicionado painel de controle de entradas/saídas do condomínio.\n+ Correção de BUGS no painel de Login.\n+ Correção de BUGS na busca de moradores.\n+ Correção de BUGS no MENU.\n+ Correção de BUGS no registro de entradas.\n+ Correção de BUGS no cadastro de moradores, condomínios e usuários.\n+ Correção de BUGS no sistema de NOTAS DA VERSÃO.\n+ Correção de BUGS no sistema de data/hora.\n\n\nVersão de testes BETA - 0.1.3 (16/12/2022)\n\n+ Adicionado sistema de cadastro, edição e exclusão de condomínios.\n+ Adicionado sistema de cadastro, edição e exclusão de moradores.\n+ Adicionado novo ícone do VIGILANTE.\n+ Adicionado novo campo possível para cadastro do morador: Veículos.\n\n\nVersão de testes BETA - 0.1.2 (10/12/2022)\n\n+ Corrigido BUGS no menu principal.\n+ Iniciado conceito de  sistema de administradores.\n+ Iniciado conceito de App para enviar/receber mensagens para/dos moradores.\n+ Adicionado Menu Administrativo.\n+ Adicionado sistema de criação de usuários para administradores.\n+ Correção de BUGS no sistema de Login.\n+ Correção de BUGS no painel de visualização de moradores.\n\nVersão de testes BETA - 0.1.1 (06/12/2022)\n\n+ Adicionado sistema de login.\n+ Adicionado conexão com banco de dados SQL.\n+ Adicionado sistema de cadastro ,alteração e exclusão de moradores.\n+ Adicionado tabela com nome de condomínios.\n+ Iniciado protótipo para conexão de câmeras em tempo real.\n+ Iniciado protótipo para abertura de portões por comando remoto.");
        jTextPane1.setFocusable(false);
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(26, 50, 450, 418);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-9, -4, 530, 530);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(NotasVersao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotasVersao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotasVersao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotasVersao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotasVersao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
