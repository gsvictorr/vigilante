
package Principais;

import Conexoes.ConexaoCondominios;
import Propriedades.Condominio;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Obs extends javax.swing.JFrame {

    public Obs() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePrincipal.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        txtSind = new javax.swing.JTextField();
        txtSubSind = new javax.swing.JTextField();
        txtEnd = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VIGILANTE |");
        setMaximumSize(new java.awt.Dimension(600, 711));
        setMinimumSize(new java.awt.Dimension(600, 711));
        setPreferredSize(new java.awt.Dimension(600, 711));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OBSERVAÇÕES");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 10, 270, 48);

        txtCep.setEditable(false);
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
        txtCep.setBounds(50, 160, 100, 40);

        txtSind.setEditable(false);
        txtSind.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtSind.setForeground(new java.awt.Color(0, 0, 0));
        txtSind.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SÍNDICO(A)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtSind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSindActionPerformed(evt);
            }
        });
        getContentPane().add(txtSind);
        txtSind.setBounds(50, 110, 230, 40);

        txtSubSind.setEditable(false);
        txtSubSind.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtSubSind.setForeground(new java.awt.Color(0, 0, 0));
        txtSubSind.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUB-SÍNDICO(A)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtSubSind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubSindActionPerformed(evt);
            }
        });
        getContentPane().add(txtSubSind);
        txtSubSind.setBounds(310, 110, 230, 40);

        txtEnd.setEditable(false);
        txtEnd.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtEnd.setForeground(new java.awt.Color(0, 0, 0));
        txtEnd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENDEREÇO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndActionPerformed(evt);
            }
        });
        getContentPane().add(txtEnd);
        txtEnd.setBounds(160, 160, 260, 40);

        txtNumero.setEditable(false);
        txtNumero.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        txtNumero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NÚMERO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        getContentPane().add(txtNumero);
        txtNumero.setBounds(430, 160, 110, 40);

        txtComplemento.setEditable(false);
        txtComplemento.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtComplemento.setForeground(new java.awt.Color(0, 0, 0));
        txtComplemento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COMPLEMENTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        getContentPane().add(txtComplemento);
        txtComplemento.setBounds(50, 210, 490, 40);

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNome.setText("nome do condomínio");
        getContentPane().add(txtNome);
        txtNome.setBounds(50, 60, 490, 30);

        txtObs.setEditable(false);
        txtObs.setBackground(new java.awt.Color(0, 102, 0));
        txtObs.setColumns(20);
        txtObs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtObs.setForeground(new java.awt.Color(0, 0, 0));
        txtObs.setRows(1);
        txtObs.setTabSize(4);
        txtObs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OBSERVAÇÕES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane1.setViewportView(txtObs);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 260, 490, 360);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 610, 760);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void txtEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndActionPerformed

    private void txtSubSindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubSindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubSindActionPerformed

    private void txtSindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSindActionPerformed

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
            java.util.logging.Logger.getLogger(Obs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Obs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Obs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Obs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Obs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JLabel txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtSind;
    private javax.swing.JTextField txtSubSind;
    // End of variables declaration//GEN-END:variables

    
    public void buscarObs(int idcond){
        
        int id = idcond;
        ConexaoCondominios cond = new ConexaoCondominios();
        
        try {
        ResultSet result = cond.verificarObs(id);
        while(result.next()){
            Condominio c = new Condominio();
            c.setNomeCond(result.getString("nomecond"));
            c.setEnd(result.getString("end"));
            c.setCep(result.getString("cep"));
            c.setComplemento(result.getString("complemento"));
            c.setNumero(result.getString("numero"));
            c.setObs(result.getString("obs"));
            txtCep.setText(c.getCep());
            txtComplemento.setText(c.getComplemento());
            txtEnd.setText(c.getEnd());
            txtNumero.setText(c.getNumero());
            txtObs.setText(c.getObs());
            txtNome.setText(c.getNomeCond());
            String nome = txtNome.getText();               
            this.setTitle("VIGILANTE | OBSERVAÇÕES DO " + nome);
            
            if(txtCep.getText().isEmpty()){
                txtCep.setText("Não definido");
            }  
            
            if(txtComplemento.getText().isEmpty()){
                txtComplemento.setText("Não definido");
            }
            
            if(txtEnd.getText().isEmpty()){
                txtEnd.setText("Não definido");
            }
            
            if(txtNumero.getText().isEmpty()){
                txtNumero.setText("Não definido");
            }
            if(txtSind.getText().isEmpty()){
                 txtSind.setText("Não definido");   
            }
            
            if(txtSubSind.getText().isEmpty()){
                txtSubSind.setText("Não definido");
            }
        }
        } catch (Exception erro) {
                        JOptionPane.showMessageDialog(null, "Obs: buscarObs:" + erro);
        }
        
    }

}
