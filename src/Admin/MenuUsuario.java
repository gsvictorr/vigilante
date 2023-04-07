
package Admin;

import Conexoes.ConexaoUsuarios;
import Propriedades.Usuario;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class MenuUsuario extends javax.swing.JFrame {


    public MenuUsuario() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon.png")).getImage());
        mostrarUsers();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSenhaRepetida = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        comboNivel = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VIGILANTE (ADMIN) | USUÁRIOS");
        setMaximumSize(new java.awt.Dimension(566, 611));
        setMinimumSize(new java.awt.Dimension(566, 611));
        setPreferredSize(new java.awt.Dimension(566, 611));
        setResizable(false);
        getContentPane().setLayout(null);

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(60, 120, 200, 28);

        btCadastrar.setBackground(new java.awt.Color(0, 153, 0));
        btCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setText("CADASTRAR");
        btCadastrar.setToolTipText("CADASTRAR USUÁRIO");
        btCadastrar.setFocusPainted(false);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrar);
        btCadastrar.setBounds(310, 250, 190, 23);

        btCancelar.setBackground(new java.awt.Color(153, 0, 0));
        btCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("CANCELAR");
        btCancelar.setToolTipText("CANCELAR");
        btCancelar.setFocusPainted(false);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelar);
        btCancelar.setBounds(60, 250, 200, 23);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 100, 60, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de usuário");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 160, 120, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Repetir a senha");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 160, 120, 20);

        txtSenhaRepetida.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSenhaRepetida.setForeground(new java.awt.Color(0, 0, 0));
        txtSenhaRepetida.setToolTipText("");
        getContentPane().add(txtSenhaRepetida);
        txtSenhaRepetida.setBounds(300, 180, 200, 28);

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));
        txtSenha.setToolTipText("");
        getContentPane().add(txtSenha);
        txtSenha.setBounds(300, 120, 200, 28);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 100, 50, 20);

        comboNivel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        comboNivel.setForeground(new java.awt.Color(0, 0, 0));
        comboNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01 - ADMINISTRADOR", "02 - USUÁRIO" }));
        getContentPane().add(comboNivel);
        comboNivel.setBounds(60, 180, 200, 28);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(30, 290, 492, 10);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(370, 70, 150, 10);

        jSeparator12.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator12);
        jSeparator12.setBounds(30, 290, 492, 10);

        jSeparator13.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator13);
        jSeparator13.setBounds(370, 70, 150, 10);

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(520, 70, 20, 220);

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(30, 70, 150, 10);

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(30, 70, 10, 220);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CADASTRO DE USUÁRIOS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 60, 170, 20);

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(30, 530, 492, 10);

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(320, 310, 200, 10);

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator9);
        jSeparator9.setBounds(520, 310, 20, 220);

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator10);
        jSeparator10.setBounds(30, 310, 200, 10);

        jSeparator11.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator11);
        jSeparator11.setBounds(30, 310, 10, 220);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USUÁRIOS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 300, 80, 20);

        tbUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "USUÁRIO", "TIPO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUsuarios.setRowHeight(23);
        jScrollPane1.setViewportView(tbUsuarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 320, 410, 200);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("USUÁRIOS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 0, 300, 60);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/backG.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 570, 850);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        condicaoPraSalvar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        txtUsuario.setText("");
        txtSenha.setText("");
        txtSenhaRepetida.setText("");
    }//GEN-LAST:event_btCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JComboBox comboNivel;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenhaRepetida;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    
    
    
    // verificando condições para salvar usuários
    private void condicaoPraSalvar(){
        try {
            Usuario usuario = new Usuario();
            usuario.setUsuario(txtUsuario.getText());
            ConexaoUsuarios con = new ConexaoUsuarios();
            ResultSet resultadologin = con.verificarUsuario(usuario);
            
            if(resultadologin.next()){
                JOptionPane.showMessageDialog(null, "Usuário já cadastrado. Por favor, tente outro nome de usuário.", "VIGILANTE (ADMIN) | ERRO AO CADASTRAR USUÁRIO", JOptionPane.ERROR_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/exclamation.png")));
                this.setVisible(true);
            }
            if(txtSenha.getText().length() < 8 || txtSenhaRepetida.getText().length() < 8){
                JOptionPane.showMessageDialog(null, "A senha deve conter no mínimo 8 caracteres.", "VIGILANTE (ADMIN) | ERRO AO CADASTRAR USUÁRIO", JOptionPane.ERROR_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/exclamation.png")));
            }else{
                salvarUsuario();
                this.dispose();
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadastroUsuario: condicaoPraSalvar" + erro);
            
        }

}
    
    // salvando usuários
    private void salvarUsuario(){
        Usuario up = new Usuario();
        String escolha = comboNivel.getSelectedItem().toString();
        int nivel = 0;
        
        if(escolha.equals("02 - USUÁRIO")){
                    nivel = 2;
        }
        
        if(escolha.equals("01 - ADMINISTRADOR")){
                    nivel = 1;     
        }
        
        if(txtUsuario.getText().isEmpty() || txtSenha.getText().isEmpty() || txtSenhaRepetida.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite em todos os campos.");
            this.setVisible(true);
  
        }else{
        up.setNivel(nivel);
        up.setUsuario(txtUsuario.getText());
        up.setSenha(txtSenha.getText());
        ConexaoUsuarios cadastro = new ConexaoUsuarios();
        cadastro.criarUsuario(up); 
         }
    }
    
    
    // mostrando usuários na tabela
           public void mostrarUsers(){
        
           DefaultTableModel modeloTabela = (DefaultTableModel) tbUsuarios.getModel();  
           ConexaoUsuarios user = new ConexaoUsuarios();
           
           
           modeloTabela.setNumRows(0);
           String us = "";
           for(Usuario u: user.listarUsuarios()){
               if(u.getNivel() == 1){
                    us = "ADMINISTRADOR";
               }if(u.getNivel() == 2){
                   us = "USUÁRIO";
               }
               modeloTabela.addRow(new Object[]{
                  u.getUsuario(), us
               });
               
               corNaLinha();
               }
           }
           
           
    
    // colocando cor para identificar usuários administradores
    public void corNaLinha(){
        
    tbUsuarios.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        Color c = Color.BLACK;

       String str = (String) value;
        if ("ADMINISTRADOR".equals(str)) {
            label.setForeground(Color.RED);
        } else {
            label.setForeground(Color.BLACK);
        }
        return label;
         }
    });
    }
}
