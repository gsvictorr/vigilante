
package Admin;

import Conexoes.ConexaoCondominios;
import Propriedades.Condominio;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MenuCondominio extends javax.swing.JFrame {

    public MenuCondominio() {
        initComponents();
        mostrarCond();
       this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon.png")).getImage());
        desabilitarCampos();
        txtNome.setBackground(Color.getHSBColor(204, 6, 29));
        btEditar.setVisible(false);
        btExcluir.setVisible(false);
        btSalvar.setVisible(false);
        btCancelar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEnd = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        comboCond = new javax.swing.JComboBox();
        txtId = new javax.swing.JLabel();
        btOk = new javax.swing.JButton();
        painelObs = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        txtComplemento = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btDel = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btCad = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VIGILANTE (ADMIN) | CONDOMÍNIOS");
        setMaximumSize(new java.awt.Dimension(693, 659));
        setMinimumSize(new java.awt.Dimension(693, 659));
        setPreferredSize(new java.awt.Dimension(693, 659));
        setResizable(false);
        getContentPane().setLayout(null);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(400, 180, 210, 10);

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(60, 180, 210, 10);

        jSeparator12.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator12);
        jSeparator12.setBounds(60, 510, 552, 10);

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(60, 180, 10, 330);

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(610, 180, 20, 330);

        jSeparator13.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator13);
        jSeparator13.setBounds(400, 180, 150, 10);

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONDOMÍNIOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(180, 180, 180))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(110, 110, 460, 20);

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOME DO CONDOMÍNIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        getContentPane().add(txtNome);
        txtNome.setBounds(190, 220, 310, 40);

        txtEnd.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtEnd.setForeground(new java.awt.Color(0, 0, 0));
        txtEnd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENDEREÇO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndActionPerformed(evt);
            }
        });
        getContentPane().add(txtEnd);
        txtEnd.setBounds(200, 270, 290, 40);

        txtNumero.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        txtNumero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NÚMERO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        getContentPane().add(txtNumero);
        txtNumero.setBounds(500, 270, 90, 40);

        txtCep.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CEP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtCep.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });
        getContentPane().add(txtCep);
        txtCep.setBounds(80, 270, 110, 40);

        comboCond.setBackground(new java.awt.Color(1, 3, 73));
        comboCond.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        comboCond.setForeground(new java.awt.Color(255, 255, 255));
        comboCond.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE O CONDOMÍNIO" }));
        comboCond.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(comboCond);
        comboCond.setBounds(110, 130, 400, 27);

        txtId.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(204, 204, 204));
        txtId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtId.setText("ID");
        getContentPane().add(txtId);
        txtId.setBounds(310, 90, 60, 16);

        btOk.setBackground(new java.awt.Color(0, 153, 0));
        btOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept.png"))); // NOI18N
        btOk.setFocusable(false);
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });
        getContentPane().add(btOk);
        btOk.setBounds(520, 130, 50, 27);

        painelObs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OBSERVAÇÕES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        painelObs.setForeground(new java.awt.Color(0, 0, 0));

        txtObs.setColumns(20);
        txtObs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtObs.setRows(5);
        painelObs.setViewportView(txtObs);

        getContentPane().add(painelObs);
        painelObs.setBounds(80, 370, 512, 122);

        txtComplemento.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtComplemento.setForeground(new java.awt.Color(0, 0, 0));
        txtComplemento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COMPLEMENTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        getContentPane().add(txtComplemento);
        txtComplemento.setBounds(80, 320, 510, 40);

        btCancelar.setBackground(new java.awt.Color(153, 0, 0));
        btCancelar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("CANCELAR");
        btCancelar.setFocusable(false);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelar);
        btCancelar.setBounds(170, 520, 160, 29);

        btSalvar.setBackground(new java.awt.Color(0, 153, 0));
        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("SALVAR");
        btSalvar.setFocusable(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar);
        btSalvar.setBounds(350, 520, 160, 29);

        btExcluir.setBackground(new java.awt.Color(153, 0, 0));
        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setText("EXCLUIR");
        btExcluir.setFocusable(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(350, 520, 160, 29);

        btEditar.setBackground(new java.awt.Color(153, 153, 0));
        btEditar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btEditar.setForeground(new java.awt.Color(255, 255, 255));
        btEditar.setText("EDITAR");
        btEditar.setFocusable(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(350, 520, 160, 29);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONDOMÍNIO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 170, 110, 22);

        btDel.setBackground(new java.awt.Color(153, 0, 0));
        btDel.setForeground(new java.awt.Color(153, 0, 0));
        btDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        btDel.setFocusable(false);
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });
        getContentPane().add(btDel);
        btDel.setBounds(390, 20, 50, 50);

        btEdit.setBackground(new java.awt.Color(153, 153, 0));
        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pencil.png"))); // NOI18N
        btEdit.setFocusable(false);
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        getContentPane().add(btEdit);
        btEdit.setBounds(320, 20, 50, 50);

        btCad.setBackground(new java.awt.Color(0, 153, 0));
        btCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        btCad.setFocusable(false);
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });
        getContentPane().add(btCad);
        btCad.setBounds(250, 20, 50, 50);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/backG.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 700, 670);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        limparCampos();
        String escolha = comboCond.getSelectedItem().toString();
        if(escolha.equals("SELECIONE O CONDOMÍNIO")){
            txtId.setText("ID");
            JOptionPane.showMessageDialog(null, "Selecione um condomínio");
        }else{
        mostrarInfos();
        txtNome.setBackground(Color.GREEN.darker());
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        condicaoPraSalvarCond();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
       excluirCond();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        editarCond();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparCampos();
        desabilitarCampos();
        
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        comboCond.setSelectedIndex(0);
        txtId.setText("ID");
        limparCampos();
        habilitarCampos();
        btEditar.setVisible(false);
        btExcluir.setVisible(false);
        btSalvar.setVisible(true);
        btCancelar.setVisible(true);
    }//GEN-LAST:event_btCadActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        String escolha = comboCond.getSelectedItem().toString();  
        if(escolha.equals("SELECIONE O CONDOMÍNIO")){
            txtId.setText("ID");
                        desabilitarCampos();
            JOptionPane.showMessageDialog(null, "Selecione um condomínio");
        }else{
        
        habilitarCampos();
        btEditar.setVisible(true);
        btExcluir.setVisible(false);
        btSalvar.setVisible(false);
        btCancelar.setVisible(true);
                }
    }//GEN-LAST:event_btEditActionPerformed

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed
         String escolha = comboCond.getSelectedItem().toString();  
        if(escolha.equals("SELECIONE O CONDOMÍNIO")){
            txtId.setText("ID");
                        desabilitarCampos();
            JOptionPane.showMessageDialog(null, "Selecione um condomínio");
        }else{
        habilitarCampos();
        btEditar.setVisible(false);
        btExcluir.setVisible(true);
        btSalvar.setVisible(false);
        btCancelar.setVisible(true);
        }
    }//GEN-LAST:event_btDelActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCondominio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCondominio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCondominio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCondominio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCondominio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCad;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox comboCond;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JScrollPane painelObs;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtObs;
    // End of variables declaration//GEN-END:variables
        

    // listando os condomínios no COMBOBOX.
    private void mostrarCond(){
        comboCond.removeAllItems();
        comboCond.addItem("SELECIONE O CONDOMÍNIO");
        ConexaoCondominios cond = new ConexaoCondominios();
        List<Condominio> lista = cond.ListarCondominiosCombo();
        for(Condominio c: lista){
            String nome = c.getNomeCond();
            int id = c.getIdCond();
            comboCond.addItem(nome);
        }
    }
    // pegando o NOME do condomínio e buscando seu ID
    private void mostrarInfos(){
            int id;
            String mostrarId = "";
            ConexaoCondominios c = new ConexaoCondominios();
            String verificarId = comboCond.getSelectedItem().toString();  
            ResultSet result = c.verificarIdCond(verificarId);     
        try {
            while(result.next()){
                id = result.getInt("idcond");
                mostrarId = String.valueOf(id);
                txtId.setText(mostrarId);
                buscarInfos();
            }
        } catch (SQLException ex) {
        }    
            
    }        
    
    // carregando os dados dos condomínios pelo ID
    private void buscarInfos(){
        try {
            String id = txtId.getText();
            int idCond = Integer.parseInt(id);
            ConexaoCondominios c = new ConexaoCondominios();       
            ResultSet result = c.mostrarCond(idCond);
            while(result.next()){
                Condominio cond = new Condominio();
                cond.setNomeCond(result.getString("nomecond"));
                cond.setCep(result.getString("cep"));
                cond.setEnd(result.getString("end"));
                cond.setObs(result.getString("obs"));
                cond.setComplemento(result.getString("complemento"));
                cond.setNumero(result.getString("numero"));
                txtNome.setText(cond.getNomeCond());
                txtComplemento.setText(cond.getComplemento());
                txtCep.setText(cond.getCep());
                txtEnd.setText(cond.getEnd());
                txtNumero.setText(cond.getNumero());
                txtObs.setText(cond.getObs());
               
            }
            
            
        } catch (SQLException ex) {
        }
    }
        
       
    // limpando campos
    private void limparCampos(){
                txtNome.setText("");
                txtComplemento.setText("");
                txtCep.setText("");
               txtEnd.setText("");
               txtNumero.setText("");
               txtObs.setText("");
    }
        
    // desabilitando campos
    private void desabilitarCampos(){
        txtNome.setEnabled(false);
        txtComplemento.setEnabled(false);
        txtCep.setEnabled(false);
        txtEnd.setEnabled(false);
        txtNumero.setEnabled(false);
        txtObs.setEnabled(false);
        painelObs.setEnabled(false);
        btSalvar.setEnabled(false);
        btEditar.setEnabled(false);
        btExcluir.setEnabled(false);
        btCancelar.setEnabled(false);
    }
    // habilitando campos
    private void habilitarCampos(){
        txtNome.setEnabled(true);
        txtComplemento.setEnabled(true);
        txtCep.setEnabled(true);
        txtEnd.setEnabled(true);
        txtNumero.setEnabled(true);
        txtObs.setEnabled(true);
        painelObs.setEnabled(true);
        btSalvar.setEnabled(true);
        btEditar.setEnabled(true);
        btExcluir.setEnabled(true);
        btCancelar.setEnabled(true);
       }
    
    // editando condomínio selecionado
      public void editarCond(){
        Condominio up = new Condominio();  
        if(txtNome.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Dados inválidos. Digite o nome do condomínio para editar", "VIGILANTE | ERRO AO EDITAR CONDOMÍNIO", JOptionPane.ERROR_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/exclamation.png")));
        } else{      
        
        String idCond = txtId.getText();
        up.setIdCond(Integer.parseInt(idCond));
        up.setNomeCond(txtNome.getText());
        up.setCep(txtCep.getText());
        up.setComplemento(txtComplemento.getText());
        up.setNumero(txtNumero.getText());
        up.setObs(txtObs.getText());
        up.setEnd(txtEnd.getText());
        ConexaoCondominios editar = new ConexaoCondominios();
        editar.editarCond(up);
        limparCampos();
        mostrarCond();
        desabilitarCampos();
        btEditar.setVisible(false);
        btExcluir.setVisible(false);
        btSalvar.setVisible(false);
        btCancelar.setVisible(false);
        }   
    }
    // excluindo condomínio selecionado
    private void excluirCond(){
         Condominio up = new Condominio();  
        if(txtNome.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Dados inválidos. Selecione o condomínio para excluir", "VIGILANTE | ERRO AO EXCLUIR CONDOMÍNIO", JOptionPane.ERROR_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/exclamation.png")));
        } else{      
        
        String idCond = txtId.getText();
        up.setIdCond(Integer.parseInt(idCond));
        ConexaoCondominios excluir = new ConexaoCondominios();
        excluir.excluirCond(up);
        limparCampos();
        mostrarCond();
        desabilitarCampos();
        btEditar.setVisible(false);
        btExcluir.setVisible(false);
        btSalvar.setVisible(false);
        btCancelar.setVisible(false);
        }   
    }
    
    // verificando se o condomínio já existe
     private void condicaoPraSalvarCond(){
        try {
            Condominio cond = new Condominio();
            cond.setNomeCond(txtNome.getText());
            ConexaoCondominios con = new ConexaoCondominios();
            ResultSet resultadologin = con.verificarCondominio(cond);
            if(resultadologin.next()){
                JOptionPane.showMessageDialog(null, "Condomínio com mesmo nome já cadastrado . Por favor, tente outro nome de condomínio.", "VIGILANTE | ERRO AO CADASTRAR CONDOMÍNIO", JOptionPane.ERROR_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/exclamation.png")));
            
        }else {
                this.dispose();
                cadastrarCond();
                limparCampos();
                mostrarCond();
                }

        } catch (SQLException ex) {
        }
     }
     
     // cadastro o morador se o retorno do método condicaoPraSalvarCond for falso
      public void cadastrarCond(){
        Condominio up = new Condominio();  
        if(txtNome.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Dados inválidos. Digite o nome do condomínio para cadastrar", "VIGILANTE | ERRO AO CADASTRAR CONDOMÍNIO", JOptionPane.ERROR_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/exclamation.png")));
        } else{      
        
        up.setNomeCond(txtNome.getText().toUpperCase());
        up.setCep(txtCep.getText());
        up.setComplemento(txtComplemento.getText().toUpperCase());
        up.setNumero(txtNumero.getText());
        up.setObs(txtObs.getText().toUpperCase());
        up.setEnd(txtEnd.getText().toUpperCase());
        ConexaoCondominios cadastro = new ConexaoCondominios();
        cadastro.criarCond(up);
        limparCampos();
        btEditar.setVisible(false);
        btExcluir.setVisible(false);
        btSalvar.setVisible(false);
        btCancelar.setVisible(false);
        }   
    }
}



